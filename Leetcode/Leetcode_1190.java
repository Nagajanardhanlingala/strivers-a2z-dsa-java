# LeetCode 1190 — Reverse Substrings Between Each Pair of Parentheses

## Theory

### 1. Core Concepts

This problem combines three important concepts:

* Nested parentheses
* Stack / LIFO
* Direction-based traversal

The key difficulty is that parentheses can be nested, so the inner substring must be processed before the outer substring.

### 2. Why Stack Is Useful

A stack follows **LIFO (Last In, First Out)**.

For nested parentheses:

```text
(
(
(
)
)
)
```

The last opened parenthesis must be matched with the first closing parenthesis.

Therefore, a stack is naturally suited for matching parentheses.

**Mental model:**

> Nested parentheses → think Stack.

### 3. Brute-Force / Direct Stack Approach

One approach is to maintain the current substring using `StringBuilder`.

When we encounter `(`:

* Save the current string on the stack.
* Start a new substring.

When we encounter `)`:

* Reverse the current substring.
* Pop the previous substring.
* Append the reversed substring.

This approach is easy to understand but can require repeated string reversals.

In the worst case, this can become **O(n²)**.

### 4. Optimal Approach

The key insight is:

> **We don't need to physically reverse the substring. We can reverse the direction of traversal instead.**

First, find the matching index of every parenthesis.

For example:

```text
(ed(et(oc))el)
```

Matching pairs:

```text
0  ↔ 13
3  ↔ 10
6  ↔ 9
```

We store these relationships in:

```java
int[] pair = new int[n];
```

### 5. Direction-Based Traversal

Maintain:

```java
int direction = 1;
```

Where:

```text
direction = 1   → move forward
direction = -1  → move backward
```

When we encounter a parenthesis:

```java
i = pair[i];
direction = -direction;
```

We:

1. Jump to the matching parenthesis.
2. Reverse the traversal direction.

This makes us naturally read the enclosed substring backwards.

### 6. Why This Works

For:

```text
(abc)
```

Instead of:

```text
abc → cba
```

we simply change the traversal:

```text
a → b → c
```

into:

```text
c → b → a
```

No actual reversal is performed.

For nested parentheses, every parenthesis changes the direction again, naturally handling multiple levels of reversal.

### 7. Java Concepts

#### StringBuilder

We use:

```java
StringBuilder answer = new StringBuilder();
```

because `StringBuilder` is mutable and allows efficient character appending:

```java
answer.append(s.charAt(i));
```

At the end:

```java
answer.toString();
```

converts it back to a `String`.

#### Stack

The solution uses:

```java
Stack<Integer> stack = new Stack<>();
```

Operations:

```java
stack.push(index);
stack.pop();
```

Modern Java generally prefers:

```java
Deque<Integer> stack = new ArrayDeque<>();
```

but `Stack` works correctly for this problem.

### 8. Important Things to Remember

* Nested parentheses → Stack.
* Matching parentheses can be stored using an index array.
* Reversal can sometimes be simulated by changing traversal direction.
* `direction = 1` means forward.
* `direction = -1` means backward.
* At every parenthesis:

  * Jump to its pair.
  * Flip direction.
* `StringBuilder` is preferred for building the result.

### 9. Mental Model

> **Match brackets → jump to the pair → flip direction → keep reading.**

### 10. Complexity

**Time Complexity:** `O(n)`

* One pass to build matching pairs.
* One traversal to construct the answer.

**Space Complexity:** `O(n)`

* `pair[]` → O(n)
* Stack → O(n)
* Answer → O(n)

---

# Code

```java
import java.util.*;

class Main {

    public String reverseParentheses(String s) {

        int n = s.length();

        // Stores the matching index of every parenthesis
        int[] pair = new int[n];

        Stack<Integer> stack = new Stack<>();

        // Step 1: Find matching parentheses
        for (int i = 0; i < n; i++) {

            if (s.charAt(i) == '(') {

                stack.push(i);

            } else if (s.charAt(i) == ')') {

                if (!stack.isEmpty()) {

                    int open = stack.pop();

                    pair[i] = open;
                    pair[open] = i;
                }
            }
        }

        // Step 2: Traverse the string using direction changes
        int i = 0;
        int direction = 1;

        StringBuilder answer = new StringBuilder();

        while (i < n && i >= 0) {

            if (s.charAt(i) == '(' || s.charAt(i) == ')') {

                // Jump to the matching parenthesis
                i = pair[i];

                // Reverse traversal direction
                direction = -direction;

            } else {

                // Add normal character to answer
                answer.append(s.charAt(i));
            }

            i += direction;
        }

        return answer.toString();
    }
}
```

## Example

Input:

```text
(ed(et(oc))el)
```

Output:

```text
leetcode
```

The important part of the optimal solution is that **we never physically reverse a substring**. We only jump between matching parentheses and change the traversal direction.
