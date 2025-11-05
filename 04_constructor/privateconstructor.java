class privateconstructor{
    int a,b;
    private privateconstructor(int x , int y){   
         a=x ; b=y;
         System.out.println(a + " " + b);
    }
    public static void main(String[] args){
        privateconstructor ref = new privateconstructor(10,20);       
    }
    
}
