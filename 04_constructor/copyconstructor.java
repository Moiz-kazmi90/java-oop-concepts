class A{
    int a,b;
    A(int x , int y){   
         a=x ; b=y;
         System.out.println(a + " " + b);
    }
    A(A ref){
        a=ref.a;
        b=ref.b;
        System.out.println(a + " " + b);

        
    }
   
    
}
public class copyconstructor{
    public static void main(String[] args){
        A ref = new A(10,20);
        A r = new A(ref);

       

    }
}