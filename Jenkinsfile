pipeline {
  environment {
    GH_CREDS = credentials('jenkins-x-github')
  }
  agent {
    label "jenkins-maven"
  }
  stages {
    stage('CI Build') {
      when {
        branch 'PR-*'
      }
      steps {
        checkout scm
        container('maven') {
          sh "mvn clean install"
        }
      }
    }

    stage('Build and Push Release') {
      when {
        branch 'master'
      }
      steps {
        checkout scm
        container('maven') {
          sh './jx/scripts/release.sh'
        }
      }
    }
  }
}
