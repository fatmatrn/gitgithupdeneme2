import java.util.Scanner;
class Main {
  public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Vucut kitle indexini  gir");
        double bmi = input.nextDouble();

        if (bmi<0){
            System.out.println("gecersiz bmi degeri girdiniz");
        } else if (bmi<18.5) {
            System.out.println("weak");
        } else if (bmi>18.5&&bmi<24.9) {
            System.out.println("your weight is ideal");
        } else if (bmi>25&&bmi<29.9) {
            System.out.println("fat");
        } else if (bmi>30) {
            System.out.println("obese");
        }


  }
}