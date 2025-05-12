## HW5 - Ex1
- **Dependencies are passed directly via constructors**  
  For example, the `Profile` class receives a `ShippingInfo` object through its constructor, and the `Customer` class receives a `Profile` object through its constructor.  
  This is a form of dependency passing, but it is **not dependency injection in the strict sense**.

- **No external injector is used**  
  Dependency injection typically involves a framework or a mechanism (e.g., **Spring**, **Guice**) that automatically provides and manages the dependencies.  
  In this case, the dependencies are manually created and passed, which does **not** qualify as dependency injection.

- **Tight coupling**  
  The code is tightly coupled because the dependencies are explicitly instantiated and passed in the `EComController` class.  
  Dependency injection aims to reduce such coupling by delegating the responsibility of providing dependencies to an external injector.

### Conclusion

While the code demonstrates **dependency passing through constructors**, it does **not implement dependency injection**, because there is **no external mechanism or framework** managing the dependencies.

## Ex2

If an exception is thrown but not caught:
- The program's normal flow is disrupted, and the exception propagates up the call stack.
- If no method in the call stack handles the exception, the program terminates abnormally.
- The Java runtime prints a stack trace to the console, showing the exception type, message, and the sequence of method calls leading to the exception.

### Advantages of Catching Specific Exceptions

Catching specific exceptions (e.g., `InvalidShippingInfoException`) has several advantages:

- **Granularity**:  
  Allows handling different exceptions in different ways, providing more precise error handling.

- **Readability**:  
  The code becomes easier to understand because it explicitly states which exceptions are expected and handled.

- **Avoiding Over-Catching**:  
  Catching a general `Exception` may unintentionally handle exceptions that should not be caught (e.g., `NullPointerException`, `OutOfMemoryError`), leading to unintended behavior.

- **Debugging**:  
  Specific exception handling makes it easier to identify and debug the root cause of an issue.

### 3. Try-With-Resources

A try-with-resources should be used when working with resources that need to be closed after use, such as files, sockets, or database connections. It is applicable to any object that implements the `AutoCloseable` or `Closeable` interface.

**Advantages**:

- **Automatic Resource Management**:  
  Resources are automatically closed at the end of the try block, even if an exception occurs.

- **Simpler Code**:  
  Eliminates the need for explicit `finally` blocks to close resources.

- **Reduced Errors**:  
  Prevents resource leaks by ensuring resources are always closed properly.