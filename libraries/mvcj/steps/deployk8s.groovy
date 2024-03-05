void call( app_env ){
    stage("mvcj: Deploy "){

        println "AQUI"  
        println "${params.branchName}"
       // println "${app_env.DEFAULT_REPOSITORY2}" +  "/" + "${DEFAULT_REPOSITORY1}" + "/" + "${IMAGE_NAME1}"
       //def IMAGE = "${app_env.IMAGE_REPOSITORY}" +  "/" + "${REPOSITORY}" + "/" + "${IMAGE_NAME}"
       def IMAGE = "${app_env.CONTAINER_REGISTRY}" +  "/" + "${env.REPOSITORY}" + "/" + "${env.IMAGE_NAME}" + ":" + "${params.IMAGE_TAG}"
         println(IMAGE); 
        println "Deploy artefatos para ${app_env.URL_CONTAINER_REGISTRY} ${IMAGE} " 
          script {
                 withKubeConfig(caCertificate: '',   credentialsId: "${app_env.CREDENCIAL_K8S}", namespace: 'default', restrictKubeConfigAccess: false, serverUrl: "${app_env.CLUSTER_K8S_API}") {
                // some block
                sh ' kubectl config view'
                             
                      
                    }  
                 }
       
        
    }
}
