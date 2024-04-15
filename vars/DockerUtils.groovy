// DockerUtils.groovy

def call(String username, String password) {
    // Implement the logic to login to Docker Hub using the provided username and password
    // For example:
    withCredentials([usernamePassword(credentialsId: 'docker-hub-credentials', usernameVariable: 'DOCKER_USERNAME', passwordVariable: 'DOCKER_PASSWORD')]) {
        sh "docker login -u $username -p $password"
    }
}

