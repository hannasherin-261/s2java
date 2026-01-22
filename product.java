class Product {
    int pcode;
    String pname;
    double price;

    Product(int pcode, String pname, double price) {
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }

    void display() {
        System.out.println("Product code: " + pcode);
        System.out.println("Product name: " + pname);
        System.out.println("Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {

        Product p1 = new Product(101, "Laptop", 55000);
        Product p2 = new Product(102, "Tablet", 30000);
        Product p3 = new Product(103, "Mobile", 25000);

        Product lowest = p1;

        if (p2.price < lowest.price) {
            lowest = p2;
        }
        if (p3.price < lowest.price) {
            lowest = p3;
        }

        System.out.println("Product with the lowest price:");
        lowest.display();
    }
}
