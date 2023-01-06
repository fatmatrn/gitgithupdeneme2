import java.util.Scanner;
class Main {
  public static void main(String[] args) {

String isim = "John";
String soyisim = "White";
String kartNo = "1234234534561478";
int isimBoyut = isim.length();
int soyIsimBoyut = soyisim.length();

System.out.println(isim.substring(0, 1).toUpperCase() + isim.substring(1, isimBoyut).replaceAll("[A-Za-z]", "*") + " ");
System.out.println(soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1, soyIsimBoyut).replaceAll("[A-Za-z]", "*") + " ");
System.out.println(kartNo.substring(0, 4) + " " + kartNo.substring(4, 8) + " " + kartNo.substring(8, 12) + " " + kartNo.substring(12));
    }

  }
  
}