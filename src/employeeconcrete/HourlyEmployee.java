
/**
 * Write a description of class HourlyEmployee here.
 * 
 * @author (Ed Manion) 
 * @version (08/30/14)
 */
public class HourlyEmployee extends Employee
{
    // instance variables
    private int hourlyRate;

    /**
     * Constructor for objects of class HourlyEmployee
     */
    public HourlyEmployee()
    {
        // initialise instance variables
        hourlyRate = 0;
    }

    
    public int getHourlyRate()
    {
        return hourlyRate;
    }
    
    public void setHourlyRate(int hourlyRate)
    {
        this.hourlyRate = hourlyRate;
    }
    
    public String toString()
    {
        String x = super.toString() + " Salaried Employee hourly rate = " + hourlyRate;
        return x;
    }
    
    
}
