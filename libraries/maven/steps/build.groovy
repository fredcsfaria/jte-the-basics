void call( String name1){
    stage("Maven: Build"){
        println "build from the maven library ${config.branchName}       "
        println "${name1}"
         println "Prepara para build"
       // seta contexto default - build Host
     //  sh 'docker context use default'
       checkout([$class: 'SubversionSCM', additionalCredentials: [], excludedCommitMessages: '', excludedRegions: '', excludedRevprop: '', excludedUsers: '', filterChangelog: false, ignoreDirPropChanges: false, includedRegions: '', locations: [[cancelProcessOnExternalsFail: true, credentialsId: 'svn_repositorio', depthOption: 'infinity', ignoreExternalsOption: true, local: '.', remote: "${config.branchName}" ]], quietOperation: true, workspaceUpdater: [$class: 'UpdateUpdater']])
    }
}
