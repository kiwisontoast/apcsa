import java.util.Arrays;
public class MergeSort 
{
    private static int passCount=0;
    public static void mergeSort(int[] list) 
    {
        passCount = 0;
        mergeSort(list, 0, list.length);
       // System.out.println(list);

    }

    private static void mergeSort(int[] stuff, int front, int back) // O( Log N )
    {
        int mid = (front + back) / 2;
        if (mid == front)
            return;
        mergeSort(stuff, front, mid);
        mergeSort(stuff, mid, back);
        merge(stuff, front, back);
       
            System.out.print("pass "+passCount+Arrays.toString(stuff));
          //  Arrays.toString(stuff);
       
        System.out.println("\n");
        passCount++;
    }

    private static void merge(int[] stuff, int front, int back) //O(N)
    {
        int dif = back-front, spot = 0;
        int[] temp = new int[ dif ];
        int beg = front, mid = (front+back)/2, saveMid = mid;
        while( beg<saveMid && mid<back )
        {
            if(stuff[ beg ]<stuff[ mid ])
                temp[ spot++ ]= stuff[ beg++ ];
            else
                temp[ spot++ ]= stuff[ mid++ ];
        }
        while( beg < saveMid )
            temp[ spot++ ]= stuff[ beg++ ];
        while( mid < back )
            temp[ spot++ ]= stuff[ mid++ ];
        for(int i = 0; i < dif; ++i)
            stuff[front+i]=temp[i];
    }
}