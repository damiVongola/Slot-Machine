# Slot-Machine
Building a slot machine by generating my own pseudo random number generator without the use of any Math classes
----------------------------
Complete Program Description
----------------------------
This Program uses a self created factorial method to create a sine function method that will be used to create pseudo random numbers. 
We can now use these pseudo random numbers to create a simple slot machine application, that has a basic user interface that draws 3 figures F1,F2 and F3 and allows the user to bet, whether they will get F1 only. If this happens they will receive the highest prize. They can bet on if they will get 3 equal figures. If that happens they get the second highest prize. They can bet on if they will get any of the other two options i.e: if they get all three figures equal or three F1's. If this happens they get the lowest prize. If they do not win any prizes they lose.
--------
Classes
--------
Assignment2
Calculations
SlotMachine
------------------
Class Descriptions
------------------
Assignment2: This is the main class, it has the user interface and allows the user to pick between 4 options. Based on whatever the user picks
the appropriate output is given.
Calculations: Here we have the main calculation happening. We have a calcFactorial() method that deals with calculating the factorial, we have a calcSine method
that uses this calcFactorial method to calculate the sine. We have a genPseudoRandNum() that uses the sine function to create pseudo random numbers
SlotMachine: This class uses the calculations class and returns the figures that are used in the main application.
