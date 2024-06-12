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

