void call( String cimage){
    stage("mvcj: Dependency"){
        println "Produzindo informação de dependencias  ${cimage} " 
        sh  ' trivy image --format cyclonedx  --scanners vuln --timeout 15m --output trivy-result-sbom-json.ci.out   ${cimage}  '
        
        
    }
}
