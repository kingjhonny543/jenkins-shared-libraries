def call(String projectname, String imagetag, String dockerhubUser){
  sh "docker build -t ${dockerhubUser}/${projectname}:${imagetag} ."
}
