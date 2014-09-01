
/**
 * Write a description of class EmployeeTestDrive here.
 * 
 * @author (Ed Manion) 
 * @version (08/30/14)
 */

public class EmployeeTestDrive
{
  public static void main(String args[])
  {
    //test concrete examples
    Employee joe = new Employee();
    joe.setAge(45);
    System.out.println("joe " + joe.toString());
    
    SalariedEmployee sally = new SalariedEmployee();
    sally.setAge(22);
    sally.setAnnualRate(50000);
    System.out.println("sally " + sally.toString());
    
    HourlyEmployee bill = new HourlyEmployee();
    bill.setAge(26);
    bill.setHourlyRate(22);
    System.out.println("bill " + bill.toString());
    
  }
}
