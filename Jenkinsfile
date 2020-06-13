pipeline{
    agent any
	
	environment {
		registry = "dofl0119/calculator"
		registryCredential = 'dockerhub'
		dockerImage = ''
	}

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
		stage('Package')
		{
			steps{
				sh "./gradlew build"
			}
		}
		stage('Deploy Image')
		{
			steps{
				script{
					dockerImage = docker.build registry + ":$BUILD_NUMBER"
				}
			}
		}
		stage('Push Image')
		{
			steps{
				script{
					docker.withRegistry('', registryCredential){
						dockerImage.push("latest")
					}
				}
			}
		}
		stage('Deploy to Staging')
		{
			steps{
				script{
					docker.withServer('tcp://docker:2376', ''){
						dockerImage.withRun('-p 8090:8090'){
							sleep 20
							sh 'curl -X GET http://docker:8090/sum?a=1&b=3'
						}
					}
				}
			}
		}
    }
}
