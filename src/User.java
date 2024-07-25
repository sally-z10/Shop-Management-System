// CSE 314: Advanced Programming
// Final Project
// Names & ID: 
//              Menna Alaa Eldin Abdelgayed Rasslan - 120210311
//              Sally Reda Eldosouky Zeineldeen - 120210008

public abstract class User {
    private String name;
    private String address;
    private String email;
    private String phone;
    private String id;

    public User(String id, String name, String address, String email, String phone ){
        this.id=id;
        this.address=address;
        this.name=name;
        this.email=email;
        this.phone=phone;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void displayinfo(){
        System.out.println("The id is: "+getId());
        System.out.println("The name is: "+getName());
        System.out.println("The address is: "+getAddress());
        System.out.println("The email is: "+ getEmail());
        System.out.println("The phone number is: " +getPhone());
    }

}
