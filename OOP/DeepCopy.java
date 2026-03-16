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
    // In Deep copy a new object is created for all referenced objects..
    // So the copied objects has its own seperate memory..
    // Changes in one objects do not affect other, which is slower and safe.
    public Person(Person p)
    {
        this.name = p.name;
        this.details = new Details(p.details.age,p.details.city);
    }
}
public class DeepCopy{
    public static void main(String [] args)
    {
        Details det = new Details(20,"Salem");
        Person obj = new Person("Pravin",det);
        System.out.println(obj.details.city);
        Person objS = new Person(obj);
        System.out.println(objS.details.city);
        objS.details.city = "Karur";
        System.out.println(objS.details.city);
        System.out.println(obj.details.city);
    }
}