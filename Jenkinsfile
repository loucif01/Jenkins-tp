pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        bat 'gradle build'
        bat 'gradle myJavaDocs'
        archiveArtifacts(artifacts: 'build/libs/*.jar , build/docs/javadoc/*', onlyIfSuccessful: true)
      }
      post {
      failure {
        mail(subject: 'build finished', body: 'build failed', to: 'fa_lebdiri@esi.dz')
      }
      success {
        mail(subject: 'build finished', body: 'build success', to: 'fa_lebdiri@esi.dz')
      }
    }
    }
    

  }
}
