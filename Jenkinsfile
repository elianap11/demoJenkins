pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
               sh 'mvn test'
            }
        }
        stage('Docker Build') {
             steps {
              script{
                     //Construye la imagen docker
                     def appImage = docker.build("my-spring-boot-app:${BUILD_NUMBER}",".")

                     //Ejecuta el contenedor con tu app
                    docker.image("my-spring-boot-app:${BUILD_NUMBER}").withRun("--net=host -p 8082:8082") {c ->
                          println "app is up and running, id: ${c.id}"

                           sleep 30
                     }
                    }
            }
        }
    }
}