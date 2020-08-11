//Selina Narain March 31 2020

public class Payroll
{
    private String employeeName;
    private int employeeID;
    private int payRate;
    private int hoursWorked;
    private double grossPay;
    
    public Payroll(String name, int idNumber)
    {
        employeeName = name;
        employeeID = idNumber;
    }
    
    //getters
    public String getName()
    {
       return employeeName;
    }
    
    public int getID()
    {
        return employeeID;
    }
    
    public int getPayRate()
    {
        return payRate;
    }
    
    public int gethoursWorked()
    {
        return hoursWorked;
    }
    
    public double getGrossPay()
    {
        if (hoursWorked<=40)
        {
            grossPay = hoursWorked * payRate;
        }
        else if(hoursWorked>40)
        {
            grossPay = 40 * payRate;
            
            hoursWorked = hoursWorked - 40;
            double overtimeRate = payRate * 1.5;
            double overtime = hoursWorked * overtimeRate;
            
            grossPay = grossPay + overtime;
        }
        return grossPay;
    }
    
    //setters
    public void setPayRate(int rate)
    {
        payRate = rate;
    }
    
    public void setHours(int hrs)
    {
        hoursWorked = hrs;
    }
}
