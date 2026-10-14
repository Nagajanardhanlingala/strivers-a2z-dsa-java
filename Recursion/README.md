# Recursion — Striver A2Z DSA (Java)

## Introduction

Recursion is a programming technique in which a function calls itself to solve a smaller version of the same problem.

A recursive solution continues making function calls until it reaches a **base case**, which stops further recursion.

Recursion helps solve problems that can be broken down into smaller, similar subproblems. It is commonly used in tree traversal, divide and conquer, backtracking, and combinatorial problems.

## Key Concepts

- **Base Case:** The condition that stops recursive calls.
- **Recursive Case:** The part where a function calls itself with a smaller or simpler input.
- **Call Stack:** Memory used to manage active function calls, including their parameters, local variables, and return points.
- **Stack Unwinding:** The process in which pending recursive calls resume and return their results after the base case is reached.

## Simple Example

### Sum of First N Natural Numbers

The sum of the first `n` natural numbers can be expressed as:

`sum(n) = n + sum(n - 1)`

The base case is:

`sum(0) = 0`

### Java Implementation

```java
public class Main {

    static int sum(int n) {
        if (n == 0) {
            return 0;
        }

        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sum(5)); // Output: 15
    }
}
```

### How It Works

For `sum(3)`, the function calls itself until it reaches the base case.

**Calling phase:**

`sum(3) → sum(2) → sum(1) → sum(0)`

**Returning phase:**

- `sum(0) = 0`
- `sum(1) = 1 + 0 = 1`
- `sum(2) = 2 + 1 = 3`
- `sum(3) = 3 + 3 = 6`

The final result is `6`.

## How to Identify a Recursion Problem

Look for problems where:

- A problem can be reduced to a smaller version of itself.
- The same operation can be repeated with a smaller input.
- There is a clear stopping condition.
- The solution can be expressed in terms of the result of a smaller subproblem.

## Guidelines for Solving Recursion Problems

1. Understand what the function is expected to return.
2. Identify the base case.
3. Define how the problem reduces to a smaller subproblem.
4. Ensure each recursive call moves toward the base case.
5. Dry-run the function to understand the calling and returning phases.
6. Analyze time complexity and auxiliary space, including the recursion stack.

## Complexity Analysis

- **Time Complexity:** Depends on the number of recursive calls and the work performed in each call.
- **Auxiliary Space:** Depends on the maximum recursion depth and any additional memory used.

## Important Things to Remember

- Every recursive solution must have a valid base case.
- Each recursive call must make progress toward the base case.
- Deep recursion can cause a `StackOverflowError`.
- Recursive solutions are not always more efficient than iterative solutions.
- Understanding the call stack is essential for debugging and analyzing recursion.

---

**Goal:** Develop strong recursive thinking, understand function-call flow, and build the ability to derive recursive solutions independently.