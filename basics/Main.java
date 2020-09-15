import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(final String[] args) {

    final int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    final int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    final int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    // below, the (int) is casting the result of Math.random (per Bade's suggestion)
    // to turn the double returned by Math.random into an Int

    final int p = (int) (Math.random() * 10);
    flipNHeads(p);
    clock();
  }

  public static String pluralize(final String word, final int num) {
    if (num > 1 || num == 0) {
      return word + "s";
    }
    return word;
  }

  public static void flipNHeads(final int n) {
    Double flippy = Math.random();

    int flippyCount = 0;
    int headsInARow = 0;
    int highestHeads = 0;

    while (flippyCount < n) {
      if (flippy >= .5) {
        System.out.println("heads");
        headsInARow++;
        if (highestHeads < headsInARow) {
          highestHeads = headsInARow;
        }
      } else if (flippy <= .5) {
        System.out.println("tails");
        headsInARow = 0;
      }
      flippyCount++;
      flippy = Math.random();
    }
    System.out.println("It took " + flippyCount + " flips to flip " + highestHeads + " heads in a row.");
  }
//Krys, Chandler, and Matt helped find the solution and walk me through how the clock function works. A lot of the formatting for the dateTime came from https://www.javatpoint.com/java-localdatetime
  public static void clock() {
    
    String test = " ";

    while(true){
      LocalDateTime now = LocalDateTime.now();
      DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss");
      String formatDateTime = now.format(format);

      if(!test.equals(formatDateTime)){
        System.out.println(formatDateTime);
      }
      test = formatDateTime;
    }
  }
}

