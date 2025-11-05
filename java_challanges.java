import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;
//1. Bonjour Toi
/*public class Name{
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter username");
        String userName = input.nextLine();
        System.out.println("Username is: " + userName);

    }
}*/
//2. Compte à Rebours

/*public class compt_rebours {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter NUM");
        int num = Integer.parseInt(input.nextLine());
        for(int a = num-1 ; a > 0 ; a--){
            System.out.println(a);
        }
    }
}*/

//3. Jeu du Nombre Mystère
/*
public class jeu_du_nomber{
    public static void main(String[] args){
        int number = 0;
        double rand = (int)(Math.random()*10)+1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the guessed number (1-10):");
            while( number != rand ){
                number = input.nextInt();
                input = new Scanner(System.in);
                if(number < rand){
                    System.out.println(number + " is less than or equal to " );
                } else if (number > rand) {
                    System.out.println(number + " is greater than or equal to " );
                }else{
                System.out.println(" great you found it !!!");
                    input.close();
            }
        }

    }
    }*/
//4. Mini Distributeur (ATM)
/*public class ATM {

    static float balance = 0;
    static float deposit = 0;
    static float withdraw = 0;

    static void deposit_money() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount to be deposit:");
        float depositAmount = input.nextFloat();
        balance = deposit + depositAmount;
        System.out.println(balance);
        System.out.println("Deposit successful. Current balance: " + balance);
    }

    static void withdraw(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount to be withdrawn:");
        float withdrawAmount = input.nextFloat();
        if (withdraw <= balance) {
            balance = balance - withdrawAmount;
            System.out.println("successfully withdrawon. Current balance: " + balance);
        } else {
            System.out.println("no money in the account");
        }
    }

    static void affichage() {
        System.out.println(balance);
    }

    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int choice = 0;

    do {
        System.out.println("\n---- ATM Menu ----");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Quit");
        System.out.print("Enter your choice: ");

        choice = input.nextInt();

        switch(choice){
            case 1:affichage();
            break;
            case 2:deposit_money();
            break;
            case 3:withdraw();
            break;
            case 0:System.out.println("Thank you! Goodbye.");
            break;
            default:System.out.println("Invalid choice.");

        }}while (choice != 0);
    }
    }*/

//Trouver le deuxième plus grand élément d’un tableau.

/*    public class second_grand_element {
        public static void main(String[] args) {
            int[] tab = new int[5];
            int max= Integer.MIN_VALUE;
            int second_max= 0 ;
            Scanner input = new Scanner(System.in);
            for(int i=0;i<tab.length;i++){
                System.out.print("Enter numbers : ");
                tab[i]=input.nextInt();
            }
            for(int i = 1 ; i < tab.length;i++) {
                if ( tab[i] > max ) {
                    second_max = max;
                    max=tab[i];
                }else if (tab[i] > second_max && tab[i]<max ) {
                    second_max=tab[i];
                }
            }
            System.out.print(second_max);
        }}*/

/*public class  Rotation_Tableau {
    public static void main(String[] args) {
        int [] tableau = {1,2,3,4,5};
        int temp=tableau[tableau.length-1];
        for(int i=tableau.length-2;i>=0;i--){
            tableau[i+1]=tableau[i];
        }
        tableau[0]=temp;
        System.out.println(Arrays.toString(tableau));

    }
}*/

public class Compter_Occurrences{
    public static void main(String[] args){
        int []tab ={1,2,2,3,5,2,3,5,1};
        int []unique_values =new int[tab.length];
        int []counts =new int[tab.length];

        for(int i=0;i<tab.length;i++){
            boolean exist=false;
            for(int j=0;j<unique_values.length;j++){
                if(tab[i]== unique_values[j]){
                    counts[j]++;
                    exist=true;
                    break;
                }else {
                    counts[j]=1;
                }
            }

        }

System.out.println(Arrays.toString(unique_values));


    }
}



