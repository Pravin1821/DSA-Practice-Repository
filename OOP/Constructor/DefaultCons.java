class Student{
    int rollno;
    String name;
//    public Student()
//    {
//        this.rollno = 0;
//        this.name = "null";
//    }
    // Counstructor in java is the special method which is used to initialize the values for the properties
    // for the class through object when they are created, it has no return type and called automatically.
    // Defaul constructor set the default values for the properties in the class when default constructor called.
    void display()
    {
        System.out.println("Name: "+name+" RollNo: "+rollno);
    }
}
public class DefaultCons{
    static void main(String[] args) {
        Student obj = new Student();
        obj.display();
    }
}