def call(String username, String password) {
    sh "docker login -u '$username' -p '$password'"
}

