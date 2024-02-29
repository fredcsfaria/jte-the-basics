void call( app_env ){
    stage("mvcj: Deploy to "){
         
        println "Render artefatos    " 
         script {
                 withKubeConfig(caCertificate: '',   credentialsId: "${app_env.CREDENCIAL_K8S}", namespace: 'default', restrictKubeConfigAccess: false, serverUrl: "${app_env.CLUSTER_K8S_API}") {
                // some block
                sh ' kubectl config view'
                             
                        
                    }  
                 }
              
    }
}
