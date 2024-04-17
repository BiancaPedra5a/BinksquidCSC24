public class recursionPractice2 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 15, 30, 50 };
        int goal = 30;
        int result = contains(arr, goal);
        if (result != -1) {
            System.out.println("Value " + goal + " found at index " + result);
        } else {
            System.out.println("Value " + goal + " not found in the array.");
        }
    }

    public static int contains(int[] arr, int target) {
        return containsGoal(arr, target, 0);
    }
    private static int containsGoal(int[] arr, int target, int index) {
        if (index >= arr.length) {
            return -1;
        } else if (arr[index] == target) {
            return index;
        } else {
            return containsGoal(arr, target, index + 1); // Recursive case
        }
    }
}
