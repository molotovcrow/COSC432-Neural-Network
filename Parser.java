import java.util.*;
import java.io.*;
//author: Michael Leonard

public class Parser {  
  //The array list which holds the collection of parsed words
  private ArrayList <String> words;
   
  /* Constructor method which accepts a file name as a parameter 
  and creates a string array list of the words in the file */
  public Parser(String fileName) throws FileNotFoundException {
    words = new ArrayList<String>();
    File file = new File(fileName);
    Scanner reader = new Scanner(file); 
    while(reader.hasNextLine()) {
      String line = reader.nextLine();
      String sentence = line.substring((line.indexOf("sentence\":\"")+11),line.length()-4);
      Scanner tokenizer = new Scanner(sentence);
      while(tokenizer.hasNext()) 
        words.add(tokenizer.next());        
    }
  } 
  
  //Getter method to return the array list of words
  public ArrayList <String> getWords() {
   return words; 
  }  
}
