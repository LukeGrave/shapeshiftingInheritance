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
