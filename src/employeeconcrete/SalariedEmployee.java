
/**
 * Write a description of class SalariedEmployee here.
 * 
 * @author (Ed Manion) 
 * @version (08/30/14)
 */
public class SalariedEmployee extends Employee
{
    // instance variables
    private int annualRate;

    /**
     * Constructor for objects of class SalariedEmployee
     */
    public SalariedEmployee()
    {
        // initialise instance variables
        annualRate = 0;
    }

    
    public int getAnnualRate()
    {
        return annualRate;
    }
    public void setAnnualRate(int annualRate)
    {
        // input validation goes here
        this.annualRate = annualRate;
    }
    
    
    public String toString()
    {
        String x = super.toString() + " Salaried Employee annual rate = " + annualRate;
        return x;
    }
    
}
