import java.util.Random;
import java.util.Scanner;
class Depo{


    public static String generateOTP(){
        int randomNo=(int)(Math.random()*9000)+1000;
        String OTP = String.valueOf(randomNo);
        return OTP;
    }
   public static void main(String[] args) throws InterruptedException {

    System.out.println("\n****  Welcome to BOOK MY BUS   ****");
    System.out.println();
    System.out.println("we have two types of buses");
    System.out.println("\n 1.  Green Bus\t  2. Red Bus");
    System.out.println();
    
    Scanner a=new Scanner(System.in);
    int ch1 ;
    System.out.println(" press 1 for Green Bus \t press 2 for red bus");
    ch1=a.nextInt();
    if (ch1==1) {
        Driver driver1 = new Driver();
        driver1.assignVehicle(new GreenBus());
        Thread.sleep(1000);
       
        Scanner c = new Scanner(System.in);
        System.out.println("\nPress 3 for booking");
        ch1=c.nextInt();

        if(ch1==3){
            Long m;
            String s;
            Scanner b =new Scanner(System.in);

            Scanner d =new Scanner(System.in);

            System.out.println("\nYour booking process start : ");
            Thread.sleep(1000);
            System.out.print("\nEnter your name : ");
            s=d.next();
            System.out.print("\nEnter your Phone number for verification :  " );
            m=b.nextLong();
            Thread.sleep(1000);
            System.out.println("\nOTP generating");
            Thread.sleep(2000);
            System.out.print("\nYour ");
            String otpStr=generateOTP();
            System.out.println("OTP :  "+otpStr);

            Thread.sleep(4000);

            int randomNo=(int)(Math.random()*65)+1;
            String no = String.valueOf(randomNo);
            System.out.println("\nMr "+s+" Your Seat Number : "+ randomNo);
            System.out.println("\n Booking Completed");
            Thread.sleep(2000);

            System.out.println("\n Thank for booking");

        }else{
            System.out.println("wrong choice");
        }
        
    } else {
        if (ch1==2) {
            System.out.println();
        Driver driver2 = new Driver();
        driver2.assignVehicle(new RedBus());    
        Thread.sleep(1000);

        Scanner c = new Scanner(System.in);
        System.out.println("\nPress 3 for booking");
        ch1=c.nextInt();

        if(ch1==3){
            Long m;
            String s;
            Scanner b =new Scanner(System.in);

            Scanner d =new Scanner(System.in);

            System.out.println("\nYour booking process start : ");
            Thread.sleep(1000);
            System.out.println("\nEnter your name : ");
            s=d.next();

            System.out.println("\nEnter your Phone number for verification:" );
            m=b.nextLong();
            Thread.sleep(1000);
            System.out.println("\nOTP grnerating");
            Thread.sleep(2000);
            System.out.print("\nyour ");
            String otpStr=generateOTP();
            System.out.println("OTP :  "+otpStr);

            Thread.sleep(4000);

            int randomNo=(int)(Math.random()*50)+1;
            String no = String.valueOf(randomNo);
            System.out.println("\nMr "+s+" , Your Seat Number : "+ randomNo);
            System.out.println("\n Booking Completed");
            Thread.sleep(2000);

            System.out.println("\n Thank for booking");

        }else{
            System.out.println("wrong choice");
        }
    
        } else {
            System.out.println("wrong choice");
        }
      
      }
   }
}

