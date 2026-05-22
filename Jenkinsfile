pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/divtec-cejef/2026-CCH-M324-Calculator-Leny.git'
            }
        }

        stage('Run Checkstyle') {
            steps {
                sh 'mvn checkstyle:checkstyle'
            }
        }
    }

    post {
        always {
            recordIssues tools: [
                checkStyle(pattern: '**/checkstyle-result.xml')
            ]
        }
    }
}