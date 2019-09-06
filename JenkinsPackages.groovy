// SOURCE:
// https://stackoverflow.com/questions/9815273/how-to-get-a-list-of-installed-jenkins-plugins-with-name-and-version-pair

// Jenkins Script Console: http://<jenkins-url>/script

Jenkins.instance.pluginManager.plugins.sort { it.getDisplayName() }.each{
  plugin ->
    println ("${plugin.getDisplayName()} (${plugin.getShortName()}): ${plugin.getVersion()}")
}

/* RESULTS:

atom-beautify@0.29.7
atom-bootstrap3@1.2.12
auto-detect-indentation@1.0.0
autoclose-html@0.23.0
autocomplete-go@1.0.8
builder-go@1.0.0
color-picker@2.1.1
docblockr@0.7.3
emmet@2.4.3
environment@1.2.0
file-type-icons@1.2.0
go-config@1.1.4
go-get@1.0.3
go-imports@0.1.1
go-plus@4.1.0
go-rename@0.3.0
gofmt@1.1.6
gometalinter-linter@1.1.0
gorename@1.0.2
highlight-line@0.11.1
highlight-selected@0.11.2
language-docker@1.1.6
language-protobuf@0.5.0
linter@1.11.4
linter-csslint@1.3.2
linter-htmlhint@1.1.4
minimap@4.23.2
minimap-highlight-selected@4.4.0
minimap-pigments@0.2.0
monokai-slate@0.5.0
navigator-godef@1.0.3
pigments@0.26.0
platformio-ide-terminal@2.0.9
rainbow-tabs@2.2.1
seti-ui@0.9.2
tester-go@1.0.4

*/
