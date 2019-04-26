FROM registry.access.redhat.com/redhat-openjdk-18/openjdk18-openshift

ENV JAVA_APP_JAR camel-boot-ws-1.0-SNAPSHOT.jar
ENV AB_ENABLED off
ENV AB_JOLOKIA_AUTH_OPENSHIFT true
ENV JAVA_OPTIONS -Djava.security.egd=file:///dev/./urandom

EXPOSE 8080

ADD  target/camel-boot-ws-1.0-SNAPSHOT.jar /deployments/
