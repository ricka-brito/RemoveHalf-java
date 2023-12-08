import java.util.Arrays;
import java.util.Random;

public class Main {

    public static String[] RemoveHalf(String[] people){
        Random rand = new Random();
        String[] half_people = new String[(int) Math.ceil(people.length / 2f)];
        int[] half_people_number = new int[(int) Math.ceil(people.length / 2f)];

        int randNumber = 0;


        for (int i = 0; i < half_people_number.length; i++) {
            while (true){
                randNumber = rand.nextInt(people.length);

                if (!Arrays.asList(half_people_number).contains(randNumber)){
                    break;
                }
            }

            half_people_number[i] = randNumber;

        }
        for (int i = 0; i < half_people.length; i++) {
            half_people[i] = people[half_people_number[i]];
        }

        return half_people;
    }

    public static void main(String[] args) {
        for(String i: RemoveHalf(new String[] {"A", "B", "C", "D"})){
            System.out.println(i);
        }
    }
}
