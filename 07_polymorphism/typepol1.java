class typepol1{
    int add(){
        int a=10,b=20;
        int c=a+b;
        return c;
    }

      void add(int a,int b){
        int c=a+b;
        System.out.println(c);
    }

      void add(int a,double d){
        double c=a+d;
        System.out.println(c);
    }
    public static void main(String[] args){
        typepol1 r = new typepol1();
        int add = r.add();
        System.out.println(add);
        r.add(10,20);
        r.add(10,20.04);
    }
}