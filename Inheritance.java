// person parent class a te student base class a

class Person{
  private
  String name;
  int age;
  public void setName(String n){
    name = n;
  }
  public void setAge(int a){
    age = a;
  }

  public int getAge(){
    return age;
  }
  public String getName(){
    return name;
  }
}

class Student extends Person{
  private
  int rollNo;
  public void setRoll(int r){
    rollNo = r;
  }
  public int getRollNo(){
    return rollNo;
  }
}

public class Inheritance{
  public static void main(String[] args){
    Student s1 = new Student();
    s1.setName("Saravjot");
    s1.setAge(23);
    s1.setRoll(583);
    System.out.println(s1.getName());
    System.out.println(s1.getAge());
    System.out.println(s1.getRollNo());
  }
}
