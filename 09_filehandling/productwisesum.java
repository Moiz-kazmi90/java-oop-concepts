import java.util.*;
import java.io.*;

public class productwisesum{
    public static void main(String[] args){
        String path = "/home/moiz/Desktop/OOPs in java/09_filehandling/Date Region Rep ID Product.txt";
        HashMap<String,Integer> map = calculatesumofproduct(path);
       
          // print the result
          for(String k : map.keySet()){
            System.out.println(k + "= " + map.get(k));
          }

    }

    public static HashMap<String , Integer> calculatesumofproduct(String path){
        HashMap <String , Integer> map = new HashMap<>();
         File filepath = new File(path);
        try{
          Scanner line = new Scanner(filepath);
        //   first line skip
        if(line.hasNextLine()) line.nextLine();
          while(line.hasNextLine()){
            String data = line.nextLine();
            String field[] = data.split("\t");
            if(field.length > 5){
                // total sum 
                int qty = Integer.parseInt(field[4]);
                int uprice = Integer.parseInt(field[5]);
                int total = qty * uprice;
                // System.out.println(total);

                // product wise sum

                String product = field[3];
                // System.out.println(product + " --> " + total );

                // check the product appear in condition if condition false then go to else
                if(map.containsKey(product)){
                    // if product present then get and add total to previous one
                    // map.put("Product A", map.get("Product A") + total);
                    // previous total is 100 so the next total is 50 final total is 150                     
                    map.put(product,map.get(product)+total);
                }else{
                    // first time the product appear eg:-(product A , 100)
                    map.put(product,total);
                }
                
            }else{
                System.out.println("field not found");
            }

          }
        }catch(Exception e){
            e.printStackTrace();

        }
        return map;
    }
}