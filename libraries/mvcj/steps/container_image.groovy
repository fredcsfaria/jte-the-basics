void call( String SKAFFOLD_PROFILE ){
    stage("mvcj: Container_Image"){
        println "Build image from source " 
          // withDockerRegistry(credentialsId: 'nexus_repository', url: "${URL_CONTAINER_REGISTRY}" ) {
            //  sh 'skaffold build -f ./.skaffold.yaml -p ${SKAFFOLD_PROFILE}     --default-repo=${DEFAULT_REPOSITORY}  --file-output=skaffold_build_result_json.ci.out   --insecure-registry=${CONTAINER_REGISTRY}    --push=false  --tag=${TAG}'
              //  }
        
    }
}
