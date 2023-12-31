pipeline{
    agent any

    stages{
        stage('Create test file'){
            steps{
                    
                        script{
                             sh """
                             echo "Hello, this is sample jenkins file" > test.txt
                             """
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
        
    }
    post{
        always {
            
            archiveArtifacts artifacts: 'test.txt', allowEmptyArchive: true
        }
    }
