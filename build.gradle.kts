plugins {
    id("earth.terrarium.cloche") version "0.7.7"
}


repositories {
    mavenLocal()

    mavenCentral()

    maven("https://maven.msrandom.net/repository/root")
}

cloche {
    metadata {
        modId.set("cynosure")
    }

    cloche.common {
        mixins.from(file("src/common/cynosure.mixins.json"))

        dependencies {
            compileOnly("org.spongepowered:mixin:0.8.3")
        }
    }

    fabric("fabric:1.20.1") {
        loaderVersion.set("0.16.9")
        minecraftVersion.set("1.20.1")

        client()
        server()

        dependencies {
            fabricApi("0.92.2+1.20.1")
        }
    }

    forge("forge:1.20.1") {
        loaderVersion.set("47.1.3")
        minecraftVersion.set("1.20.1")

        client()
        server()
    }
}