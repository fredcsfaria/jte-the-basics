void call( app_env ){
    stage("mvcj: Deploy "){

        println "${app_env.DEFAULT_REPOSITORY}" +   "${DEFAULT_REPOSITORY1}" + "${IMAGE_NAME1}"
        println "Render artefatos para ${app_env.URL_CONTAINER_REGISTRY} ${IMAGE_NAME} " 
          script {
                 withKubeConfig(caCertificate: '',   credentialsId: "${app_env.CREDENCIAL_K8S}", namespace: 'default', restrictKubeConfigAccess: false, serverUrl: "${app_env.CLUSTER_K8S_API}") {
                // some block
                sh ' kubectl config view'
                             
                      
                    }  
                 }
       
        
    }
}
