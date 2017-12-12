# Syntax

Storm has a very readible syntax, made more so by the fact that the word `the` can be inserted at any point and not change the execution of the program (such as in [AppleScript](https://developer.apple.com/library/content/documentation/AppleScript/Conceptual/AppleScriptX/AppleScriptX.html)). However, the syntax is also relatively strict.

## Control Flow

### If statements
If statements are an integral part of any programming language, letting your code *appear* to make decisions. They are also the building block of any if-type expressions. Storm requires the `then` keyword **and** that you use brackets `{}`. See the [Comparisons](#comparisons) section for details on conditions.
#### If
##### Syntax
```
if (condition) then {
    //Statements here
}
```
##### Java Counterpart
```
if (condition) {
    //Statements here
}
```
##### Examples
This is the recommended form. Note that these use the Storm [`String` comparisons](#string comparisons), which you may not be familiar with, and the simplified printing, which you also may not be familiar with.
```
if (password == "myPassword") then {
    println("You logged in!");
}
```

These forms work, but are discouraged.
```
if (password == "myPassword") then
{
    println("You logged in!");
}
```
```
if (password == "myPassword") then
{ println("You logged in!"); }
```

Note that if your statements are one line, you can use the recommended form or you can use the one line form below.
```
if (password == "myPassword") then { println("You logged in!"); }
```
This form should only be used with a single statement to be executed if the condition is true.
#### If-elseif
If-elseif statements are not very common, but there are use cases where they are obviously the best possible choice. Multiple chained `if-elseif-elseif`s can (and generally should) be replaced by [switch](#switch statements) statements.
##### Syntax
##### Java Counterpart
##### Examples
#### If-else
If-else statements are the most common variation of `if` statements. There is no simpler form of them, but watch out for a lot of nested if-else statements.
##### Syntax
##### Java Counterpart
##### Examples
#### If-elseif-else
If-elseif-else statements are a common type of `if`
##### Syntax
##### Java Counterpart
##### Examples
### Switch Statements
### Conditional Operators
### Loops
#### For Loops
##### Syntax
##### Java Counterpart
##### Examples
#### While Loops
##### Syntax
##### Java Counterpart
##### Examples
#### For-Each Loops
##### Syntax
##### Java Counterpart
##### Examples
## Input
## Output
## Comparisons
### String Comparisons
