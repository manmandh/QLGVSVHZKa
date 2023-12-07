import java.util.ArrayList;
import java.util.Scanner;

public class Handle {
    private ArrayList<Person> list;
    public Handle(){
        list = new ArrayList<Person>();
    }
    public void add(Person person){
        this.list.add(person);
    }
    public void SeeALlInformation(){
        for(Person person : list){
            person.AddInformation();
        }
    }
    public Person findStudent(int id){
        for (Person student: list){
            if (student.getID() == id) {
                return student;
            }
        }
        return null;
    }

    public Person findTeacher(int id){
        for (Person teacher: list){
            if (teacher.getID() == id) {
                return teacher;
            }
        }
        return null;
    }
    public void addStudent(){
        for(int i = 0; i < 1; i++){
            System.out.println(String.format("Enter information(%d/%d)", i+1, 1));
            Student student = new Student();
            student.AddInformation();
                  if((findStudent(student.getID()) != null)){
                      System.out.println("Student id already exist! Try again");
                      addStudent();
                  }
                  list.add(student);
        }
    }
    public void addTeacher(){
        for(int i = 0; i < 1; i++) {
            System.out.println(String.format("Enter information(%d/%d)", i + 1, 1));
            Teacher teacher = new Teacher();
            teacher.AddInformation();
            if ((findTeacher(teacher.getID()) != null)) {
                System.out.println("Teacher id already exist! Try again");
                addTeacher();
            }
            list.add(teacher);
        }
    }

    public void findID(){
        System.out.println("Your Person ID for ?");
        int id = Integer.parseInt((new Scanner(System.in)).nextLine());
        for(Person person: list){
            if(person.getID() ==id) {
                person.Display();
            }
            else {
                System.out.println("Not founded");
            }
        }
    }

    public void findAge(){
        System.out.println("Your Person Age for ?");
        int age = Integer.parseInt((new Scanner(System.in)).nextLine());
        for(Person person: list){
            if(person.getAge() == age) {
                person.Display();
            }
            else {
                System.out.println("Not founded");
            }
        }
    }

    public void findAddress(String address){
        System.out.println("Your Person Address for ?");
        for(Person person: list){
            if(person.getAddress().equals(address)){
                person.Display();
            }
            else {
                System.out.println("Not founded");
            }
        }
    }



    public void updateStudent(){
        System.out.println("Your student ID for update?");
        int id = Integer.parseInt((new Scanner(System.in)).nextLine());
        for (Person student: list) {
            if (student.getID() == id) {
                student.EditInformation1();
            }
        }
        System.out.println("Updated!");
    }
    public void updateTeacher(){
        System.out.println("Your teacher ID for update?");
        int id = Integer.parseInt((new Scanner(System.in)).nextLine());
        for (Person teacher : list) {
            if (teacher.getID() == id) {
                teacher.EditInformation2();
            }
        }
        System.out.println("Updated!");
    }
    public void destroyById(){
        System.out.println("ID?");
        int id = Integer.parseInt((new Scanner(System.in)).nextLine());
        for(Person person : list){
            if(person.getID() == id){
                list.remove(person);
            }
        }
        System.out.println("Destroyed");
    }

    public void DeleteAllData(){
        this.list.removeAll(list);
    }
}
