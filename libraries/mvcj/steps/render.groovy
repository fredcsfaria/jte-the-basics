void call( app_env ){
    stage("mvcj: Render to "){
         
        println "Render artefatos para ${app_env.URL_CONTAINER_REGISTRY} ${IMAGE_NAME} " 
           withDockerRegistry(credentialsId: 'nexus_repository', url: "${app_env.URL_CONTAINER_REGISTRY}" ) {
              //sh "skaffold build -f ./.skaffold.yaml -p ${app_env.SKAFFOLD_PROFILE}     --default-repo=${app_env.DEFAULT_REPOSITORY}  --file-output=skaffold_build_result_json.ci.out   --insecure-registry=${app_env.CONTAINER_REGISTRY}    --push=false  --tag=${config.TAG}"
            // // sh "skaffold render -f ./.skaffold.yaml  --digest-source=tag --default-repo=${app_env.DEFAULT_REPOSITORY}  --offline=true -p ${app_env.SKAFFOLD_PROFILE}  -o k8s-deploy.yaml -i app-image=${IMAGE_NAME} "
               printl "Render "
                }
        
    }
}
