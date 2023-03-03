import java.util.Scanner;

public class Condo2 {
    public static void main(String [] args) {


        Scanner Input = new Scanner(System.in)  ;
        System.out.println("---------------------------- Setup Condo ----------------------------");
        System.out.print("Please enter the number of floors: ");
        int numFloors = Input.nextInt();
        System.out.print("Please enter the number of Room: ");
        int numRoom = Input.nextInt();

        System.out.println(numFloors);
        System.out.println(numRoom);
        String[][] name = new String[numFloors][numRoom];

        for(int i =0; i<numFloors; i++){
            for(int j=0; j<numRoom; j++){
                System.out.print(name[i][j]+ " ");
            }
            System.out.println();
        }

        //buy
        System.out.println("---------------------------- Buy Condo ----------------------------");
        System.out.print("Please enter the number of floors: ");
        int chooseFloor = Input.nextInt()-1;

        System.out.print("Please enter the number of Room: ");
        int chooseRoom = Input.nextInt()-1;

        Input.nextLine();
        System.out.print("Enter Owner: ");
        String Name=Input.nextLine();

        for(int i =0; i<numFloors; i++){
            for(int j=0; j<numRoom; j++){
               name[chooseFloor][chooseRoom]=Name;
            }
            System.out.println();
        }

        //display
        for(int i =0; i<numFloors; i++){
            for(int j=0; j<numRoom; j++){
                System.out.print(name[i][j]+ " ");
            }
            System.out.println();
        }

        //sell
        System.out.println("---------------------------- Sell Condo ----------------------------");
        System.out.print("Please enter the number of floors: ");
        int sellFloor = Input.nextInt()-1;

        System.out.print("Please enter the number of Room: ");
        int sellRoom = Input.nextInt()-1;

        for(int i =0; i<sellFloor; i++){
            for(int j=0; j<sellRoom; j++){
                name[sellFloor][sellRoom]=null;

            }
            System.out.println();
        }
        //display
        for(int i =0; i<numFloors; i++){
            for(int j=0; j<numRoom; j++){
                System.out.print(name[i][j]+ " ");
            }
            System.out.println();
        }



        //search
        System.out.println("---------------------------- Search Condo ----------------------------");
        System.out.print("Please enter the number of floors: ");
        int searchFloor = Input.nextInt()-1;

        System.out.print("Please enter the number of Room: ");
        int searchRoom = Input.nextInt()-1;

        System.out.println(name[searchFloor][searchRoom]);


        //search name
        System.out.println("---------------------------- Search Condo by Name ----------------------------");
        Input.nextLine();
        System.out.println("Enter Name for Search: ");
        String NameEnter = Input.nextLine();

        for(int i =0; i<searchFloor; i++){
            for(int j=0; j<searchRoom; j++){
               if(!(name[i][j]==null)){
                   if(name[i][j].equals(NameEnter)){
                       System.out.println(name[i][j]);
                   }
               }else {
                   System.out.println("Name not Found..!");
               }
            }
            System.out.println();
        }
    }
}
