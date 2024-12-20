pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                // Compila el proyecto
                sh 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                // Ejecuta las pruebas
                sh 'mvn test'
            }
        }
        stage('Run') {
            steps {
                sh 'java -jar target/demoJenkins-0.0.1-SNAPSHOT.jar'
            }
        }
    }
}