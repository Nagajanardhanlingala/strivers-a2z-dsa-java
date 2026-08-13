# ⭐ Basic Sorting

This folder contains the basic sorting algorithms from Striver's A2Z DSA Sheet.

Sorting is one of the most fundamental topics in Data Structures and Algorithms. It is used to arrange data in ascending or descending order and serves as the foundation for many advanced algorithms and problem-solving techniques.

---

## 📚 Algorithms Covered

### 01. Selection Sort

**Idea:**
- Find the smallest element in the unsorted portion of the array.
- Swap it with the first unsorted position.
- Repeat until the array is sorted.

**Mental Model:**
> Find the minimum → put it at the beginning → repeat.

**Time Complexity**
- Best Case: **O(n²)**
- Average Case: **O(n²)**
- Worst Case: **O(n²)**

**Space Complexity**
- **O(1)**

---

### 02. Bubble Sort

**Idea:**
- Compare adjacent elements.
- Swap them if they are in the wrong order.
- After each pass, the largest unsorted element reaches its correct position at the end.

**Mental Model:**
> One pass → largest element reaches the end → repeat.

**Time Complexity**
- Best Case: **O(n)** *(Optimized Bubble Sort)*
- Average Case: **O(n²)**
- Worst Case: **O(n²)**

**Space Complexity**
- **O(1)**

---

### 03. Insertion Sort

**Idea:**
- Divide the array into a sorted and unsorted portion.
- Take one element from the unsorted portion.
- Shift larger elements in the sorted portion to the right.
- Insert the element at its correct position.

**Mental Model:**
> Take the next element → shift larger elements → insert it into the correct position.

**Time Complexity**
- Best Case: **O(n)**
- Average Case: **O(n²)**
- Worst Case: **O(n²)**

**Space Complexity**
- **O(1)**

---

### 04. Merge Sort

**Idea:**
- Divide the array into two halves recursively.
- Continue dividing until each part contains one element.
- Merge the sorted halves to build the final sorted array.

**Mental Model:**
> Keep dividing until single elements → merge sorted halves → repeat.

**Time Complexity**
- Best Case: **O(n log n)**
- Average Case: **O(n log n)**
- Worst Case: **O(n log n)**

**Space Complexity**
- **O(n)**

---

### 05. Quick Sort

**Idea:**
- Choose an element as the pivot.
- Partition the array around the pivot.
- Elements smaller than the pivot are placed on the left.
- Elements larger than the pivot are placed on the right.
- The pivot reaches its final correct position.
- Recursively sort the left and right partitions.

**Mental Model:**
> Pick a pivot → fix the pivot → recursively sort the left and right parts.

**Partition Mental Model:**
> `j` searches → `i` maintains the boundary of smaller elements → place the pivot in its final position.

**Time Complexity**
- Best Case: **O(n log n)**
- Average Case: **O(n log n)**
- Worst Case: **O(n²)**

**Space Complexity**
- Average Case: **O(log n)**
- Worst Case: **O(n)**

---

### 06. Recursive Bubble Sort

**Idea:**
- Perform one complete Bubble Sort pass.
- The largest element reaches its correct position at the end.
- Recursively sort the remaining `n-1` elements.

**Mental Model:**
> One pass → largest reaches the end → recursively solve the remaining `n-1`.

**Time Complexity**
- Best Case: **O(n²)**
- Average Case: **O(n²)**
- Worst Case: **O(n²)**

**Space Complexity**
- **O(n)** due to recursion.

---

## 🔑 Key Differences

| Algorithm | Main Idea | Best | Average | Worst | Space |
|-----------|-----------|------|---------|-------|-------|
| Selection Sort | Select minimum and place it | O(n²) | O(n²) | O(n²) | O(1) |
| Bubble Sort | Adjacent comparisons and swaps | O(n) | O(n²) | O(n²) | O(1) |
| Insertion Sort | Insert each element into sorted portion | O(n) | O(n²) | O(n²) | O(1) |
| Merge Sort | Divide and merge | O(n log n) | O(n log n) | O(n log n) | O(n) |
| Quick Sort | Partition around pivot | O(n log n) | O(n log n) | O(n²) | O(log n)* |
| Recursive Bubble Sort | Bubble pass + recursion | O(n²) | O(n²) | O(n²) | O(n) |

\* Average recursion stack space. Worst case is **O(n)**.

---

## 🧠 Important Mental Models

### Selection Sort
> Find the minimum → put it at the beginning → repeat.

### Bubble Sort
> One pass → largest reaches the end → repeat.

### Insertion Sort
> Take the next element → shift larger elements → insert it correctly.

### Merge Sort
> Divide → divide → divide → merge sorted halves.

### Quick Sort
> Pick pivot → fix pivot → recursively sort both sides.

### Recursive Bubble Sort
> One pass → largest reaches the end → recursively solve `n-1`.

---

## 🎯 Learning Outcomes

After completing this section, I should be able to:

- Understand the fundamentals of sorting algorithms.
- Explain Selection Sort, Bubble Sort, and Insertion Sort.
- Understand recursive implementation using Recursive Bubble Sort.
- Understand Divide and Conquer using Merge Sort and Quick Sort.
- Explain pivot selection and partitioning in Quick Sort.
- Perform dry runs manually.
- Analyze time and space complexity.
- Implement sorting algorithms from scratch in Java.
- Compare different sorting algorithms based on their time and space complexity.
- Understand why Quick Sort can degrade to **O(n²)**.

---

### 🚀 Repository

This folder is a part of my **Striver's A2Z DSA Sheet** preparation in Java.