// 💡 Things You Can Build Step-by-Step

// Add Student — ask name, roll, course, marks → save them.

// Remove Student — delete by roll number.

// Display All Students — print from ArrayList.

// Display All Courses — print from HashSet.

// Search Student — enter roll number → show marks (from HashMap).

// Count Students — show how many students added.

import java.util.*;
import java.util.Scanner;
import java.io.*;
public class studentmanage{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        ArrayList<String>  students = new ArrayList<>();
        ArrayList<String>  rolls = new ArrayList<>();
        ArrayList<String>  courses = new ArrayList<>();
        try{
        System.out.println("what do you want ");
        System.out.println("add" );
        System.out.println("delete");
        System.out.println("unique courses (un)");


        String choice = s.nextLine();
        FileWriter f = new FileWriter("students.txt",true);
        // __________ add students code________________
     if(choice.equalsIgnoreCase("add")){
        while(true){
        System.out.println("enter student name");
        String name = s.nextLine();

        System.out.println("enter student roll no");
        String roll = s.nextLine();

        System.out.println("enter student course");
        String course = s.nextLine();

      
        students.add(name);
        rolls.add(roll);
        courses.add(course);
        f.write("Name: " + name + ", Roll: " + roll + ", Course: " + course + "\n");
         System.out.println("continue or exit press bye");
        String bye = s.nextLine();
            if(bye.equalsIgnoreCase("bye")){
                System.out.println("bye");
                break;
            }
        }
        f.close();
     }
        // __________delete students_______________
     else if(choice.equalsIgnoreCase("delete")){
        // read file
        File file = new File("students.txt");
        Scanner reader = new Scanner(file);
        while(reader.hasNextLine()){
            String line = reader.nextLine();
              String[] parts = line.split(", ");
                    if (parts.length == 3) {
                        String name = parts[0].split(": ")[1];
                        String roll = parts[1].split(": ")[1];
                        String course = parts[2].split(": ")[1];

                        students.add(name);
                        rolls.add(roll);
                        courses.add(course);
                    }
        }
        reader.close();
         System.out.println("enter the roll number");
         String rollno = s.nextLine();
        if(rolls.contains(rollno)){
            int index= rolls.indexOf(rollno);
            students.remove(index);
            rolls.remove(index);
            courses.remove(index);
            System.out.println("student deleted successfully");

            // rewrite the file
            FileWriter f2 = new FileWriter("students.txt", false);
            for(int i=0;i<students.size();i++){
                 f2.write("Name: " + students.get(i) + ", Roll: " + rolls.get(i) + ", Course: " + courses.get(i) + "\n");
            }
        }
        else{
            System.out.println("student not found");
        }
        }else if(choice.equalsIgnoreCase("un")){
            // read file
        File file = new File("students.txt");
        Scanner reader = new Scanner(file);
        while(reader.hasNextLine()){
            String line = reader.nextLine().trim();
            if(line.isEmpty()) continue;
              String[] parts = line.split(", ");
                    if (parts.length == 3 && parts[2].contains(": ")) {
                      
                        String course = parts[2].split(": ")[1].trim();
                        courses.add(course);
                    }
        }
        reader.close();
        
        HashSet<String> uniquecourses = new HashSet<>(courses);
        System.out.println("unique courses in file :-");
        if(uniquecourses.isEmpty()){
            System.out.println("no courses found");
        }else{
        for(String c:uniquecourses){
            System.out.println(c);
        }
        }
        }
        else{
            System.out.println("invalid user");
        }
     
        

    // get the arraylist
    System.out.println("show student list");
    for (int i=0;i< students.size();i++){
         System.out.println("Name: " + students.get(i));
            System.out.println("Roll: " + rolls.get(i));
            System.out.println("Course: " + courses.get(i));
            System.out.println("----------------------");
    }
    System.out.println("total students" + students.size());
    }
        catch (IOException e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
        
    s.close();
    }
}