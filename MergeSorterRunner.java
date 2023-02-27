public class MergeSorterRunner
{
    public static void main(String args[])
    {
        //9 5 3 2
        //19 52 3 2 7 21
        //68 66 11 2 42 31
        MergeSort.mergeSort(new int[]{9,5,3,2});
        System.out.println("\n");
        MergeSort.mergeSort(new int[]{19,52,3,2,7,21});
        System.out.println("\n");
        MergeSort.mergeSort(new int[]{68,66,11,2,42,31});
        System.out.println("\n");
    }
}