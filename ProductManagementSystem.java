import java.util.Scanner;

class Product {
    int pid;
    String pname;
    int qty;
    double price;

    Product(int id, String name, int quantity, double cost) {
        pid = id;
        pname = name;
        qty = quantity;
        price = cost;
    }

    void display() {
        System.out.println("ID: " + pid + ", Name: " + pname + ", Qty: " + qty + ", Price: $" + price);
    }
}

public class ProductManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[100]; // Max 100 products
        int count = 0;
        int choice;

        do {
            System.out.println("\n--- Product Management Menu ---");
            System.out.println("1. Add Product");
            System.out.println("2. View All Products");
            System.out.println("3. View Product by ID");
            System.out.println("4. Update Product Quantity");
            System.out.println("5. Delete Product");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter Product ID: ");
                int id = sc.nextInt();
                sc.nextLine(); // consume newline
                System.out.print("Enter Product Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Quantity: ");
                int qty = sc.nextInt();
                System.out.print("Enter Price: ");
                double price = sc.nextDouble();

                products[count] = new Product(id, name, qty, price);
                count++;
                System.out.println("Product added successfully.");
            }

            else if (choice == 2) {
                System.out.println("\n--- All Products ---");
                for (int i = 0; i < count; i++) {
                    products[i].display();
                }
            }

            else if (choice == 3) {
                System.out.print("Enter Product ID to view: ");
                int searchId = sc.nextInt();
                boolean found = false;

                for (int i = 0; i < count; i++) {
                    if (products[i].pid == searchId) {
                        products[i].display();
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Product not found.");
                }
            }

            else if (choice == 4) {
                System.out.print("Enter Product ID to update: ");
                int updateId = sc.nextInt();
                boolean found = false;

                for (int i = 0; i < count; i++) {
                    if (products[i].pid == updateId) {
                        System.out.print("Enter new quantity: ");
                        int newQty = sc.nextInt();
                        products[i].qty = newQty;
                        System.out.println("Product quantity updated.");
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Product not found.");
                }
            }

            else if (choice == 5) {
                System.out.print("Enter Product ID to delete: ");
                int deleteId = sc.nextInt();
                boolean deleted = false;

                for (int i = 0; i < count; i++) {
                    if (products[i].pid == deleteId) {
                        for (int j = i; j < count - 1; j++) {
                            products[j] = products[j + 1];
                        }
                        count--;
                        System.out.println("Product deleted.");
                        deleted = true;
                        break;
                    }
                }

                if (!deleted) {
                    System.out.println("Product not found.");
                }
            }

            else if (choice == 6) {
                System.out.println("Exiting... Thank you!");
            }

            else {
                System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}

