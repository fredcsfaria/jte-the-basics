void call( String name1){
    stage("mvcj: Scanning"){
        println "Scanning image  ${name1} " 
       // println "\""FRED\"""
      sh  "trivy image   --vuln-type os,library  --scanners vuln,secret  --severity HIGH,CRITICAL  --format sarif --output trivy_result_sarif.ci.out  --exit-code 0  --timeout 15m --ignore-unfixed --quiet ${cimage} "
                
        
    }
}
