// CSE 314: Advanced Programming
// Final Project
// Names & ID: 
//              Menna Alaa Eldin Abdelgayed Rasslan - 120210311
//              Sally Reda Eldosouky Zeineldeen - 120210008

import java.util.ArrayList;

public class Management {
    private ArrayList <Customer> customers;
    public ArrayList <Employee> employees;
    public ArrayList <Supplier> suppliers;

    public Management(){
        customers= new ArrayList<>();
        employees= new ArrayList<>();
        suppliers= new ArrayList<>();
    }
    public void add_customers(Customer customer){
        customers.add(customer);
        System.out.println("Customer added successfully\n");
    }
    public void add_employees(Employee employee){
        employees.add(employee);
        System.out.println("Employee added successfully\n");
    }
    public void add_suppliers(Supplier supplier){
        suppliers.add(supplier);
        System.out.println("Supplier added successfully\n");
    }

    public void delete_customers(String customerId){
        for (Customer customer: customers){
            if (customer.getId().equalsIgnoreCase((customerId))) {
                customers.remove(customer);
                System.out.println("Customer deleted successfully");
                return;
            }
        }
        System.out.println("Error: Customer Id is invalid");
    }
    public void delete_employees(String employeeId){
        for (Employee employee: employees){
            if (employee.getId().equalsIgnoreCase((employeeId))) {
                employees.remove(employee);
                System.out.println("Employee deleted successfully");
                return;
            }
        }
        System.out.println("Error: Employee Id is invalid");
    }
    public void delete_suppliers(String supplierId){
        for (Supplier supplier: suppliers){
            if (supplier.getId().equalsIgnoreCase((supplierId))) {
                suppliers.remove(supplier);
                System.out.println("Supplier deleted successfully");
                return;
            }
        }
        System.out.println("Error: Supplier Id is invalid");
    }

    public void update_customers(String customerId, String name, String address, String email, String phone, boolean member){
        for (Customer customer: customers){
            if (customer.getId().equalsIgnoreCase((customerId))) {
                customer.setName(name);
                customer.setAddress(address);
                customer.setEmail(email);
                customer.setPhone(phone);
                customer.setMember(member);
                System.out.println("Customer updated successfully");
                return;
            }
        }
        System.out.println("Error: Customer Id is invalid");
    }
    public void update_employees(String employeeId, String name, String address, String email, String phone, int salary, String department, String emp_type){
        for (Employee employee: employees){
            if (employee.getId().equalsIgnoreCase((employeeId))) {
                employee.setName(name);
                employee.setAddress(address);
                employee.setEmail(email);
                employee.setPhone(phone);
                employee.setSalary(salary);
                employee.setDepartment(department);
                employee.setEmp_type(emp_type);
                System.out.println("Employee updated successfully");
                return;
            }
        }
        System.out.println("Error: Employee Id is invalid");
    }
    public void update_suppliers(String supplierId, String name, String address, String email, String phone, String product_type, String shipping_time){
        for (Supplier supplier: suppliers){
            if (supplier.getId().equalsIgnoreCase((supplierId))) {
                supplier.setName(name);
                supplier.setAddress(address);
                supplier.setEmail(email);
                supplier.setPhone(phone);
                supplier.setProduct_type(product_type);
                supplier.setShipping_time(shipping_time);
                System.out.println("Supplier updated successfully");
                return;
            }
        }
        System.out.println("Error: Supplier Id is invalid");
    }

    public void display_customers(){
        System.out.println("Customers: ");
        if (customers.isEmpty()){
            System.out.println("No customers to display\n");
        }
        for (Customer customer: customers){
            customer.displayinfo();
            System.out.println();
        }
    }
    public void display_employees(){
        System.out.println("Employees: ");
        if (employees.isEmpty()){
            System.out.println("No employees to display\n");
        }
        for (Employee employee: employees){
            employee.displayinfo();
            System.out.println();
        }
    }
    public void display_suppliers(){
        System.out.println("Suppliers: ");
        if (suppliers.isEmpty()){
            System.out.println("No suppliers to display\n");
        }
        for (Supplier supplier: suppliers){
            supplier.displayinfo();
            System.out.println();
        }
    }

}
