plugins {
    kotlin("jvm")
    id ("org.springframework.boot")
    id ("io.spring.dependency-management")
    id ("com.google.cloud.tools.jib")
}


repositories {
    mavenCentral()
}
dependencyManagement {
    imports {
        mavenBom("org.springframework.cloud:spring-cloud-dependencies:2020.0.2")
    }
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.cloud:spring-cloud-starter-kubernetes-fabric8")
}



jib.from.image = "adoptopenjdk/openjdk11"


