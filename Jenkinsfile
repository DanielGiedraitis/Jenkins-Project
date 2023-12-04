pipeline {
    agent any

    stages {
        stage('Fetch') {
            steps {
                echo "Pulling from Github repository"
                git branch: 'main', url: 'https://github.com/DanielGiedraitis/Jenkins-Project'
            }
        }
        stage('Build') {
            steps {
                echo "Compiling the java files"
            }
        }
        stage('Test') {
            steps {
                echo "Running the tests"
            }
        }
    }
}
