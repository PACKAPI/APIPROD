# Usa uma imagem do OpenJDK
FROM bellsoft/liberica-openjdk-debian:22

# Define o diretório de trabalho
WORKDIR /app

# Copia o arquivo JAR gerado pelo Maven ou Gradle
COPY target/APIproduct-0.0.1-SNAPSHOT.jar app.jar

# Expõe a porta 8080 (ou a que seu app usa)
EXPOSE 8080

# Comando para rodar a aplicação
CMD ["java", "-jar", "app.jar"]
