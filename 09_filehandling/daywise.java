import java.util.*;
import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class daywise{
    public static void main(String[] args){
        String path = "/home/moiz/Desktop/OOPs in java/09_filehandling/Date Region Rep ID Product.txt";
        File filepath = new File(path);

        try{
              int montotal=0,tuetotal=0,wedtotal=0,thurtotal=0,fritotal=0,sattotal=0,suntotal=0;

        DateTimeFormatter format =DateTimeFormatter.ofPattern("d-MMM-yyyy");
        Scanner line =  new Scanner(filepath);
        // first line skip
        if (line.hasNextLine()) line.nextLine();
        while(line.hasNextLine()){
            
            String data = line.nextLine();
            String[] field = data.split("\t");
            if(field.length > 5){
            // sales ka code hai
            int qty = Integer.parseInt(field[4]);
            int  uprice = Integer.parseInt(field[5]);
            int toatalsales = qty * uprice;    
            // System.out.println(toatalsales);
            // convert date into day 
            String dateline = field[0];
            LocalDate date = LocalDate.parse(dateline , format);
            DayOfWeek day = date.getDayOfWeek();
            // convert day MONDAY into "MONDAY"
            String dayname = day.name();
            // System.out.println(day + " " + " -->" + toatalsales);

            // total day and its sum print
          
            if( dayname != null && dayname.equalsIgnoreCase("MONDAY")){
                montotal += toatalsales;
            }else if( dayname != null && dayname.equalsIgnoreCase("TUESDAY")){
                tuetotal += toatalsales;
            }else if(dayname != null && dayname.equalsIgnoreCase("WEDNESDAY")){
                wedtotal += toatalsales;
            }else if(dayname != null && dayname.equalsIgnoreCase("THURSDAY")){
                thurtotal += toatalsales;
            }else if(dayname != null && dayname.equalsIgnoreCase("FRIDAY")){
                fritotal += toatalsales;
            }else if(dayname != null && dayname.equalsIgnoreCase("SATURDAY")){
                sattotal += toatalsales;
            }else if(dayname != null && dayname.equalsIgnoreCase("SUNDAY")){
                suntotal += toatalsales;
            }

            }else{
                System.out.println("No tab found in input!");
            }

        }
            System.out.println("Week total sales");
            System.out.println("Monday = " + montotal);
            System.out.println("Tuesday = " + tuetotal);
            System.out.println("Wednesday =" + wedtotal);
            System.out.println("Thursday =" + thurtotal);
            System.out.println("Friday =" + fritotal);
            System.out.println("Saturday =" + sattotal);
            System.out.println("Sunday =" + suntotal);
        //  best day and highest total logic
        int max =montotal;
        String bestday = "Monday";
        if(tuetotal > max){
            max = tuetotal;
            bestday = "Tuesday";
        }if(wedtotal > max){
            max = wedtotal;
            bestday = "Wednesday";
        }if(thurtotal > max){
            max = thurtotal;
            bestday = "Thursday";
        }if(fritotal > max){
            max = fritotal;
            bestday = "Friday";
        } if(sattotal > max){
            max = sattotal;
            bestday = "Saturday";
        } if(suntotal > max){
            max = suntotal;
            bestday = "Sunday";
        }

        System.out.println("higest sale on" + " :- " + bestday + " :- " + max);
        
        

        }catch(Exception e){
            System.out.println("an file occured");
            e.printStackTrace();
        }
    }
}
