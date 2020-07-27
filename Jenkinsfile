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
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
