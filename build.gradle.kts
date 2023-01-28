plugins {
    java
    id("org.springframework.boot") version "3.0.2"
    id("io.spring.dependency-management") version "1.1.0"
}

group = "edu.penzgtu"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    compileOnly("org.projectlombok:lombok")
    developmentOnly("org.springframework.boot:spring-boot-devtools")
    annotationProcessor("org.projectlombok:lombok")
    testImplementation("org.springframework.boot:spring-boot-starter-test")

    // Swagger
    developmentOnly("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.0.2")
    implementation("io.swagger.core.v3:swagger-annotations:2.2.8")

    // Postgres
    runtimeOnly("org.postgresql:postgresql")

    // Spring JPA
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-validation")

    // Model mapper
    implementation("org.modelmapper:modelmapper:+")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
