void call( String branchName){
    stage("mvcj: Prepare"){
        println "Build com Maven - branch  ${branchName} " 
        
         //println "Prepara para build"
       // seta contexto default - build Host
        sh ' mvn --batch-mode install -P nexus'
    }
} 
