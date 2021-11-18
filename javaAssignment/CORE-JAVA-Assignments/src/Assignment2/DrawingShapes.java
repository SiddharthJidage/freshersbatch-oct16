package Assignment2;

abstract class Shape{
    abstract void draw();
    {

    }
}
class Line extends Shape
{
    public void draw()
    {
        System.out.println("draw Line");
    }

}
class  Triangle extends Shape
{
    public void draw()
    {
        System.out.println("draw Triangle");
    }

}
class Rectangle extends Shape
{
    public void draw()
    {
        System.out.println("draw rectangle");
    }
}
    class  Circle extends Shape
    {
        public void draw()
        {
              System.out.println("draw circle");
        }

    }


class DrawingShapes{
    public static void main(String[] args) {
        Shape line=new Line();
        line.draw();
        Shape rect=new Rectangle();
        rect.draw();
        Shape O=new Circle();
        O.draw();
        Shape tri=new Triangle();
        tri.draw();
    }

}
