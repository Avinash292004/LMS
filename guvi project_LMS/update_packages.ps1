$files = Get-ChildItem -Path "src/main/java/com/lms" -Recurse -Filter *.java
foreach ($file in $files) {
    $content = Get-Content $file.FullName
    $package = "package com.lms." + $file.Directory.Name + ";"
    $content[0] = $package
    $content | Set-Content $file.FullName
}
