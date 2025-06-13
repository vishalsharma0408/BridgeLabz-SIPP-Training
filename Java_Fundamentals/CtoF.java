import java.util.Scanner;
class CtoF{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int celcius=sc.nextInt();
	int Fahrenheit=(celcius * 9/5) + 32;
	System.out.println("Converted Temp:" + Fahrenheit);
	}
}