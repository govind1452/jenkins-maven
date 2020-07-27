pipeline{
  def mvnHome = tool name: 'maven-3', type: 'maven'
  stage('SCM Checkout'){
  git 'https://github.com/govind1452/jenkins-maven'
  
  }
  stage('compile'){
  sh "${mvnHome}/bin/mvn package"
  }
  
}
