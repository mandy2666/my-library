def call() {
    withCredentials([usernamePassword(
            credentialsId: "docker-hub-credentials",
            usernameVariable: "USER",
            passwordVariable: "PASS"
    )]) {
        sh "docker login -u '$USER' -p '$PASS'"
    }
}
