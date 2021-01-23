package algorithm;

/**
 * バブルソートクラス
 */
public class BubbleSort {

    /**
     * mainメソッド
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] array = { 10, 75, 24, 32, 98, 72, 88, 43, 60, 35, 54, 62, 2, 12, 82 };
        BubbleSort.sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    /**
     * バブルソート
     *
     * @param array
     */
    private static void sort(int[] array) {
        int tmp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }
}
