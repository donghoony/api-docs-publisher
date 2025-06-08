val projectVersion = "0.0.1"
val lombokVersion = "1.18.38"
val restdocsVersion = "0.19.4"

plugins {
    id("java")
    id("com.epages.restdocs-api-spec") version restdocsVersion
}

group = "hoony.me"
version = projectVersion

repositories {
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

dependencies {
    // lombok
    compileOnly("org.projectlombok:lombok:$lombokVersion")

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}
