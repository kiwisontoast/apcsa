class Vehicle0
{
public String color, model;
double price;
int doors;
// default constructor
Vehicle0()
{
color = "red";
model = null;
price=0;
doors=0;
}
// parameter constructor
public Vehicle0(String m, String c, int d, double p)
{
color = c;
model = m;
price=p;
doors=d;
}
// parameter constructor
 public Vehicle0(String m, String c)
{
color = c;
model = m;
price = 55555;
}
public void displayData()
{
System.out.println(this);
System.out.println("Model:" + model+"\ncolor: " + color);
System.out.println("Price:" + price+"\ndoors: " + doors+ "\n");
}
public String toString(){
    String output ="";
    output+="Model:" + model+"\ncolor: " + color + "\n";
    output+="Price:" + price+"\ndoors: " + doors+ "\n";
    return output;
}
}
