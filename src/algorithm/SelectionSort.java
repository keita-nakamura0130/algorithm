package algorithm;

/**
 * 選択ソートクラス
 */
public class SelectionSort {

    /**
     * mainメソッド
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] array = { 10, 75, 24, 32, 98, 72, 88, 43, 60, 35, 54, 62, 2, 12, 82 };
        SelectionSort.sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    /**
     * 選択ソート
     *
     * @param array
     */
    private static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }
            }

            if (i != index) {
                int tmp = array[index];
                array[index] = array[i];
                array[i] = tmp;
            }
        }
    }
}
