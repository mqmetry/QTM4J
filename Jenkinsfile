pipeline{

    agent any

    stages {

        stage ('Compile Stage') {

            steps {

                    shell 'mvn clean install'


            }
        }
    stage ('Test Stage') {

            steps {

                    shell 'mvn test'



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
