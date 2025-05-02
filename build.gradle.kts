import io.papermc.paperweight.userdev.ReobfArtifactConfiguration

plugins {
    id("java")
    id("com.gradleup.shadow") version "9.0.0-beta13"
    id("io.papermc.paperweight.userdev") version "2.0.0-beta.16"
    id("xyz.jpenilla.resource-factory-paper-convention") version "1.2.0"
}

setGroup("org.stablerpg.stablemobs")
setVersion("1.0.0")

repositories {
    mavenCentral()
}

dependencies {
    paperweight.paperDevBundle("1.21.5-R0.1-SNAPSHOT")

    compileOnly("org.projectlombok:lombok:1.18.38")
    annotationProcessor("org.projectlombok:lombok:1.18.38")
}

tasks {
    java {
        toolchain.languageVersion.set(JavaLanguageVersion.of(21))
    }
    compileJava {
        options.release.set(21)
    }
    jar {
        enabled = false
    }
    shadowJar {
        archiveFileName.set("${project.name}-${project.version}.jar")
        minimize()
    }
    assemble {
        dependsOn(shadowJar)
    }
    paperweight {
        reobfArtifactConfiguration.set(ReobfArtifactConfiguration.MOJANG_PRODUCTION)
    }
    paperPluginYaml {
        name.set(rootProject.name)
        main.set("${project.group}.${rootProject.name}")
        apiVersion.set("1.21")
        paperPluginYaml.
        author.set("ImNotStable")
    }
}
