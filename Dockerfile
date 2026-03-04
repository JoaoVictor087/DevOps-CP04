FROM gradle:8.7-jdk21 AS builder
WORKDIR /app

COPY build.gradle settings.gradle gradlew ./
COPY gradle ./gradle

RUN chmod +x gradlew
RUN ./gradlew dependencies --no-daemon

# Copia o código
COPY src ./src

RUN ./gradlew bootJar --no-daemon

FROM eclipse-temurin:21-jdk-ubi10-minimal
WORKDIR /app

COPY --from=builder /app/build/libs/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]