void call( app_env ){
    stage("mvcj: Deploy "){

        println "AQUI"  
        println "${SVN_REPO_URL}"
        println "${app_env.DEFAULT_REPOSITORY2}" +  "/" + "${DEFAULT_REPOSITORY1}" + "/" + "${IMAGE_NAME1}"
        println "Deploy artefatos para ${app_env.URL_CONTAINER_REGISTRY} ${IMAGE_NAME} " 
          script {
                 withKubeConfig(caCertificate: '',   credentialsId: "${app_env.CREDENCIAL_K8S}", namespace: 'default', restrictKubeConfigAccess: false, serverUrl: "${app_env.CLUSTER_K8S_API}") {
                // some block
                sh ' kubectl config view'
                             
                      
                    }  
                 }
       
        
    }
}
