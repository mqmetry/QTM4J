pipeline{

    agent any

    stages {

        stage ('Compile Stage') {

            steps {
withMaven(maven: 'MavenWeb') {
                    sh 'mvn clean install'

}

            }
        }
    stage ('Test Stage') {

            steps {
withMaven(maven: 'MavenWeb') {
                    sh 'mvn test'
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
