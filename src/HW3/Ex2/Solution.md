### 1. What is the static type of `m1`? What is its dynamic type?
- **Static type** of `m1`: `Message`
- **Dynamic type** of `m1`: `Email`

---

### 2. Which method is called? Why?
- The overridden `getType()` method from the `Email` class is called.
- **Reason**:  
  In Java, **method calls are dynamically dispatched**. This means the method of the **actual (dynamic) object type** (`Email`) is executed, even if the reference type is `Message`.

---

### 3. Why can’t `send()` be called directly?
- The reference variable `m1` is of type `Message`, and `Message` **does not declare** a `send()` method.
- In Java, the compiler checks **methods based on the reference (static) type**, not the object (dynamic) type.
- Therefore, you **cannot call** `send()` on a `Message` reference directly without a cast.

---

### 4. How could you safely call `send()` anyway (e.g., using `instanceof`)?
You can check if `m1` is an instance of `Email` using `instanceof` and then cast it:

```java
if (m1 instanceof Email) {
    ((Email) m1).send();
}
```

- This ensures **safe casting** and prevents `ClassCastException`.
- After confirming `m1` is actually an `Email`, you can call the `send()` method safely.

---
