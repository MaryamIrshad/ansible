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
        stage('ansible playbook'){
            steps{
                script{
                    sh 'ansible-playbook -i "C:\ProgramData\Jenkins\.jenkins\workspace\test\ansible\inventory" "C:\ProgramData\Jenkins\.jenkins\workspace\test\ansible\installpackage.yml"'
                }
            }
        }
    }
}
