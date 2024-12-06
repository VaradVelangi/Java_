public class LargestElement {
    public static void main(String[] args) {
        int a[]={2,5,1,3,0};
        int largest=0;
        int smallest= Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>largest)largest=a[i];
            if (a[i]<smallest)smallest=a[i];
        }
        System.out.println(largest);
        System.out.println(smallest);





    }
}
