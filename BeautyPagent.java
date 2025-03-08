import java.util.Scanner;
public class BeautyPagent{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int contestants=5,judges=3;
        double totalsum=0;

        for(int i=1;i<=contestants;i++){
        double sum=0;
        System.out.println("Enter Score contestants " +i+":");
            for(int j=1;j<=judges;j++){
                    
                    System.out.println("Judge"+j+": ");
                    sum+=scan.nextDouble();
            }
            System.out.println("Total Score For contestants "+i+"is: "+ sum);
            totalsum+=sum;
        }
        double Avg=totalsum/contestants;
        System.out.println("Total Score Avg is: "+Avg);
    }
}