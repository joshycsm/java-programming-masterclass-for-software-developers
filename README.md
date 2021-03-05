# java-programming-masterclass-for-software-developers

## Section 1: Course Introduction 17min

### 1. Introduction to the Course

-

## Section 2: Software Tools Setup 37min

### 7. Biggest Tip to Succeed as a Java Programmer

- Intellij and JDK 11

### 9. Software Tools Introduction

- Intellij and JDK 11

### 10. Java Development Kit INstallation Overview

- Intellij and JDK 11 install on respective OS

### 14. Installing JDK 11 for Mac

- Amazon Corretto - JDK for the Mac
- "Google"
- download 11
- .pkg file

### 15. Installing Intellij IDEA for Mac

- jetbrains
- download free version

### 18. Configuring IntelliJ IDEA - WINDOWS, MAC AND LINUX

- JDK, is effectively a Software Development kit, or SDK

- contains the tools you need to write programs

- The Java Development Kit includes the tools that enables the computer to undertand your Java code, and execute it.

- Also has a debugger, and we'll be seeing what that is, and how to use it, when we've written a program to debug!

- Deselect imports, one-line methods, closures, generic constructor and method parameters, to show as much code as possible

## Section 3: First Steps 2hr 47min

### 19. Introduction

- Learn Java keywords, variables, data types, main method, expressions, operators, primitive datatypes, strings

### 20. Hello World Project

-       public class Hello {

        }

- Java programs (and most other programming languages) have keywords. Each has a specific meaning and sometimes they need to be used in specific orders.

- You write Java programs by following a specific set of rules, using a combination of these keywords and other things you will see which collectively from a Java program.

- NOTE: keywords are case sensitive - public and Public and even PUBLIC are different things

- **public** and **class** are two java keywords - they have a specific meaning which we will find out more about moving forward

- The **public** Java keyword is an access modifier. An access modifier allows us to define the scope or how other parts of your code or even someone else's code can access this code. More on this later.

- For now, we will use the public access modifier to give full access. We'll come back to access modifiers once we get further into the course.

- Defining a class. The **class** keyword is used to define a class with the name following the keword - Hello in this case and left and right curly braces to define the class block

- To define a class requirek an optional access modifier, followed by class, followed by the left and right curly braces.

- The left and right curly braces are defining the class body - anything in between them is "part" of this class. We can have data and code as you will see as we progress.

- So that's our first class defined.

- Next we will add our first ever method and define what that is.

### 21. Defining the Main Method

- What is a method? It's a collection of statements (one or more) that performs an operation. We'll be using a special method called the main method that Java looks for when running a program. It's the entry point of any Java code.

- You can create your own methods as you will see later, but for now, let's create this main method.

- **public** is an access modifer we discussed when defining the class in the last video - same principle.

- **static** is a Java keyword that needs an understanding of other concepts, so for now, know that we need to have static for java to find our method to run the code we are going to add.

- **void** is yet another java keyword used to indicate that the method will not return anything - more on that later

- The left and right parenthesis in a method declaration are mandatory and can optionally include one or more parameters - which is a way to pass information to a method. More on that later.

- **Code block** A code block is used to define a block of code. It's mandatory to have one in a method declaration and it's here where we will be adding statements to perform certain tasks.

- **Statement** - This is a complete command to be executed and can include one or more expressions (we'll see these in action later)

-       public class Hello {

            public static void main(String[] args) {
                System.out.println("Hello World");
            }
        }

### 22. Hello World Challenge and Common Errors

- debugging, look for errors.

- String literal is defined with characters inside double quotes.

### 23. Variables

- Variables are a way to store information in our computer. Variables that we define in a program can be accessed by a name we give them, and the computer does the hard work of figuring out where they get stored in the computers random access memory (RAM)

- A variable, as the name suggest can be changed, in other words, it's contents are variable.

- There are lots of different types of data we can define for our variables. Collectively these are known as Data types. As you may have guessed, data types are keywords in Java.

- Let's start out by defining a variable of type **int - int** being an abbreviation for integer, a whole number (that is a number without any decimal points).

- To define a variable we need to specify the data type, then give our variable a name, and optionally add an expression to initialize the variable with a value.

- Let's define our first variable:

  -         int myFirstNumber = 5

  - Declaration Statement - Used to define a variable by indicating the data type, and the name, and optionally to set the variable to a certain value.

  - Here the type (short for Data type) is an **int**, the name is **myFirstNumber** and the value we are assigning or initializing our variable with is **5**. We are declaring a variable of type **int** with the name **myFirstNumber** and assinging the value **5** to it.

  - Expression - This is a construct that evaluates to a single value - we'll discuss this in much more detail in the upcoming section on expressions.

- Challenge: Looking at the first **System.out.println** statement, what do you think should be typed on the line below our declaration statement to print out the value of the variable **myFirstNumber**?

  -       sout => Prints a string to System.out.println()
  -       souv => Prints a value to System.out.println()
  -       psvm => Main method declaration

- String Literal - Any sequence of characters surrounded by double quotes is a String literal in Java. It's value cannot be changed, unlike a variable.

- Java Operators - or just operators perform an operation (hence the word) on a variable or value. **+, -, /** and **\*** are four common ones that I feel sure that you are familiar with.

- There are lots more you will learn as we go through the course

### 24. Starting out with Expressions

- Challenge:

  - **Create additional variables.**
  - Declare the following variables and add to our program
  - **mySecondNumber** which is an int and assign a value of **12** to it.
  - **myThirdNumber**, also an **int** with a value of **6**.
  -     public class Hello {

            public static void main(String[] args) {
                System.out.println("Josh Cabral");

                int myFirstNumber = (10 + 5) + (2 * 10);
                int mySecondNumber = 12;
                int myThirdNumber = myFirstNumber * 2;
                int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
                System.out.println(myTotal);
                int myLastOne = 1000 - myTotal;
                System.out.println(myLastOne);
            }
        }

### 25. Primitive Types

- In Java primitive types are the most basic data types. The **int** is one of eight primitive types.

- The eight primitive data types in Java are **boolean, byte, char, short, int, long, float** and **double**. Consdier these as the building blocks of data manipulation. Let's expore the eight prmitive types in Java.

- Java Packages

  - A package is a way to oraganize your Java Projects. For now, consider them as folders with **learnprogramming** in our example being a subfolder of **academy**. Companies use their domain names reversed.

  - So **learnprogarmming.academy** becomes **academy.learnprogramming** - we will go into a lot more detail about packages later in the course.

- Wrapper classes:

  - Java uses the concept of a Wrapper class for all eight primitive tyeps - in the case of an **int**, we can use **Integer**, and by doing that it gives us ways to perform operations on an **int**.

  -         int myMinIntValue = Integer.MIN_VALUE;
            int myMaxIntValue = Integer.MAX_VALUE;
            System.out.println("Integer Minimum Value = " + myMinIntValue);
            System.out.println("Integer Maximum Value = " + myMaxIntValue);

  - In this case, we are using the **MIN_VALUE** and **MAX_VALUE** to get Java to tell us the minimum and maximum ranges of numbers that can be stored.

  - Will experience **overload** if +1 above max value or -1 below min value

  - If you try and put a value larger than the maximum value in Java, or a value smaller than the minimum value in Java, then you will get an Overflow in the case of the maximum value or an Underflow in the case of the minimum.

  - The computer just skips back to the minimum number or the maximum number, which is usually not what you want. it's an important concept to be aware of.

- A datatype does exist to store even bigger values. Must stay in range of whatever data type you are using!

- We will learn more about the short, byte, long and width next!

### 26. byte, short, long and width

- Additional whole number data types!

- Size of Primitive Types and Width

  - a **Byte** occupies 8 bits. A bit is not directly represented in a primitive type - We have a **boolean** which is not really the same thing that we will discuss in a future video. So a **Byte** occupies **8 bits**. We can say that a **byte** has a width of **8**.

  - A **short** can store a large range of numbers and occupies **16 bits**, and has a width of **16**.

  - An **int**, has a much larger range as we know, and occupies **32 bits**, and has a width of **32**.

  - The point here is that each primitive type occupies a different amount of memory - we can see that an **int** needs four times the amount of space, than a **byte** does for example.

  - It's not particulary relevant for you to know these numbers, but it could come up as an interview question and it is useful that certain data types take up more space than others.

-       System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;
        System.out.println("myMaxIntTest = " + myMaxIntTest);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        long myLongValue = 100;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        long bigLongLiteralVAlue = 2_147_483_647_333L;
        System.out.println(bigLongLiteralVAlue);

        short bigShortLiteralValue = 32767;

### 27. Casting in Java

- Arithmetic and Casting
- Casting in Java

  - Casting means to treat or convert a number from one type to another. We put the type we want the number to be in parenthesis liek this:

  - **(byte)**(myMinByteValue/2);

  - Other languages have casting, this is not just a Java thing.

  - if you don't specify the data type, computer will generally assume an expression is an int. So stick with int in most cases over byte, short, etc.

### 28. Primitive Types Challenge

- Your challenge is to create a **byte** variable and set it to any valid **byte** number, it doesn't matter. Create a **short** variable and set it to any valid **short** number.

- Create an **int** variable and set it to any valid **int** number. Lastly, create a variable of type **long** and make it **equal to 50000 plus 10 times** the **sum** of the **byte plus** the **short plus** the **integer** values

### 29. float and double Primitive Types

-

### 30. Floating Point Precison and a Challenge

-

### 31. The char and boolean Primitive Data Types

-

### 32. Primitive Types Recap and the String Data Type

-

### 33. Operators, Operands and Expressions

-

### 34. Abbreviating Operators

-

### 35. if-then Statement

-

### 36. Logical and Operator

-

### 37. Logical OR Operator

-

### 38. Assignment Operator VS Equals to Operator

-

### 39. Ternary Operator

-

### 40. Operator Precedence and Operator Challenge

-

### 41. First Steps Summary

-

### 42. End of Remaster

-

## Section 4: Java Tutorial: Expressions, Statements, Code blocks, Methods and more 3hr 23min

### 43. Introduction

-

### 44. Keywords and Expressions

-

### 45. Statements, Whitespace and Indentation (Code Organization)

-

### 46. Code Blocks And The If Then Else Control Statements

-

### 47. if then else Recap

-

### 48. Methods In Java

-

### 49. More on Mehtods And A Challenge

-

### 50. Method Challenge - Final Code Changes

-

### 51. DiffMerge Tool Introduction

-

### 52. Install DiffMerge

-

### 53. Using DiffMerge

-

### 54. Coding Exercises

-

### 55. Coding Exercises Example Part 1

-

### 56. Coding Exercies Example Part 2

-

### 57. Coding Exercies Example Part 3

-

Coding Exercise 1: Speed Converter
Coding Exercise 2: MegaBytes Converter
Coding Exercise 3: Barking Dog
Coding Exercise 4: Leap Year Calculator
Coding Exercise 5: DecimalComparator
Coding Exercise 6: Equal Sum Checker
Coding Exercise 7: Teen Number Checker

### 58. Method Overloading

-

### 59. Method Overloading Recap

-

### 60. Seconds and Minutes Challenge

-

### 61. Bonus Challenge Solution

-

Coding Exercise 8: Area Calculator
Coding Exercise 9: Minutes to Years and Days Calculator
Coding Exercise 10: Equality Printer
Coding Exercise 11: Playing Cat

## Section 5: Control Flow Statements 2hr 57min

### 62. Introduction

-

### 6

-

### 6

-

### 6

-

### 6

-

### 6

-

### 6

-

### 6

-

### 7

-

### 7

-

### 7

-

### 7

-

### 7

-

### 7

-

## Section 6: OOP Part 1 - Classes, Constructors and Inheritance 2hr 36min

### 7

-

### 7

-

### 7

-

### 7

-

### 8

-

### 8

-

### 8

-

### 8

-

### 8

-

### 8

-

### 8

-

### 8

-

### 8

-

### 8

-

## Section 7: OOP Part 2 - Composition, Encapsulation, and Polymorphism 2hr 20min

### 9

-

### 9

-

### 9

-

### 9

-

### 9

-

### 9

-

### 9

-

### 9

-

### 9

-

## Section 8: Arrays, Java inbuilt Lists, Autoboxing and Unboxing 5hr 49min

### 99. Arrays

-

### 10

-

### 10

-

### 10

-

### 10

-

### 10

-

### 10

-

### 10

-

### 10

-

### 10

-

### 10

-

### 11

-

### 11

-

### 11

-

### 11

-

### 11

-

### 11

-

### 11

-

### 11

-

### 11

-

### 11

-

### 12

-

### 12

-

### 12

-

## Section 9: Inner and Abstract Classes & Interfaces 3hr 3min

### 12

-

### 12

-

### 12

-

### 12

-

### 12

-

### 12

-

### 12

-

### 13

-

### 13

-

### 13

-

### 13

-

### 13

-

### 13

-

## Section 10: Java Generics 1hr 5min

### 13

-

### 13

-

### 13

-

### 13

-

### 14

-

## Section 11: Naming Conventions and Packages. static and final keywords 2hr 31min

### 14

-

### 14

-

### 14

-

### 14

-

### 14

-

### 14

-

### 14

-

### 14

-

### 14

-

### 15

-

### 15

-

### 15

-

## Section 12: Java Collections 6hr 36min

### 15

-

### 15

-

### 15

-

### 15

-

### 15

-

### 15

-

### 15

-

### 16

-

### 16

-

### 16

-

### 16

-

### 16

-

### 16

-

### 16

-

### 16

-

### 16

-

### 16

-

### 17

-

### 17

-

### 17

-

### 17

-

### 17

-

### 17

-

### 17

-

### 17

-

### 17

-

### 17

-

## Section 13: JavaFX 10hr 6min (Learn based on need)

### 180 - 225.

-

## Section 14: Basic Input & Output including java.util 8hr 22min

### 226. Exceptions

-

### 263. Mapping IO and NIO Methods

-

## Section 15: Concurrency in Java 5hr 26min

### 26

-

### 26

-

### 26

-

### 26

-

### 26

-

### 26

-

### 27

-

### 27

-

### 27

-

### 27

-

### 27

-

### 27

-

### 27

-

### 27

-

### 27

-

### 27

-

### 28

-

### 28

-

### 28

-

### 28

-

### 28

-

### 28

-

### 28

-

### 28

-

### 28

-

### 28

-

### 29

-

### 29

-

### 29

-

## Section 16 Lambda Expressions 3hr 11min

### 29

-

### 29

-

### 29

-

### 29

-

### 29

-

### 29

-

### 29

-

### 30

-

### 30

-

### 30

-

### 30

-

### 30

-

### 30

-

## Section 17: Regular Expressions 1hr 54min

### 30

-

### 30

-

### 30

-

### 30

-

### 31

-

### 31

-

### 31

-

### 31

-

## Section 18: Debugging and Unit Testing 2hr 46min

### 314. Introduction to Debugging

-

### 324. Junit Challenges #8 to #10

-

## Section 19: Databases 7hr 40min

### 325. Section Introduction

-

### 359. Handling Updates

-

## Section 20: Java Networking Programming 2hr 24min

### 3

-

## Section 21: Java 9 Module System 14min

### 3

-

## Section 22: Migrating Java Projects to Java 9 1hr 5min

### 3

-

## Section 23: Course Remaster in Progress 2hr 26min

### 3

-

## Section 24: Archived Videos 31min

### 3

-

## Section 25: Extra Information - Source code, and other stuff 19min

### 400. Source code for all Programs

-

### 401. Bonus Lecture and Information

-
