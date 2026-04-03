pipeline {
    agent any 

    stages {
        stage('Build') {
            steps {
                echo 'Building application...'
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                echo 'Running unit tests...'
                sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying to staging environment...'
            }
        }
    }
}
