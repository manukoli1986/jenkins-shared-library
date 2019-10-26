  def mvn {
        withMaven(maven: 'maven') {
            sh "mvn clean verify -DSkiptest=True"
        }
  }
