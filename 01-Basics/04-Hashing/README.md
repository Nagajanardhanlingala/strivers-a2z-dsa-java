# ⭐ Basic Hashing

This folder contains the **Basic Hashing** problems from **Striver's A2Z DSA Sheet**, solved in **Java**. Each problem is implemented using both **Hash Array** and **HashMap** approaches to understand when each technique should be used.

## 📚 What is Hashing?

**Hashing** is a technique used to store and retrieve data efficiently by mapping a **key** to a **value**. In DSA, hashing is commonly used to count frequencies, check the existence of elements, remove duplicates, and optimize searching operations.

For frequency-based problems:

* **Key** → Array Element
* **Value** → Frequency of that element

Example:

```text
Array:
[10, 5, 10, 15, 10, 5]

Frequency Table:
10 -> 3
5  -> 2
15 -> 1
```

Hashing allows these operations to be performed in **O(1)** average time for each lookup or update.

---

## 📌 Hash Array vs HashMap

### ✅ Hash Array

* Used when the range of values is **small and known**.
* Very fast due to direct indexing.
* Cannot efficiently handle very large or negative values.
* Example:

  ```java
  int[] hash = new int[maxElement + 1];
  ```

### ✅ HashMap

* Used when the range of values is **large or unknown**.
* Supports negative numbers and large integers.
* Stores only the elements that actually appear.
* Example:

  ```java
  HashMap<Integer, Integer> map = new HashMap<>();
  ```

---

## 📂 Problems Solved

### 01. Count Frequency of Each Element

* **Approach 1:** Hash Array
* **Approach 2:** HashMap

**Concepts Learned:**

* Frequency counting
* Direct indexing
* HashMap operations (`put()`, `get()`, `containsKey()`, `getOrDefault()`)

---

### 02. Find Highest and Lowest Frequency Element

* **Approach 1:** Hash Array
* **Approach 2:** HashMap

**Concepts Learned:**

* Finding maximum and minimum frequencies
* Ignoring elements with zero frequency
* Tracking both the element and its frequency

---

## 📁 Files

```text
01_CountFrequency_HashArray.java
02_CountFrequency_HashMap.java
03_HighestLowestFrequency_HashArray.java
04_HighestLowestFrequency_HashMap.java
```

---

## ⏱️ Time Complexity

### Hash Array

* **Time:** O(n + maxElement)
* **Space:** O(maxElement)

### HashMap

* **Time:** O(n) (Average Case)
* **Space:** O(n)

---

## 🎯 Key Takeaways

* Hashing is one of the most important techniques in Data Structures and Algorithms.
* Use a **Hash Array** when the value range is small and known.
* Use a **HashMap** when the range is large, unknown, or includes negative values.
* Frequency counting is a foundational concept that appears in many coding interview problems.

---

**Part of my Java solutions for Striver's A2Z DSA Sheet. 🚀**
