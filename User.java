package corejava;

public class User {
    String firstName;
    String lastName;
    int mobileNumber;
    String address;
    int pinCode;
    int serviceNumber;

    public User(String firstName, String lastName, int mobileNumber, String address, int pinCode, int serviceNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.address = address;
        this.pinCode = pinCode;
        this.serviceNumber = serviceNumber;
    }
        public static void main(String[] args) {
            User user = new User("anurag", "kumar", 442523787, "opera homes", 60005, 876464646);
            System.out.println(user.firstName + " " + user.lastName + " " + user.mobileNumber + " " + user.address + " " + user.pinCode + "" + user.serviceNumber);
        }
}

class UserBill {

}


// User -> firstName, lastName, mobileNumber, address, pinCode, serviceNumber
// ElectricityBillReport -> User[] arr = new User[10];
//      generateBillForUser(int serviceNo) ->