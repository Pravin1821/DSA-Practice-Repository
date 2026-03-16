class Details{
    int age;
    String city;

    public Details(int age, String city) {
        this.age = age;
        this.city = city;
    }
}
class Person{
    String name;
    Details details;

    public Person(String name, Details details) {
        this.name = name;
        this.details = details;
    }
    // In Shallow copy only references of the objects are copied not actual values.
    // So both objects shares the same memory reference for internal object.
    // If one objects value changed another object also see the changes, which is faster and less safe.
    public Person(Person p)
    {
        this.name = p.name;
        this.details = p.details;
    }
}
public class ShallowCopy{
    public static void main(String [] args)
    {
        Details det = new Details(20,"Salem");
        Person obj = new Person("Pravin",det);
        System.out.println(obj.details.city);
        Person objS = new Person(obj);
        System.out.println(objS.details.city);
        obj.details.city = "Karur";
        System.out.println(objS.details.city);
    }
}