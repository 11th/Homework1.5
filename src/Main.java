public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
        int [] personIDs = new int[3];
        for (int i = 0; i < personIDs.length; i++) {
            personIDs[i] = i + 1;
        }
        float [] personRates = {1.57f, 7.654f, 9.986f};
        char [] personGenders = {'M', 'M', 'F'};

        //Task 2
        System.out.println("Task 2");
        for (int i = 0; i < personIDs.length; i++) {
            if (i < personIDs.length - 1)
                System.out.print(personIDs[i] + ", ");
            else
                System.out.print(personIDs[i] + "\n");
        }
        for (int i = 0; i < personRates.length; i++) {
            if (i < personRates.length - 1)
                System.out.print(personRates[i] + ", ");
            else
                System.out.print(personRates[i] + "\n");
        }
        for (int i = 0; i < personGenders.length; i++) {
            if (i < personGenders.length - 1)
                System.out.print(personGenders[i] + ", ");
            else
                System.out.print(personGenders[i] + "\n");
        }

        //Task 3
        System.out.println("Task 3");
        for (int i = personIDs.length - 1; i >= 0; i--) {
            if (i > 0)
                System.out.print(personIDs[i] + ", ");
            else
                System.out.print(personIDs[i] + "\n");
        }
        for (int i = personRates.length - 1; i >= 0; i--) {
            if (i > 0)
                System.out.print(personRates[i] + ", ");
            else
                System.out.print(personRates[i] + "\n");
        }
        for (int i = personGenders.length - 1; i >= 0; i--) {
            if (i > 0)
                System.out.print(personGenders[i] + ", ");
            else
                System.out.print(personGenders[i] + "\n");
        }

        //Task 4
        System.out.println("Task 4");
        for (int i = 0; i < personIDs.length; i++) {
            if (personIDs[i] % 2 != 0)
                personIDs[i]+=1;
            if (i < personIDs.length - 1)
                System.out.print(personIDs[i] + ", ");
            else
                System.out.println(personIDs[i]);
        }
    }
}