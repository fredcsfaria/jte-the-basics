void call(){
    stage("Maven: Build"){
        println "build from the maven library ${config.branchName}       "
         println "Prepara para build"
       // seta contexto default - build Host
     //  sh 'docker context use default'
       checkout([$class: 'SubversionSCM', additionalCredentials: [], excludedCommitMessages: '', excludedRegions: '', excludedRevprop: '', excludedUsers: '', filterChangelog: false, ignoreDirPropChanges: false, includedRegions: '', locations: [[cancelProcessOnExternalsFail: true, credentialsId: 'svn_repositorio', depthOption: 'infinity', ignoreExternalsOption: true, local: '.', remote: "https://cd-build-01:8083/svn/gsi/ws-sgd/branches/migracao_container" ]], quietOperation: true, workspaceUpdater: [$class: 'UpdateUpdater']])
    }
}
