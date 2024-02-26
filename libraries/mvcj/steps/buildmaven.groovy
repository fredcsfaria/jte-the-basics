void call( String branchName){
    stage("mvcj: Build"){
        println "Build com Maven - branch  ${branchName} " 
        
         //println "Prepara para build"
       // seta contexto default - build Host
        sh ' mvn --batch-mode install -P nexus'
    }
} 
