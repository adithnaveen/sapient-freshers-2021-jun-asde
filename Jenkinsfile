pipeline {
    agent any

    tools {
        maven "maven"
    }
    
   parameters {
        string(name: 'company', defaultValue: 'Sapient', description: 'Enter your cmopany name???')
	booleanParam(name: 'DEBUG_BUILD', defaultValue: true, description: 'do you want to buidl with debug')
	choice(name: 'env', choices: ['DEV', 'TEST', 'PROD'], description: 'specify you build env') 
    }

    stages {
        stage('Build') {
            steps {
		echo "The company name ${company}"
		echo "ENV : ${env}"
		echo "BUILD_WITH DEBUG : ${DEBUG_BUILD}"

                echo "************** Running ${env.BUILD_ID} on ${env.JENKINS_URL}***********"


                git 'https://github.com/adithnaveen/sapient-freshers-2021-jun-asde.git'

                // Run Maven on a Unix agent.
                sh "mvn -Dmaven.test.failure.ignore=true clean package"

            }

            }
        }

  post {
        failure {
		echo "Application failed ***********" 
        }

    }    

}

