class student{
    int roll,marks;
    String name;
    void input(){
        System.out.println("Enter roll name and marks");
    }
}

class moiz extends student{
    void disp(){
        roll=1;name="moiz";marks=90;
        System.out.println(roll+" "+name+" "+marks);
    }
    public static void main(String[] args){
        moiz m = new moiz();
        m.input();
        m.disp();
    }
}