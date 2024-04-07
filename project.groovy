pipeline {
    agent any 
    stages {
        stage('Build') { 
            steps {
                    
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
        {-
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