 import java.util.Scanner;
 public class WaterBill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the water consumption in liters:");
        int consumption= sc.nextInt();
        int bill;
        if(consumption>=500){
            bill=350;
        }else{
          bill=100; 
        }
       System.out.println(" water bill:Rs."+bill);
       sc.close();
    }

}
