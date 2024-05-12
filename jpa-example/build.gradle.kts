plugins {
    id("spring-boot-convention")
    kotlin("plugin.jpa")
}

dependencies {
    implementation(libs.spring.boot.starter)
    implementation(libs.spring.boot.starter.web)
    implementation(libs.spring.boot.starter.actuator)
    implementation(libs.spring.boot.starter.data.jpa)
    testImplementation(libs.spring.boot.starter.test)

    runtimeOnly("com.h2database:h2")
}
