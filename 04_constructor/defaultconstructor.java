class A{
    int a; String name; boolean c;
    // A(){   default constructor
    //      a=1000;  name ="moiz"; c=true;
    // }
    void show(){
        System.out.println(a + " " + name + " "+ c);
    }
}
public class defaultconstructor{
    public static void main(String[] args){
        A ref = new A();
        ref.show();
    }
}