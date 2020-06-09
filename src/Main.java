public class Main {

    public static void main(String[] args) {
        int [] array = {9, 2, 7, 1, 0, 5, 4, 3};
        SelectionSort s = new SelectionSort(array);
        s.ascendingSort();
        s.print();
        System.out.println();
        s.descendingSort();
        s.print();
    }
}
