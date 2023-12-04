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
                bat "\"javac\" -cp \"C:\\Users\\danie.LAPTOP-GOIIMLLB\\.m2\\repository\\org\\junit\\jupiter\\junit-jupiter\\5.8.1\\junit-jupiter-5.8.1.jar;C:\\Users\\danie.LAPTOP-GOIIMLLB\\.m2\\repository\\org\\junit\\jupiter\\junit-jupiter-api\\5.8.1\\junit-jupiter-api-5.8.1.jar\" -d . src\\Student.java src\\StudentTest.java"
            }
        }
        stage('Test') {
        	steps {
        		echo "Running the test file"
        		bat "\"java\" -cp \".;C:\\Users\\danie.LAPTOP-GOIIMLLB\\.m2\\repository\\org\\junit\\jupiter\\junit-jupiter\\5.8.1\\junit-jupiter-5.8.1.jar;C:\\Users\\danie.LAPTOP-GOIIMLLB\\.m2\\repository\\org\\junit\\jupiter\\junit-jupiter-api\\5.8.1\\junit-jupiter-api-5.8.1.jar\" org.junit.platform.console.ConsoleLauncher --scan-classpath"
        	}
        }
    }
}



