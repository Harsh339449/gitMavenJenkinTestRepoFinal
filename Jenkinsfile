pipeline{
    agent any
    stages{
        stage("Test"){
            steps{
                sh "mvn test"
               
            }
        }
        stage("Build"){
            steps{
                sh "mvn package"
               
            }
        }
        stage("Deploy"){
            steps{
                deploy adapters: [tomcat8(credentialsId: '15cc4328-3007-42f9-a0a0-426f7b787023', path: '', url: 'http://54.147.191.177:8082/')], contextPath: '/app', war: '**/*.war'
                
            }
        }
    }
    post{
        always{
            echo "========always========"
        }
        success{
            echo "========pipeline executed successfully ========"
        }
        failure{
            echo "========pipeline execution failed========"
        }
    }
}
