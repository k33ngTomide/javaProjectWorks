package ChapterThree;

public class Car {

    private String model;
    private String year;
    private double price;

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public double getPrice() {
        return price;
    }

    public void discount(int discount) {
        price = price - (price * ((double)discount/100));
    }

    public Car(String model, String year, double price) {
        this.model = model;
        this.year = year;
        if (price > 0) this.price = price;
    }
}
