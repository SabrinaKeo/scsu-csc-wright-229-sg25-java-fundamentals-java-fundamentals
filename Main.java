//Creating the class
public class Main {
//Creating the methods for each Exercise
public static void main(String[] args) {
helloWorld(); //calling the Hello World method
variables(); //calling the variables method
statement(); //calling the statements method
looping(); // calling the looping method
System.out.println(greetings("Sabrina")); /*calling the greetings method
with Sabrina as the
argument and printing result*/

}
//Exercise 1: print "Hello, World!"
public static void helloWorld() {
System.out.println("Hello, World!");

}

//Exercise 2: Variables and Data Types
public static void variables(){
int x = 10;
String message = "The number is ";
System.out.println(message + x);
}

//Exercise 3: If-Else Statement
public static void statement(){
int number = 14; //assigning a number
if (number % 2 == 0) { //using remainder operator to identify odd or even number
System.out.println("Even");
} else {
System.out.println("Odd");
}
}

//Exercise 4: Loops
public static void looping() {
for (int i = 0; i < 5; i++) { //starting from 0, print i until i is equal to 5
System.out.println(i);
}
}

//Exercise 5: Methods
public static String greetings(String name){
return "Hello, " + name + "!";
}
}







