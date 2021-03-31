# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
FROM adoptopenjdk/openjdk11:alpine-jre
ADD target/dockerdemo-0.0.1-SNAPSHOT.jar dockerdemo.jar
ENTRYPOINT ["java","-jar","dockerdemo.jar"]
