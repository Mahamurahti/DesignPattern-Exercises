package strategy;

public class QuickSort implements ISort{

    private static QuickSort instance;

    private QuickSort() {}

    public static QuickSort getInstance(){
        if(instance == null)
            instance = new QuickSort();
        return instance;
    }

    @Override
    public void sort(int[] tableToBeSorted) {
        final long startTime = System.currentTimeMillis();
        quickSort(tableToBeSorted, Main.MAX);
        final long endTime = System.currentTimeMillis();

        Generator.printResults(tableToBeSorted);
        System.out.println("\n\nQuickSort execution time: " + ((endTime - startTime) / 1000F) + " sec");
    }

    public static void quickSort(int[] tableToBeSorted, int values) {
        quickSort(tableToBeSorted, 0, values - 1);
    }

    public static void quickSort(int[] tableToBeSorted, int lo0, int hi0) {
        int lo = lo0;
        int hi = hi0;
        int mid, swap;

        mid = tableToBeSorted[(lo0 + hi0) / 2];
        while (lo <= hi) {
            while (tableToBeSorted[lo] < mid)
                ++lo;

            while (tableToBeSorted[hi] > mid)
                --hi;

            if (lo <= hi) {
                swap = tableToBeSorted[lo];
                tableToBeSorted[lo] = tableToBeSorted[hi];
                ++lo;
                tableToBeSorted[hi] = swap;
                --hi;
            }
        }
        if (lo0 < hi)
            quickSort(tableToBeSorted, lo0, hi);

        if (lo < hi0)
            quickSort(tableToBeSorted, lo, hi0);
    }
}
