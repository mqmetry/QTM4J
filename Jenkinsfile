pipeline{

    agent any

    stages {

        stage ('Compile Stage') {

            steps {
withMaven(maven: 'maven_latest') {
                    shell 'mvn clean install'

}

            }
        }
    stage ('Test Stage') {

            steps {
withMaven(maven: 'maven_latest') {
                    shell 'mvn test'
}


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
