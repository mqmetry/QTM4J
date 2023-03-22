pipeline{

    agent any
      
    tools { 
      maven 'MAVEN_HOME' 
      jdk 'JAVA_HOME' 
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
