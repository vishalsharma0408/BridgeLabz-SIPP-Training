import java.util.Scanner;
class Areaofcylinder{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int r=sc.nextInt();
	float height=sc.nextFloat();
	double pie=3.14;
	double Volume = pie * (r^2)* height;
	System.out.println(Volume);
	}
}