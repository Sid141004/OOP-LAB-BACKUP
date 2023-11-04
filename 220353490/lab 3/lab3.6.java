public class FourDigitNumberCombinations {
    public static void generateCombinations(int[] digits, int[] currentCombination, int depth) {
        if (depth == 4) {
            for (int digit : currentCombination) {
                System.out.print(digit);
            }
            System.out.println();
            return;
        }

        for (int digit : digits) {
            currentCombination[depth] = digit;
            generateCombinations(digits, currentCombination, depth + 1);
        }
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 3, 4};
        int[] currentCombination = new int[4];
        generateCombinations(digits, currentCombination, 0);
    }
}
