
### What is Prototype?
- we have a complex object that is costly to create. To create more instances of such class, we use an existing instance as our prototype
- Prototype will allow us to make copies of existing object & save us from having to recreate objects from scratch

### Implement a Prototype
- We start by creating a class which will be a prototype
  - The class must implement Cloneable interface
  - Class should override clone method and return copy of itself
  - Then method should declare CloneNotSupportedException in throws clause to give subclasses chance to decide on whether to support cloning.
- Clone method implementation should consider the deep & shallow copy and choose whichever is applicable

### Implementation Considerations
- Pay attention to the deep copy and shallow copy of references. Immutable fields on clones save the trouble of deep copy.
- Make sure to reset the mutable state of object before returning the prototype. It's a good idea to implement this in method to allow subclasses to initialize themselves.
- clone() method is protected in Object class and must be overridden to be public to be callable from outside the class
- Cloneable is a `marker` interface, an indication that the class supports cloning
- 
### Design Implementation
- Prototypes are useful when you have large objects where majority of state is unchanged between instances, and you can easily identify that state.
- A prototype registry is a class where in you can register various prototypes which other code can access to clone out instances. This solves the issue of getting access to initial instance

### Examples of a Prototype
- Actually the `Object.clone()` method is an example of a prototype!
- This method is provided by java and can clone an existing object, thus allowing any object to act as a prototype. Classes still need to be Cloneable but the method does the job of cloning object