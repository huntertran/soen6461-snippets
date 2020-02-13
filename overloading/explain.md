**Two phases of Software**

There are 2 phase: Compiler phase and Virtual Machine phase. Compiler only check if the code is valid, but Virtual Machine will actually run the code from object.

|                               | Compiler                                             | Virtual Machine                                                                                               |
|-------------------------------|------------------------------------------------------|---------------------------------------------------------------------------------------------------------------|
| `Point  p1  = new  Point ();` | Normal                                               | Create new Point object                                                                                       |
| `Object  o  = p1;`            | Object is super class of Point => valid              | variable o is point to p1 (a Point object)                                                                    |
| `p1 .equals (p2)`             | There is `equals(Point)` => valid                    | p2 is a Point object => call `equals(Point)`                                                                  |
| `o .equals (p2)`              | There is `equals(Object)` in `Object` class => valid | JVM don't have any choice but call `equals(Object)` from `Object` class, which is overloaded in `Point` class |
| `p1 .equals (o)`              | There is `equals(Object)` in `Point` class => valid  | JVM call the `equals(Object)` in `Point` class                                                                |