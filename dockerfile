FROM nexus.homeoffice.anfcorp.com:6200/openjdk:17-alpine as build-jdk

RUN apk add --no-cache binutils && \
    apk upgrade -U -a

RUN $JAVA_HOME/bin/jlink \
         --verbose \
         --add-modules ALL-MODULE-PATH \
         --strip-debug \
         --no-man-pages \
         --no-header-files \
         --strip-java-debug-attributes \
         --compress=2 \
         --output /customjre

FROM nexus.homeoffice.anfcorp.com:6200/alpine:latest
ENV JAVA_HOME=/jre
ENV PATH="${JAVA_HOME}/bin:${PATH}"

COPY --from=build-jdk /customjre $JAVA_HOME

ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar

ENTRYPOINT [ "/jre/bin/java", "-jar", "/app.jar" ]
