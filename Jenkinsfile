pipeline {
  agent any
  stages {
    stage('mystage1') {
      steps {
        bat(script: 'echo \'hi proj strtd\'', returnStatus: true, returnStdout: true)
      }
    }

    stage('mystage2') {
      steps {
        input('do u wanna proceed further?')
      }
    }
            stage('Three') {
                 when {
                       not {
                            branch "master"
                       }
                 }
                 steps {
                       echo "Hello"
                 }
                 }
                 stage('dockerFour') {
                 parallel { 
                            stage('Unit Test') {
                           steps {
                                echo "Running the unit test..."
                           }
                           }
                            stage('Integration test') {
                              agent {
                                    docker {
                                            reuseNode true
                                            image 'ubuntu'
                                           }
                                    }
                              steps {
                                echo "Running the integration test..."
                              }
                           }
                           }
                           }
              }
}
