import java.util.Scanner;
public class EuropeanTownships {
       public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double total_hall_walls=0;
        double total_bedroom_walls=0;
        double total_walls=0;
        double total_hours=0;
        double total_accent_color=0;
        double total_regular_color=0;
        int Township=sc.nextInt();
        for(int i=1;i<=Township;i++){
         int houses=sc.nextInt();
         int hou[]=new int[houses];
         double sum=0;
         for(int j=1;j<=hou.length;j++){
            double Totalbedroom=sc.nextDouble();
            double roofBedRoom=sc.nextDouble();
            double Standard=sc.nextDouble();
            double halls=sc.nextDouble();
            total_hall_walls=halls*6;
            total_bedroom_walls=Standard*4+roofBedRoom*3;
            total_walls=total_hall_walls+total_bedroom_walls;
            sum+=total_walls;          
            double accent_walls=sum/3.0;
            double regular_walls=sum-accent_walls;
            total_hours=accent_walls*2.5+regular_walls*3.25;
            total_accent_color=accent_walls*1.5;
            total_regular_color=regular_walls*2.25;           
         }
         System.out.printf("Case #%d: %.2f, %.2f, %.2f\n",i,total_hours,total_accent_color,total_regular_color);
        }     
            
       }
}