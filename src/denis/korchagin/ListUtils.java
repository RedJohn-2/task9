package denis.korchagin;

import java.util.*;

public class ListUtils {

    public static List<Integer> toIntList(String str) {
        Scanner scanner = new Scanner(str);
        scanner.useLocale(Locale.ROOT);
        scanner.useDelimiter("(\\s|[,;])+");
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.nextInt());
        }

        return list;
    }

    public static List<Integer> readIntListFromConsole() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Input list: ");
                String line = scanner.nextLine();
                return toIntList(line);
            }
            catch(Exception e) {
                System.out.print("You made a mistake, try again! ");
            }
        }
    }

    public static void printShiftedList(List<Integer> list) {
        System.out.print("Shifted list: ");
        for (int i : list) {
            System.out.print(i + " ");
        }
    }

}
