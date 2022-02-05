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
    case "su":
      sudoTerm.commands();
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

public class sudoTerm extends terminal {

  public static void commands(){
    Scanner mySC = new Scanner(System.in);
    Striing sudocomand = mySC.nextLine();
    switch(sudocomand){
      case "SetPass":
      System.out.println("what is your password")
      break;
    }
  }
}
