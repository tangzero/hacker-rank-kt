import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.61"
}

allprojects {
    apply(plugin = "kotlin")

    repositories {
        mavenCentral()
    }

    dependencies {
        implementation(kotlin("stdlib"))

        testImplementation(kotlin("test"))
        testImplementation("org.junit.jupiter:junit-jupiter:5.5.2")
        testImplementation("io.mockk:mockk:1.9.3")
    }

    tasks.withType<Test> {
        useJUnitPlatform()
        
    }

    tasks.withType<KotlinCompile>().all {
        kotlinOptions {
            jvmTarget = JavaVersion.VERSION_1_8.toString()
        }
    }
}
