package wk8;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Week8 {

    public static void main(String[] args) {

        example9();
    }

    static void example1(){

        //Path cwd = Path.of("");
        //Path wk8File = Path.of("src/wk8/Week8.java"); //path points to Week8.java file
        Path wk8File = Path.of("src" ,"wk8", "Week8.java");
        //Path fooFile = Path.of("src", "wk8", "foo", "bar.txt");
        File f1 = wk8File.toFile();
        System.out.println(f1.exists());
        System.out.println(f1.getAbsolutePath());
        System.out.println("Is this a file? " + f1.isFile());
        System.out.println("Is this a dir? " + f1.isDirectory());

    }
    static void example2(){
        //creating a new directory
    Path p1 = Path.of("src" ,"wk8", "testDir1", "testDir1Dir1");
    try {
        Files.createDirectory(p1);
    }
    catch (IOException e){
        System.err.println(e.getMessage());
    }

    }
    static void example3(){

        Path p1 = Path.of("src" ,"wk8", "testDir2", "td2");
        try {
            Files.createDirectories(p1);
        }
        catch (IOException e){
            System.err.println(e.getMessage());
        }


    }
    static void example4(){

        Path src = Path.of("src" ,"wk8", "testDir1", "testDir1Dir1");
        Path dst = Path.of("src", "wk8", "testDir3");
        try {
            Files.copy(src, dst);
        }
        catch (Exception e){
            System.err.println(e);
        }

    }
    static void example5(){
        Path allFilesAndFoldersOfWk8 = Path.of("src", "wk8");

        String[] valuesAsString = allFilesAndFoldersOfWk8.toFile().list();
        File[] valuesAsFile = allFilesAndFoldersOfWk8.toFile().listFiles();

        for(File file : valuesAsFile){
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getName());
        }

    }
    static void example6(){

        Path p = Path.of("src", "wk8", "first.txt");
        try {
            Files.writeString(p, "Hello World!\n",
                    StandardOpenOption.APPEND
                    );
        }
        catch (Exception e){
            System.err.println(e);
        }


    }
    static void example7(){

        Path p = Path.of("src", "wk8", "second.txt");
        try {
            String content = "Why won't you write\n";
            if(!Files.exists(p))
                Files.createFile(p);
            Files.writeString(p, content,
                    StandardOpenOption.APPEND
            );
        }
        catch (Exception e){
            System.err.println(e);
        }


    }
    static void example8(){

        Path p = Path.of("src", "wk8", "first.txt");
        try{
            String content = Files.readString(p);
            System.out.println(content);
        }
        catch (Exception e){
            System.err.println(e);
        }

    }
    static void example9(){

        Path p = Path.of("src", "wk8", "first.txt");
        try{
            List<String> allLines = Files.readAllLines(p);
            for(String line : allLines){
                System.out.println(line);
            }

       }
        catch (Exception e){
            System.err.println(e);
        }


    }
    static void example10(){}
}
