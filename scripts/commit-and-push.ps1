param(
    [Parameter(Mandatory=$true)]
    [string]$Message
)

Write-Host "Checking Git status..."
git status --short

Write-Host "Adding changes..."
git add -A

$changes = git diff --cached --name-only

if (-not $changes) {
    Write-Host "No changes to commit."
    exit 0
}

Write-Host "Committing changes..."
git commit -m "$Message"

if ($LASTEXITCODE -ne 0) {
    Write-Host "Commit failed."
    exit 1
}

Write-Host "Pushing to GitHub..."
git push origin main

if ($LASTEXITCODE -eq 0) {
    Write-Host "Successfully pushed to GitHub."
}