package L04_Methods.Exercise;

import java.util.*;

public class P11_ArrayManipulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        String input = sc.nextLine();

        while (!input.equals("end")) {

            if (input.contains("exchange")) {
                int index = Integer.parseInt(input.split(" ")[1]);
                exchangeArray(arr, index);
            } else if (input.equals("max even")) {
                if (getMaxEvenEl(arr) != null)
                    System.out.println(getMaxEvenEl(arr));
            } else if (input.equals("max odd")) {
                if (getMaxOddEl(arr) != null)
                    System.out.println(getMaxOddEl(arr));
            } else if (input.equals("min even")) {
                if (getMinEvenEl(arr) != null)
                    System.out.println(getMinEvenEl(arr));
            } else if (input.equals("min odd")) {
                if (getMinOddEl(arr) != null)
                    System.out.println(getMinOddEl(arr));
            } else if ((input.contains("first") || input.contains("last")) && arr != null) {

                int count = Integer.parseInt(input.split(" ")[1]);

                if (input.contains("first") && input.contains("even")) {
                    if (getFirstNEvenEls(arr, count) != null)
                        System.out.println(Arrays.toString(getFirstNEvenEls(arr, count)));
                } else if (input.contains("first") && input.contains("odd")) {
                    if (getFirstNOddEls(arr, count) != null)
                        System.out.println(Arrays.toString(getFirstNOddEls(arr, count)));
                } else if (input.contains("last") && input.contains("even")) {
                    if (getLastNEvenEls(arr, count) != null)
                        System.out.println(Arrays.toString(getLastNEvenEls(arr, count)));
                } else if (input.contains("last") && input.contains("odd")) {
                    if (getLastNOddEls(arr, count) != null)
                        System.out.println(Arrays.toString(getLastNOddEls(arr, count)));
                }
            }

            input = sc.nextLine();
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void exchangeArray(int[] arr, int index) {

        if (index < 0 || index > arr.length - 1) {
            System.out.println("Invalid index");
        } else {

            try {
                List<Integer> list = new ArrayList<>();

                for (int i = index + 1; i < arr.length; i++) {
                    list.add(arr[i]);
                }

                for (int i = 0; i <= index; i++) {
                    list.add(arr[i]);
                }

                for (int i = 0; i < list.size(); i++) {
                    arr[i] = list.get(i);
                }

            } catch (Exception ignored) {
            }
        }
    }

    private static Integer getMaxEvenEl(int[] arr) {
        try {
            int max = Arrays.stream(arr).filter(n -> n % 2 == 0).max().getAsInt();

            for (int i = arr.length - 1; i >= 0; i--) {
                if (max == arr[i])
                    return i;
            }

            return null;
        } catch (Exception e) {
            System.out.println("No matches");
            return null;
        }
    }

    private static Integer getMaxOddEl(int[] arr) {
        try {
            int max = Arrays.stream(arr).filter(n -> n % 2 == 1).max().getAsInt();

            for (int i = arr.length - 1; i >= 0; i--) {
                if (max == arr[i])
                    return i;
            }

            return null;
        } catch (Exception e) {
            System.out.println("No matches");
            return null;
        }
    }

    private static Integer getMinEvenEl(int[] arr) {

        try {
            int min = Arrays.stream(arr).filter(n -> n % 2 == 0).min().getAsInt();

            for (int i = arr.length - 1; i >= 0; i--) {
                if (min == arr[i])
                    return i;
            }

            return null;
        } catch (Exception e) {
            System.out.println("No matches");
            return null;
        }
    }

    private static Integer getMinOddEl(int[] arr) {

        try {
            int min = Arrays.stream(arr).filter(n -> n % 2 == 1).min().getAsInt();

            for (int i = arr.length - 1; i >= 0; i--) {
                if (min == arr[i])
                    return i;
            }

            return null;
        } catch (Exception e) {
            System.out.println("No matches");
            return null;
        }
    }

    private static int[] getFirstNEvenEls(int[] arr, int count) {

        if (count > arr.length || count <= 0) {
            System.out.println("Invalid count");
            return null;
        }

        try {
            int[] evens = Arrays.stream(arr).filter(n -> n % 2 == 0).toArray();

            int length = Math.min(count, evens.length);

            int[] resultArray = new int[length];

            for (int i = 0; i < resultArray.length; i++) {
                resultArray[i] = evens[i];
            }

            return resultArray;
        } catch (Exception e) {
            System.out.println("[]");
            return null;
        }
    }

    private static int[] getFirstNOddEls(int[] arr, int count) {

        if (count > arr.length || count <= 0) {
            System.out.println("Invalid count");
            return null;
        }

        try {
            int[] odds = Arrays.stream(arr).filter(n -> n % 2 == 1).toArray();

            int length = Math.min(count, odds.length);

            int[] resultArray = new int[length];

            System.arraycopy(odds, 0, resultArray, 0, resultArray.length);

            return resultArray;
        } catch (Exception e) {
            System.out.println("[]");
            return null;
        }
    }

    private static int[] getLastNEvenEls(int[] arr, int count) {

        if (count > arr.length || count <= 0) {
            System.out.println("Invalid count");
            return null;
        }

        try {
            int[] evens = Arrays.stream(arr).filter(n -> n % 2 == 0).toArray();

            int length = Math.min(count, evens.length);

            int[] resultArray = new int[length];

            System.arraycopy(evens, 0, resultArray, 0, resultArray.length);

            Collections.reverse(Arrays.asList(resultArray));

            return resultArray;
        } catch (Exception e) {
            System.out.println("[]");
            return null;
        }
    }

    private static int[] getLastNOddEls(int[] arr, int count) {

        if (count > arr.length || count <= 0) {
            System.out.println("Invalid count");
            return null;
        }

        try {
            int[] odds = Arrays.stream(arr).filter(n -> n % 2 == 1).toArray();

            int length = Math.min(count, odds.length);

            int[] resultArray = new int[length];

            System.arraycopy(odds, 0, resultArray, 0, resultArray.length);

            Collections.reverse(Arrays.asList(resultArray));

            return resultArray;
        } catch (Exception e) {
            System.out.println("[]");
            return null;
        }
    }
}
