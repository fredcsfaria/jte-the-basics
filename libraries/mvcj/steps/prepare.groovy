void call( String name1){
    stage("mvcj: Prepare"){
        println "build from the maven library   ${name1} " 
        echo name1
         println "Prepara para build"
       // seta contexto default - build Host
     //  sh 'docker context use default'
       checkout([$class: 'SubversionSCM', additionalCredentials: [], excludedCommitMessages: '', excludedRegions: '', excludedRevprop: '', excludedUsers: '', filterChangelog: false, ignoreDirPropChanges: false, includedRegions: '', locations: [[cancelProcessOnExternalsFail: true, credentialsId: 'svn_repositorio', depthOption: 'infinity', ignoreExternalsOption: true, local: '.', remote: name1 ]], quietOperation: true, workspaceUpdater: [$class: 'UpdateUpdater']])
    }
}
