package ecommerce;

    public class MainApp {

        public static void main(String[] args) {
            Product p1 = new Electronics(1, "Laptop", 50000);
            Product p2 = new Clothing(2, "Shirt", 2000);
            Product p3 = new Groceries(3, "Rice", 1000);

            printFinalPrice(p1);
            printFinalPrice(p2);
            printFinalPrice(p3);
        }

        public static void printFinalPrice(Product p) {

            double price = p.getPrice();
            double discount = p.calculateDiscount();
            double tax = 0;

            if (p instanceof Taxable) {
                Taxable t = (Taxable) p;
                tax = t.calculateTax();
                System.out.println(t.getTaxDetails());
            }

            double finalPrice = price + tax - discount;
            System.out.println("Product Name: " + p.getName());
            System.out.println("Price: " + price);
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);
            System.out.println("----------------------");
        }
    }

