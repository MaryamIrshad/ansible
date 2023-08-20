pipeline{
    agent
    {
        label 'centos'
    }

    stages{
        stage('Create test file'){
            steps{
                    dir ('/home/centoskey/workspace/workspace/'){
                        script{
                             sh """
                             echo "Hello, this is sample jenkins file" > test.txt
                             """
                        }
                    }
                   
                }
            }
        }
        stage('print path'){
            steps{
                script{
                    sh 'echo $PATH'
                }
            }
        }

    }
    post{
        always {
            
            archiveArtifacts artifacts: '/home/centoskey/workspace/workspace/test.txt', allowEmptyArchive: true
        }
    }

