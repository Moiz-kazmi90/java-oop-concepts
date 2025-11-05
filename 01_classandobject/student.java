public class student{

    String name;
    int age;
    int marks;

    public void result(){
        System.out.println("you are pass");
    }

    public static void main(String[] args){
        student stu = new student();
        System.out.println(stu.name="moiz");

        System.out.println(stu.age=19);
        System.out.println(stu.marks=900);
        stu.result();
    }
}