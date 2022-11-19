FROM openjdk:8
EXPOSE 9090
ADD /target/springboot-k8s-lab1-0.0.1.jar springboot-k8s-lab1-0.0.1.jar
ENTRYPOINT ["java","-jar","/springboot-k8s-lab1-0.0.1.jar"]