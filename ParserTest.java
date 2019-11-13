import java.util.*;
import java.io.*;
//author: Michael Leonard

public class ParserTest {
  /* Method to demonstrate parser. Notice that FileNotFoundException must
  be thrown in order to use a parser object. And that a ListIterator
  object can be used to traverse the parser object */
  public static void main(String[] args) throws FileNotFoundException{
    Parser p = new Parser("test.txt");
    ListIterator<String> itr = p.getWords().listIterator();
    while(itr.hasNext())
      System.out.println(itr.next());
  }
}
