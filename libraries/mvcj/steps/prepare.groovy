void call( String branchName){
    stage("mvcj: Prepare"){
        println "Checkout from branch   ${branchName} "
       //  println "Checkout from config branch ${config.branchName3}"    
       //  println "Checkout from keyword branch ${branchName1}" 
        //  println "Checkout from keyword2 branch ${SVN_REPO_URL1}" 
        //  println "Checkout from config branch ${config.SVN_REPO_URL} " 
         //  println "Image to registry ${config.CONTAINER_REGISTRY} " 
         println "Prepara para build"
       // seta contexto default - build Host
       sh 'docker context use default'
       checkout([$class: 'SubversionSCM', additionalCredentials: [], excludedCommitMessages: '', excludedRegions: '', excludedRevprop: '', excludedUsers: '', filterChangelog: false, ignoreDirPropChanges: false, includedRegions: '', locations: [[cancelProcessOnExternalsFail: true, credentialsId: 'svn_repositorio', depthOption: 'infinity', ignoreExternalsOption: true, local: '.', remote: branchName ]], quietOperation: true, workspaceUpdater: [$class: 'UpdateUpdater']])
    }
}
