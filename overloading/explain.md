**Two phases of Software**

There are 2 phase: Compiler phase and Virtual Machine phase. Compiler only check if the code is valid, but Virtual Machine will actually run the code from object.

|                                                      | Compiler                                        | Virtual Machine                                                               |
|------------------------------------------------------|-------------------------------------------------|-------------------------------------------------------------------------------|
| `final  SuperClass  superClass  = new  SubClass ();` | SubClass is an sub-class of SuperClass => valid | Create an SubClass object, assign it to superClass variable                   |
| `superClass .foo ();`                                | SuperClass have `foo()` method => valid           | Call `foo()` from object, which is SubClass                                   |
| `final  SubClass  subClass  = new  SubClass ();`     | Normal initiantion                              | Create an SubClass object, assign it to subClass variable                     |
| `((SuperClass)subClass).foo ();`                     | Cast is valid, SuperClass have `foo()` => valid | JVM choose to execute `foo()` from subClass object. This is called upcasting. |

> Java always upcast any object to it's super class (base class). The code `((SuperClass)subClass)` is useless.
> 
> When upcasting, the casted variable in compile time is a type of it super class, so any newly created methods of the sub-class will not accessible