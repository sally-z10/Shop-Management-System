// CSE 314: Advanced Programming
// Final Project
// Names & ID: 
//              Menna Alaa Eldin Abdelgayed Rasslan - 120210311
//              Sally Reda Eldosouky Zeineldeen - 120210008

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int choice;
        Scanner x = new Scanner(System.in);
        Management shopSystem = new Management();

        do {
            System.out.println("Shop Management System Menu");
            System.out.println("---------------------------");
            System.out.print("[1] Customer\n[2] Employee\n[3] Supplier\n[4] Exit\nEnter your User type:\t");
            choice = x.nextInt();
        

            switch (choice) {
                case 1:
                    System.out.println("\n[1] Add Customer");
                    System.out.println("[2] Delete Customer");
                    System.out.println("[3] Update Customer");
                    System.out.println("[4] Display Customers");
                    System.out.print("What would you like to do? \t");

                    int choice2 = x.nextInt();
                    x.nextLine();

                    switch (choice2) {
                        case 1:
                            System.out.println("Enter Customer ID: ");
                            String id = x.nextLine();
                            System.out.println("Enter Customer Name: ");
                            String name = x.nextLine();
                            System.out.println("Enter Customer Address: ");
                            String address = x.nextLine();
                            System.out.println("Enter Customer Email: ");
                            String email = x.nextLine();
                            System.out.println("Enter Customer Phone: ");
                            String phone = x.nextLine();
                            System.out.println("Is Customer a Member? (true/false) ");
                            boolean member = x.nextBoolean();

                            Customer customer = new Customer(id,name, address, email, phone, member);
                            shopSystem.add_customers(customer);
                            break;

                        case 2:
                            System.out.println("Enter Customer ID to delete: ");
                            String customerId = x.nextLine();
                            shopSystem.delete_customers(customerId);
                            break;

                        case 3:
                            System.out.println("Enter Customer ID: ");
                            id = x.nextLine();
                            System.out.println("Enter Customer Name: ");
                            name = x.nextLine();
                            System.out.println("Enter Customer Address: ");
                            address = x.nextLine();
                            System.out.println("Enter Customer Email: ");
                            email = x.nextLine();
                            System.out.println("Enter Customer Phone: ");
                            phone = x.nextLine();
                            System.out.println("Is Customer a Member? (true/false) ");
                            member = x.nextBoolean();
                            shopSystem.update_customers(id,name, address, email, phone, member);
                            break;

                        case 4:
                            shopSystem.display_customers();
                            break;
                    }
                    break;

                case 2:
                    System.out.println("\n[1] Add Employee");
                    System.out.println("[2] Delete Employee");
                    System.out.println("[3] Update Employee");
                    System.out.println("[4] Display Employees");
                    System.out.print("What would you like to do? \t");
    
                    choice2 = x.nextInt();
                    x.nextLine();

                    switch (choice2) {
                        case 1:
                            System.out.println("Enter Employee ID: ");
                            String id = x.nextLine();
                            System.out.println("Enter Employee Name: ");
                            String name = x.nextLine();
                            System.out.println("Enter Employee Address: ");
                            String address = x.nextLine();
                            System.out.println("Enter Employee Email: ");
                            String email = x.nextLine();
                            System.out.println("Enter Employee Phone: ");
                            String phone = x.nextLine();
                            System.out.println("Enter Employee Salary: ");
                            int salary = x.nextInt();
                            x.nextLine();
                            System.out.println("Enter Employee Department: ");
                            String department = x.nextLine();
                            System.out.println("Enter Employee Type: ");
                            String emp_type = x.nextLine();

                            Employee employee = new Employee(id,name, address, email, phone, salary, department, emp_type);
                            shopSystem.add_employees(employee);
                            break;
                        case 2:
                            System.out.println("Enter Employee ID to delete: ");
                            String employeeId = x.nextLine();
                            shopSystem.delete_employees(employeeId);
                            break;
                        case 3:
                            System.out.println("Enter Employee ID: ");
                            id = x.nextLine();
                            System.out.println("Enter Employee Name: ");
                            name = x.nextLine();
                            System.out.println("Enter Employee Address: ");
                            address = x.nextLine();
                            System.out.println("Enter Employee Email: ");
                            email = x.nextLine();
                            System.out.println("Enter Employee Phone: ");
                            phone = x.nextLine();
                            System.out.println("Enter Employee Salary: ");
                            salary = x.nextInt();
                            x.nextLine();
                            System.out.println("Enter Employee Department: ");
                            department = x.nextLine();
                            System.out.println("Enter Employee Type: ");
                            emp_type = x.nextLine();
                            shopSystem.update_employees(id,name, address, email, phone, salary, department, emp_type);
                            break;
                        case 4:
                            shopSystem.display_employees();
                            break;
                    }
                    break;

                case 3:
                    System.out.println("\n[1] Add Supplier");
                    System.out.println("[2] Delete Supplier");
                    System.out.println("[3] Update Supplier");
                    System.out.println("[4] Display Suppliers");
                    System.out.print("What would you like to do? \t");
    
                    choice2 = x.nextInt();
                    x.nextLine();

                    switch (choice2) {
                        case 1:
                            System.out.println("Enter Supplier ID: ");
                            String id = x.nextLine();
                            System.out.println("Enter Supplier Name: ");
                            String name = x.nextLine();
                            System.out.println("Enter Supplier Address: ");
                            String address = x.nextLine();
                            System.out.println("Enter Supplier Email: ");
                            String email = x.nextLine();
                            System.out.println("Enter Supplier Phone: ");
                            String phone = x.nextLine();
                            System.out.println("Enter Supplier Product Type: ");
                            String product_type = x.nextLine();
                            System.out.println("Enter Supplier Shipping Time: ");
                            String shipping_time = x.nextLine();

                            Supplier supplier = new Supplier(id,name, address, email, phone, product_type, shipping_time);
                            shopSystem.add_suppliers(supplier);
                            break;
                        case 2:
                            System.out.println("Enter Supplier ID to delete: ");
                            String supplierId = x.nextLine();
                            shopSystem.delete_suppliers(supplierId);
                            break;
                        case 3:
                            System.out.println("Enter Supplier ID: ");
                            id = x.nextLine();
                            System.out.println("Enter Supplier Name: ");
                            name = x.nextLine();
                            System.out.println("Enter Supplier Address: ");
                            address = x.nextLine();
                            System.out.println("Enter Supplier Email: ");
                            email = x.nextLine();
                            System.out.println("Enter Supplier Phone: ");
                            phone = x.nextLine();
                            System.out.println("Enter Supplier Product Type: ");
                            product_type = x.nextLine();
                            System.out.println("Enter Supplier Shipping Time: ");
                            shipping_time = x.nextLine();
                            x.close();
                            shopSystem.update_suppliers(id,name, address, email, phone, product_type, shipping_time);
                            break;
                        case 4:
                            shopSystem.display_suppliers();
                            break;
                    }
                    break;

                case 4:
                    System.out.println("Exiting the program. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please run the program again.");
            }
        } while (choice != 4);
    }
}