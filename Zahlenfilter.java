class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!!");
  
  for (int i = 1; i < 200; i++){
    if (i % 5 == 0){
      System.out.println( i + " ist durch 5 teilbar!");
    }

    if (i % 10 == 9){
      System.out.println( i + " endet auf 9!");
    }

    int vorg = i-1;
    int erg = i + vorg;

    if (erg % 3 == 0){
      System.out.println(i + " und "+vorg+" addiert ergeben "+erg+" und "+erg+" ist durch 3 teilbar");
    }
  }
  
  }
}