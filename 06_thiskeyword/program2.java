// this keyword use in variable 
class a{
    int a;
    a(int a){
        this.a=a;
    }
     void show(){
        System.out.println(a);
    }
}

public class program2{
    public static void main(String[] args){
        a r = new a(100);     
        r.show();
        
    }
}    
