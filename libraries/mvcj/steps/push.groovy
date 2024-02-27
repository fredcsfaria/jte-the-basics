void call( app_env){
    stage("mvcj: Dependency"){
        println "Push from the maven library   ${name1} " 
             withDockerRegistry(credentialsId: 'nexus_repository', url: "${URL_CONTAINER_REGISTRY}" ) {
              withDockerRegistry(credentialsId: 'nexus_repository', url: "${app_env.URL_CONTAINER_REGISTRY}" ) {
                  sh "skaffold build -f ./.skaffold.yaml  -p ${app_env.SKAFFOLD_PROFILE}  --default-repo=${app_env.DEFAULT_REPOSITORY}   --file-output=build_result.json   --insecure-registry=${app_env.CONTAINER_REGISTRY}   --tag=${TAG} --push=true "
            
              }
        
    }
}
