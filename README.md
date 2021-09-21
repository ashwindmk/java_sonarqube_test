# SonarQube

### Steps to Run
1. Start sonarqube server.
   ```
   ./sonar.sh start
   ```
   
2. Execute sonarqube.
   ```
   ./gradlew clean
   ./gradlew build
   ./gradlew jacocoTestReport
   ./gradlew sonarqube -Dsonar.host.url=http://localhost:9000/ -Dsonar.verbose=true
   ```
   
3. Check Report
   http://localhost:9000
