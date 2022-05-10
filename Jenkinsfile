pipeline{
    agent any
    stages{
        stage("Test"){
            steps{
                sh "mvn test"
                slackSend channel: 'learning', message: 'Job Started'
               
            }
        }
        stage("Build"){
            steps{
                slackSend channel: 'learning', message: 'Build Started'
                sh "mvn package"
               
            }
        }
        stage("Deploy"){
            steps{
                slackSend channel: 'learning', message: 'Deploying on Tomcat'
                deploy adapters: [tomcat8(credentialsId: '15cc4328-3007-42f9-a0a0-426f7b787023', path: '', url: 'http://3.80.99.217:8082/')], contextPath: '/SampleWebApplication', war: '**/*.war'
                
            }
        }
    }
    post{
        always{
            echo "========always========"
        }
        success{
            echo "========pipeline executed successfully ========"
            slackSend channel: 'learning', message: 'Job Success'
        }
        failure{
            echo "========pipeline execution failed========"
            slackSend channel: 'learning', message: 'Job Failed'
        }
    }
}
