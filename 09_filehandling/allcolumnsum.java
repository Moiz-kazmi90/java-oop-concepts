import java.util.*;
import java.io.*;

public class allcolumnsum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Column Name (Product / Region / Rep ID): ");
        String colName = sc.nextLine();

        String path = "/home/moiz/Desktop/OOPs in java/09_filehandling/Date Region Rep ID Product.txt";
        HashMap<String, Integer> result = getTotalSales(path, colName);

        for(String key : result.keySet()){
            System.out.println(key + " = " + result.get(key));
        }

        sc.close();
    }


    public static HashMap<String, Integer> getTotalSales(String path, String colName) {
        HashMap<String, Integer> map = new HashMap<>();

        try {
            Scanner sc = new Scanner(new File(path));

            String[] headers = sc.nextLine().split("\t");
            int index = -1;

            for(int i=0; i<headers.length; i++){
                if(headers[i].equalsIgnoreCase(colName)){
                    index = i;
                    break;
                }
            }

            while(sc.hasNextLine()){
                String[] data = sc.nextLine().split("\t");

                String key = data[index];
                int qty = Integer.parseInt(data[4]);
                int price = Integer.parseInt(data[5]);
                int total = qty * price;

                map.put(key, map.getOrDefault(key, 0) + total);
            }

            sc.close();
        } catch(Exception e){
            System.out.println("File Error!");
        }

        return map;
    }
}
