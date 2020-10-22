package corejava;

class UserData {
    int salary;

    UserData(int salary) {
        this.salary = salary;
    }
}

public class Callbyvf {

    void changeValue(int num){
        num = num + 10000;
    }

    void changeByRef(UserData userData) {
        userData.salary = userData.salary + 10000;
    }

    public static void main(String[] args) {
        Callbyvf obj = new Callbyvf();

        int initialSalary = 50000;
        UserData initialUserData = new UserData(50000);


        obj.changeValue(initialSalary); // it will create a new copy of value and pass as argument
        obj.changeByRef(initialUserData); // it will pass reference of existing value as argument

        System.out.println("value:" + initialSalary);

        System.out.println("ref:" + initialUserData.salary);

    }
}
