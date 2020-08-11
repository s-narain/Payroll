public class PayrollDemo
{
    public static void main()
    {
        System.out.println("ID\tName\t\trate/hr\t\thours/worked\tGross Pay");
        System.out.println("-------------------------------------------------------------------");
        
        Payroll employee1 = new Payroll ("Joe Shmo", 1111);
        employee1.setPayRate(15);
        employee1.setHours(50);
        printPayroll(employee1);
        
        Payroll employee2 = new Payroll ("Sally Smith", 2222);
        employee2.setPayRate(20);
        employee2.setHours(50);
        printPayroll(employee2);
        
        Payroll employee3 = new Payroll ("Juan Lola", 3333);
        employee3.setPayRate(25);
        employee3.setHours(40);
        printPayroll(employee3);
    }
    
    public static void printPayroll(Payroll e)
    {
        System.out.println(e.getID() + "\t" + 
                            e.getName() + "\t" + 
                            e.getPayRate() + "\t\t" +
                            e.gethoursWorked() + "\t\t" +
                            e.getGrossPay());
    }
}
