# IT ACADEMY BACKEND JAVA SPECIALIZATION
## SPRINT 1 TASK 7 - Annotations lvl 1

## Summary

This exercise focuses on object-oriented programming principles, specifically inheritance and method overriding, as well as the concept of deprecated methods in Java.

## Exercise 1

### Functionalities

- Create a class hierarchy with three classes: `Worker`, `OnlineWorker`, and `OfficeWorker`.
- The `Worker` class has attributes `name` (String), `surname` (String), `pricePerHour` (double), and a method `calculateSalary()` that takes the number of hours worked as a parameter and multiplies it by the `pricePerHour`.
- The `OnlineWorker` and `OfficeWorker` classes inherit from the `Worker` class and *override* the `calculateSalary()` method using the `@Override` annotation.
- For `OfficeWorker`s, the `calculateSalary()` method receives the number of hours worked in the month. When calculating the salary, multiply the number of hours worked by the `pricePerHour` and add the value of a *static* attribute named `gasoline` (representing gasoline allowance) which you'll add to this class.
- For `OnlineWorker`s, the `calculateSalary()` method receives the number of hours worked in the month. When calculating the salary, multiply the number of hours worked by the `pricePerHour` and add the price of the internet flat rate, which will be a *constant* of the `OnlineWorker` class.
- In the `main()` method of the `Main` class, make the necessary invocations to demonstrate the functionality of the `@Override` annotation and the different salary calculations.

## Exercise 2

### Functionalities

- Add some deprecated methods to the child classes (`OnlineWorker` and `OfficeWorker`) using the `@Deprecated` annotation.  These methods should be something simple, perhaps alternative ways to get some information.  The exact functionality is up to you.
- Create an external class (separate from the class hierarchy) that invokes the deprecated methods.
- Use the appropriate annotation (specifically `@SuppressWarnings("deprecation")`) to suppress the deprecation warnings generated when calling the deprecated methods from the external class.  This demonstrates how to handle deprecated methods when you have to work with legacy code.

## Technologies

- Java JDK 22 
- IntelliJ IDEA 
- Git
- GitHub

## How to run it

Clone the repository or download the zip file and run it in your favorite IDE. Run the `Main` class to demonstrate the functionality of the worker hierarchy and the deprecated methods.  You can observe the output in the console.