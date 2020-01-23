package array;

public class LeftRotate {

    // rotate arr by d
    private void leftRotate(int arr[], int d) {
        for (int i = 0; i < d; i++) {
            leftRotateByOne(arr);
        }
    }

    private void leftRotateByOne(int[] arr) {
        int i, tmp;
        tmp = arr[0];
        for (i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[i] = tmp;
    }

    private void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i] + " ");
    }

    public static void main(String[] args) {
        LeftRotate leftRotate = new LeftRotate();
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        leftRotate.leftRotate(arr, 2);
        leftRotate.printArray(arr);
    }
}
