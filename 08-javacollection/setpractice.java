import java.util.*;

public class setpractice{
    public static void main(String[] args){
     HashSet<Integer> set = new HashSet<>();   
     set.add(1);
     set.add(1);
     set.add(2);
     set.add(3);
     set.add(3);
     set.add(4);
     set.add(5);
     System.out.println(set);
     System.out.println(set.remove(1));
     System.out.println(set.contains(1));
     System.out.println(set.size());
     System.out.println(set.isEmpty());
     System.out.println(set);

     for(int i=1;i<=10;i++){
        if(set.contains(i)){
            System.out.println(i + " found ");
        }else{
            System.out.println(i + "not found found ");

        }
     }
     




     for(int i : set){
        System.out.println(i);
     }

     
    }
}