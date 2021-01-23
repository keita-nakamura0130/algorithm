package algorithm;

/**
 * 挿入ソートクラス
 */
public class InsertSort {

    /**
     * mainメソッド
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] array = { 10, 75, 24, 32, 98, 72, 88, 43, 60, 35, 54, 62, 2, 12, 82 };
        InsertSort.sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    /**
     * 挿入ソート
     *
     * @param array
     */
    private static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
}
