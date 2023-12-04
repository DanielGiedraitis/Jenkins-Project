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
                bat 'javac -cp "path/to/junit-jupiter-5.8.1.jar;path/to/junit-jupiter-api-5.8.1.jar" -d . src\\Student.java src\\StudentTest.java'
            }
        }
    }
}

