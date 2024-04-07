pipeline {
    agent any 
    stages {
        stage('Build') { 
            steps {
                    git branch: 'main', credentialsId: '4564541dsd', url: 'https://github.com/Prathamesh19999/jenkin-pub.git'
                echo "Cloning the repos"
            }
        }
    }
}







