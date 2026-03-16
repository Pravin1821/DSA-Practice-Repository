import java.util.*;
class Book{
    private String name;
    private String Author;
    // Encapsulation is the process of wrapping the varibales, methods and constructor in single class
    // and accessed by using public getter and setter and restricting direct access.
    // Which is used for data hiding, security, restricting direct access, prevent internal data modification,
    // and allows validation.
    // Making the vriables into private and accessed by public getter and setter.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==""){
            System.out.println("Name cannot be null");
            return;
        }
        this.name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

}
public class Encapsulation{
    public static void main(String [] args) {
        Book obj = new Book();
//        obj.name = "Atomic Habits";
//        System.out.println(obj.name+" "+obj.Author); - this cannot be done by direct access.
        obj.setName("The Power of Subconsious Mind");
        obj.setAuthor("Joshep Murphe");
        System.out.println(obj.getName()+" - "+obj.getAuthor());
    }
}