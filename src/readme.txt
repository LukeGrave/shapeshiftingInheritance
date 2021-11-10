# Shapes

Wir implementieren ein Programm, in dem wir auf einer FlÃ¤che Formen reprÃ¤sentieren kÃ¶nnen.

Eine Form(Shape) ist eine abstrakte Klasse und hat einige Eigenschaften:
* `color` beinhaltet den Farbcode fÃ¼r die Darstellung
* `isFilled` ist ein boolscher Wert der ausdrÃ¼ckt ob die Form ausgefÃ¼llt wird oder nicht.
Jede Form hat auÃŸerdem zwei Methoden
* `public abstract double getArea()` gibt die FlÃ¤che einer Form zurÃ¼ck
* `public abstract double getPerimeter()` gibt den Umfang einer Form zurÃ¼ck

Wir implementieren einige konkrete Formen.

## Circle

Ein Kreis hat als zusÃ¤tzliche Eigenschaft einen `radius` und erweitert die `Shape` Klasse.
Durch die Erweiterung muss der Kreis alle Methoden von Form implementieren, die dort als abstrakt definiert werden.
Ist der Radius negativ oder null soll eine `IllegalArgumentException` geworfen werden.

ðŸ’¡ Es gibt eine Konstante fÃ¼r PI in Math.PI definiert.

## Rectangle

Ein Rechteck hat als zusÃ¤tzliche Eigenschaften eine `width` und `length` und erweitert wie die Kreis Klasse die Form
und muss dadurch ebenfalls die `getArea` und `getPerimeter` Methode implementieren.
Sind Breite oder LÃ¤nge negativ oder null soll eine `IllegalArgumentException` geworfen werden.

## Square

Ein Quadrat ist im Prinzip nur eine spezielle Art von Rechteck - ein Rechteck dessen Breite und LÃ¤nge den gleichen Wert haben.

# Tests

Am besten wÃ¤re es, wenn du fÃ¼r jede konkrete, instanzierbare (=nicht abstrakt) Klasse, also Circle, Rectangle und Square eine Testklasse erzeugst
und die Umfangs- und FlÃ¤chenberechnung fÃ¼r 2 verschiedene Beispiele pro Klasse testet.
Schreibe auÃŸerdem Tests, welche verifizieren dass bei Ãœbergabe einer negativen Zahl oder null eine IllegalArgumentException geworfen wird.

implement a test program Main.java, that creates several instances and prints area and perimeter
practice rigorous information hiding: all members should be private unless you really really need them not to be.
your test code should exhibit the principles of polymorphism, e.g. write Shape s = new Rectangle(4.0, 4.5) rather thanRectangle r = new Rectangle(...)
the number pi is defined in Math.PI




------------------------------------------------

Inheritance
In Object-Oriented programming we view the world as made out of objects. The objects have data and methods coupled together and they interact with one another by sending messages. Classes are abstractions of objects. We can organize the classes in a hierarchy. A child class (or subclass) can inherit both data and methods from the parent class (or super class). The keyword that is used to denote inheritance is extends.
There are two views to inheritance. One view is that a child class is always an extension (that is a larger set) of the properties associated with the parent class. A child has all the data fields and methods and can add to the data fields and methods. However, there is another view where the child class is a more specialized (or restricted) form of the parent type. So in a certain sense it is a contraction of the parent type. This tension between inheritance as expansion and inheritance as contraction is a source for much of the power inherent in the technique but also causes confusion.

A commonly employed rule of thumb to understand when inheritance is an appropriate software technique is known as is-a relationship. The relationship derives its name from a simple rule of thumb that tests this relationship. To determine if the class X inherits from class Y, form the sentence "An X is a Y". If this sounds correct and if it seems to match everyday experience then X and Y have a is-a relationship.

Inheritance is transitive. A class can inherit features from superclasses many levels away. If class Dog is a subclass of Mammal and class Mammal is a subclass of class Animal then Dog will inherit attributes both from Mammal and from Animal.

Here are some classes that we would like to examine and see if there is an inheritance relationship between them.

To illustrate the inheritance hierarchy we use the class Shape as the super class and the classes Circle and Rect inherit from Shape. Shape has two instance variables xPos and yPos. We can think of (xPos, yPos) as the coordinates of the upper left corner of the smallest rectangle that bounds Shape. The sides of this rectangle are parallel to the x and y axis.

Shape has well defined concept of area but not a mathematical formula that we can code. The method area() for Shape is declared abstract. Hence Shape is also an abstract class. Since Shape is an abstract class we cannot create an object of type Shape. Subclasses of Shape will have to define the method area(). We can also declare a method to be final. Such a method cannot be redefined in a subclass.

When an object is created a constructor is used to initialize the object's variables. If variables are declared in the superclass then its variables need to be initialized. This can be done by calling on the method super(); To call on any other method in the superclass we can do:

super.methodName ( parameter list );
A variable that is declared public can be seen and accessed from other classes. A variable that is declared private can be accessed only within that class. A subclass cannot access the private variables of a super class. However, protected variables can be accessed by sub classes.

A sub class inherits the public and protected variables and methods of the super class. It can add to the list of variables and methods. Or it may override, that is, completely redefine a method of the superclass but preserve the method signature. Methods that are defined as being final cannot be redefined.

The Circle class inherits from the Shape class. The (xPos, yPos) refer to the coordinates of the center of the Circle. The Circle has an instance variable, its radius. The Rect class inherits from the Shape class. In the Rect class the variables (xPos, yPos) refer to the position of the top left corner of the rectangle whose sides are parallel to the x and y axes. There are two other instance variables (xLower, yLower) and they are the coordinates of the lower right corner of the rectangle. The Cylinder class inherits from Circle. The coordinates (xPos, yPos, zPos) refer to the coordinates of the center of the base of the cylinder. The side of the cylinder is parallel to the z axis. height refers to the height of the cylinder along the z axis.

We said earlier that we cannot create an object of type Shape because it is an abstract class. However, we can have a variable of type Shape. Thus

Shape aShape;
is perfectly legal, whereas the following statement is not:
Shape aShape = new Shape();
After we declare a variable of type Shape we can assign any object that is a subtype of Shape to it. These are legal Java statements:
aShape = new Circle ();
aShape = new Rect ();
aShape = new Cylinder();
We can have an array of Shapes and assign each element in the array to an object that is a sub type of Shape.

Shape [] shapeList = new Shape [3];
shapeList[0] = new Circle ();
shapeList[1] = new Rect ();
shapeList[2] = new Cylinder ();
If we are handed such an array of Shapes we can determine the type of the object using the instanceof operator. The expression ( shapeList[1] instanceof Circle ) will return a boolean value of false.
Objects are passed to and from methods by reference. Objects are passed to methods as parameters and passed back in return statements. An object must exist before it is passed to a method. The changes that the method makes to an object are permanent. An object returned by a method is usually created in the method, and the object continues to exist after the method stops executing. If a parameter specifies that input object belongs to ClassA, than any object belonging to its sub classes can be substituted. Similarly, if a method's return type is ClassA, then objects of ClassA or its sub classes can be returned.


abstract class Shape
{
  protected double xPos;
  protected double yPos;

  public Shape () {  xPos = 0.0;  yPos = 0.0;  }

  public Shape ( double x, double y )
  {  xPos = x;  yPos = y;  }

  public double getXPos () {  return xPos;  }
  public double getYPos () {  return yPos;  }

  public void setXPos ( double x ) {  xPos = x;  }
  public void setYPos ( double y ) {  yPos = y;  }

  abstract public double area ();

  public void moveTo ( double xLoc, double yLoc )
  {  xPos = xLoc;  yPos = yLoc;  }

  public boolean equals ( Shape s )
  {  return ((this.xPos == s.xPos) && (this.yPos == s.yPos));  }

  public String toString ()
  {
    String str = "Shape: Position: (" + xPos + ", " + yPos + ")";
    return str;
  }
}

class Circle extends Shape
{
  protected double radius;

  public Circle ()
  {  super ();  radius = 0.0;  }

  public Circle ( double x, double y, double rad )
  {  super (x, y);  radius = rad;  }

  public double getRadius () { return radius; }
  public void setRadius ( double rad ) { radius = rad; }

  public double area () { return Math.PI * radius * radius; }
  public double circumference () { return 2.0 * Math.PI * radius; }

  public boolean equals ( Circle c )
  { return ((this.xPos == c.xPos) &&
	    (this.yPos == c.yPos) &&
	    (this.radius == c.radius));
  }

  public String toString ()
  { String str = "Circle: Center: (" + xPos + ", " + yPos + ") ";
    str = str + "Radius: " + radius;
    return str;
  }
}

class Rect extends Shape
{
  private double xLower;
  private double yLower;

  public Rect ()
  {  super ();  xLower = 0.0;  yLower = 0.0;  }

  public Rect ( double xU, double yU, double xL, double yL )
  {  super ( xU, yU );  xLower = xL;  yLower = yL;  }

  public double getUpperX () { return xPos; }
  public double getUpperY () { return yPos; }
  public double getLowerX () { return xLower; }
  public double getLowerY () { return yLower; }

  public void setUpperX ( double xVal ) { xPos = xVal; }
  public void setUpperY ( double yVal ) { yPos = yVal; }
  public void setLowerX ( double xVal ) { xLower = xVal; }
  public void setLowerY ( double yVal ) { yLower = yVal; }

  public double area ()
  { return ( xLower - xPos ) * ( yPos - yLower ); }

  public void moveTo ( double xLoc, double yLoc )
  {
    xLower += xLoc - xPos;
    yLower += yLoc - yPos;
    super.moveTo ( xLoc, yLoc );
  }

  public boolean equals ( Rect rt )
  { return (( this.xPos == rt.xPos ) && ( this.yPos == rt.yPos ) &&
	    ( this.xLower == rt.xLower ) && ( this.yLower == rt.yLower ));
  }

  public String toString ()
  {
    String str = "Rectangle: Upper Left: (" + xPos + ", " + yPos + ") ";
    str = str + "Lower Right: (" + xLower + ", " + yLower + ")";
    return str;
  }
}

class Cylinder extends Circle
{
  private double zPos;
  private double height;

  public Cylinder ()
  { super (); zPos = 0.0; height = 0.0; }

  public Cylinder ( double x, double y, double z, double r, double h )
  { super ( x, y, r );  zPos = z;  height = h; }

  public double getZPos () { return zPos; }
  public double getHeight () { return height; }

  public void setZPos ( double z ) { zPos = z; }
  public void setHeight ( double h ) { height = h; }

  public double area ()
  {  return 2.0 * super.area() + height * super.circumference();  }

  public double volume () { return height * super.area(); }

  public void moveTo ( double x, double y, double z )
  { super.moveTo ( x, y ); zPos = z; }

  public boolean equals ( Cylinder cy )
  {  return super.equals ( cy ) && ( this.zPos == cy.zPos );  }

  public String toString ()
  { String str = "Cylinder: Position: (" + xPos + ", " + yPos + ", " + zPos;
    str = str + ") " + "Radius: " + radius + " Height: " + height;
    return str;
  }
}

public class ShapeDriver
{
  public static void main ( String args[] )
  {
    // Test the Circle Class
    Circle ci = new Circle ( 1.0, 2.0, 3.0 );
    System.out.println ( ci.toString());
    ci.moveTo (2.0, 1.0);
    System.out.println ( ci.toString());
    System.out.println ("Area of circle = " + ci.area());
    System.out.println ();

    // Test the Rect Class
    Rect rt = new Rect ( 0.0, 1.0, 1.0, 0.0 );
    System.out.println ( rt.toString() );
    rt.moveTo ( 2.0, 2.0 );
    System.out.println ( rt.toString() );
    System.out.println ( "Area of rectangle = " + rt.area() );
    System.out.println ();

    // Test the Cylinder Class
    Cylinder cy = new Cylinder ( 1.0, 2.0, 3.0, 4.0, 5.0 );
    System.out.println ( cy.toString() );
    System.out.println ( "Area of cylinder = " + cy.area() );
    cy.moveTo ( 3.0, 2.0, 1.0 );
    System.out.println ( "Volume of cylinder = " + cy.volume() );
    System.out.println ();

    // Declare an array of shapes
    Shape shapes[] = new Shape [3];
    shapes [0] = new Circle ( 1.0, 2.0, 3.0 );
    shapes[1] = new Rect ( 2.0, 5.0, 4.0, 3.0 );
    shapes[2] = new Cylinder ( 3.0, 4.0, 5.0, 6.0, 7.0 );

    // Calculate total area
    double totalArea = 0.0;
    for ( int i = 0; i < 3; i++ )
    totalArea += shapes[i].area();
    System.out.println ( "Total area = " + totalArea );
    System.out.println ();

    // Calculate total volume
    double totalVolume = 0.0;
    for ( int j = 0; j < 3; j++ )
    {
      if ( shapes[j] instanceof Cylinder )
	totalVolume += ( (Cylinder) shapes[j]).volume();
    }
    System.out.println ( "Total volume = " + totalVolume );
    System.out.println ();

  }
}