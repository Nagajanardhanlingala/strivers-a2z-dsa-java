public class Main {

    public static int secondLargest(int[] arr) {

        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num > max) {
                second = max;
                max = num;
            }
            else if (num != max && num > second) {
                second = num;
            }
        }

        return (second == Integer.MIN_VALUE) ? -1 : second;
    }

    public static void main(String[] args) {

        int[] arr = {2, 5, 1, 3, 0};

        System.out.println(secondLargest(arr));
    }
}
