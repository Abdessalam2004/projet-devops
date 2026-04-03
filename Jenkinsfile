pipeline {
    agent any 

    options {
        // This stops the "automatic" checkout you are seeing
        skipDefaultCheckout()
    }

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
    post {
        success {
            echo "Build #${BUILD_NUMBER} réussi"
        }
        failure {
            echo "Build #${BUILD_NUMBER} échoué"
        }
        always {
            cleanWs()
        }
    }
}
