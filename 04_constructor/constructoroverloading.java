// constructor overloading
class A{
    int a,b; String c;
    A(int x , int y){   
         a=x ; b=y;
    }
    A(int x , String  y){   
        a=x ; c=y;
    }
}
public class constructoroverloading{
    public static void main(String[] args){
        A r = new A(10,20);
        A r1 = new A(10,"moiz");
        System.out.println(r.a + " " + r.b);
        System.out.println(r1.a + " " + r1.c);

    }
}