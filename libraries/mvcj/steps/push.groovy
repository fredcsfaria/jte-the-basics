void call( String name1){
    stage("mvcj: Dependency"){
        println "Push from the maven library   ${name1} " 
             withDockerRegistry(credentialsId: 'nexus_repository', url: "${URL_CONTAINER_REGISTRY}" ) {
               
          
               sh 'skaffold build -f ./.skaffold.yaml  -p ${SKAFFOLD_PROFILE} --default-repo=${DEFAULT_REPOSITORY}   --file-output=build_result.json   --insecure-registry=${CONTAINER_REGISTRY}   --tag=${TAG} --push=true' 
               
                   }
        
    }
}
