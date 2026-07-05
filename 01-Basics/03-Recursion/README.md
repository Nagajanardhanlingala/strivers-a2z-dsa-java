# ⭐ Basic Recursion

This folder contains the **Basic Recursion** problems from **Striver's A2Z DSA Sheet** implemented in **Java**.

---

## 📖 What is Recursion?

**Recursion** is a programming technique in which a function calls itself to solve a smaller version of the same problem. Instead of solving the entire problem at once, recursion repeatedly breaks it down until it reaches a simple case called the **base case**.

Every recursive function consists of two important parts:

* **Base Case** – The stopping condition that prevents infinite recursion.
* **Recursive Call** – The function calling itself with a smaller input.

General structure:

```java
void recursiveFunction(parameters) {
    if (baseCase) {
        return;
    }

    // Current work

    recursiveFunction(smallerProblem);
}
```

---

## 🔹 Why Learn Recursion?

Recursion is an essential problem-solving technique used in Data Structures and Algorithms. It helps in solving complex problems by dividing them into smaller and simpler subproblems.

It is widely used in:

* 🌳 Tree Traversals (Binary Tree, BST)
* 📂 Graph Traversals (DFS)
* 🔙 Backtracking
* 🧩 Dynamic Programming
* 🔀 Divide and Conquer Algorithms (Merge Sort, Quick Sort)
* 📁 File System Traversal
* 🧮 Mathematical Computations

Understanding recursion builds the foundation for many advanced DSA topics.

---

## 📚 Problems Covered

| No. | Problem                                          | File                                      |
| --- | ------------------------------------------------ | ----------------------------------------- |
| 01  | Print Name N Times                               | `01_PrintNameNTimes.java`                 |
| 02  | Print Numbers from 1 to N                        | `02_Print1ToN.java`                       |
| 03  | Print Numbers from N to 1                        | `03_PrintNTo1.java`                       |
| 04  | Sum of First N Numbers (Parameterized Recursion) | `04_SumOfFirstNNumbersParameterized.java` |
| 05  | Sum of First N Numbers (Functional Recursion)    | `05_SumOfFirstNNumbersFunctional.java`    |
| 06  | Factorial of N                                   | `06_Factorial.java`                       |
| 07  | Reverse an Array (Two Pointer Recursion)         | `07_ReverseArray.java`                    |
| 08  | Check if a String is Palindrome                  | `08_CheckPalindrome.java`                 |
| 09  | Fibonacci Number Using Recursion                 | `09_Fibonacci.java`                       |

---

## 🧠 Key Concepts Learned

* Base Case
* Recursive Call
* Parameterized Recursion
* Functional Recursion
* Backtracking
* Two Pointer Recursion
* Multiple Recursion
* Recursion Tree
* Stack Unwinding
* Time Complexity of Recursive Solutions

---

## ⏱️ Time Complexity

| Problem                | Time Complexity  |
| ---------------------- | ---------------- |
| Print Name N Times     | O(N)             |
| Print 1 to N           | O(N)             |
| Print N to 1           | O(N)             |
| Sum of First N Numbers | O(N)             |
| Factorial              | O(N)             |
| Reverse Array          | O(N)             |
| Palindrome Check       | O(N)             |
| Fibonacci (Recursive)  | O(2<sup>N</sup>) |

---

## 🎯 Learning Outcome

After completing this section, I learned how to:

* Identify the base case in recursive problems.
* Break a problem into smaller subproblems.
* Differentiate between parameterized and functional recursion.
* Use recursion with arrays and strings.
* Solve problems using multiple recursive calls.
* Understand recursion trees and stack unwinding.
* Analyze the time complexity of recursive algorithms.

---

**Language Used:** Java ☕

**Source:** Striver's A2Z DSA Sheet
