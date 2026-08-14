# 🔍 Binary Search

> Binary Search is an efficient searching algorithm used to find an element in a **sorted array/search space** by repeatedly dividing the search space into half.

## 🧠 What is Binary Search?

Binary Search works by comparing the target with the **middle element** of the current search range.

- If `arr[mid] == target` → target found.
- If `arr[mid] < target` → search the right half.
- If `arr[mid] > target` → search the left half.

### Mental Model

> **Check middle → eliminate half → repeat.**

---

## 🚀 Uses of Binary Search

Binary Search can be used for:

- Searching an element in a sorted array.
- Finding **Lower Bound** and **Upper Bound**.
- Finding the first/last occurrence of an element.
- Searching in rotated sorted arrays.
- Finding minimum/maximum values in a monotonic search space.
- **Binary Search on Answer** problems.
- Finding positions, boundaries, or thresholds in sorted/monotonic data.

---

## ⚙️ Basic Algorithm

```java
int low = 0;
int high = arr.length - 1;

while (low <= high) {

    int mid = low + (high - low) / 2;

    if (arr[mid] == target) {
        return mid;
    }
    else if (arr[mid] < target) {
        low = mid + 1;
    }
    else {
        high = mid - 1;
    }
}

return -1;