# Storm Examples
This page is a collection of example code written in Storm, and then translated into Java for comparison.
## Simple Examples
### Hello World
There is no difference between Java and Storm in this case.
#### Storm
```
public class Main {
    public static void main(String[] args) {
        println("Hello, World!");
    }
}
```
#### Java
```
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```
### Get User Input
#### Storm
```
public class Main: {
    public static main(String[] args): {
        Scanner myScanner: new Scanner(in);
        String input: myScanner.nextLine();
        if (input = "myPassword) then {
            println("You got the password!");
        }
    }
}
```
#### Java
```
public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String input = myScanner.nextLine();
        if (input.equals("myPassword") {
            System.out.println("You got the password!");
        }
    }
}
```
