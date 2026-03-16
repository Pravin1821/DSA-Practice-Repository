class Student{
    int rollno;
    String name;
    public Student()
    {
        this.rollno = 0;
        this.name = "Unknown";
    }
    // Parameterized constructor which supports parameters to assign values for the propeties of objects class.
    public Student(int rollno, String name)
    {
        this.name = name;
        this.rollno = rollno;
    }
    void display(){
        System.out.println("Name: "+name+ "\nRollNo: "+rollno);
    }
}
public class ParameterizedCons{
    public static void main(String [] args)
    {
        Student obj = new Student();
        obj.display();
        Student objP = new Student(100,"Pravin");
        objP.display();
        objP.name = "Praveen";
        objP.display();
    }
}