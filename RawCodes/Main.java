public class Main{
    public static void main(String[] args){
        Student[] students = new Student[10];
        for(int i=0; i<10; i++){
            students[i] = new Student("Abhijit "+i);
        }
        students[5].name = "Prabhakar";
        for(Student s : students){
            s.sayName();
        }
    }
}