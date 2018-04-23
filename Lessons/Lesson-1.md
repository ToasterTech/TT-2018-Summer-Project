# Lesson 1: Setting up the Bakery
Alright, time to set up your computers so we can do some robot coding!

## Task 1: Install IntelliJ IDEA
Alright, first we are going to install IntelliJ IDEA. IntelliJ is an IDE (Integrated Development Environment) that we will use to write the robot code. If you google IntelliJ, you will see that there are 2 versions: Ultimate and Community. We are going to use the Ultimate edition because we want all of the bells and whistles, so [click here](https://www.jetbrains.com/idea/download/ "CLICK ME"). When you install, it will say that you have a free trial until you can get a license. Normally, licenses call a lot of money, but you can get a free student license [here](https://www.jetbrains.com/shop/eform/students) and you can sign up as long as you have something that proves you are a student (Student ID, ACT or SAT Scores, transcript, etc.). If you are having trouble, just let me know and I will try to get you a license.

When you are running the IntelliJ Setup Wizard, you will see a couple of prompts. After you pick a theme, try to get your screen to match mine. If you can't, that's okay, but it just makes life slightly easier.
![Yeah, this isn't working](https://i.imgur.com/MemGlok.png)
After this one, you can click through the rest of the installers. At this point, you can exit IntelliJ, as you will need to install Git and Gradle next.

## Task 2: Install Git
Next, we are going to install Git. Git is a programming tool that allows you to upload all of your code changes to Github. Essentially, as you upload your changes, I can see what you have made and I can track your progress. To install Git, [click here](https://git-scm.com/downloads) and pick your Operating System. Honestly, you can click through these prompts to finish the installer.

## Task 3: Install Java Development Kit
Now, we have to install the Java Development Kit (JDK). The JDK allows us to use Java to write our own programs, and without it we will not be able to do anything with the robot. Even if you already have Java installed on your computer, you may not neccesarily have the JDK installed, as that is a separate component that is not bundled with the general Java installation. To install the JDK, [click here](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) and accept the agreement for JDK 8u162. Afterwards, you will be able to install the JDK for your operating system.

## Task 4: Install Gradle
Now, we will install Gradle. Gradle is the build system that we will be using to build and deploy the robot code. To install gradle, [click here](https://gradle.org/install/#manually) and follow the instructions listed to install Gradle manually.

## Task 5: Clone Repository
Before we finish installing everything, now you need to clone this GitHub repository to your computer. Normally, we could clone this through IntelliJ. However, because this repository also includes the instructions for the activities, it will not take it cleanly. What we are going to do instead is use the **TERMINAL!** Just a quick heads up, you will see me using the Windows Terminal to execute these instuructions. However, you can use any terminal to do these instructions.

Open the terminal and the first command you will run is the `cd` command. `cd` allows you to navigate between different directories, and it tells your computer where to go. For example, if I type in `cd C:/Users/HP/Documents/"Toaster Tech"`, it will take me to my Toaster Tech folder in the Documents. Make sure you use the forward slashes in order to move to whatever folder you want to drop the repository into. Otherwise, you will get a ton of the errors.

## Task 6: Setup JDK
We are in the home stretch guys! Now, we need to make sure that IntelliJ knows where the JDK is. Without it, you won't be able to write any code. If you get a lot of errors in the files, it is okay. We will fix that in the next task. Once you clone the reposito

## Task 7: Setup Gradle Libraries
