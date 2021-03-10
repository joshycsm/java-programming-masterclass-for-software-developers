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

- Create an **int** variable and set it to any valid **int** number. Lastly, create a variable of type **long** and make it **equal to 50000 plus 10 times** the **sum** of the **byte plus** the **short plus** the **integer** values.

-       byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        System.out.println(longTotal);

        short shortTotal = (short) (1000 + 10 *
                (byteValue + shortValue + intValue));

        System.out.println("shortTotal = " + shortTotal);

### 29. float and double Primitive Types

- Unlike whole numbers, floating point numbers have fractional parts that we express with a decimal point. **3.14159** is an example.

- Floating point numbers are also known as real numbers. We use a floating point number when we need more precision in calculations.

- Single and Double Precision

  - Precision refers to the format and amout of space occupied by the type. Single precision occupies **32 bits** (so has a width of **32**) and a Double precision occupies **64 bits** ( and thus has a width of **64**).

  - As a result the **float** has a range from **1.4E-45 to 3.4028235E+38** and the **double** is much more precise with a range from **4.9E-324** to **1.7976931348623157E+308**.
  - double data type is accepted by default just as integer type is accepted as the default for whole numbers
  -     float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5;
        float myFloatValue = 5.25f;
        double myDoubleValue = 5.25d;

### 30. Floating Point Precison and a Challenge

- More on the float and double primitive types

  - Challenge

    - STEPS:
      1. Create a variable with the appropriate type to store the number of pounds to be converted to kilograms.
      2. Calculate the result i.e. the number of kilograms based on the contents of the variable above and store the result in a 2nd apporpriate variable.
      3. Print out the result.
    - HINT: **1** pound is equal to **0.45359237** of a kilogram. This should help you perform the calculation.

- Floating Point Number Precision Tips

  - In general **float** and **double** are great for general floating point operations. But both are not great to use where precise calculations are required - this is due to a limitation with how floating point numbers are stored, and not a Java problem as such.

  - Java has a class called **BigDecimal** that overcomes this. We will talk more about that later in the course. For now just keep in the back of your mind that when precise calculations are necessary, such as when performing currency calculations, floating-point types should not be used.

  - But for general calculations **float** and **double** are fine. Again, we will discuss it later in the course.

### 31. The char and boolean Primitive Data Types

- Char Data Type

  - A **char** occupies two bytes of memory, or **16 bits** and thus has a width of **16**. The reason it's not just a **single byte** is that it allows you to store Unicode characters.

- Unicode

  - **Unicode** is an international encoding standard for use with different languages and scripts, by which each letter, digit, or symbol is assigned a unique numeric value that applies accross diffferent platforms and programs.

  - In the English alphabet, we have the letters A through Z. Meaning only 26 characters are needed in total to represent the entire English alphabet. But other languages need more characters, and often a lot more.

  - **Unicode** allows us to represent these languages and the way it works is that by using a combination of the **two bytes** that a **char** takes up in memory it can represent and one of **65535** different types of characters

  - Char is useful with arrays.

  -     char myChar = 'D';
        char myUnicode = '\u0044';
        System.out.println("myChar = " + myChar);
        System.out.println("myUnicode = " + myUnicode);
        char myCopyrightChar = '\u00A9';
        System.out.println("myCopyrightChar = " + myCopyrightChar);

- Boolean Primitive Type

  - A **boolean** value allows for two choices **True** or **False**, **Yes** or **No**, **1** or **0**. In Java terms we have a **boolean** primitive type and it can be set to two values only. **true** or **false**. They are actually pretty useful and you will use them a lot when programming.

  -     boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;

### 32. Primitive Types Recap and the String Data Type

- Can create your own data types via Classes.

- String

  - The **String** is a dataytpe in Java, which is not a primitive type. It's actually a **Class**, but it enjoys a bit of favoritism in Java to make it easier to use than a regular class.

- What is a String?

  - A **String** is a sequence of characters. In the case of the **char** which you can see above which we discussed in the previous video, it could contain a **single character** only (regular charater or Unicode character).

  - A **String** can contain a sequence of characters. A large number of characters. Technically it's limited by memory or teh **MAX_VALUE** of an **int** which was **2.14 Billion**. That's a lot of characters.

- Strings in Java are Immutable

  - When I said you can delete characters out of a **String**, that's not strictly true. Because **Strings** in Java are immutable. That means you can't change a **String** after it's created. Instead, what happens is a new **String** is created.

  - So in the case of this code, **lastString** doesn't get appended the value "**120.47**" instead a new **String** is created which consists of the previous value of **lastString** plus a text representation of the double value **120.47**.

  - The net result is the same, **lastString** has the right values, however, a new **String** got created and the old one got discarded.

  - Don't worry if this makes no sense, it will later in the course. For now, I just wanted to point out that **Strings** are **immutable**.

- The Code We Used To Append Strings Was Inefficient

  - As a result of a **String** being created, appending values like this is inefficient and not recommended. I'll show you a better way of doing it in a future video where we discuss something called **StringBuffer** which can be changed.

  - We need an understanding of classes before we tackle **StringBuffer**, and also, you will come across code written in the style I've used in this lecture so it's still useful for you to know how to do things this way.

-       String myString = "This is a string";
        System.out.println("myString = " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString = " + myString);
        myString = myString + " \u00A9 2021";
        System.out.println("myString = " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("numberString = " + numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString = " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("lastString = " + lastString);

### 33. Operators, Operands and Expressions

- What are Operators?

  - **Operators** in Java are special symbols that perform specific operations on one, two, or three operands, and then return a result. As an example, we used the **+** (addition) operator to sum the value of two variables in a previous video.

  - There are many others in Java.

- What is an Operand?

  - An **Operand** is a term used to describe any object that is manipulated by an **operator**. If we consider this statement

  - **int myVar = 15 + 12;**

  - Then **+** is the operator, and **15** and **12** are the **operands**. Variables used instead of literals are also **operands**.

  - **double mySalary = hoursWorked \* hourlyRate;**

  - In the above line **hoursWorked** and **hourlyRate** and **operands**, and **\*** (multiplication) is the **operator**.

- What is an Expression?

  - An **expression** is formed by combining variables, literals, method return values (which we haven't covered yet) and operators.

  - In the line below, **15 + 12** is the expression which has (or returns) **27** in this case.

  - **int myValue = 15 +12;**

  - In the statement below, **hoursWorked \* hourlyRate** is the expression. If **hoursWorked** was **10.00** and **hourlyRate** was **20.00** then the expression would return **200.00**;

  - **double mySalary = hoursWorked \* hourlyRate;**

  - Let's explore Operators in more detail

- What is a Comment?

  - **Comments** are ignored by the computer and are added to a program to help describe something. **Comments** are there for humans.

  - We use **//** in front of any code, or on a blank line. Anything after the **//** right through to the end of the line is ignored by the computer.

  - Aside from describing somthing about a program, comments can be used to temporarily disable code.

-       int result = 1 + 2; // 1 + 2 = 3
        System.out.println("result = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result -1; // 3 - 1 = 2
        System.out.println("result = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("result = " + result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("result = " + result);

        result = result % 3; // the remainder of (4 % 3) = 1
        System.out.println("result = " + result);

### 34. Abbreviating Operators

-       // result = result + 1;
        result++; // 1 + 1 = 2
        System.out.println("result = " + result);

        result--; // 2 -1 = 1
        System.out.println("result = " + result);

        // result = result + 2;
        result +=2; // 1 + 2 = 3
        System.out.println("result = " + result);

        // result = result * 10;
        result *=10; // 3 * 10 = 30
        System.out.println("result = " + result);

        // result = result / 3
        result /= 3; // 30 / 3 = 10
        System.out.println("result = " + result);

        // result = result - 2
        result -= 2; // 10 - 2 = 8
        System.out.println("result = " + result);

### 35. if-then Statement

- if-then Statements in Java

  - The **if-then** statement in the most basic of all the control flow statements. It tells your program to execute a certain section of code only if a particular test evaluates to **true**.

  - This is known as **conditional logic**

- Conditional Logic

  -**Conditional logic** uses specific statements in Java to allow us to check a condition and execute a certain code based on whether that condition (the expression) is **true** or **false**.

  - Let's see how this works in practice.

- if-then Rule - Always Use a Code Block

  - Instead of using the **if**-statement as we can see here, we should instead use a **code block**.

  - A **code block** allows more than one statement to be executed - a block of code.

  - The format is:

         **if (expression) {
              // put one or more statements here
          }

-       boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

### 36. Logical and Operator

-       int topScore = 80;
        if (topScore >= 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 81;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }

### 37. Logical OR Operator

- Logical AND and Logical OR

  - The **AND** operator comes in two flavors in Java, as does the **OR** operator.

  - **&&** is the Logical **AND** which operates on **boolean** operands - Checking if a given condition is **true** or **false**.

  - You will almost always want to be doing this. The **&** is a bitwise operator working at the bit level. This is an advanced concept we won't get into here.

  - Likewise **||** is the Logical **OR** what again operates on **boolean** operands - Checking if a given condtion **true** or **false**.

  - Again, you will almost always want to be doing this. This **|** is a bitwise operator working at the bit level.

-       if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

### 38. Assignment Operator VS Equals to Operator

- Difference Between the Assignment and Equal to Operators

  - As you can see in the code we typed to declare the **newValue int**, it's using the **assignment operator** (one equal sign) to assign the value **50** to **newValue**.

  - What we needed to do in the code is to not use the **assignment operator** in the **if-then** statement, but rather the **equal to** operator which has two equal signs.

  - We are not assigning a value here, we want to test if the values are equal to each other.

- The NOT Operator

  - The ! or NOT Operator is also known as the Logical Complement Operator.

  - For use with **booleans** it tests the alternate value - we saw **(isCar)** test for **true**, by adding a **!** operator before the value we can check the opposite - **false** in this case.

  - **boolean isCar = false**

  - We can use either of these statements:

    **if(isCar == false)**

    **if(!isCar)**

    to check if the **boolean isCar** is **false**.

  - I'd generally recommend using the abbreviated from of both for two reason. One to avoid the potential for error by accidentally using the assignment operator, and second, the code is more concise.

-       boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to happen");
        }

        //        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (!wasCar) {
            System.out.println("wasCar is false");
        }

### 39. Ternary Operator

- Terary Operator ? :

  - The **ternary** operator is a shortcut to assigning one of two values to a variable depending on a given condtion.

  - It's a shorcut of the **if-then-else** statement (**else** we will be discussing later).

  - **int ageofClient = 20;**

  - **boolean isEighteenOrOver = ageOfClient == 20 ? true : false;**

  - Operand one - **ageOfClient == 20** in this case is the condition we are checking. it needs to return **true** or **false**.

  - Operand two - **true** here is the value to assign to the variable **isEighteenOrOver** if the condition above is **true**

  - Operand three - **false** here is the value to assign to the variable **isEighteenOrOver** if the condition above is **false**

  - In this case, **isEighteenOrOver** is assigned the value **true** because **ageOfClient** has the value **20**.

  - It can be a good idea to use **parenthesis** like this to make the code more readable.

  -     **boolean isEighteenOrOver = (ageOfClient == 20) ? true : false;**

### 40. Operator Precedence and Operator Challenge

- [Summary of Operators](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html)

- [Java Operator Precedence Table](http://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html)

- Operator Challenge

  - 1. Create a **double** variable with a value of **20.00**.

    - Solution:

  - 2. Create a second variable of type **double** with the value **80.00**.

    - Solution:

      -

  - 3. Add both numbers together and multiply by **100.00**.

    - Solution:

      -

  - 4. Use the **remainder** operator to figure out what the **remainder** from the result of the operation in **step 3** and **40.00**. We used the **modulus** or **remainder** operator on **ints** in this course, but we can also use it on a **double**

    - Solution:

      -

  - 5. Create a **boolean** variable that ssigns the value **true** if the reaminder in **#4** is **0**, or **false** if it's **not zero**.

    - Solution:

      -

  - 6.  Output the **boolean** variable.

    - Solution:

      -

  - 7. Write an **if-then** statement that displays a message **"Got some remainder"** if the **boolean** in **step 5** is **not true**. Don't be surprised if you see output for this step, where you might expect it not to show. I'll explain in my solution.

    - Solution:

      -

-       double doubleVariable = 20.00d;
        double secondDoubleVariable = 80.00d;
        double newResult = (doubleVariable + secondDoubleVariable) * 100.00d;
        System.out.println("newResult = " + newResult);
        double solution4 = newResult % 40.00d;
        System.out.println("solution4 = " + solution4);
        boolean solution5 = (solution4 == 0) ? true : false;
        System.out.println("solution5 = " + solution5);
        String solution7 = (solution5 == true) ? "No remainder" : "Got some remainder";
        System.out.println("solution7 = " + solution7);
-       double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myValuesTotal = (myFirstValue + mySecondValue) * 100.00d;
        System.out.println("myValuesTotal = " + myValuesTotal);
        double theRemainder = myValuesTotal % 40.00d;
        System.out.println("theRemainder = " + theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some reaminder");
        }

### 41. First Steps Summary

- Fundamental building blocks section of the course complete.
- Don't be afraid to come back to any material.
- This is not a competition to get to the end, but to become a productive java programmer.

### 42. End of Remaster

- 77 hour course. 1 section at a time.
- Old style is still 100% relevant!
- Just trying to make new style content better.

## Section 4: Java Tutorial: Expressions, Statements, Code blocks, Methods and more 3hr 23min

### 43. Introduction

- This section is dealing with four really important concepts of Java.

- We're talking about Expressions, Statements, Code Blocks and Methods.

- Four really key components of Java that you really need to get a good understanding of and that's the goal of this section is to give you that understanding.

- So, let's make a start.

### 44. Keywords and Expressions

- [Java Language Keywords](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html)

- [List of Java keywords](https://en.wikipedia.org/wiki/List_of_Java_keywords)

### 45. Statements, Whitespace and Indentation (Code Organization)

-       // a mile is equal to 1.609344 kilometres
        double kilometres = (100 * 1.609344);
        int highScore = 50;
        if (highScore == 50) {
            System.out.println("This is an expression");
        }

        // In the following code that I will type below, write down what parts of the code are expressions
        int score = 100;
        if (score > 99) {
            System.out.println("You got the high score!");
            score = 0;
        }

### 46. Code Blocks And The If Then Else Control Statements

-       int myVariable = 50;
        if (myVariable == 50) {
            System.out.println("Printed");
        }

        myVariable++;
        myVariable--;
        System.out.println("This is a test");

        System.out.println("This is" + " another" + " still more.");

        int anotherVariable = 50;
        myVariable--;
        System.out.println("This is another one");

- cannot access variables within a code block outside that code block. Idea of Scope. Can access created variables created prior to a code block however.

-       boolean secondGameOver = true;
        int secondScore = 10000;
        int secondLevelCompleted = 8;
        int secondbonus = 200;

        if (secondGameOver) {
            int secondFinalScore = secondScore + (secondLevelCompleted * secondbonus);
            System.out.println("secondFinalScore = " + secondFinalScore);
        }

-       boolean gameOver = true;
        int score = 1000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score > 1000) {
            System.out.println("Your score was less than 5000");
        } else if (score < 1000) {
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got here");
        }

### 47. if then else Recap

- The **if** statement identifies which statement or code block to run based on the value of an expression. In other words based on a specific condition.

- Inside the code block defined by curly braces

  - {and} we can have one or multiple statements

- We can use the **else** statement after the **if**. In that case when the condition is false the else block will be executed.

- We can also add **else if** to test multiple conditions.

- The following is the basic structure of the **if** then **else** statement

  -       if(condtion) {
              // if statment (block)
          } else {
              // else statement (block)
          }
  - semicolon should not be included on the same line as the **if** or it can create unwanted behavior in our code

- 1. Test expression **score >= 5000**, in this case the expression result is **true**

- 2. Execute block, in this case it will print message "Your score was >= 5000".

- 3. The code will then jump to the first line after the last curly brace and continue with the rest of the program.

-       int score = 6000;

        if (score >= 5000) {
            System.out.println("Your score was >= to 5000");
        } else if (score < 1000 && score >= 500) {
            System.out.println("Your score was < 1000 but >= to 500");
        } else {
            System.out.println("Your score was < 500");
        }

### 48. Methods In Java

-       boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore +=1000;
            System.out.println("finalScore = " + finalScore);
        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("finalScore = " + finalScore);
        }

-        public static void main(String[] args) {

            boolean gameOver = false;
            int score = 800;
            int levelCompleted = 5;
            int bonus = 100;
            calculateScore(gameOver, score, levelCompleted, bonus);

            score = 10000;
            levelCompleted = 8;
            bonus = 200;
            calculateScore(gameOver, score, levelCompleted, bonus);
        }

        public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

            if (gameOver) {
                int finalScore = score + (levelCompleted * bonus);
                finalScore +=2000;
                System.out.println("finalScore = " + finalScore);
                return finalScore;
            }
            return -1;
        }

### 49. More on Mehtods And A Challenge

-         /*
         Create a method called displayHighScorePosition !void method doesn't return data! procedure!
         it should receive a players name as a parameter, and a 2nd parameter as a position in the high score table
         You should display the players name along with a message like " managed to get into position " and the
         position they got and a further message " on the high score table".

         Create a 2nd method called calculateHighScorePosition !method referred to as a function!
         it should be sent one argument only, the player score
         it should return an int
         the return data should be
         1 if the score is >1000
         2 if the score is >500 and < 1000
         3 if the score is >100 and < 500
         4 in all other cases
         call both methods and display the results of the following
         a score of 1500, 900, 400, and 50
        */

        int highScorePosition = calculatedHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculatedHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculatedHighScorePosition(400);
        displayHighScorePosition("Percy", highScorePosition);

        highScorePosition = calculatedHighScorePosition(50);
        displayHighScorePosition("Gilbert", highScorePosition);

        }

-       public static void displayHighScorePosition(String playerName, int highScorePosition) {
            System.out.println(playerName + " managed to get into position "
                + highScorePosition + " on the high score table");
        }

-       public static int calculatedHighScorePosition(int playerScore) {
            if (playerScore >= 1000) {
                return 1;
            } else if (playerScore >= 500 && playerScore < 1000) {
                return 2;
            } else if (playerScore >= 100 && playerScore < 500) {
                return 3;
            } else {
                return 4;
            }
        }

### 50. Method Challenge - Final Code Changes

-       int position = 4; // assuming position 4 will be returned

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;

### 51. DiffMerge Tool Introduction

- DiffMerge is a program that will help you to visiually compare and merge files on any operating system.

- It can be very helpful with programming as well.

- Some other tools like code repositories use similar merge operations, so this will also help you in the future when you start working with code repositories.

- When you code along with the videos in the course it is easy to make a typo, and get stuck, and this is where DiffMerge will help you!

- Every lesson has the code attached to it that I typed in the video and you can download a zip file with all that code.

- I will explain and show you later how to download and use that code. It's pretty easy.

- By downloading code from the video and comparing it with yours you will be able to easily find any errors/typos made using DiffMerge.

- With DiffMerge you can compare a single file or even the whole folder and visually see the differences side by side.

- In the next video we will install the DiffMerge program and I will then show you how to use it to get the maximum benefit from it during this course.

### 52. Install DiffMerge

- http://sourcegear.com/diffmerge/downloads.php

### 53. Using DiffMerge

- Let's see how to use DiffMerge with code from the course.

- Specifically, you will learn how to compare code using DiffMerge and how to find common errors like typos.

- Can see what happened over 30 minutes of coding in future uses.

-       always filter *.class
        then .idea in sub-folder filters

- checking by folder can be a good habit over just by file to see what changes may have been made anywhere while working a large project.

### 54. Coding Exercises

- Coding exercises are a feature added by Udemy to allow instructors to add exercises that students can complete to help reinforce concepts that have been taught. The cool thing is that you can click a button and have your solution checked immediately!

- In other words, I will give you a coding exercise to complete, and you can type it interactively into the screen and click a button to see if your solution is correct.

- This is different to the challenges you have seen so far, when you see me give you the challenge and then I go through the solution in a video.

- Coding exercises give you the exercise and you do them withou seeing a solution in a video.

- There are plenty of upcoming challenges in the course, and coding exercises are meant to complement those challenges - So this is new material I have added.

- Coding Exercises can be a bit tricky to understand initally, so in this video, I am going to show you how to go through a sample coding exercise so that when you get to the first coding exercise in the course (in the next video) you will know how to go about it.

- Let's go over to Udemy's website and open up a coding exercise and get started.

-       psvm needed which is main method to check / test if our method works!!!

### 55. Coding Exercises Example Part 1

-       public class SpeedConverter {

            public static long toMilesPerHour(double kilometersPerHour) {

                if (kilometersPerHour < 0) {
                return -1;
            }
                return Math.round(kilometersPerHour / 1.609);
            }
        }

### 56. Coding Exercies Example Part 2

- Returning a value and printing text in the console is not the same.

### 57. Coding Exercies Example Part 3

-       public class SpeedConverter {

            public static long toMilesPerHour(double kilometersPerHour) {

                if (kilometersPerHour < 0) {
            return -1;
                }

                return Math.round(kilometersPerHour / 1.609);
            }

            public static void printConversion(double kilometersPerHour) {

                if (kilometersPerHour < 0) {
                    System.out.println("Invalid Value");
                } else {
                    long milesPerHour = toMilesPerHour(kilometersPerHour);
                    System.out.println(kilometersPerHour +
                            " km/h = " + milesPerHour +
                            " mi/h");

                }
            }
        }

Coding Exercise 1: Speed Converter
Coding Exercise 2: MegaBytes Converter
Coding Exercise 3: Barking Dog
Coding Exercise 4: Leap Year Calculator
Coding Exercise 5: DecimalComparator
Coding Exercise 6: Equal Sum Checker
Coding Exercise 7: Teen Number Checker

### 58. Method Overloading

- same method name but with different parameters

- Can't just change the return type from `int` to `void`, for example. You actually need to change the number of parameters the method has or else the method signature doesn't change effectively enough to be considered a unique method.

- happens to be very common in Java

### 59. Method Overloading Recap

- **Method overloading** is a feature that allows us to have more than one method with the **same name**, so long as we use **different parameters**.

- It is the ability to create multiple methods of the same name with different implementations.

- Calls to an overloaded method will run a specific implementation of that method.

- In the example from the previous video we had **calculateScore** method with 0, 1, and 2 parameters.

- As an example, let's say you have to create a method which can do

  - The sum of two numbers.
  - The sum of three numbers.
  - And the sum of four numbers.
  - Each method would have parameters passed to it with the numbers to sum.

- Ending up with the following methods is not good practice and it is not actually method overloading.

- Never ever write code like below, it is bad practice.

-       public static int sumTwoNumbers(int a, int b) {
            return a + b;
        }
-       public static int sumThreeNumbers(int a, int b, int c) {
            return a + b + c;
        }
-       public static int sumTwoNumbers(int a, int b, int c , int d) {
            return a + b + c + d;
        }

- Above 3 different method names to remember to do something very similar. 20 would be even harder to remember.

- With method overloading we end up with 3 methods but all sharing the same method name. Easier to remember!

-       public static int sum(int a, int b) {
            return a + b;
        }
-       public static int sum(int a, int b, int c) {
            return a + b + c;
        }
-       public static int sum(int a, int b, int c , int d) {
            return a + b + c + d;
        }

- The above has the same method name, easier to remember. This is an example of how methods should be written using method overloading.

- Very common used in many other languages as well.

- The println method is a great example of method overloading in the Java language.

- There are actually 10 methods with the name **println**.

- We can print an integer, double, string and so on...

-       public static void main (String[] args) {
            System.out.println("Hello!");
            System.out.println(5);
            System.out.println(10.75);
        }

- It improves code readablility and re-usability.

- It is easier to remember one method name instead of remembering multiple names.

- Acheives consistency in naming. One name for methods that are commonly used for example println

- Overloaded methods give programmers the flexibility to call a similar method with different tyeps of data.

### 60. Seconds and Minutes Challenge

- Create a method called **getDurationString** with two parameters, first paramter **minutes** and 2nd parameter **seconds**.

- You should validate that the **first paramter minutes is >= 0**.

- You should validate that the **2nd paramter seconds is >= 0 and <=59**.

- The method should **return "Invalid value" in the method if either of the above are not true**.

- If the **parameters are valid** then calculate how many hours minutes and seconds equal the minutes and seconds passed to this method and \*\*return that value as string in format "XXh YYm ZZs" where XX represents a number of hours, YY the minutes, and ZZ the seconds.

- Create a **2nd method of the same name but with only one parameter seconds.**

- **Validate that it is >= 0, and return "Invalid value" if it is not true.**

- If it is valid, then calculate how many minutes are in the seconds value and then call the other overloaded method passing the correct minutes and seconds calculated so that it can calculate correctly.

- Call both methods to print values to the console.

- Tips:

  - Use int or long for your number data type is probably a good idea.

  - 1 minute = 60 seconds and 1 hour = 60 minutes or 3600 seconds.

  - Methods should be static as we have used previously.

- Bonus:

  - For the input 61 minutes output should be 01 h 01m 00s, but it is ok if it is 1h 1m 0s (Tip: use if-else)

  - Create a new console project and call it SecondsAndMinutesChallenge

### 61. Bonus Challenge Solution

- a constant is like a variable, but a variable that we can't reassign once a value is assigned. A Constant variable is created using the `final` keyword.

Coding Exercise 8: Area Calculator
Coding Exercise 9: Minutes to Years and Days Calculator
Coding Exercise 10: Equality Printer
Coding Exercise 11: Playing Cat

## Section 5: Control Flow Statements 2hr 57min

### 62. Introduction

- Control Flow Statements

  - You're going to be learning that in this section. We're going to be dealing with the **switch statement**, the **for statement**, the **while statement**, and the **do-while statement**.

  - These are the four key control flow statements that you need to understand to get the most out of Java.

  - So, let's make a start.

### 63. The switch statement (+Challenge Exercise)

-

### 64. Day of the Week Challenge

-

Coding Exercise 12: Number In Word
Coding Exercise 13: Number Of Days In Month

### 65. The for Statement (+Challenge Exercise)

-

### 66. For Loop Recap

-

### 67. Sum 3 and 5 Challenge

-

Coding Exercise 14: Sum Odd

### 68. The while and do while statements(+Challenge Exercise)

-

### 69. While and Do While Recap

-

### 70. Digit Sum Challenge

-

Coding Exercise 15: Number Palindrome
Coding Exercise 16: First And Last Digit Sum
Coding Exercise 17: Even Digit Sum
Coding Exercise 18: Shared Digit
Coding Exercise 19: Last Digit Checker
Coding Exercise 20: Greatest Common Divisor
Coding Exercise 21: All Factors
Coding Exercise 22: Pefect Number
Coding Exercise 23: Number To Words

### 71. Parsing Values from a String

-

Coding Exercise 24: Flour Pack Problem
Coding Exercise 25: Largest Prime
Coding Exercise 26: Diagonal Star

### 72. Reading User Input

-

### 73. Problems and Solutions

-

### 74. Reading User Input Challenge

-

### 75. Min and Max Challenge

-

Coding Exercise 27: Input Calculator
Coding Exercise 28: Paint Job

## Section 6: OOP Part 1 - Classes, Constructors and Inheritance 2hr 36min

### 76. Introduction

-

### 77. Classes Part 1

-

### 78. Classes Part 2

-

Coding Exercise 29: Sum Calculator
Coding Exercise 30: Person

### 79. Constructors - Part 1 (+Challenge Exercise)

-

### 80. Constructors - Part 2 (+Challenge Exercise)

-

Coding Exercise 31: Wall Area
Coding Exercise 32: Point
Coding Exercise 33: Carpet Cost Calculator
Coding Exercise 34: Complex Operations

### 81. Inheritance - Part 1

-

### 82. Inheritance - Part 2

-

### 83. Reference vs Object vs Instance vs Class

-

### 84. this vs super

-

### 85. Method Overloading vs Overriding Recap

-

### 86. Static vs Instance Methods

-

### 87. Static vs Instance Variables

-

### 88. Inheritance challenge Part 1 (+Challenge Exercise)

-

### 89. Inheritance challenge Part 2

-

Coding Exercise 35: Cylinder

Coding Exercise 36: Pool Area

## Section 7: OOP Part 2 - Composition, Encapsulation, and Polymorphism 2hr 20min

### 90. Introduction

-

### 91. Composition

-

### 92. Composition Part 2 (+Challenge Exercise)

-

Coding Exercise 37: Composition

### 93. Encapsulation

-

### 94. Encapsulation (+Challenge Exercise)

-

Coding Exercise 38: Encapsulation

### 95. Polymorphism

-

### 96. Polymorphism (+Challenge Exercise)

-

Coding Exercise 39: Polymorphism

### 97. OOP Master Challenge Exercise

-

### 98. OOP Challenge - Solution

-

Coding Exercise 40: Bill's Burgers

## Section 8: Arrays, Java inbuilt Lists, Autoboxing and Unboxing 5hr 49min

### 99. Arrays

-

### 100. Arrays (Challenge Exercise)

-

Coding Exercise 41: Sorted Array

### 101. Arrays Recap

-

### 102. References vs Value Types

-

### 103. Minimum Element Challenge

-

Coding Exercise 42: Minimum Element

### 104. Reverse Array Challenge

-

Coding Exercise 43: Reverse Array

### 105. List and ArrayList Part 1

-

### 106. ArrayList Part 2

-

### 107. ArrayList Part 3

-

### 108. ArrayList Challenge Part 1

-

### 109. ArrayList Challenge Part 2

-

### 110. ArrayList Challenge Part 3

-

### 111. Bug Fix for ArrayList Challenge

-

Coding Exercise 44: Mobile Phone

### 112. Autoboxing and Unboxing

-

### 113. Autoboxing and Unboxing (Challenge Exercise) - Part 1

-

### 114. Autoboxing and Unboxing (Challenge Exercise) - Part 2

-

### 115. Autoboxing and Unboxing (Challenge Exercise) - Part 3

-

Coding Exercise 45: Banking

### 116. LinkedList Part 1

-

### 117. LinkedList Part 2

-

### 118. LinkedList Part 3

-

### 119. LinkedList Challenge Part 1

-

### 120. Bug Fix for "Track 1" Error

-

### 121. LinkedList Challenge Part 2

-

### 122. LinkedList Challenge Part 3 (Final video)

-

Coding Exercise 46: Playlist

## Section 9: Inner and Abstract Classes & Interfaces 3hr 3min

### 123. Interfaces

-

### 124. Interfaces Part 2

-

### 125. Interfaces Challenge Part 1

-

### 126. Interfaces Challenge Part 2

-

Coding Exercise 47: Interface

### 127. Inner Classes Part 1

-

### 128. Inner Classes Part 2

-

### 129. Inner Classes Challenge

-

Coding Exercise 48: Playlist - Inner Class

### 130. Abstract Classes Part 1

-

### 131. Abstract Classes Part 2

-

### 132. Interface vs Abstract Class

-

### 133. Abstract Class Challenge Part 1

-

### 134. Abstract Class Challenge Part 2

-

### 135. Abstract Class Challenge Part 3 (includes recursion)

-

Coding Exercise 49: Abstract Class

## Section 10: Java Generics 1hr 5min

### 136. Generics Introduction

-

### 137. Our Generics Class

-

### 138. Our Generics Class Part 2

-

### 139. Our Generics Class Part 3

-

### 140. Generics Challenge

-

## Section 11: Naming Conventions and Packages. static and final keywords 2hr 31min

### 141. Naming Conventions

-

### 142. Packages

-

### 143. Packages Part 2

-

### 144. Packages Part 3

-

### 145. Packages (Challenge Exercise)

-

### 146. Scope

-

### 147. Packages Part 2 and Visibility

-

### 148. Scope + (Challenge Exercise)

-

### 149. Access Modifiers

-

### 150. The static statement

-

### 151. The final statement

-

### 152. Final Part 2 and Static Initializers

-

## Section 12: Java Collections 6hr 36min

### 153. Collections Overview

-

### 154. Binary Search

-

### 155. Collections List Methods

-

### 156. Comparable and Comparator

-

### 157. Maps

-

### 158. Map Continued And Adventure Game

-

### 159. Adding Exits to the Adventure GAme

-

### 160. Adventure Game Challenge

-

Coding Exercise 50: Adventure Game

### 161. Immutable Classes

-

### 162. Immutable Class Challenge

-

Coding Exercise 51: Immutable Class

### 163. Sets and HashSet

-

### 164. HashSet - equals() and hashCode()

-

### 165. Finish off equals() and hashCode()

-

### 166. Potential issue with equals() and sub-classing

-

### 167. Sets - Symmetric & Asymmetric

-

### 168. Finishing Off Sets

-

### 169. Sets Challenge Part 1

-

### 170. Sets Challenge Part 2

-

### 171. Sets Challenge Part 3

-

Coding Exercise 52: Sets

### 172. Sorted Collections

-

### 173. StockList class With Maps

-

### 174. Add a Basket

-

### 175. TreeMap and Unmodifiable Maps

-

### 176. Challenge Part 1

-

### 177. Challenge Part 2

-

### 178. Challenge Part 3

-

### 179. Challenge Part 4 (Final)

-

## Section 13: JavaFX 10hr 6min (Learn based on need)

### 180 - 225.

-

## Section 14: Basic Input & Output including java.util 8hr 22min

### 226. Exceptions

-

### 227. Stack Trace and Call Stacks

-

### 228. Catching and throwing Exceptions

-

### 229. Multi Catch Exceptions

-

### 230. Introduction to I/O

-

### 231. Writing content - FileWriter class and Finally block

-

### 232. Try with Resources

-

### 233. FileReader and Closeable

-

### 234. BufferedReader

-

### 235. Load Big Location and Exits Files

-

### 236. Challenge

-

### 237. Buffered Writer and Challenge

-

### 238. Byte Streams

-

### 239. Reading Binary Data and End of File Exceptions

-

### 240. Object Input Output Including Serialization

-

### 241. Finish Object I/O and RandomAccessFile class

-

### 242. Create Random Access File

-

### 243. Update Static Initializer Block With Random File Access

-

### 244. Update Adventure Game to Read Random access File

-

### 245. Java NIO

-

### 246. Writing Objects with Java NIO

-

### 247. Reading and Writing with Java NIO

-

### 248. Writing Binary Files with Java NIO

-

### 249. Reading Files NIO

-

### 250. Absolute and Relative Reads

-

### 251. Chained Put Methods

-

### 252. Writing Sequentially

-

### 253. FileChannel to Copy Files and Pipes with Threads

-

### 254. Filesystem

-

### 255. More on Paths

-

### 256. Exists and CopyFile

-

### 257. Move, Rename and Delete

-

### 258. File Attributes

-

### 259. Read Existing Directory Contents

-

### 260. Separators Temp Files and File Stores

-

### 261. Walk File Tree

-

### 262. Copy Entire Tree

-

### 263. Mapping IO and NIO Methods

-

## Section 15: Concurrency in Java 5hr 26min

### 264. Concurrency and Threads Introduction

-

### 265. Threads

-

### 266. Runnable and Thread

-

### 267. Interrupt and Join

-

### 268. Multiple Threads

-

### 269. Thread Variables

-

### 270. Synchronisation

-

### 271. Producer and Consumer

-

### 272. Deadlocks, wait, notify and notifyAll methods

-

### 273. The Java Util Concurrent package

-

### 274. Thread Interference

-

### 275. Reentrant Lock and Unlock

-

### 276. Using Try Finally with Threads

-

### 277. Thread Pools

-

### 278. ArrayBlockingQueue Class

-

### 279. Deadlocks

-

### 280. More on Deadlocks

-

### 281. Thread Starvation

-

### 282. Fair Locks and Live Locks

-

### 283. Live Lock Example and Slipped Condtions

-

### 284. Other Thread Issues

-

### 285. JavaFX BAckground Tasks

-

### 286. Data Binding

-

### 287. Service

-

### 288. Challenge 1 and 2

-

### 289. Challenge 3, 4 and 5

-

### 290. Challenge 6 and 7

-

### 291. Challenge 8

-

### 292. Challenge 9

-

## Section 16 Lambda Expressions 3hr 11min

### 293. Lamda Expressions Introduction

-

### 294. Lamda Expressions Continued

-

### 295. Lamda Expressions Nested Blocks

-

### 296. Scope and Functional Programming

-

### 297. Functional Interfaces & Predicates

-

### 298. More on Predicates & Suppliers

-

### 299. Functions

-

### 300. Chaining java.util.functions Functions

-

### 301. Streams

-

### 302. Streams - Intermediate and Terminal Operations

-

### 303. Streams - Flatmap & Lambda Best Practices

-

### 304. Lamda Challenge Part 1

-

### 305. Lamda Challenge Part 2

-

## Section 17: Regular Expressions 1hr 54min

### 306. Regular Expressions Introduction

-

### 307. Character classes and Boundary Matchers

-

### 308. Quantifiers and the Pattern and Matcher classes

-

### 309. Matcher find and Group Methods

-

### 310. And, Or & Not

-

### 311. Regular Expressions Challenge Part 1

-

### 312. Regular Expressions Challenge Part 2

-

### 313. Regular Expressions Challenge Part 3

-

## Section 18: Debugging and Unit Testing 2hr 46min

### 314. Introduction to Debugging

-

### 315. More on Debugging

-

### 316. Field Watch Points

-

### 317. Advanced Debugging

-

### 318. Introduction to Unit Testing with JUnit

-

### 319. Asserts in Junit

-

### 320. More Asserts and Exception Handling

-

### 321. Parameterized Testing

-

### 322. JUnit Challenge #1 and #2

-

### 323. JUnit Challenge #3 and #7

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

### 369. Introduction to Modules

-

### 370. Module Declartions and Statements

-

### 371. Module Types

-

## Section 22: Migrating Java Projects to Java 9 1hr 5min

### 372. Project Setup and Test

-

### 373. Structuring the new project

-

### 374. Creating the first module (Common)

-

### 375. Creating the Module Descriptor file

-

### 376. Creating the 2nd module (Database)

-

### 377. Challenge - Create the final module (UI)

-

### 378. Transitive Dependencies

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
