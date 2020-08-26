#IMAGEN BASE JAVA
FROM openjdk:8-jdk-slim

# COPIAMOS EL JAR COMPILADO AL DIRECTORIO DE TRABAJO
COPY "./target/springconsola-0.0.1-SNAPSHOT.jar" "desarrolladores.jar"

#EXPONEMOS EL PUERTO DE LA IMAGEN
EXPOSE 8080

#establecemos el punto de entrada con los comandos que se desan ejecutar

ENTRYPOINT ["java","-jar","desarrolladores.jar"]