pipeline{
    agent any
    stages{
        stage('checkout'){
            steps{
                git url: 'https://github.com/GHkar/calculator.git'
            }
        }
        stage('compile'){
            steps{
                sh "./gradlew compileJava"
            }
        }
        stage('Unit test'){
            steps{
                sh "./gradlew test"
            }
        }
        stage('Code Coverage'){
            steps{
                sh "./gradlew jacocoTestReport"
                publishHTML (target : [
                    reportDir : 'build/reports/jacoco/test/html',
                    reportFiles : 'index.html',
                    reportName: "JaCoCo Report"])
                sh "./gradlew jacocoTestCoverageVerification"
            }
        }
    }
}
