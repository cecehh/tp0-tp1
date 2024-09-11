plugins {
    id("java")
    id("org.openjfx.javafxplugin") version "0.0.13"
    id("org.sonarqube") version "4.4.1.3373"
}

group = "fr.chelie"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_20
    targetCompatibility = JavaVersion.VERSION_20
}

sonar {
    properties {
        property("sonar.projectKey", "cecehh_tp0-tp1")
        property("sonar.organization", "cecehh")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}

javafx {
    version = "20.0.1"
    modules("javafx.controls", "javafx.fxml")
}


dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("mysql:mysql-connector-java:8.0.33")
}




tasks.test {
    useJUnitPlatform()
}