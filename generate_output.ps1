$Problem = Read-Host -Prompt 'What is the problem number?'

$ProblemFilePath = ".\p$Problem"

$InputFilePath = "$ProblemFilePath\input" 
$OutputFilePath = "$ProblemFilePath\output"

javac "$ProblemFilePath\Solution.java"  -d $ProblemFilePath

$Inputs = Get-ChildItem $InputFilePath | Select-Object -ExpandProperty Name

foreach ($Input in $Inputs) {
    $Output = $Input.replace("input", "output")
    Get-Content "$InputFilePath\$Input" | java -classpath $ProblemFilePath Solution > "$OutputFilePath\$Output"

}





