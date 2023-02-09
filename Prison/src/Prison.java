import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Prison {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Jak wiele eksperymentów chcesz wykonać: ");
        int numberOfTests = scanner.nextInt();
        int execution = 0;

        while (numberOfTests > execution) {

        Prison prison = new Prison();
        Random numberGenerator = new Random();
        int randomInt;
        int numberOfTurnOffBulbs = 0;
        Cell cell = new Cell();
        ArrayList<Prisoner> prisoners = prison.createPrisoners();
        int daysExperiment = 0;



            while (numberOfTurnOffBulbs != 99) {
                randomInt = numberGenerator.nextInt(100);
                Prisoner randomPrisoner = prisoners.get(randomInt);


                if (randomPrisoner.getId() == 0) {
                    if (cell.getBulb()) {
                        cell.setBulb(false);
                        numberOfTurnOffBulbs++;
                        daysExperiment++;
                    }
                } else {
                    if (!cell.getBulb()) {
                        cell.setBulb(true);
                    }
                    daysExperiment++;
                }

            }

            System.out.println(execution +" "+ daysExperiment);
            System.out.println();
            execution++;
        }
    }

    public ArrayList<Prisoner> createPrisoners() {
        ArrayList<Prisoner> prisoners = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            prisoners.add(new Prisoner(i));
        }
        return prisoners;
    }
}
