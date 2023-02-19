import javax.imageio.IIOException;
import java.io.*;
import java.io.FileWriter;
import java.util.Scanner;

public class FileOperation {
    public static void main(String args[]){
        try{
            File fin1 = new File("file1.txt");
            File fin2 = new File("file2.txt");
            Scanner f1sc = new Scanner(fin1);
            Scanner f2sc = new Scanner(fin2);

            StringBuilder sb = new StringBuilder();
            while (f1sc.hasNextLine() && f2sc.hasNextLine()){
                sb.append(f1sc.nextLine());
                sb.append("\n");
                sb.append(f2sc.nextLine());
                sb.append("\n");
            }
            while (f1sc.hasNextLine()){
                sb.append(f1sc.nextLine());
                sb.append("\n");
            }
            while (f2sc.hasNextLine()){
                sb.append(f2sc.nextLine());
                sb.append("\n");
            }
            try{
                FileWriter writer = new FileWriter("Fileoutput.txt");
                writer.write(sb.toString());
                writer.flush();
                System.out.println("File Adding Completed");
            }
            catch (IOException e){
                e.printStackTrace();
            }


        }catch(Exception e){System.out.println(e);}
    }
}
