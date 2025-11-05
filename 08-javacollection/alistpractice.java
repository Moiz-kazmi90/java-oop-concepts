import java.util.*;

public class alistpractice{
    public static void main(String[] args){
        ArrayList<String> list= new ArrayList<>();
        list.add("mango");
        list.add("apple");
        list.add("banana");
        list.add("nanspati");
        list.add("amrood");
        System.out.println(list);
        System.out.println(list.remove("mango"));
        System.out.println(list.indexOf("banana"));
        Collections.sort(list);
        System.out.println(list);



        // for(int i : list){
        //     System.out.println(i);
        // }
        // for(int i=0;i<list.size();i++){
        //     System.out.println(list.get(i));
        // }



    }
}