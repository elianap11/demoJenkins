FROM jenkins/jenkins:lts

USER root

# Instalar Maven
RUN apt-get update && apt-get install -y maven && apt-get clean

USER jenkins