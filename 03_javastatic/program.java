// static variable method block
// static keyword is used to call varible name method without creating object
// this and super can not be used in static context
class program{
       
    // static block
    static{
        System.out.println("learn coding");
    }
    // instance block
    {
        System.out.println("get internship");
    }
    program(){
        System.out.println("good salary");
        
    }
  
    public static void main(String[] args){
    program p = new program();
    
    }
}