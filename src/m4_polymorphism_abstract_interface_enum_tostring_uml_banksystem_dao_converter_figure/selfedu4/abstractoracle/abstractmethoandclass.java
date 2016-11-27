package src.m4_polymorphism_abstract_interface_enum_tostring_uml_banksystem_dao_converter_figure.selfedu4.abstractoracle;

/**
 * Created by Стрела on 04.09.2016.
 * An abstract class is a class that is declared abstract—it may or may not include abstract methods.
 * Abstract classes cannot be instantiated, but they can be subclassed.
 * An abstract method is a method that is declared without an implementation (without braces,
 * and followed by a semicolon), like this:
 * abstract void moveTo(double deltaX, double deltaY);
 * If a class includes abstract methods, then the class itself must be declared abstract, as in:
 *
 public abstract class GraphicObject {
 // declare fields
 // declare nonabstract methods
 abstract void draw();
 }
 Abstract classes are similar to interfaces. You cannot instantiate them, and they may contain a mix of methods declared with or without an implementation. However, with abstract classes, you can declare fields that are not static and final, and define public, protected, and private concrete methods. With interfaces, all fields are automatically public, static, and final, and all methods that you declare or define (as default methods) are public. In addition, you can extend only one class, whether or not it is abstract, whereas you can implement any number of interfaces.

 Which should you use, abstract classes or interfaces?

 Consider using abstract classes if any of these statements apply to your situation:
 You want to share code among several closely related classes.
 You expect that classes that extend your abstract class have many common methods or fields, or require access modifiers other than public (such as protected and private).
 You want to declare non-static or non-final fields. This enables you to define methods that can access and modify the state of the object to which they belong.
 Consider using interfaces if any of these statements apply to your situation:
 You expect that unrelated classes would implement your interface. For example, the interfaces Comparable and Cloneable are implemented by many unrelated classes.
 You want to specify the behavior of a particular data type, but not concerned about who implements its behavior.
 You want to take advantage of multiple inheritance of type.

 When an Abstract Class Implements an Interface

 In the section on Interfaces, it was noted that a class that implements an interface must implement all of the interface's methods. It is possible, however, to define a class that does not implement all of the interface's methods, provided that the class is declared to be abstract. For example,

 abstract class X implements Y {
 // implements all but one method of Y
 }

 class XX extends X {
 // implements the remaining method in Y
 }
 In this case, class X must be abstract because it does not fully implement Y, but class XX does, in fact, implement Y.
 Class Members

 An abstract class may have static fields and static methods. You can use these static members with a class reference (for example, AbstractClass.staticMethod()) as you would with any other class.
 */
public class abstractmethoandclass {
}
