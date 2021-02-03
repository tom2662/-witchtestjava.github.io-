import java.util.Scanner;

public class Basic {

    public static void main(String[] args){
       




        Witchcraft harry = new Witchcraft();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Year of Death person A :");    
        harry.Yoda = scanner.nextInt();

        System.out.println("Enter Age of Death person A :");    
        harry.Aoda =  scanner.nextInt();

        System.out.println("Enter Year of Death person B :");  
        harry.Yodb =  scanner.nextInt();

        System.out.println("Enter Age of Death person B :");  
        harry.Aodb =  scanner.nextInt();

        float result = harry.avgKill();

        System.out.println("Average Kill:"+result);


    }




}