pipeline {
    agent any
    stages {

        stage('Build') {
            steps {

                sh 'mvn clean'
                sh 'mvn compile'
                sh 'mvn install'
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
                deploy adapters: [tomcat8(credentialsId: '98097f04-7a1d-46f1-aa9e-cbe4980ec1d5', path: '', url: 'http://localhost:8080/')], contextPath: 'check1', war: '**/*.war'
            }
        }
    }
}
