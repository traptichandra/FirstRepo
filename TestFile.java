package FirstPackage;
import java.io.*;
import java.util.Scanner;

public class TestFile {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String fileName;
        System.out.println("Enter the file name");
        fileName = scn.next();
        File fileObj;
        fileObj = new File("C:\\Java\\src\\Examples",fileName);
        if (fileObj.exists()) {
            System.out.println("File exists with the name " + fileObj.getName());
            System.out.println("the length of the file is " + fileObj.length() + " bytes long");
            if (fileObj.canRead())
                System.out.println("readable");
            if (fileObj.canWrite())
                System.out.println("write operation can be performed on the file");
        }
        else
            System.out.println("File does not exist");

    }
}
