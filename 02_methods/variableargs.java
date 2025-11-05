public class variableargs{
    public static void main(String[] args){
       System.out.println(sum(2,4,4));
       
    }

    public static int sum(int ...a){
        int sum=0;
        for(int i : a){
            sum += i;
        }
        return sum;
    }

    
}