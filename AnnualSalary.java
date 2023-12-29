package classTest;
class user
{
int id=102;
String name="vedika";

public void setemployeeid(int id)
{
	this.id=id;
}
public void setemployeename(String name)
{
	this.name=name; 
}

}
class Employee extends user //creating sub class
{
  double Salary=14000;
  public void setsalary(double Salary)
  {
  	this.Salary=Salary; 
  }
  
}
public class AnnualSalary
{
public static void main(String args[])
{
  Employee a1=new Employee(); //create object of employee class
  int id=a1.id;
  String Name=a1.name;
  double Calculateannualsalary =a1.Salary*12;
  System.out.println("id: "+id);
  System.out.println("Name of Employee: "+Name);
  System.out.println("total salary is: "+Calculateannualsalary);
}
}
