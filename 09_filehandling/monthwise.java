import java.util.*;
import java.io.*;

public class monthwise {
    public static void main(String[] args) {
        String path = "/home/moiz/Desktop/OOPs in java/09_filehandling/Date Region Rep ID Product.txt";
        File filepath = new File(path);

        try {
            Scanner line = new Scanner(filepath);

            String[] months = {
                "Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
            };
            int[] sales = new int[12];

            // skip first line (header)
            if (line.hasNextLine()) line.nextLine();

            while (line.hasNextLine()) {
                String data = line.nextLine().trim();
                String[] field = data.split("\t");

                if (field.length > 5) {
                    // sales ka code hai
                    String date = field[0];
                    String[] datesplit = date.split("-");
                    String monthwise = datesplit[1];

                    // Find month index
                    int monthIndex = -1;
                    for (int i = 0; i < months.length; i++) {
                        if (months[i].equalsIgnoreCase(monthwise)) {
                            monthIndex = i;
                            break;
                        }
                    }

                    if (monthIndex != -1) {
                        int qty = Integer.parseInt(field[4].trim());
                        int uprice = Integer.parseInt(field[5].trim());
                        int totalsales = qty * uprice;
                        sales[monthIndex] += totalsales;
                    }
                }
            }

            // Print result
            System.out.println("Month-wise Sales Summary:");
            for (int i = 0; i < months.length; i++) {
                System.out.println(months[i] + " : " + sales[i]);
            }

            line.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + path);
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
