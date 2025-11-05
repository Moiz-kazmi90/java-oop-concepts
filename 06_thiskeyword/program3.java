// this keyword use in constructor 
class a{
   a(){      // default constructor
         System.out.println("learn coding");
    }
    a(int a){
        this();
        System.out.println(a);

    }
}
public class program3{
    public static void main(String[] args){
        a r = new a(100);     

        
    }
}    
