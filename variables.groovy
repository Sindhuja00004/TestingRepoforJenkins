pat="github_aob"
Id="507585"
srcLocation="/home/mfuser/jenkins/workspace/aob-root-module/aob-build/VE_mvp_aobdxc/"
inProgressBuildType="FailBuild"
isMicroservice="false"
overrideGlobalConfig="true"
inProgressScanActionType="Queue"
isMicroservice="false"
overrideGlobalConfig="true"
remediationScanPreferenceType="NonRemediationScanOnly"
pollingInterval="2"
SonarProjectName="DemoProject1"
SonarAuthentication="3790b1784c56e9fbe39a4bdcc405296d9b7f17a1"
SonarHostURL="http://20.127.210.161:9000/"
SonarJacocoPath1="${WORKSPACE}/common/target/site/jacoco/jacoco.xml"
SonarJacocoPath2="${WORKSPACE}/root/target/site/jacoco/jacoco.xml"
SonarWebhook="http://20.127.210.161:8080/sonarqube-webhook"
SonarTestInclusion="**/*Tests.java"
SonarJavaBinaries="/"
BranchName="main"
GitRepo="https://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@github.com/sindhuja00004/TestingRepoforJenkins.git"
GitRepo1="https://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@github.com/GParvathaSetty/VE_mvp_aobdxc.git"
BranchName1="1.2.0"



|-----DevOps
      |---Mod Pipeline
      |   |----Modular Pipeline.yml
      |---Sub pipeline for Mod
          |---- ASoD Sub Pipeline.yml
          |---- Sonar Sub Pipelines.yml
      |---Variables
          |---variables.groovy
