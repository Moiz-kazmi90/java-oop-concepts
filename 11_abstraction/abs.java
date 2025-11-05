abstract class animal{
    // constructor
    animal(){
        System.out.println("ANIMAL IS READY......");
    }
    // method
    public abstract void sound();
} 
class dog extends animal{
    dog(){}
    public void sound(){
        System.out.println("Dog is barking.....");
    }
}
class Tiger extends animal{
    Tiger(){}
    public void sound(){
        System.out.println("Lion is roar.....");
    }
}
class abs{
    public static void main(String[] args){
         dog d = new dog();
         Tiger t = new Tiger();
         d.sound();
         t.sound();
         
         
    }
}