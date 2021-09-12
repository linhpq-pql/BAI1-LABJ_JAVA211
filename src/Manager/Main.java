package Manager;

import Entity.Food;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public  static void main(String[] args){
         Scanner keyboard = new Scanner(System.in);
         char Answer;
         boolean Answer1;
        ArrayList<Food>ld = new ArrayList<>();
        //Loop until user want to exit
        while(true){
            int choice = Manager.Menu();
            switch (choice){
                case 1:
                    do {
                        Manager.addFood(ld);
                        System.out.print("Continue? Y/N\n");

                        Answer = keyboard.next().charAt(0);
                    }
                    while ( Answer == 'Y' || Answer == 'y' );
                    break;
                case 2:
                    Manager.searchFood(ld);
                    break;
                case 3:
                        System.out.println("Are you make sure want to delete data\n");
                        Answer1 = Validate.checkInputYN();
                        if (Answer1 == true){
                        Manager.deleteFood(ld);
                        break;}
                        else {
                            break;}
                case 4:
                    Manager.printFood(ld);
                    break;
                case 5:
                    return;
            }
        }
    }
}
