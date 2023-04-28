plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
    `maven-publish`
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = project.group.toString()
            artifactId = "b-ext"
            version = project.version.toString()

            from(components["java"])

            pom {
                name.set(project.name)
                description.set("Android build extensions")
                url.set("http://www.example.com/library")
                /*properties.set(mapOf(
                    "myProp" to "value",
                    "prop.with.dots" to "anotherValue"
                ))*/
                licenses {
                    license {
                        name.set("The Apache License, Version 2.0")
                        url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                    }
                }
                developers {
                    developer {
                        id.set("solo4")
                        name.set("Semen Kaskasian")
                        email.set("semen.kaskasian@gmail.com")
                    }
                }
                scm {
                    connection.set("scm:git:git://example.com/my-library.git")
                    developerConnection.set("scm:git:ssh://example.com/my-library.git")
                    url.set("http://example.com/my-library/")
                }
            }
        }
    }
}

group = "dev.solo4.androidbuildhelper"
version = "1.0"