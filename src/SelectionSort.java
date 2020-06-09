public class SelectionSort {
    int [] array;

    public SelectionSort(int [] arr){
        this.array = arr;
    }

    public void ascendingSort(){
        int mid = array.length/2;
        int index;
        for (int i = 0; i < array.length - 1; i++) {
            index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[index] > array[j]){
                    index = j;
                }
            }
            swap(index, i);
        }
    }

    public void descendingSort(){
        int mid = array.length/2;
        int index;
        for (int i = 0; i < array.length - 1; i++) {
            index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[index] < array[j]){
                    index = j;
                }
            }
            swap(index, i);
        }
    }

    public void swap(int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public void print(){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
