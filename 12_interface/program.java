import java.util.Scanner;
interface client{
    void input();
    void output();

}
class program  implements client{
    String name; double salary;
    public void input(){
      Scanner i = new Scanner(System.in);
      System.out.println("Enter a name");
      name=i.nextLine();
      System.out.println("Enter a salary");
      salary=i.nextDouble();
    }
    public void output(){
        System.out.println(name + " " + salary);
    }
    public static void main(String[] args){
        client c = new program();
        c.input();
        c.output();

    }
}