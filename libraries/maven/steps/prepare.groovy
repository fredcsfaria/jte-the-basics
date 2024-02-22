void call(String repo){
    stage("Maven: Prepare"){
 
    println "git commit -m ${repo}" 
}
}
