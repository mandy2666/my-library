// File: pipeline/vars/myStep.groovy

def call() {
     ([usernamePassword(
            credentialsId: "docker_cred",
            usernameVariable: "USER",
            passwordVariable: "PASS"
    )]) {
        sh "docker login -u '$USER' -p '$PASS'"
    }
}

