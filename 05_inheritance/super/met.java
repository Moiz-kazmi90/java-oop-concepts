// methods use in super keyword
class a{
     void show(){
        System.out.println("happy viewer");
    }
}
class b extends a{
    
    void show(){
        super.show();
        System.out.println("happy learner");
    }

}
class met{
    public static void main(String[] args){
        b r = new b();
        r.show();
    }
}    
