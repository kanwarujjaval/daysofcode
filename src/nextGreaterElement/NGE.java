package nextGreaterElement;

public class NGE {

    static void printNGE(int[] arr) {
        Stack stack = new Stack();
        int element, next;

        stack.push(arr[0]);

        for (int i = 0; i < arr.length; i++) {
            next = arr[i];

            if (!stack.isEmpty()) {
                element = stack.pop();

                while (element < next) {
                    if (stack.isEmpty()) break;
                    element = stack.pop();
                }

                if (element > next) {
                    stack.push(element);
                }

                stack.push(next);
            }

        }

        while (!stack.isEmpty()) {
            element = stack.pop();
            next = -1;
            System.out.println(element + "--->" + next);
        }
    }

    public static void main(String[] args) {
//        int[] arr = {11, 123, 34, 5, 7, 77, 4, 12};
        int[] arr = {11, 13, 21, 3};
        printNGE(arr);
    }
}
