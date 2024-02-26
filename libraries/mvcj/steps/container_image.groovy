void call( app_env ){
    stage("mvcj: Deploy to "){
          println  "${app_env.long_name}"
        println "Build image from source " 
           withDockerRegistry(credentialsId: 'nexus_repository', url: "${app_env.URL_CONTAINER_REGISTRY}" ) {
              sh 'skaffold build -f ./.skaffold.yaml -p ${app_env.SKAFFOLD_PROFILE}     --default-repo=${app_env.DEFAULT_REPOSITORY}  --file-output=skaffold_build_result_json.ci.out   --insecure-registry=${app_env.CONTAINER_REGISTRY}    --push=false  --tag=${config.TAG}'
                }
        
    }
}
