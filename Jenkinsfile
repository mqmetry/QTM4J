pipeline{

    agent any

    stages {

        stage ('Compile Stage') {

            steps {
withMaven(maven: 'maven_latest') {
                    bat 'mvn clean install'

}

            }
        }
    stage ('Test Stage') {

            steps {
withMaven(maven: 'maven_latest') {
                    bat 'mvn test'
}


            }
        }


        stage ('Cucumber Reports') {

            steps {
                cucumber 
                    fileIncludePattern: "**/cucumber.json",
                    jsonReportDirectory: 'target'

            }

        }

    }

}
