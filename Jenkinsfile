pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        bat 'gradle build'
        bat 'gradle uploadArchives'
      }
    }
    stage('SonarQube') {
      steps {
        bat 'a'
      }
    }
  }
}