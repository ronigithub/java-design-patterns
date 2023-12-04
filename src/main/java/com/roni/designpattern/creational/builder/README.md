### What problem builder design pattern solves?
- Class constructor requires a lot of information 
```java
// Product instances are immutable
class Product {
  public Product(int weight, double price, int shipVolume, int shipCode) {
    // initialize
  }
  // other code
}
```

- Object that need other objects or `parts` to construct them
```java
class Address {
    public Address(String houseNumber, String street) {
      // initialize
    }
}

class User {
    public User(String name, Address address, LocalDate birthDate, List<Role> roles) {
      // initialize
    }
    
    // other code
}
```

### What is Builder?

- We have a complex process to construct an object involving multiple steps, then builder design pattern can help us.


- In builder, we remove the logic related to object construction from `client` code and abstract it in separate class.



### **Four different Role in Builder design pattern**

**Role - Product**  
- Final complex object that we want to create

**Role - Builder** 
- Providers interface for creating `parts` of the product

**Role - Concrete Builder**
- Constructs parts & assembles final product
- Keeps track of the product it creates

**Role - Director**
- uses builder to construct object
- knows the steps & their sequence to build product

### Implement a Builder

- we start by creating a builder (steps)
  - Identify the parts of the product & provide methods to create those parts
  - It should provide a method to `assemble` or build the product/object
  - It must provide a way/method to get fully built object out. Optionally builder can keep reference to a product it has built so the same can be returned again in future

- A director can be a separate class or client can play the role of director

## Considerations

### Implementation Considerations
- We can easily create an immutable class by implementing builder as an inner static class. This type of implementation used quite frequently even if immutability is not a main concern

### Design Considerations
- The director Role is rarely implemented as separate class, typically the consumer of the object instance or the client handles that role


- Abstract builder is also not required if `product` itself is not part of any inheritance hierarchy. We can directly create concrete builder.

- `Too many constructor arguments` problem then it's a good indication that builder pattern may help.