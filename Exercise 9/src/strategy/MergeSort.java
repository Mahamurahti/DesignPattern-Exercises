package strategy;

public class MergeSort implements ISort{

    private static MergeSort instance;

    private MergeSort() {}

    public static MergeSort getInstance(){
        if(instance == null)
            instance = new MergeSort();
        return instance;
    }

    @Override
    public void sort(int[] tableToBeSorted) {
        final long startTime = System.currentTimeMillis();
        mergeSort(tableToBeSorted, 0, Main.MAX - 1);
        final long endTime = System.currentTimeMillis();

        Generator.printResults(tableToBeSorted);
        System.out.println("\n\nMergeSort execution time: " + ((endTime - startTime) / 1000F) + " sec");
    }

    public static void mergeSort(int[] tableToBeSorted, int start, int end) {
        int partition;
        long tableHead, tableTail, tableWhole;

        if (start < end) {
            tableHead = start;
            tableTail = end;
            tableWhole = (tableHead + tableTail) / 2;
            partition = (int)tableWhole;
            mergeSort(tableToBeSorted, start, partition);
            mergeSort(tableToBeSorted, partition + 1, end);
            merge(tableToBeSorted, start, partition, end);
        }
    }

    private static final int[] helpTable = new int[Main.MAX];

    public static void merge(int[] tableToBeSorted, int p, int q, int r) {
        int i = p, j = q + 1, k = 0;
        while(i < q + 1 && j < r + 1) {
            if (tableToBeSorted[i] < tableToBeSorted[j])
                helpTable[k++] = tableToBeSorted[i++];
            else
                helpTable[k++] = tableToBeSorted[j++];
        }

        while (i < q + 1)
            helpTable[k++] = tableToBeSorted[i++];

        while (j < r + 1)
            helpTable[k++] = tableToBeSorted[j++];

        for (i = 0; i < k; i++)
            tableToBeSorted[p+i] = helpTable[i];
    }
}
