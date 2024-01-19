
### What is Abstract Factory?
- Abstract factory is used when we have two or more objects which work together forming a kit or set and there can be multiple sets or kits that can be created by client code
- So we separate client code from concrete objects forming such a set and also from the code which creates these sets.

### Implement an Abstract Factory
- We start by studing the product `sets`
  - Create abstract factory as an abstract class or an interface
  - Abstract factory defines abstract methods for creating products
  - Provide concrete implementation of factory for each set of products
- Abstract factory makes use of factory method pattern. You can think of abstract factory as an object with multiple factory methods

### Implementation Considerations
- Factories can be implemented as singletons, we typically ever need only one instance of it anyway. But make ure to familiarize yourself with drawbacks of singletons.
- Adding a new product type requires changes to the base factory as well as all implementations of factory.
- we provide the client code with concrete factory so that it can create objects.

### Design Implementation
- When we want to constrain object creations so that they all work together then abstract factory is good design pattern
- Abstract factory uses factory method pattern
- If objects are expensive to create then you can transparently switch factory implementations to use prototype design pattern to create objects.

### Examples of an Abstract Factory
- The javax.xml.parsers.DocumentBuilderFactory is good example of an abstract factory pattern.
- However, this implementation doesn't match 100% with the UML of abstract factory from GoF. The class has a `static newInstance()` method which returns actual factory class object
- The `newInstance()` method however uses classpath scanning, system properties, an external properties file as ways to find the factory class & creates the factory object. 
So we can change the factory class being used, even if this is a static method

```java
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class Client {
  public static void main(String[] args) {
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    System.out.println("Using factory class: " + factory.getClass());

    DocumentBuilder builder = factory.newDocumentBuilder();
    System.out.println("Got builder class: " + builder.getClass());
    
    Document doc = builder.newDocument();
    System.out.println("Got Document class: " + doc.getClass());
  }
}
```