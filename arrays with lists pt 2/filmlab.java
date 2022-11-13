public class filmlab {
    public static void main(String [] args)
{
Film[] watch = new Film[4];
watch[0] = new Film("Shrek",133,"PG");
watch[1] = new Film("Road to Perdition",117,"G");
watch[2] = new Film("The Truth about Cats and Dogs",93,"PG");
watch[3] = new Film("Enigma",114,"G");
// loop to increase the length time of each object in the array by 10%
for(int i = 0; i < watch.length; i++) {
    watch[i].setLength((int)(watch[i].getLength() * 1.1));
}
// loop to display the film information of each object in the array.
for(int i = 0; i < watch.length; i++) {
    watch[i].display();
}
// create a Film object to store the shortest running time.
Film shortestFilm = watch[0];
for(int i = 1; i < watch.length; i++) {
    if(watch[i].getLength() < shortestFilm.getLength()) {
        shortestFilm = watch[i];
    }
}
// display the shortest running film information.
System.out.println("The shortest running film is... ");
System.out.println("title: "+shortestFilm.title);
System.out.println("length: " + shortestFilm.length);
System.out.println("rating: " + shortestFilm.rating);

}
}
class Film{
String title;
int length;
String rating; // "G", "PG", "PG-13", "R"
public Film (String sname, int min, String r)
{
    title = sname;
    length = min;
    rating = r;
}
public void display()
{
    System.out.println(title + ": " + length + " minutes, rated " + rating);
}
public int getLength()
{
    return length;
}
public void setLength(int len)
{
    length = len;
}}