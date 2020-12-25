package denis.korchagin;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = ListUtils.readIntListFromConsole();
        int n = readNumber();
        ListUtils.printShiftedList(createShiftedList(list, n));
    }

    static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input n: ");
        return scanner.nextInt();
    }

    static List<Integer> createShiftedList(List<Integer> list, int n) {
        List<Integer> shiftedList = moveList(list, n);
        return shiftedList;
    }

    static List<Integer> moveList(List<Integer> list, int n) {
        if (n >= 0) return moveListRight(list, n);
        else return moveListLeft(list, n);
    }

    static List<Integer> moveListRight(List<Integer> list, int n) {
        for (int i = 0; i < Math.abs(n); i++) {
            list.add(0, list.get(list.size() - 1));
            list.remove(list.size() - 1);
        }
        return list;
    }

    static List<Integer> moveListLeft(List<Integer> list, int n) {
        for (int i = 0; i < Math.abs(n); i++) {
            list.add(list.get(0));
            list.remove(0);
        }
        return list;
    }
}
