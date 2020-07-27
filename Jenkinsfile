pipeline {
    agent any

    stages {
        stage('Git Checkout'){
            steps{
                echo 'checkout...'
                git 'https://github.com/govind1452/jenkins-maven.git'
            }
        }
        stage('Build') {
            steps {
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
