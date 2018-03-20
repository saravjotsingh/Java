import java.util.*;

class Student{
  private
  String name;
  String address;
  int ncourses=0;
  String [] course = new String[30];
  int [] grades = new int[30];
  Student(){

  }
  Student(String n,String a){
    this.name = n;
    this.address = a;
  }

  String getName(){
    return this.name;

  }

  String getAddress(){
    return this.address;
  }

  void setAddress(String a){
    this.address = a;

  }
  String tostring(){
    return (this.name + " " + this.address);
  }

  void addCoursesGrade(String c,int g){
    this.course[ncourses] = c;
    this.grades[ncourses] = g;
    this.ncourses++;
  }

  void printGrades(){
    //System.out.println(ncourses);
    for(int i=0;i<ncourses;i++){
      System.out.println("course " + course[i] + " Grade " + grades[i]);
    }
  }

  double getAverage(){
    double avg=0;
    //System.out.println(ncourses);
    for(int i=0;i<ncourses;i++){
       avg += grades[i];
    }
    avg = avg/ncourses;
    return avg;
  }

}

public class Student1{
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the name");
    String name = scan.next();
    System.out.println("Enter the Address");
    String address = scan.next();
    Student s1 = new Student(name,address);
    System.out.println("Enter the number of courses");
    int n = scan.nextInt();
    for(int i=0;i<n;i++){
        System.out.println("Enter the course and detail");
        String c = scan.next();
        int g = scan.nextInt();
        s1.addCoursesGrade(c,g);
    }
    s1.printGrades();
    System.out.println(s1.getAverage());



  }
}
