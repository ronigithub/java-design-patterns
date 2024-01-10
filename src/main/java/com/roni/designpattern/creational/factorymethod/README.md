
### What is Factory Method Pattern?

- We want to move the object creation logic from our code to a separate class
- We use this pattern when we do not know in advance which class we may need to instantiate beforehand & also to allow new class to be added to system and handle their creation without affecting client code
- We let subclasses decide which object to instantiate by overriding the factory method

**Use factory method pattern when you want to delegate object instantiation to subclasses, you'd want to do this when you have "product" inheritance hierarchy and possibility of future additions to that.**

### Implement a Factory Method
- We start by creating a class for our creator
  - creator itself can be concrete if it can provide a default object, or it can be abstract
  - Implementation will override the method and return an object

### Implementation Considerations
- The creator can be a concrete class & provide a default implementation for the factory method. In such cases we will create some "default" object in base creator.
- We can also use the simple factory way of accepting additional arguments to choose between different objet types. Subclasses can then override factory method to selectively create different objects for some criteria.

### Design Implementation
- Creator hierarchy in factory method pattern reflects the product hierarchy. we typically end up with a concrete creator per object type
- Template method design pattern often makes use of factory methods.
- Another creational design pattern called "abstract factory" makes use of factory method pattern

### Examples of a factory method
- The java.util.Collection(or java.util.AbstractCollection) has an abstract method called iterator(). This method is an example of a factory method
- Remember, the most defining characteristic of factory method pattern is "subclasses providing the actual instance".

**Note: So static methods returning object instances are technically not GoF factory methods**