FROM openjdk:17-alpine

## https://security.alpinelinux.org/vuln/CVE-2021-46848
#RUN apk add --upgrade libtasn1-progs
#
## https://security.alpinelinux.org/vuln/CVE-2022-37434
#RUN apk update && apk upgrade zlib

# Create a new user with UID 10014
RUN addgroup -g 10014 choreo && \
    adduser  --disabled-password  --no-create-home --uid 10014 --ingroup choreo choreouser
VOLUME /tmp
USER 10014
# Add Spring Boot app.jar to Container
ADD target/british-airways-flyer-miles.jar british-airways-flyer-miles.jar
# Expose the port your application will run on
EXPOSE 8090
# Fire up our Spring Boot app by default
#CMD [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
ENTRYPOINT ["java","-jar","/british-airways-flyer-miles.jar"]

