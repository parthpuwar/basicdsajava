public class rotate1d {
    public static void main(String[] args) {
        int []a = {1,4,6,9};
        int j = a.length-1;
        for (int i= 0;i<a.length/2;i++){
            a[i]=a[i]^a[j];
            a[j]=a[i]^a[j];
            a[i]=a[i]^a[j];
            j--;
        }
        for (int x : a){
            System.out.println(x);
        }
    }
}
