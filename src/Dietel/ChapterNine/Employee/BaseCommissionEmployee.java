package Dietel.ChapterNine.Employee;

public class BaseCommissionEmployee extends CommissionEmployee {

    private double baseSalary;


    public BaseCommissionEmployee (String firstName, String lastName,
                                  String socialSecurityNumber,
                                  double commissionRate,
                                  double grossSale,
                                  double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, commissionRate, grossSale);

        if(baseSalary < 0.0) throw new IllegalArgumentException("Base Salary must be greater than Zero");
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary < 0.0) throw new IllegalArgumentException("Base Salary must be greater than Zero");
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "Base Commission Employee \n" +
                "First Name: " + getFirstName() + '\n' +
                "Last Name: " + getLastName() + '\n' +
                "Social Security Number: " + getSocialSecurityNumber() + '\n' +
                "Gross Sale: " + getGrossSale() +
                "Commission Rate: " + getCommissionRate() +
                "baseSalary: " + baseSalary ;
    }
}
