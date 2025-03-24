### **🌳 Properties of Trees - Essential for FAANG Interviews**  

To solve tree-based **FAANG interview questions**, you must understand these fundamental **tree properties**:  

---

## **📌 1. Height & Depth of a Tree**
- **Height of a Node**: The **longest path** from that node to a leaf.
- **Height of a Tree**: The **height of the root node**.
- **Depth of a Node**: The **path length from the root to that node**.

### **Example**
```
        1  <-- Height = 3 (Max levels - 1)
       / \
      2   3
     / \   
    4   5   
```
- **Height of Node 1 (root)** = `2`
- **Depth of Node 4** = `2` (since `4` is at level `2`)
- **Height of Node 4** = `0` (leaf node has height `0`)

✅ **Formula**:  
`Height(root) = 1 + max(Height(left), Height(right))`  

🔹 **Use Case**: Helps in solving problems like **Balanced Trees, Diameter, LCA, and AVL Trees**.

---

## **📌 2. Full, Complete, and Perfect Binary Trees**
Understanding different types of binary trees helps in optimizing problems like **heap construction, traversal efficiency, and balanced trees**.

### **Full Binary Tree**
- Every node has **0 or 2** children.
```
       1
      / \
     2   3
    / \
   4   5
```
✅ Used in **expression trees, Huffman encoding**.

### **Complete Binary Tree**
- Every level is **completely filled** except possibly the last one.
- Last level nodes are **as left as possible**.
```
       1
      / \
     2   3
    / \  /
   4  5 6
```
✅ Used in **Heaps (Heapify, Priority Queues)**.

### **Perfect Binary Tree**
- **All levels completely filled**, **every leaf is at the same level**.
```
       1
      / \
     2   3
    / \  / \
   4   5 6  7
```
✅ Number of nodes = `2^h - 1`.  
✅ Used in **Binary Index Trees, Segment Trees**.

---

## **📌 3. Balanced vs. Unbalanced Trees**
- **Balanced Tree**: `Height = O(log n)` → Ensures **efficient operations**.
- **Unbalanced Tree**: `Height = O(n)` → Becomes **inefficient**.

### **Example of an Unbalanced Tree**
```
       1
        \
         2
          \
           3
            \
             4
```
🔴 Searching in this tree is **O(n)** (like a **linked list**).  
✅ **Balanced Trees (AVL, Red-Black, B-Trees) keep height ≈ log(n)**.

---

## **📌 4. Traversal Properties**
### **Types of Tree Traversals**
✅ **DFS Traversals**
- **Inorder (Left → Root → Right)** → **Sorted order in BST**
- **Preorder (Root → Left → Right)** → **Tree serialization**
- **Postorder (Left → Right → Root)** → **Used in deletion problems**

✅ **BFS (Level Order) Traversal**
- Explores tree **level by level**.
- Used in **Shortest Path, Zigzag Traversal, Binary Heap Construction**.

---

## **📌 5. Binary Search Tree (BST) Properties**
- **Left subtree** contains values **smaller** than root.
- **Right subtree** contains values **greater** than root.
- **Inorder Traversal of BST gives a sorted array**.

```
        5
       / \
      3   8
     / \  / \
    2  4 7   9
```
✅ Used in **Range Queries, Floor/Ceil Operations, Insertion & Deletion Optimization**.

---

## **📌 6. Lowest Common Ancestor (LCA) Property**
The **LCA of two nodes** is the **deepest node** that is an ancestor of both.

### **LCA Example**
```
       1
      / \
     2   3
    / \
   4   5
```
- **LCA(4, 5) = 2**  
- **LCA(2, 3) = 1**  

✅ Used in **Binary Lifting, Distance between nodes, LCA in BST**.

---

## **📌 7. Diameter of a Tree**
- **Longest path between any two nodes**.
- Either passes through the root **or is in left/right subtree**.
- Uses **Height Property**.

✅ Formula: `Diameter = 1 + leftHeight + rightHeight`

---

## **📌 8. Heap Properties**
- **Min Heap**: `parent ≤ children` → Used in **Priority Queues**.
- **Max Heap**: `parent ≥ children` → Used in **Heap Sort, Dijkstra’s Algorithm**.

✅ **Heap Order Property** ensures fast **insertion/deletion in O(log n)**.

---

## **📌 9. Trie Properties**
- Special tree for **prefix-based search**.
- **Used in:** **Auto-complete, Dictionary lookups, IP Routing**.

✅ **Time Complexity for search in Trie** → `O(M)` (where `M` is length of word).

---

## **📌 10. AVL Trees & Red-Black Trees**
- **AVL Tree** → **Self-balancing BST**, ensures `O(log n)` for all operations.
- **Red-Black Tree** → Used in **Java’s TreeMap, C++’s map/set**.

✅ **Why?** They keep height `O(log n)`, unlike unbalanced BSTs.

