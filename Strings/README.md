## 🔤 Strings

Started solving **String problems from Striver's A2Z DSA Sheet**.

This section focuses on understanding Java Strings, efficient string manipulation, traversal techniques, and common patterns used in coding interviews.

### 📚 String Fundamentals

Before solving problems, I covered the following important Java String concepts:

- **String in Java**
  - `String` is a class in Java, not a primitive data type.
  - A String represents a sequence of characters.
  - Strings are **immutable**, meaning their contents cannot be changed after creation.

- **String Pool**
  - Java maintains a special memory area called the **String Pool** for String literals.
  - Identical String literals can refer to the same object.
  - `==` compares references, while `.equals()` compares String contents.

- **StringBuilder**
  - Mutable sequence of characters.
  - More efficient than repeatedly modifying a `String`.
  - Commonly used when constructing strings inside loops.

- **StringBuffer**
  - Mutable and synchronized/thread-safe.
  - Generally slower than `StringBuilder`.
  - Less commonly required in DSA problems.

- **String and Character Operations**
  - Converting a String into a character array using `toCharArray()`.
  - Accessing individual characters using `charAt()`.
  - Converting digit characters to integers using:
    ```java
    int digit = ch - '0';
    ```

### 🛠️ Important String Methods

Some commonly used methods while solving DSA problems:

| Method | Purpose |
|---|---|
| `length()` | Returns the number of characters |
| `charAt(i)` | Returns the character at index `i` |
| `substring(l, r)` | Extracts characters from `l` to `r-1` |
| `equals()` | Compares String contents |
| `toCharArray()` | Converts String into `char[]` |
| `contains()` | Checks whether a sequence exists |
| `indexOf()` | Finds the first occurrence |
| `lastIndexOf()` | Finds the last occurrence |
| `startsWith()` | Checks the starting sequence |
| `endsWith()` | Checks the ending sequence |
| `toLowerCase()` | Converts to lowercase |
| `toUpperCase()` | Converts to uppercase |
| `replace()` | Replaces characters/sequences |
| `trim()` | Removes leading and trailing spaces |

### 🧠 Common String DSA Patterns

The following patterns are being practiced throughout this section:

- Traversing a String from left to right
- Traversing a String from right to left
- Character frequency counting
- Using `StringBuilder` for efficient construction
- Two-pointer techniques
- Character and digit manipulation
- Prefix and suffix based problems
- Parentheses and nesting-depth problems
- Word-based String traversal
- Palindrome-related problems
- String comparison and matching
- Hashing/frequency-based String problems

### 💡 Useful String Patterns

**Frequency of lowercase English letters:**

```java
int[] freq = new int[26];

for(char ch : s.toCharArray()) {
    freq[ch - 'a']++;
}