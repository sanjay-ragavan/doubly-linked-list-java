# Doubly Linked List Implementation in Java

## Overview

This project implements a **Doubly Linked List (DLL)** in Java. A doubly linked list is a data structure where each node contains a reference to both the next and the previous node, enabling bidirectional traversal. This implementation supports operations like inserting at the beginning, at the end, and after a specified node, as well as displaying the list in both forward and reverse order.

---

## Features

1. **Insert First**: Adds a new node at the beginning of the list.  
2. **Insert Last**: Adds a new node at the end of the list.  
3. **Insert After**: Adds a new node after a specified node in the list.  
4. **Display**: Prints the elements in the list in both normal and reverse order.  
5. **Search**: Retrieves a node based on the provided data.  

---

## Code Structure

### **Classes**  
- **`DLL`**: The core implementation of the doubly linked list.  
- **`Node`**: Represents a single node in the doubly linked list.  
- **`Main`**: Demonstrates the usage of the doubly linked list.  

### **DLL Class Methods**

| Method            | Description                                                                 |
|--------------------|-----------------------------------------------------------------------------|
| `insertFirst(int)` | Adds a node at the beginning of the list.                                  |
| `insertLast(int)`  | Adds a node at the end of the list.                                        |
| `insert(int, int)` | Adds a node after a specified node in the list (based on the given value). |
| `display()`        | Displays the list in normal and reverse order.                            |
| `getValue(int)`    | Searches for a node with the given value and returns it.                  |

---

## How to Use

1. Clone this repository or copy the code.  
2. Compile and run the `Main` class.  
3. The `Main` class demonstrates inserting and displaying nodes in the list.

### Example Usage (from `Main` class)

```java
public class Main {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(10); // Insert 10 at the beginning
        list.insertFirst(20); // Insert 20 at the beginning
        list.insertFirst(30); // Insert 30 at the beginning
        list.insertLast(0);   // Insert 0 at the end
        list.insert(80, 20);  // Insert 80 after the node containing 20
        list.display();       // Display the list in both normal and reverse order
    }
}
```

---

## Sample Output

```
Normal Order
30 -> 20 -> 80 -> 10 -> 0 -> End
Reverse Order
0 -> 10 -> 80 -> 20 -> 30 -> Start
```

---

## Customization

- Update the `Main` class to include more operations or test cases.
- Extend the `DLL` class with additional functionalities like deletion or size computation.

---
