pipeline{
    agent {label 'centos'}

    stages{
        stage('clone repository'){
            steps{
                script{
                    def gitRepoUrl = 'https://github.com/MaryamIrshad/ansible.git'
                }
            }
        }
        stage('ansible playbook'){
            steps{
                script{
                    sh 'ansible-playbook -i ansible/inventory ansible/installpackage.yml'
                }
            }
        }
    }
}
