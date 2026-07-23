import java.util.*;

class Main {

    public static ArrayList<Integer> findUnion(int[] arr1, int[] arr2) {

        int i = 0;
        int j = 0;

        ArrayList<Integer> ans = new ArrayList<>();

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {

                if (ans.isEmpty() || ans.get(ans.size() - 1) != arr1[i]) {
                    ans.add(arr1[i]);
                }
                i++;

            } else if (arr1[i] > arr2[j]) {

                if (ans.isEmpty() || ans.get(ans.size() - 1) != arr2[j]) {
                    ans.add(arr2[j]);
                }
                j++;

            } else {

                if (ans.isEmpty() || ans.get(ans.size() - 1) != arr1[i]) {
                    ans.add(arr1[i]);
                }
                i++;
                j++;
            }
        }

        while (i < arr1.length) {
            if (ans.isEmpty() || ans.get(ans.size() - 1) != arr1[i]) {
                ans.add(arr1[i]);
            }
            i++;
        }

        while (j < arr2.length) {
            if (ans.isEmpty() || ans.get(ans.size() - 1) != arr2[j]) {
                ans.add(arr2[j]);
            }
            j++;
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 4, 4, 5};

        ArrayList<Integer> ans = findUnion(arr1, arr2);

        System.out.println(ans);
    }
}
