import java.util.Scanner;
public class terminal{
  public static void main(String[] args){
    System.out.println("Welcome to the terminal");

    terminal.newLine();
  }

  public static void newLine(){
  Scanner myObj = new Scanner(System.in);

  String command = myObj.nextLine();

  switch(command){
    case "rd":
      System.out.println("Chose the file to baserun");
      terminal.
      terminal.newLine();
    break;
    case "writeFile":
      System.out.println("Use the file write class");
    case "exit":
      System.out.println("Ending session, run the class file again to use the terminal again");
    break;
    default:
    System.out.println("COMMAND NOT FOUND");
    terminal.newLine();
  }
}
}
