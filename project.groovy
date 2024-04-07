pipeline {
    agent any 
    stages {
        stage('Build') { 
            steps {
            echo 'Cloning the repos'
            }
        }
    } 
}   