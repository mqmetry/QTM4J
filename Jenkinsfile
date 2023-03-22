pipeline{

    agent any
      
    tools { 
      maven 'Maven 3.8.8' 
      jdk 'jdk8' 
    }

    stages {

        stage ('Compile Stage') {

            steps {

                    sh 'mvn clean install'



            }
        }
    stage ('Test Stage') {

            steps {

                    sh 'mvn test'



            }
        }


        stage ('Cucumber Reports') {

            steps {
                cucumber fileIncludePattern: "**/cucumber.json",
                    jsonReportDirectory: 'target'

            }

        }

    }

}
