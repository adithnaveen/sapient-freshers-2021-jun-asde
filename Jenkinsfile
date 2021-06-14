pipeline {
    agent any

    tools {
        maven "maven"
    }
    
   parameters {
        string(name: 'company', defaultValue: 'Sapient', description: 'Enter your cmopany name???')
    }

    stages {
        stage('Build') {
            steps {
		echo "The company name ${company}"
                git 'https://github.com/adithnaveen/sapient-freshers-2021-jun-asde.git'

                // Run Maven on a Unix agent.
                sh "mvn -Dmaven.test.failure.ignore=true clean package"

            }

            }
        }
    }

