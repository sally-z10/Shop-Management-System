// CSE 314: Advanced Programming
// Final Project
// Names & ID: 
//              Menna Alaa Eldin Abdelgayed Rasslan - 120210311
//              Sally Reda Eldosouky Zeineldeen - 120210008

public class Customer extends User{

    private boolean member;
    public Customer(String id, String name, String address, String email, String phone, boolean member) {
        super(id,name, address, email, phone);
        this.member = member;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    @Override
    public void displayinfo() {
        super.displayinfo();
        System.out.println("Membership: " + isMember());
    }
}






