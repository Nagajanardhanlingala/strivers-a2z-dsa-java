# ⭐ Basic Sorting

This folder contains the basic sorting algorithms from Striver's A2Z DSA Sheet.

Sorting is one of the most fundamental topics in Data Structures and Algorithms. It is used to arrange data in ascending or descending order and serves as the foundation for many advanced algorithms such as Binary Search, Merge Sort, Quick Sort, and various greedy and graph-based problems.

---

## 📚 Algorithms Covered

### 01. Selection Sort
**File:** `01_SelectionSort.java`

**Idea:**
- Find the smallest element in the unsorted portion of the array.
- Swap it with the first unsorted position.
- Repeat until the array is sorted.

**Time Complexity**
- Best Case: **O(n²)**
- Average Case: **O(n²)**
- Worst Case: **O(n²)**

**Space Complexity**
- **O(1)**

---

### 02. Bubble Sort
**File:** `02_BubbleSort.java`

**Idea:**
- Compare adjacent elements.
- Swap them if they are in the wrong order.
- After each pass, the largest unsorted element "bubbles" to its correct position at the end.

**Time Complexity**
- Best Case: **O(n)** *(Optimized Bubble Sort)*
- Average Case: **O(n²)**
- Worst Case: **O(n²)**

**Space Complexity**
- **O(1)**

---

## 🔑 Key Differences

| Selection Sort | Bubble Sort |
|----------------|-------------|
| Finds the smallest element in each pass. | Compares adjacent elements in each pass. |
| Performs one swap per pass. | May perform multiple swaps per pass. |
| Smaller element is placed at the beginning. | Larger element moves to the end. |
| O(n²) in all cases. | Can be O(n) in the best case with optimization. |

---

## 🎯 Learning Outcomes

After completing these algorithms, you should be able to:

- Understand the fundamentals of sorting.
- Identify the working of Selection Sort and Bubble Sort.
- Perform dry runs manually.
- Analyze Time and Space Complexity.
- Implement both algorithms from scratch in Java.

---

### 🚀 Repository

This folder is a part of my **Striver's A2Z DSA Sheet** preparation in Java.