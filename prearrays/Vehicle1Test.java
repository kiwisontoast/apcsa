public class Vehicle1Test
{
public static void main (String args[])
{
Vehicle0 v1 = new Vehicle0();
Vehicle0 v2 = new Vehicle0("Camry", "red",4, 20000);
Vehicle0 v3 = new Vehicle0("Mitsubishi", "blue");
v1.displayData();
v2.displayData();
v3.displayData();
System.out.println(v1);
System.out.println(v2);
System.out.println(v3);
}
}