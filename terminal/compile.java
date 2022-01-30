import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class compile {

public static void main(String[] args) {
  System.out.println("Welcome to the compile, run ether create or append");

  Scanner myCom = new Scanner(System.in);
  String command = myCom.nextLine();
  switch(command){
    case "create":
    Scanner myObj1 = new Scanner(System.in);
    String filename1 = myObj1.nextLine();
    try {
      File myObj = new File(""+ filename1);
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists. Try running the append command.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    break;
    case "append":
      try {
      Scanner myObj2 = new Scanner(System.in);
      String filename = myObj2.nextLine();
      FileWriter myWriter = new FileWriter("" + filename);
      Scanner myCod = new Scanner(System.in);
      String code = myCod.nextLine();
      myWriter.write("" + code);
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    break;
  }



}
  }
