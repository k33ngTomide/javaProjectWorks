package Dietel.ChapterNine.Employee;

public class CommissionEmployee extends Employee{
    private double grossSale;
    private double commissionRate;
    public CommissionEmployee(String firstName, String lastName,
                              String socialSecurityNumber, double commissionRate, double grossSale) {
        super(firstName, lastName, socialSecurityNumber);

        if(grossSale < 0.0) throw new IllegalArgumentException("Gross Sale must be greater than Zero");
        if(commissionRate < 0.0) throw new IllegalArgumentException("Commission Rate must be greater than Zero");

        this.grossSale = grossSale;
        this.commissionRate = commissionRate;
    }

    public double getGrossSale() {
        return grossSale;
    }

    public void setGrossSale(double grossSale) {
        if(grossSale < 0.0)
            throw new IllegalArgumentException("Gross Sale must be greater than Zero");

        this.grossSale = grossSale;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if(commissionRate < 0.0)
            throw new IllegalArgumentException("Commission Rate must be greater than Zero");
        this.commissionRate = commissionRate;
    }

    @Override
    public String toString() {
        return "Commission Employee" +
                "First Name: " + getFirstName() + '\n' +
                "Last Name: " + getLastName() + '\n' +
                "Social Security Number: " + getSocialSecurityNumber() + '\n' +
                "Gross Sale: " + grossSale +
                "Commission Rate: " + commissionRate ;
    }
}
