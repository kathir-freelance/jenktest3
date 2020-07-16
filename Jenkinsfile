pipeline {
agent any
stages {
stage ('Compile Stage') {
steps {
withMaven(maven : 'my_mvn') {
bat'mvn clean compile'
}
}
}
stage ('Testing Stage') {
steps {
withMaven(maven : 'my_mvn') {
bat'mvn test'
}
}
}
stage ('Install Stage') {
steps {
withMaven(maven : 'my_mvn') {
bat'mvn install'
}
}
}
}
}
