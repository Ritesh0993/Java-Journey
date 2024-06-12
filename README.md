# Java 8 New Features

Welcome to the Java 8 New Features repository! This repository provides examples and explanations of the new features introduced in Java 8. Whether you're a beginner or an experienced developer, this repository will help you understand and utilize the powerful capabilities of Java 8.

## Table of Contents

1. [Introduction](#introduction)
2. [Features](#features)
    - [Lambda Expressions](#lambda-expressions)
    - [Functional Interfaces](#functional-interfaces)
    - [Stream API](#stream-api)
    - [Optional Class](#optional-class)
    - [Default Methods](#default-methods)
    - [Method References](#method-references)
    - [New Date and Time API](#new-date-and-time-api)
3. [Setup](#setup)
4. [Usage](#usage)

## Introduction

Java 8 was a major release for the Java programming language. It introduced a number of new features aimed at making Java more expressive, scalable, and adaptable to modern development practices. This repository contains detailed examples and explanations of these features.

## Features

### Lambda Expressions

Lambda expressions provide a clear and concise way to represent one method interface using an expression. They enable you to treat functionality as a method argument, or treat a code as data.

```java
// Example of a lambda expression
Arrays.asList("a", "b", "c").forEach(e -> System.out.println(e));
```
### Functional Interface

A functional interface is an interface that contains exactly one abstract method. They can have only one functionality to exhibit. From Java 8 onwards, lambda expressions can be used to represent the instance of a functional interface.

```java
@FunctionalInterface
public interface MyFunctionalInterface {
    void execute();
}
```

### Stream API

The Stream API provides a functional approach to processing sequences of elements. It supports operations like filter, map, and reduce, which can be chained together to form a pipeline.

```java
// Example of using Stream API
List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
myList.stream()
    .filter(s -> s.startsWith("c"))
    .map(String::toUpperCase)
    .sorted()
    .forEach(System.out::println);
```
### Optional Class

The Optional class is a container object which may or may not contain a non-null value. It is used to represent a value that might be absent.

```java
// Example of using Optional
Optional<String> optional = Optional.of("Hello");
optional.ifPresent(System.out::println);
```
### Default Methods

Default methods enable interfaces to have methods with implementation without affecting the classes that implement the interface. This feature allows the addition of new methods to interfaces without breaking the existing code.
```java
// Example of a default method in an interface
public interface MyInterface {
    default void defaultMethod() {
        System.out.println("This is a default method");
    }
}
```

### Method References
Method references provide a way to refer to methods without invoking them. They are used to create simple lambda expressions by referring to existing methods.

```java
// Example of method reference
List<String> myList = Arrays.asList("a", "b", "c");
myList.forEach(System.out::println);
```

### New Date and Time API
Java 8 introduced a new date and time API in the java.time package. This new API is immutable and thread-safe, providing a comprehensive set of classes for date and time manipulation.

```java
LocalDateTime now = LocalDateTime.now();
System.out.println(now);
```























