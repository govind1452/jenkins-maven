pipeline{
  stages{
    
    stage('SCM Checkout'){
      steps{
        git 'https://github.com/govind1452/jenkins-maven'
      }
  }
  stage('compile'){
    steps{
      def mvnHome = tool name: 'maven-3', type: 'maven'
      sh "${mvnHome}/bin/mvn package"
    }
  
  }
  }
  
}
