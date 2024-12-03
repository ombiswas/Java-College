public class Q23 {
    String brand;
    int year;

    // Parameterized constructor
    Q23(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }

    public static void main(String[] args) {
        Q23 car1 = new Q23("Toyota", 2020);
        Q23 car2 = new Q23("Honda", 2019);

        car1.display();
        car2.display();
    }
}
