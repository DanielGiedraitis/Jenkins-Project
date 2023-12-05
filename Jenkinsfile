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
                bat "\"javac\" -cp \"lib\\junit-platform-console-standalone-1.9.3.jar\" -d . src\\Student.java src\\StudentTest.java"
            }
        }
        stage('Test') {
             steps {
                 echo "Running the tests"
                 bat "\"java\" -jar lib\\junit-platform-console-standalone-1.9.3.jar --class-path . --scan-class-path"
             }
        }
    }
}



