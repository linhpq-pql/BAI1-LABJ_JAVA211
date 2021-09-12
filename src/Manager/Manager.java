package Manager;
import Entity.Food;
import java.util.ArrayList;
import java.util.List;

public class Manager {
    public static int Menu(){
        System.out.println("Welcome to Food Management - @ 2021 by <SE150083 - Pham Quang Linh \n>");
        System.out.println("Select the option below \n");
        System.out.println("1. Add a new food\n");
        System.out.println("2. Search the food by name\n");
        System.out.println("3. Remove the food by ID\n");
        System.out.println("4. Print the food list in the descending order of expired date\n");
        System.out.println("5. Quit\n");
        System.out.println("Enter your choice");
        int choice = Validate.checkInputIntLimit(1,5);
        return choice;
    }

    //Allow user add a food
    public static void addFood(ArrayList<Food> ld){
        System.out.println("Enter the ID of Food \n");
        String ID = Validate.checkInputString();
        //Check code Exist or not
        if(!Validate.checkCodeExist(ld,ID)){
            System.err.println("Code exists \n");
            return;
        }
        if (!Validate.checkDuplicate(ld, ID)) {
            System.err.println("Duplicate.");
            return;
        }
        System.out.println("Enter the name of Food\n");
        String name = Validate.checkInputString();

        System.out.println("Enter the weight of food ( integer type )\n");
        int weight = Validate.checkInputInt();

        System.out.println("Enter the type of the food \n");
        String type = Validate.checkInputString();

        System.out.println("Enter the place where put the food \n");
        String place = Validate.checkInputString();

        System.out.println("Enter the expired date \n");
        String expiredDate = Validate.checkInputString();

        ld.add(new Food(ID, name, weight, type, place ,expiredDate));
        System.err.println("Add successful.");
    }
    //allow user search doctor
    public static void searchFood(ArrayList<Food> ld) {
        System.out.print("Enter name: ");
        String nameSearch = Validate.checkInputString();
        ArrayList<Food> listFoundByName = listFoundByName(ld, nameSearch);
        if (listFoundByName.isEmpty()) {
            System.err.println("List empty.");
        } else {
            System.out.printf("%-10s%-15s%-15s%-25s%-20s%-30s\n", "ID", "Name",
                    "Weight", "Type" , "Place" , "ExpiredDate");
            for (Food food : listFoundByName) {
                System.out.printf("%-10s%-15s%-15d%-25s%-20s%-30s\n", food.getID(),
                        food.getName(), food.getWeight(),
                        food.getType(), food.getPlace() , food.getExpireDate());
            }
        }
    }
    //get list found by name
    public static ArrayList<Food> listFoundByName(ArrayList<Food> ld, String name) {
        ArrayList<Food> listFoundByName = new ArrayList<>();
        for (Food food : ld) {
            if (food.getName().contains(name)) {
                listFoundByName.add(food);
            }
        }
        return listFoundByName;
    }

    //allow user delete doctor
    public static void deleteFood(ArrayList<Food> ld) {
        System.out.print("Enter ID: ");
        String ID = Validate.checkInputString();
        Food food = getFoodByID(ld, ID);
        if (food == null) {
            System.err.println("Not found doctor.");
            return;
        } else {
            ld.remove(food);
        }
        System.err.println("Delete successful.");
    }

    //get docter by code
    public static Food getFoodByID(ArrayList<Food> ld, String ID) {
        for (Food doctor : ld) {
            if (doctor.getID().equalsIgnoreCase(ID)) {
                return doctor;
            }
        }
        return null;
    }

    public static void printFood(ArrayList<Food> ld){
        if (ld.isEmpty()) {
            System.err.println("List empty.");
        } else {
            System.out.printf("%-10s%-15s%-15s%-25s%-20s%-30s\n", "ID", "Name",
                    "Weight", "Type" , "Place" , "ExpiredDate");
            for (Food food : ld) {
                System.out.printf("%-10s%-15s%-15s%-25s%-20s%-30s\n", food.getID(),
                        food.getName(), food.getWeight(),
                        food.getType(), food.getPlace() , food.getExpireDate());
            }
        }
    }

}






