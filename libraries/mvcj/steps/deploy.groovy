void call( app_env ){
    stage("mvcj: Deploy to "){
         
        println "Render artefatos para ${app_env.URL_CONTAINER_REGISTRY} ${IMAGE_NAME} " 
         script {
                 withKubeConfig(caCertificate: '',   credentialsId: "${CREDENCIAL_K8S}", namespace: 'default', restrictKubeConfigAccess: false, serverUrl: "${CLUSTER_K8S_API}") {
                // some block
                sh ' kubectl config view'
             // sh 'skaffold apply -f ./.skaffold.yaml  -p ${SKAFFOLD_PROFILE}  k8s-deploy.yaml'
                  
                        
                    }  
                 }
              
    }
}
