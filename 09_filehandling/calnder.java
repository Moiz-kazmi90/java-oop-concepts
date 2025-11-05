import java.time.*;
public class calnder{
    public static void main(String[] args){
      int year = 2025;
      int month = 11;
    
         System.out.println("Su  Mo  Tu  We  Th  Fr  Sa");
        LocalDate ldnow = LocalDate.of(year,month,1);
        DayOfWeek dfow = ldnow.getDayOfWeek();
  if (dfow.toString().equalsIgnoreCase("MONDAY")) {
            System.out.print("    ");   //4 blank space
        } else if (dfow.toString().equalsIgnoreCase("TUESDAY")) {
            System.out.print("        ");   //8 blank space
        } else if (dfow.toString().equalsIgnoreCase("WEDNESDAY")) {
            System.out.print("            ");   //12 blank space
        } else if (dfow.toString().equalsIgnoreCase("THURSDAY")) {
            System.out.print("                ");   //16 blank space
        } else if (dfow.toString().equalsIgnoreCase("FRIDAY")) {
            System.out.print("                    ");    //20 blank space
        } else if (dfow.toString().equalsIgnoreCase("SATURDAY")) {
            System.out.print("                        ");   //24 blank space
        }

        int totaldays = ldnow.lengthOfMonth();
      for(int day=1 ; day <=totaldays;day++){
        LocalDate date = LocalDate.of(year,month,day);
        DayOfWeek dayofweek = date.getDayOfWeek();
        
         if (day < 10) {
                System.out.print(day + "   ");
            } else {
                System.out.print(day + "  ");
            }

       if(dayofweek.toString().equalsIgnoreCase("SATURDAY")){
        System.out.println();
       }       
      
      }
    }
}