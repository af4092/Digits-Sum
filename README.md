# Digits-Sum
Digits-Sum built on java, UI on window builder, building tool gradle.

- Simple project to check gradle building tool installation. Program sums all digits of given number:

<p align="center">
  <img src="https://user-images.githubusercontent.com/24220136/226554269-d267bc23-c826-42fc-96be-bc93000a4036.png" alt="Image">
</p>

## IMPORTANT 

- Popular error message is while trying to run jar file:

```
$ java -jar untitled-1.0-SNAPSHOT.jar
no main manifest attribute, in untitled-1.0-SNAPSHOT.jar
```

- To handle this, we have to add manifest file with the 'Main-Class' attribute to the JAR file in `build.gradle` file:

```
tasks.jar {
    manifest {
        attributes["Main-Class"] = "org.example.Main"
    }
}

```

--------------------

## [Implementation](https://github.com/af4092/Digits-Sum/blob/main/GradleAF/lib/src/main/java/gradleaf/Main.java)

- Java Swing-based user interface (UI) class named UI. It creates a simple GUI window that allows the user to input a number and calculate the sum of its digits

- The code is in a package named `gradleaf`.

- The UI class extends the `JFrame` class to create a window-based UI.

- The UI consists of a panel named `contentPane`, which serves as the main container for UI components.

- The UI contains several UI components:

    - A `JTextField` named `tfInput` for the user to enter a number.
    - A `JLabel` named `lbOutput` to display the result of the sum.
    - A `JLabel` named `lblNewLabel` to display a title for the UI.
    - A `JButton` named `btnSum` to initiate the calculation.
    
- In the constructor of the UI class:

    - The UI window's title, size, and close operation are set.
    - The content pane's layout is set to null.
    - The UI components are created, positioned, and added to the content pane.
    - An `action listener` is added to the btnSum button, which listens for button clicks. When the button is clicked, the action listener's actionPerformed method is invoked.

- Inside the actionPerformed method:

    - The text entered in the tfInput field is retrieved using `tfInput.getText()`.
    - The retrieved text is parsed into a Long value using `Long.parseLong()` and stored in `inputDouble`.
    - An instance of the `sumDigits` class (not provided) is created.
    - The sumDigits object's sumDigits method is called, passing `inputDouble` as an argument.
    - The returned result is cast to an int and stored in the result variable.
    - The result is converted to a String using `Integer.toString()` and stored in resultFinal.
    - The `resultFinal` string is set as the text of the `lbOutput` label.
    - The UI class does not define the sumDigits class, so the calculation logic for summing the digits of a number is missing. To make the code functional, you need to define the `sumDigits` class separately and provide its implementation.

- When the `UI` is launched and interacted with, it provides a simple input field for entering a number, a button to trigger the digit sum calculation, and a label to display the result.
