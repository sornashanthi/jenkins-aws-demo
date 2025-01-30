FROM openjdk:21
EXPOSE 8081
ADD target/jenkins-aws-demo.jar jenkins-aws-demo.jar
ENTRYPOINT [ "java", "-jar", "jenkins-aws-demo.jar" ]