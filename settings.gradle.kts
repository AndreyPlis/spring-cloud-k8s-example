
pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
    plugins {
        kotlin("jvm") version "1.5.21"

        id("org.springframework.boot") version "2.4.5"
        id ("io.spring.dependency-management") version "1.0.11.RELEASE"
        id ("io.spring.gradle") version "1.0.11.RELEASE"
        id ("com.google.cloud.tools.jib") version "3.1.2"

    }
}




rootProject.name = "spring-cloud-k8s-example"
include("service")
