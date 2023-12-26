pipeline {
    agent any
    environment {
        //imagename = "ramesh131/spring-demo"
        imagename = "817950466876.dkr.ecr.us-east-1.amazonaws.com/my-ecr-repo"
        registryCredential = "rameshDockerRegistry"
        dockerImage = ''
        //devSystemAddress="devops@192.168.1.45"
        statusLoop=''
    }
    stages {
        stage('Build') { 
            steps {
                sh 'mvn -DskipTests clean install'
            }
        }
        stage('Build Docker Image'){
            steps {
                script{
                    dockerImage = docker.build("${env.imagename}:v${env.BUILD_NUMBER}")
                }
            }
        }
        stage('configure aws'){
            steps {
		withCredentials([string(credentialsId: 'AWS_ACCESS_KEY', variable: 'test')]) {
			sh 'aws configure set aws_access_key_id "${test}"'
		}
		withCredentials([string(credentialsId: 'AWS_SECRET_ACCESS_KEY', variable: 'test')]) {
                	sh 'aws configure set aws_secret_access_key "${test}"'
		}
            }
        }
        stage('aws ecr login'){
            steps {
                sh 'eval $(aws ecr get-login --no-include-email --region us-east-1 | sed "s;https://;;g")'
            }
        }
        stage('Push Built Image to Docker Hub'){
            steps{
                script{
                    //docker.withRegistry('', registryCredential) {
                    dockerImage.push()
                    dockerImage.push('latest')
                    
                    //}
                }
            }
        }
        stage('Remove Unused docker image') {
            steps{
                sh "docker rmi $imagename:v$BUILD_NUMBER"
                sh "docker rmi $imagename:latest"
            }
        }
    }
}
