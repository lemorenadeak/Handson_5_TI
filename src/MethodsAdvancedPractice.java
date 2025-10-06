import java.util.Arrays;

public class MethodsAdvancedPractice {

    // Static variable untuk demonstrasi
    private static int counter = 0;

    // Instance variable untuk demonstrasi
    private String instanceName;

    // Constructor
    public MethodsAdvancedPractice(String name) {
        this.instanceName = name;
        counter++;
    }

    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Methods Advanced
         */

        // ===== METHOD SIGNATURE DAN DECLARATION =====
        System.out.println("=== METHOD SIGNATURE DAN DECLARATION ===");

        // Latihan 1
        System.out.println(calculate(2, 3));           // integer
        System.out.println(calculate(2.5, 3.5));       // double
        System.out.println(calculate(1, 2, 3));        // tiga integer
        System.out.println(calculate("Hello", "Java"));// String

        // ===== METHOD OVERLOADING =====
        System.out.println("\n=== METHOD OVERLOADING ===");
        print(100);
        print(99.99);
        print("Hello Overloading");
        print(new int[]{1, 2, 3});

        // ===== STATIC VS INSTANCE METHODS =====
        System.out.println("\n=== STATIC VS INSTANCE METHODS ===");
        System.out.println("Counter awal: " + getCounter());
        incrementCounter();
        System.out.println("Counter setelah increment: " + getCounter());

        MethodsAdvancedPractice obj = new MethodsAdvancedPractice("Instance1");
        System.out.println(obj.getInstanceName());
        obj.setInstanceName("UpdatedInstance");
        obj.displayInfo();

        // ===== PASS BY VALUE - PRIMITIVES =====
        System.out.println("\n=== PASS BY VALUE - PRIMITIVES ===");
        int originalNumber = 10;
        System.out.println("Before modifyPrimitive: " + originalNumber);
        modifyPrimitive(originalNumber);
        System.out.println("After modifyPrimitive: " + originalNumber);

        // ===== PASS BY VALUE OF REFERENCE - OBJECTS =====
        System.out.println("\n=== PASS BY VALUE OF REFERENCE - OBJECTS ===");
        int[] originalArray = {1, 2, 3, 4, 5};
        System.out.println("Before modifyArray: " + Arrays.toString(originalArray));
        modifyArray(originalArray);
        System.out.println("After modifyArray: " + Arrays.toString(originalArray));

        int[] anotherArray = {10, 20, 30};
        System.out.println("Before reassignArray: " + Arrays.toString(anotherArray));
        reassignArray(anotherArray);
        System.out.println("After reassignArray: " + Arrays.toString(anotherArray));

        // ===== ARRAY SEBAGAI PARAMETER DAN RETURN VALUE =====
        System.out.println("\n=== ARRAY SEBAGAI PARAMETER DAN RETURN VALUE ===");
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Sorted copy: " + Arrays.toString(sortArrayCopy(numbers)));

        double[] stats = getArrayStats(numbers);
        System.out.println("Min: " + stats[0] + ", Max: " + stats[1] + ", Avg: " + stats[2]);

        int[] merged = mergeArrays(new int[]{1, 2}, new int[]{3, 4});
        System.out.println("Merged array: " + Arrays.toString(merged));

        // ===== VARIABLE ARGUMENTS (VARARGS) =====
        System.out.println("\n=== VARIABLE ARGUMENTS (VARARGS) ===");
        System.out.println("Sum: " + sum(1, 2, 3, 4, 5));
        printInfo("Values", 10, 20, 30);

        // ===== METHOD CHAINING =====
        System.out.println("\n=== METHOD CHAINING ===");
        double result = new Calculator(10).add(5).multiply(2).subtract(4).getResult();
        System.out.println("Chaining result: " + result);

        // ===== RECURSIVE METHODS =====
        System.out.println("\n=== RECURSIVE METHODS ===");
        System.out.println("Factorial(5): " + factorial(5));
        System.out.println("Fibonacci(6): " + fibonacci(6));
        int[] sortedArr = {1, 3, 5, 7, 9};
        System.out.println("Binary search for 5: " + binarySearchRecursive(sortedArr, 5, 0, sortedArr.length - 1));

        // ===== UTILITY STATIC METHODS =====
        System.out.println("\n=== UTILITY STATIC METHODS ===");
        System.out.println("Power: " + MathUtils.power(2, 3));
        System.out.println("IsPrime 17: " + MathUtils.isPrime(17));
        System.out.println("GCD: " + MathUtils.gcd(20, 30));

        System.out.println("Reverse: " + StringUtils.reverse("hello"));
        System.out.println("IsPalindrome: " + StringUtils.isPalindrome("level"));
        System.out.println("CountWords: " + StringUtils.countWords("Hello world Java"));

        ArrayUtils.printMatrix(new int[][]{{1, 2}, {3, 4}});
        System.out.println("Duplicates: " + Arrays.toString(ArrayUtils.findDuplicates(new int[]{1, 2, 2, 3})));
        System.out.println("Arrays equal: " + ArrayUtils.areEqual(new int[]{1, 2}, new int[]{1, 2}));
    }

    // ===== METHOD OVERLOADING EXAMPLES =====
    public static int calculate(int a, int b) {
        return a + b;
    }

    public static double calculate(double a, double b) {
        return a + b;
    }

    public static int calculate(int a, int b, int c) {
        return a + b + c;
    }

    public static String calculate(String a, String b) {
        return a + b;
    }

    public static void print(int value) {
        System.out.println("Int value: " + value);
    }

    public static void print(double value) {
        System.out.println("Double value: " + value);
    }

    public static void print(String value) {
        System.out.println("String value: " + value);
    }

    public static void print(int[] array) {
        System.out.println("Array: " + Arrays.toString(array));
    }

    // ===== STATIC VS INSTANCE METHODS =====
    public static int getCounter() {
        return counter;
    }

    public static void incrementCounter() {
        counter++;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String name) {
        this.instanceName = name;
    }

    public void displayInfo() {
        System.out.println("Instance name: " + instanceName + ", Counter: " + counter);
    }

    // ===== PASS BY VALUE DEMONSTRATIONS =====
    public static void modifyPrimitive(int number) {
        number += 100;
        System.out.println("Inside modifyPrimitive: " + number);
    }

    public static void modifyArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] += 10;
        }
    }

    public static void reassignArray(int[] array) {
        array = new int[]{100, 200, 300};
    }

    // ===== ARRAY METHODS =====
    public static int[] sortArrayCopy(int[] original) {
        int[] copy = Arrays.copyOf(original, original.length);
        Arrays.sort(copy);
        return copy;
    }

    public static double[] getArrayStats(int[] array) {
        int min = Arrays.stream(array).min().getAsInt();
        int max = Arrays.stream(array).max().getAsInt();
        double avg = Arrays.stream(array).average().orElse(0);
        return new double[]{min, max, avg};
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {
        int[] result = Arrays.copyOf(array1, array1.length + array2.length);
        System.arraycopy(array2, 0, result, array1.length, array2.length);
        return result;
    }

    // ===== VARIABLE ARGUMENTS (VARARGS) =====
    public static int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) total += num;
        return total;
    }

    public static void printInfo(String title, int... values) {
        System.out.println(title + ": " + Arrays.toString(values));
    }

    // ===== RECURSIVE METHODS =====
    public static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int binarySearchRecursive(int[] array, int target, int left, int right) {
        if (left > right) return -1;
        int mid = left + (right - left) / 2;
        if (array[mid] == target) return mid;
        if (array[mid] > target) return binarySearchRecursive(array, target, left, mid - 1);
        return binarySearchRecursive(array, target, mid + 1, right);
    }

    // ===== UTILITY STATIC METHODS =====
    public static class MathUtils {
        public static double power(double base, int exponent) {
            return Math.pow(base, exponent);
        }

        public static boolean isPrime(int number) {
            if (number <= 1) return false;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) return false;
            }
            return true;
        }

        public static int gcd(int a, int b) {
            if (b == 0) return a;
            return gcd(b, a % b);
        }
    }

    public static class StringUtils {
        public static String reverse(String str) {
            return new StringBuilder(str).reverse().toString();
        }

        public static boolean isPalindrome(String str) {
            return str.equals(reverse(str));
        }

        public static int countWords(String str) {
            return str.trim().split("\\s+").length;
        }
    }

    public static class ArrayUtils {
        public static void printMatrix(int[][] matrix) {
            for (int[] row : matrix) {
                System.out.println(Arrays.toString(row));
            }
        }

        public static int[] findDuplicates(int[] array) {
            return Arrays.stream(array)
                    .boxed()
                    .filter(i -> Arrays.stream(array).filter(x -> x == i).count() > 1)
                    .distinct()
                    .mapToInt(Integer::intValue)
                    .toArray();
        }

        public static boolean areEqual(int[] array1, int[] array2) {
            return Arrays.equals(array1, array2);
        }
    }

    // ===== METHOD CHAINING EXAMPLE =====
    public static class Calculator {
        private double value;

        public Calculator(double initial) {
            this.value = initial;
        }

        public Calculator add(double n) {
            value += n;
            return this;
        }

        public Calculator multiply(double n) {
            value *= n;
            return this;
        }

        public Calculator subtract(double n) {
            value -= n;
            return this;
        }

        public double getResult() {
            return value;
        }
    }
}
