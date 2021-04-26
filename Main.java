import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

class Main {

  static ArrayList<Person> people;
  static String filename;
  static FileReader myFile;

  public static void main(String[] args) {
    
    persons = new ArrayList <People>();
    filename = "people.txt";
    String name = "", age = "", color = "";

try {
  myFile = new FileReader(filename);
  BufferedReader reader = new BufferedReader
  (myFile);

  while (reader.ready)) {
    name = reader.readLine();
    age = reader.readLine();
    color = reader.readLine();
    System.out.println(name + "\t" + age + "\t" + color);
    
  }
  reader.close();
} catch (IOException exception) {
  System.out.println("An error occured: " + exception);
}


  }
}