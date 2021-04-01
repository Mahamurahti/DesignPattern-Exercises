package strategy;

public class SelectSort implements ISort{

    private static SelectSort instance;

    private SelectSort() {}

    public static SelectSort getInstance(){
        if(instance == null)
            instance = new SelectSort();
        return instance;
    }

    @Override
    public int[] sort(int[] tableToBeSorted) {
        final long startTime = System.currentTimeMillis();
        selectSort(tableToBeSorted);
        final long endTime = System.currentTimeMillis();

        Generator.printResults(tableToBeSorted);
        System.out.println("\n\nSelectSort execution time: " + ((endTime - startTime) / 1000F) + " sec");

        return tableToBeSorted;
    }

    public static void selectSort(int[] tableToBeSorted){
        int help;
        for (int i = 0; i < Main.MAX; i++) {
            int smallest = i;
            for (int j = i + 1; j < Main.MAX; j++) {
                if (tableToBeSorted[j] < tableToBeSorted[smallest]) {
                    smallest = j;
                }
            }
            if (smallest != i) {
                help = tableToBeSorted[smallest];
                tableToBeSorted[smallest] = tableToBeSorted[i];
                tableToBeSorted[i] = help;
            }
        }
    }
}
