package wk8;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.util.Scanner;
import java.nio.file.Path;
public class StudentDirectoryListing {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a school name");
        String schoolName = sc.nextLine();
        Path p = Path.of("src", "wk8", "sdl", schoolName);
        try{
            Files.createDirectory(p);
        }
        catch (FileAlreadyExistsException e){
            System.out.println("Hey, I attend " + schoolName + " too!");
        }
        catch (IOException e){
            System.err.println(e);
        }



        try{
            System.out.println("Enter a school year of study");
            int year = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter a school semester of study");
            String semester = sc.nextLine();

            p = p.resolve(String.valueOf(year)).resolve(semester);
            //src/sdl/Georgian College/2024/fall
            Files.createDirectories(p);


            System.out.println("Enter a course code");
            String courseCode = sc.nextLine();
            p = p.resolve(courseCode);
            Files.createDirectory(p);

            while(true){
                System.out.printf("Enter an evaluation for %s. Type nothing to escape\n",
                        courseCode);
                String evaluation = sc.nextLine();
                if (evaluation.trim().isEmpty())
                    break;
                Files.createFile(p.resolve(evaluation + ".txt"));
            }

            System.out.println("You will be entering grades for your evaluations");
            String[] evaluations = p.toFile().list();


            for(String evaluation : evaluations){

                System.out.printf("Enter grade for %s: ", evaluation);
                int grade = Integer.parseInt(sc.nextLine());
                Files.writeString(p.resolve(evaluation), String.valueOf(grade));

            }


        }
        catch (Exception e){
            System.err.println(e);
        }




    }
}
