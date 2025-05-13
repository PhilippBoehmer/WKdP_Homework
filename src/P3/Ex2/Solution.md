1.In this case, modules is a final reference to an ArrayList. While you cannot reassign modules to a new ArrayList or any other object, you can still modify the contents of the ArrayList (e.g., adding, removing, or clearing elements) because the ArrayList itself is mutable.  This is why the changeModuleList method works—it modifies the contents of the ArrayList that modules refers to, rather than reassigning the modules reference.

2.*final Primitive Variable:*  
The value of the variable cannot be changed once it is assigned.
Example:
final int a = 42;
a = 50; // Compilation error: cannot assign a value to final variable 'a'

*final Object Reference Variable:*

The reference to the object cannot be changed to point to another object.
However, the contents (or state) of the object itself can still be modified if the object is mutable.
Example:
final Student s = new Student();
s = new Student(); // Compilation error: cannot assign a value to final variable 's'
s.setName("John"); // Allowed: modifying the state of the object

Primitives: final makes the value immutable.
Object References: final makes the reference immutable, but not the object itself.

3.A final instance variable must be initialized either:  
At the point of declaration (e.g., private final int a = 42;), or
In every constructor of the class.
In your code, the final variable a is initialized in the constructor FinalTest(int a). This ensures that the variable is assigned a value before the object is fully constructed, satisfying the requirement for final variables. Once assigned, the value of a cannot be changed.