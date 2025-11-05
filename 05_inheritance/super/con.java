// constructor use in super keyword
class a{
     a(int a){
        System.out.println("hello viewer" + a);
       }
}
class b extends a{
    
    b(){
        super(100);
        System.out.println("hello learner");

    }

}
class con{
    public static void main(String[] args){
        b r = new b();
        
    }
}    