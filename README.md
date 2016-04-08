## sbt-pmd-plugin ##
This project provides an SBT 0.13 plugin for running PMD over source files. For more information about PMD, see [https://pmd.github.io/](https://pmd.github.io/).

This plugin uses version 5.1.3 of PMD.

### Setup ###
Add the following lines to `project/plugins.sbt`:

```scala
addSbtPlugin("com.qonceptual.sbt" % "sbt-pmd-plugin" % "1.0.2")
```

### Running PMD ###
```scala
sbt pmd
```

### Configuring PMD to Run Before Tests ###
```scala
test in Test <<= (test in Test).dependsOn(pmd)
```

### Settings ###

**pmdReportFormat: String** The PMD Report format output. Supported values that also successfully detect if warnings were found include csv, emacs, text, ideaj, textpad, html, summaryhtml, vbhtml, xml, xslt, and textcolor. Default: `text`

**pmdRulesets: Seq[String]** The rulesets to run. Default: `Seq("rulesets/java/basic.xml")`

**pmdFailBuild: Boolean** If true, any warnings from PMD will fail the build. Default: `true`

**pmdLanguage: String** The language PMD should use. Default: `java`

**pmdLanguageVersion: String** The version of a language PMD should use. Default: `1.8`

**pmdReportFile: File** The file where PMD should generate the report. Default: `target/pmd-report.txt`
