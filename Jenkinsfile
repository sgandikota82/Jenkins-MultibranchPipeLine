pipeline {
    agent any

    stages {
        stage ('Compile Stage') {
            println 'Compile Stage'
//             steps {
//                 withMaven(maven : 'maven_3_5_0') {
//                     sh 'mvn clean compile'
//                 }
//             }
        }

        stage ('Testing Stage') {
            println 'Testing Stage'
//             steps {
//                 withMaven(maven : 'maven_3_5_0') {
//                     sh 'mvn test'
//                 }
//             }
        }


        stage ('Deployment Stage') {
                println 'Deployment Stage'
//             steps {
//                 withMaven(maven : 'maven_3_5_0') {
//                     sh 'mvn deploy'
//                 }
            }
        }
    }
}