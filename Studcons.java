package corejava;

public class Studcons {
        String studentName;
        int studentAge;
        //constructor
        Studcons(String name, int age){
            studentName = name;
            studentAge = age;
        }
        void display(){
            System.out.println(studentName+ " "+studentAge);
        }
        public static void main(String args[])
        {
            Studcons myObj = new Studcons("anurag" , 19);
            myObj.display();
        }
    }

