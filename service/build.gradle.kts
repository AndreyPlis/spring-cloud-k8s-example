plugins {
    kotlin("jvm")
    id ("org.springframework.boot")
    id ("io.spring.dependency-management")
    id ("com.google.cloud.tools.jib")
}


repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.springframework.boot:spring-boot-starter-web")
}

jib.from.image = "adoptopenjdk/openjdk11"


