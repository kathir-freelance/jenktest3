pipeline {
agent any
stages
 {
  stage ('Compile Stage') {
    steps {
      withMaven(maven : 'my_mvn') {
          bat'mvn -f SpringBootDataJpa1/pom.xml clean compile'
            }
          }
    }
    stage ('Testing Stage') {
        steps {
          withMaven(maven : 'my_mvn') {
          bat'mvn -f SpringBootDataJpa1/pom.xml test'
            }
        }
    }
    stage ('Install Stage') {
      steps {
          withMaven(maven : 'my_mvn') {
          bat'mvn -f SpringBootDataJpa1/pom.xml install'
            }
          }
      }
}
}
