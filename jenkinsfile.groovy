pipeline{
    agent any

    stages{
        stage('clone repository'){
            steps{
                script{
                    def gitRepoUrl = 'https://github.com/MaryamIrshad/ansible.git'
                }
            }
        }
        
    }
}
