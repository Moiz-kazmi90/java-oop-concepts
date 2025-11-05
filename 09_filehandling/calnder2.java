import java.time.*;
public class calnder2{
    public static void main(String[] args){
      int year = 2025;
      int month = 10;
    
         System.out.println("Su  Mo  Tu  We  Th  Fr  Sa");
        LocalDate ldnow = LocalDate.of(year,month,1);
        DayOfWeek dfow = ldnow.getDayOfWeek();

        int spacetotal = dfow.getValue();  //Monday =1 to Sunday = 7
        for (int i=1 ; i<=spacetotal % 7;i++){    //wed = 3 
           System.out.print("    ");    //blank space is 4
        //    3 x 4 = 12 blank spaces 
        }
        int totaldays = ldnow.lengthOfMonth();
      for(int day=1 ; day <=totaldays;day++){
          System.out.printf("%-4d", day);

        LocalDate date = LocalDate.of(year,month,day);
        DayOfWeek dayofweek = date.getDayOfWeek();
    //    line break after saturday
       if(dayofweek.toString().equalsIgnoreCase("SATURDAY")){
        System.out.println();
       }       
      
      }
    }
}