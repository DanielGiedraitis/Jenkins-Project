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
                echo "Compiling java files"
                sh 'javac -d . src/Student.java' // Compile Student.java
            }
        }
    }
}
