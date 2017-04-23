public class BeerSong {
  public static void main (String[] args) {
    int beerNum = 99;
    String word = "bottles";
    String phrase = " of beer on the wall";

    while (beerNum > 0) {

      if (beerNum == 1) {
        word = "bottle";
      }

      System.out.println(beerNum + " " + word + phrase);
      System.out.println(beerNum + " " + word + " of beeeeeeer!");
      System.out.println("Take one down, pass it around");
      beerNum = beerNum - 1;

      if (beerNum > 0) {

        if (beerNum == 1) {
          word = "bottle";
        }

        System.out.println(beerNum + " " + word + phrase);
        System.out.println("--------------------------------------");
      } else {
        System.out.println("No more bottles of beer on the wall");
        System.out.println("###################################### BB");
      }

    }
  }
}
