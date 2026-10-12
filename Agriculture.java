import java.util.Scanner;
class Farm{
    void showFarm(){
System.out.println("Agriculture farm");
    }
}

class CropFarm extends Farm{
    void showCropFarm(){
        System.out.println("Crop farm:Rice farm");
        System.out.println("Crop:Rice");
    }
}

class VegetableFarm extends Farm{
    void showVegetableFarm(){
        System.out.println("Vegetable farm");
        System.out.println("Crop:Tomato");
    }
}

class TomatoFarm extends VegetableFarm{
    void showTomatoFarm(){
    System.out.println("Tomato farm");
    System.out.println("Method:Organic farming");
    }
}

class DairyFarm extends Farm{
    void showDairyFarm(){
    System.out.println("Dairy farm");
    System.out.println("Animal : Cow");
    }
}

interface Farmer{
    void Farming();
}

interface Irrigation{
    void irrigation();
}

class SmartFarm implements Farmer, Irrigation{
    public void Farming(){
        System.out.println("Farmer: Grows crops using modern methods.");
    }
    public void irrigation(){
        System.out.println("Irrigation: Uses drip irrigation");
    }
}

class OrganicFarm extends Farm implements Farmer{
    public void Farming(){
        System.out.println("Farmer:Uses organic farming methods");
    }
    void organicMethod(){
        System.out.println("Method:Uses natural manure and fertilizers");
    }
}

public class Agriculture{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int choice;

        do{
            System.out.println("-----AGRICULTURE INHERITANCE-----");
            System.out.println("1. Single Inheritance");
            System.out.println("2. Multilevel Inheritance");
            System.out.println("3. Hierarchical Inheritance");
            System.out.println("4. Multiple Inheritance");
            System.out.println("5. Hybrid Inheritance");
            System.out.println("6. Exit");

            System.out.println("Enter your choice: ");
            choice=scanner.nextInt();
  
            switch(choice){
                case 1:
                    System.out.println("-----SINGLE INHERITANCE-----");
                    CropFarm cropfarm=new CropFarm();
                    cropfarm.showFarm();
                    cropfarm.showCropFarm();
                    break;

                case 2:
                    System.out.println("\n-----MULTILEVEL INHERITANCE-----");
                    TomatoFarm tomatofarm=new TomatoFarm();
                    tomatofarm.showFarm();
                    tomatofarm.showVegetableFarm();
                    tomatofarm.showTomatoFarm();
                    break;

                case 3:
                    System.out.println("\n-----HIERARCHICAL INHERITANCE-----");
                    CropFarm cropfarm1=new CropFarm();
                    DairyFarm dairyfarm=new DairyFarm();
                    cropfarm1.showFarm();
                    cropfarm1.showCropFarm();
                    System.out.println();
                    dairyfarm.showFarm();
                    dairyfarm.showDairyFarm();
                    break;

                case 4:
                    System.out.println("\n--- MULTIPLE INHERITANCE ---");
                    SmartFarm smartfarm = new SmartFarm();
                    smartfarm.Farming();
                    smartfarm.irrigation();
                    break;

                case 5:
                    System.out.println("\n--- HYBRID INHERITANCE ---");
                    OrganicFarm organicfarm=new OrganicFarm();
                    organicfarm.showFarm();
                    organicfarm.Farming();
                    organicfarm.organicMethod();
                    break;

                case 6:
                    System.out.println("Exiting Agriculture Program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter your choice from (1-5)");
            }
        } while(choice!=6);
          scanner.close();
    }
}