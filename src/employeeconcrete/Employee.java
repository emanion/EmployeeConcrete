
/**
 * Write a description of class Employee here.
 * 
 * @author (Ed Manion) 
 * @version (08/30/14)
 */
public class Employee
{
    // instance variables
    private int age;

    /**
     * Constructor for objects of class Employee
     */
    public Employee()
    {
        // initialise instance variables
        age = 0;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        // input validation goies here
        this.age = age;
    }
    
    public String toString()
    {
        String x = "Employee age = " + age;
        return x;
    }
    
}
