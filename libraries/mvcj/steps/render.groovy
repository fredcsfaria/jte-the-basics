void call( app_env ){
    stage("mvcj: Render to "){

      //   println "${app_env.DEFAULT_REPOSITORY2}" +  "/" + "${DEFAULT_REPOSITORY1}" + "/" + "${IMAGE_NAME1}"
        def CONTAINER_IMAGE = "${app_env.CONTAINER_REGISTRY}" +  "/" + "${REPOSITORY}" + "/" + "${IMAGE_NAME}" + ":" + "${IMAGE_TAG}"
        println(CONTAINER_IMAGE);
        println "Render artefatos para ${app_env.URL_CONTAINER_REGISTRY} ${IMAGE_NAME} " 
           withDockerRegistry(credentialsId: 'nexus_repository', url: "${app_env.URL_CONTAINER_REGISTRY}" ) {
             
            //sh "skaffold render -f ./.skaffold.yaml  --digest-source=tag --default-repo=${app_env.DEFAULT_REPOSITORY}  --offline=true -p ${app_env.SKAFFOLD_PROFILE}  -o k8s-deploy.yaml -i app-image=${IMAGE_NAME} "
            sh "skaffold render -f ./.skaffold.yaml  --digest-source=tag --default-repo=${app_env.IMAGE_REPOSITORY}  --offline=true -p ${app_env.SKAFFOLD_PROFILE}  -o k8s-deploy.yaml -i app-image=CONTAINER_IMAGE "               
                }
        
    }
}
