import java.util.Scanner;

class TouristPlace {
    void showPlace() {
        System.out.println("Tourist Place");
    }
}

class Beach extends TouristPlace {
    void showBeach() {
        System.out.println("Beach: Baga Beach");
        System.out.println("Activity: Swimming and Water Sports");
    }
}

class HillStation extends TouristPlace {
    void showHillStation() {
        System.out.println("Hill Station: Mahabaleshwar");
    }
}

class GoaHillStation extends HillStation {
    void showGoaHillStation() {
        System.out.println("Tourist Spot: Dudhsagar");
        System.out.println("Activity: Sightseeing");
    }
}

class Museum extends TouristPlace {
    void showMuseum() {
        System.out.println("Museum: Goa State Museum");
        System.out.println("Activity: Historical Tour");
    }
}

interface Guide {
    void guideTour();
}

interface Photographer {
    void takePhotos();
}

class TourGuide implements Guide, Photographer {
    public void guideTour() {
        System.out.println("Guide: Explains tourist places");
    }

    public void takePhotos() {
        System.out.println("Photographer: Takes photos of tourist places");
    }
}

class AdventureTour extends TouristPlace implements Guide {
    public void guideTour() {
        System.out.println("Guide: Guides tourists during adventure activities");
    }

    void adventure() {
        System.out.println("Adventure: Trekking and River Rafting");
    }
}

public class Tourism {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== TOURISM INHERITANCE =====");
            System.out.println("1. Single Inheritance");
            System.out.println("2. Multilevel Inheritance");
            System.out.println("3. Hierarchical Inheritance");
            System.out.println("4. Multiple Inheritance");
            System.out.println("5. Hybrid Inheritance");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\n--- Single Inheritance ---");

                    Beach b = new Beach();
                    b.showPlace();
                    b.showBeach();
                    break;

                case 2:
                    System.out.println("\n--- Multilevel Inheritance ---");

                    GoaHillStation g = new GoaHillStation();
                    g.showPlace();
                    g.showHillStation();
                    g.showGoaHillStation();
                    break;

                case 3:
                    System.out.println("\n--- Hierarchical Inheritance ---");

                    Beach beach = new Beach();
                    Museum museum = new Museum();

                    beach.showPlace();
                    beach.showBeach();

                    System.out.println();

                    museum.showPlace();
                    museum.showMuseum();
                    break;

                case 4:
                    System.out.println("\n--- Multiple Inheritance ---");

                    TourGuide tg = new TourGuide();
                    tg.guideTour();
                    tg.takePhotos();
                    break;

                case 5:
                    System.out.println("\n--- Hybrid Inheritance ---");

                    AdventureTour at = new AdventureTour();
                    at.showPlace();
                    at.guideTour();
                    at.adventure();
                    break;

                case 6:
                    System.out.println("Exiting Tourism Program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter your choice from (1-5)");
            }

        } while (choice != 6);

        scanner.close();
    }
}