import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Podaj liczby różne od 5: ");
    Scanner scan = new Scanner(System.in);
    int liczba=scan.nextInt();
    int suma=0;
    while(liczba!=5)
      {
        if(liczba%2!=0)
        {
          suma=suma+liczba;
        }
        liczba=scan.nextInt();
      }
    System.out.println("Suma liczb nieparzystych wynosi: "+suma);
  }
}