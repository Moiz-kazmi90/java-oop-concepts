class A{
    int a,b;
    A(int x , int y){   
         a=x ; b=y;
    }
    A(int x , String  y){   
         System.out.println(x + " " + y);
    }
    void show(){
        System.out.println(a + " " + b);
    }
}
public class parameterconstructor{
    public static void main(String[] args){
        A ref = new A(10,20);
        ref.show();
        A r = new A(10,"moiz");

    }
}