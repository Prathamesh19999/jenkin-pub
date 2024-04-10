pipeline {
    agent any 
    stages {
        stage('pull') { 
            steps {
                    git branch: 'main', changelog: false, poll: false, url: 'https://github.com/Prathamesh19999/jenkin-pub'
                echo "Cloning the repos"
            }
        }

        stage('Build')
        {
            steps{
                sh '/opt/apache-maven-3.9.6/bin/mvn clean package'

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







