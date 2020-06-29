pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        bat(script: 'echo \'hi proj strtd\'', returnStatus: true, returnStdout: true)
      }
    }

    stage('maveb  build') {
      steps {
        build 'buildjob'
      }
    }

  }
}