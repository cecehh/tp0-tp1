plugins {
    id("java")
    id("org.openjfx.javafxplugin") version "0.0.13"
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