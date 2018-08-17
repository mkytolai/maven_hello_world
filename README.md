# maven_hello_world
A simple hello world with maven in java.

#############################################

This demo requires you to have both java and maven installed. Their installation is left as an exercise to the reader

#############################################

**INSTRUCTIONS FOR GNU/Linux:**

After downloading/cloning and extracting the files open a command line and change the directory to


´´´
cd Downloads/maven_hello_world-master/
```

where *Downloads/maven_hello_world-master* is the path that I extracted the files to

type the command:

´´´
mvn package
```

to package the compiled code to a distrubutable format (in this case .jar).


When you are greeted with the BUILD SUCCESS text you should again change directory to the "target" folder

´´´

cd target
```
and finally run the .jar with:
´´´

java -jar mvn-test-1.0-SNAPSHOT.jar
```



todo: make README less snarky and add macOS / windows support


