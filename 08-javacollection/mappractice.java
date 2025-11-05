import java.util.*;

public class mappractice{
    public static void main(String[] args){
        HashMap<Integer,String> map = new HashMap<>();
        // var map = HashMap<Integer,String>();

        map.put(1,"moiz");
        map.put(5,"komal");
        map.put(6,"moiz");
        map.put( 0,"");
        map.put(7,"");


        map.put(2,"ali");
        map.put(3,"hassan");
        map.put(4,"kazmi");
        map.put(3,"Hassan");
        // for(int i=1;i<=map.size();i++){
        //     System.out.println(map.get(i));
        // }
        // System.out.println(map.get("hassan"));

        // System.out.println(map.get(4));
        // System.out.println(map.remove(2));


        // System.out.println(map.containsKey(1));
        // System.out.println(map.containsValue("hassan"));
        System.out.println(map);
        // System.out.println(map.keySet());
        // System.out.println(map.values());
        // System.out.println(map.entrySet());

        // for(Map.Entry<Integer,String> entry : map.entrySet()){
        //     System.out.println("key" + entry.getKey() + ":" + "value" + entry.getValue());
        // }

        // print key and value
        for(int i:map.keySet()){
            System.out.println("key" + i + " values" + map.get(i));
        }






    }
}