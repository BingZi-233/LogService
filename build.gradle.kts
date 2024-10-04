
import io.izzel.taboolib.gradle.*
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile


plugins {
    java
    id("io.izzel.taboolib") version "2.0.18"
    id("org.jetbrains.kotlin.jvm") version "1.8.22"
}

taboolib {
    env {
        install(Basic)
        install(Bukkit)
        install(BukkitUtil)
        install(Metrics)
        install(CommandHelper)
        install(MinecraftChat)
        install(I18n)
    }
    description {
        name = "LogService"
        contributors {
            name("BingZi-233")
        }
    }
    version { taboolib = "6.2.0-beta15" }
}

repositories {
    mavenCentral()
}

dependencies {
    // ORMLite 核心
    compileOnly("com.j256.ormlite:ormlite-core:6.1")
    // ORMLite JDBC 支持
    compileOnly("com.j256.ormlite:ormlite-jdbc:6.1")
    // SQLite驱动
    compileOnly("org.xerial:sqlite-jdbc:3.46.1.3")
    // MySQL驱动
    compileOnly("com.mysql:mysql-connector-j:8.0.33")
    // HikariCP 数据库连接池
    compileOnly("com.zaxxer:HikariCP:5.1.0")
    compileOnly("ink.ptms.core:v12004:12004:mapped")
    compileOnly("ink.ptms.core:v12004:12004:universal")
    compileOnly(kotlin("stdlib"))
    compileOnly(fileTree("libs"))
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = "1.8"
        freeCompilerArgs = listOf("-Xjvm-default=all")
    }
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}
