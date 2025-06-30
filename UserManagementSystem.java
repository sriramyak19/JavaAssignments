import java.util.Scanner;

class User {
    int id;
    String firstName;
    String lastName;
    String email;
    String username;
    String password;

    User(int id, String firstName, String lastName, String email, String username, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + firstName + " " + lastName + ", Email: " + email + ", Username: " + username);
    }
}

public class UserManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User[] users = new User[100]; // max 100 users
        int count = 0;
        int choice;

        do {
            System.out.println("\n--- User Management System ---");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Forgot Password");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter First Name: ");
                String fname = sc.nextLine();
                System.out.print("Enter Last Name: ");
                String lname = sc.nextLine();
                System.out.print("Enter Email: ");
                String email = sc.nextLine();
                System.out.print("Enter Username: ");
                String uname = sc.nextLine();
                System.out.print("Enter Password: ");
                String pass = sc.nextLine();

                users[count] = new User(id, fname, lname, email, uname, pass);
                count++;
                System.out.println("User registered successfully!");
            }

            else if (choice == 2) {
                System.out.print("Enter Username: ");
                String uname = sc.nextLine();
                System.out.print("Enter Password: ");
                String pass = sc.nextLine();

                boolean found = false;
                for (int i = 0; i < count; i++) {
                    if (users[i].username.equals(uname) && users[i].password.equals(pass)) {
                        System.out.println("Login successful!");
                        users[i].display();
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Invalid username or password.");
                }
            }

            else if (choice == 3) {
                System.out.print("Enter Username: ");
                String uname = sc.nextLine();
                boolean found = false;
                for (int i = 0; i < count; i++) {
                    if (users[i].username.equals(uname)) {
                        System.out.println("Password: " + users[i].password);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Username not found.");
                }
            }

            else if (choice == 4) {
                System.out.println("Exiting... Thank you!");
            }

            else {
                System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}

