# Access Modifiers and Alternative Designs

## `public String owner`
- **Accessibility**:  
  Accessible from all classes, regardless of package or inheritance. No access issues.
- **Alternative Design**:  
  _None needed._

---

## `private double balance`
- **Accessibility**:  
  Only accessible within the `Account` class.  
  Access **fails** in:
    - `AccountManager`
    - `ExternalAudit`
    - `CompanyAccount`  
      (because they are outside the `Account` class)
- **Alternative Design**:  
  Use a **public getter method** (`getBalance()`) to provide controlled access.

---

## `protected int pin`
- **Accessibility**:  
  Accessible within the same package and by subclasses in other packages.  
  Access **works** in:
    - `AccountManager` (same package)
    - `CompanyAccount` (subclass in a different package)  
      Access **fails** in:
    - `ExternalAudit` (different package and not a subclass)
- **Alternative Design**:  
  Use a **public method** to allow controlled access or modification.

---

## `String internalNote` (default/package-private)
- **Accessibility**:  
  Accessible only within the same package.  
  Access **works** in:
    - `AccountManager` (same package)  
      Access **fails** in:
    - `ExternalAudit`
    - `CompanyAccount` (different packages)
- **Alternative Design**:  
  Use a **getter method** to provide controlled access.

---

# Difference Between `protected` and `private` with Getter

## `protected`
- Allows direct access to subclasses and classes in the same package.
- Less restrictive, but can lead to unintended access.

## `private` with Getter
- Provides controlled access to the variable.
- More restrictive and secure, as access is only through the getter.
- **Preferred** for **encapsulation** and maintaining **control** over how the variable is accessed or modified.
