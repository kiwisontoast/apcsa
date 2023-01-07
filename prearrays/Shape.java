public class Shape
{
   
    public String getArea(int r)
    {
        return "Area is "+(Math.PI*(r*r));
    }
    public String getArea(double r)
    {
        return "Area is "+(r*r);
    }
    public String getPerimeter(int r)
    {
        return "Perimeter is "+(2*Math.PI*r);
    }
    public String getPerimeter(double r)
    {
        return "Perimeter is "+(r*4);
    }
}