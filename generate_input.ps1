$Start = Read-Host -Prompt 'What should be the start number?'
$End = Read-Host -Prompt 'What should be the end number?' 
$Problem = Read-Host -Prompt 'What is the problem number?'

$ProblemFilePath = ".\p$Problem"

$InputFilePath = "$ProblemFilePath\input" 

for ($i = [int]$Start; $i -lt [int]$End+1; $i++){
    $FileNumber = ([String]$i).PadLeft(2, '0'); 
    $FileName = "input$FileNumber.txt"
    node "$ProblemFilePath\generate_input.js" > "$InputFilePath\$FileName"
}