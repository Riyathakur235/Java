
    import java.io.File;
import java.io.FileNotFoundException;
//import java.io.FileWriter;
//import java.io.IOException;
import java.util.Scanner;

//public class Filecreat {
//    public static void main(String[] args) {
//       try {
//           File file = new File("new.txt");
//           if (file.createNewFile()) {
//               System.out.println("File created " + file.getName());
//           } else {
//               System.out.println("File already exists");
//           }
//       }catch(IOException e){
//               System.out.println("An error occured");
//               e.printStackTrace();
//           }
//       }
//    }

//class WriteToFile{
//class Filecreat{
//    public static void main(String[] args) {
//        try{
//            FileWriter writer =new FileWriter("new.txt");
//            writer.write("Hello this is a test message written ");
//            writer.close();
//            System.out.println("Sucessfully wrote  to the file.");
//        }catch(IOException e){
//            System.out.println("An error occurred .");
//            e.printStackTrace();
//        }
//    }
//}
 //public class ReadFromFile{
public class Filecreat {

    public static void main(String[] args) {
         try{
             File file =new File("new.txt");
             Scanner scanner=new Scanner(file);
             while (scanner.hasNextLine()){
                 String data=scanner.nextLine();
                 System.out.println(data);
             }
             scanner.close();
        }catch (FileNotFoundException e){
             System.out.println("An error occurred");
             e.printStackTrace();
         }
     }
 }


// public class Deletefile{
//public class Filecreat{
//     public static void main(String[] args) {
//         File file = new File("new .text");
//         if (file.delete()){
//             System.out.println("Deleted the file:"+file);
//         }else {
//             System.out.println("Failed to delete the file");
//         }
//     }
// }


