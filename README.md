# Digits-Sum
Digits-Sum built on java, UI on window builder, building tool gradle.

Simple project to check gradle building tool installation. Program sums all digits of given number:

![image](https://user-images.githubusercontent.com/24220136/226554269-d267bc23-c826-42fc-96be-bc93000a4036.png)

## IMPORTANT 

Popular error message is while trying to run jar file:

```
$ java -jar untitled-1.0-SNAPSHOT.jar
no main manifest attribute, in untitled-1.0-SNAPSHOT.jar
```

To handle this, we have to add manifest file with the 'Main-Class' attribute to the JAR file in `build.gradle` file:

```
tasks.jar {
    manifest {
        attributes["Main-Class"] = "org.example.Main"
    }
}

```
