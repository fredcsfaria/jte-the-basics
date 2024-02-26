void call( String branchName){
    stage("mvcj: Prepare"){
        println "Checkout from branch   ${branchName} config.branchName3" 
        
         println "Prepara para build"
       // seta contexto default - build Host
       sh 'docker context use default'
       checkout([$class: 'SubversionSCM', additionalCredentials: [], excludedCommitMessages: '', excludedRegions: '', excludedRevprop: '', excludedUsers: '', filterChangelog: false, ignoreDirPropChanges: false, includedRegions: '', locations: [[cancelProcessOnExternalsFail: true, credentialsId: 'svn_repositorio', depthOption: 'infinity', ignoreExternalsOption: true, local: '.', remote: branchName ]], quietOperation: true, workspaceUpdater: [$class: 'UpdateUpdater']])
    }
}
