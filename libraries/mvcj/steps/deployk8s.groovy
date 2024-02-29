void call( app_env ){
    stage("mvcj: Deploy "){
         
        println "Render artefatos para ${app_env.URL_CONTAINER_REGISTRY} ${IMAGE_NAME} " 
          script {
                 withKubeConfig(caCertificate: '',   credentialsId: "${app_env.CREDENCIAL_K8S}", namespace: 'default', restrictKubeConfigAccess: false, serverUrl: "${app_env.CLUSTER_K8S_API}") {
                // some block
                sh ' kubectl config view'
                             
                      
                    }  
                 }
        /*   withDockerRegistry(credentialsId: 'nexus_repository', url: "${app_env.URL_CONTAINER_REGISTRY}" ) {
              //sh "skaffold build -f ./.skaffold.yaml -p ${app_env.SKAFFOLD_PROFILE}     --default-repo=${app_env.DEFAULT_REPOSITORY}  --file-output=skaffold_build_result_json.ci.out   --insecure-registry=${app_env.CONTAINER_REGISTRY}    --push=false  --tag=${config.TAG}"
             sh "skaffold render -f ./.skaffold.yaml  --digest-source=tag --default-repo=${app_env.DEFAULT_REPOSITORY}  --offline=true -p ${app_env.SKAFFOLD_PROFILE}  -o k8s-deploy.yaml -i app-image=${IMAGE_NAME} "
               
                } */
        
    }
}
