pipeline {
    agent any 
    stages {
        stage('Build') { 
            steps {
                    git branch: 'main', credentialsId: '4564541dsd', url: 'https://github.com/Prathamesh19999/jenkin-pub.git'
                echo "Cloning the repos"
            }
        }

        stage('Develop')
        {
            steps{
                echo "Developing the code "
            }
        }

        stage('Test')
        {
            steps{
                echo "Testing the code"

            }
        }
        
        stage('Quality test')
        {
            steps{
                echo "Testing the quality of the project"

            }
 
        }

        stage('Deploy')
        {
            steps{
                echo "Successfully Deploy"
            }
        }

    }
}







