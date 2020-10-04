node {
   // This is to demo github action
   def sonarUrl = 'http://129.146.173.193:9000'
   def leetcodeGit = 'https://github.com/bhaskaro/leetcode'
   def mvn = tool (name: 'maven3', type: 'maven') + '/bin/mvn'

   stage('SCM Checkout') {
        // Clone repo
        git branch: 'master',
        //credentialsId: 'github',
        url: '${leetcodeGit}'
   }

   stage('Sonar & Jacoco Publish'){
	  //withCredentials([string(credentialsId: 'sonarqube', variable: 'sonarToken')]) {
       // def sonarToken = "sonar.login=${sonarToken}"
       // sh "${mvn} verify sonar:sonar"
	 //}
	 sh "${mvn} verify sonar:sonar"
   }


   stage('Maven Package'){
	   // Build using maven
	   sh "${mvn} clean compile package install"
   }

   stage('deploy-dev') {
       //def tomcatDevIp = '172.31.28.172'
	   //def tomcatHome = '/opt/tomcat8/'
	   //def webApps = tomcatHome+'webapps/'
	   //def tomcatStart = "${tomcatHome}bin/startup.sh"
	   //def tomcatStop = "${tomcatHome}bin/shutdown.sh"

	   //sshagent (credentials: ['tomcat-dev']) {
	   //   sh "scp -o StrictHostKeyChecking=no target/myweb*.war ec2-user@${tomcatDevIp}:${webApps}myweb.war"
       //   sh "ssh ec2-user@${tomcatDevIp} ${tomcatStop}"
	  //    sh "ssh ec2-user@${tomcatDevIp} ${tomcatStart}"
	  // }
	   echo "dummy deploy-dev stage."
   }

   stage('deploy-prod') {
     echo "dummy deploy-dev stage."
   }
   stage('Send Email Notification') {
		mail bcc: '', body: """Hi Team, You build successfully deployed
		                       Job URL : ${env.JOB_URL}
							   Job Name : ${env.JOB_NAME}
							   Sonar Url : ${sonarUrl}
        Thanks,
        DevOps Team""", cc: '', from: '', replyTo: '', subject: "${env.JOB_NAME} Success", to: 'bhaskaro@gmail.com'
   }
}