// variable ke liye super 
class a{
    int a=10;
}
class b extends a{
    int a=20;
    void show(){
    System.out.println(a);
    System.out.println(super.a);
    }

}
class hello{
    public static void main(String[] args){
        b r = new b();
        r.show();
    }
}    
