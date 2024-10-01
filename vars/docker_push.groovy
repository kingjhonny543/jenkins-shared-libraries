def call(String Project, String ImageTag, String dockerhubUser) {
    withCredentials([usernamePassword(credentialsId: 'dockerhubCred', passwordVariable: 'dockerhubPass', usernameVariable: 'dockerhubUser')]) {
        sh "echo ${dockerhubPass} | docker login -u ${dockerhubUser} --password-stdin"
    }
    sh "docker push ${dockerhubUser}/${Project}:${ImageTag}"
}
