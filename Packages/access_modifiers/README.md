### Testing of the sample code
  #### Step 1: Build all packages
  - Build `access1`.
  - Build `access2`, setting the classpath to access1 (Since access2 depends on access1 package).
  #### Step 2: Compile and build `main.java`.
  #### Step 3: Run obtained class file `accessMain`. _(Optional)_

### Building package `access1`
In the terminal, navigate to the directory this text file is in; i.e., **UP ONE LEVEL** from 'access1'.<br>
Run this command:<br>
```
javac access1\*.java
```
This basically tells the java compiler to compile all the .java files in the folder `access1`.

### Building package `access2`
Run this command staying in the same directory as in the previous command, i.e., **UP ONE LEVEL** from `access2`:<br>
```
javac -cp . access1\*.java access2\*.java
```
This tells the java compiler to compile all the .java files in the folder `access2` keeping the classpath at `access1`.

### _Optionally, execute and compile `main.java` as usual to see the results._
