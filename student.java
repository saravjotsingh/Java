class studentData{
  private
  int rollno,age;
  String name;
  public void setname(String n,int a,int roll){
    name = n;
    age = a;
    rollno = roll;
  }
  public void showname(){
    System.out.println(name);
    System.out.println(age);
    System.out.println(rollno);
  }
}

public class student{
  public static void main(String[] args){
    studentData s1 = new studentData();
    s1.setname("saravjot",21,583);
    s1.showname();
  }
}
