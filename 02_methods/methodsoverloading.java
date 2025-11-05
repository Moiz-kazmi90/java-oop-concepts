// method overloading function name same or return type same but parameters is different
public class methodsoverloading{
    public static void main(String[] args){
       System.out.println(sum(2,4));
       System.out.println(sum(2,4,6));
    }

    public static int sum(int a,int b){
        return a + b;
    }

    public static int sum(int a,int b,int c){
        return a + b + c;
    }
}