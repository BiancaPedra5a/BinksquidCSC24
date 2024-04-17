public class recursionPractice {
        public static void main(String[] args) {
            String string1 = "Dog";
            int nTimes = 4;
            String result = appendNTimes(string1, nTimes);
            System.out.println(string1 + " appended " + nTimes + " times: " + result);
        }

        public static String appendNTimes(String s, int n) {
            if (n == 0) {
                return "";
            } else {
                return s + appendNTimes(s, n - 1); // Recursive
            }
        }
}
