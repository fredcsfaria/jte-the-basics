  // seta contexto default - build Host
  sh 'docker context use default'
  checkout([$class: 'SubversionSCM', additionalCredentials: [], excludedCommitMessages: '', excludedRegions: '', excludedRevprop: '', excludedUsers: '', filterChangelog: false, ignoreDirPropChanges: false, includedRegions: '', locations: [[cancelProcessOnExternalsFail: true, credentialsId: 'svn_repositorio', depthOption: 'infinity', ignoreExternalsOption: true, local: '.', remote: "${SVN_REPO_URL}"]], quietOperation: true, workspaceUpdater: [$class: 'UpdateUpdater']])
                
