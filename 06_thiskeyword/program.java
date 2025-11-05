// this keyword use
class a{
     void show(){
        System.out.println(this);
    }
}

public class program{
    public static void main(String[] args){
        a r = new a();
        System.out.println(r);        
        r.show();
        
    }
}    
