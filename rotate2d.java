import java.util.*;
public class rotate2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        int [][] a = new int [n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                if (i!=j){
                    a[i][j] = a[i][j] ^ a[j][i];
                    a[j][i] = a[i][j] ^ a[j][i];
                    a[i][j] = a[i][j] ^ a[j][i];
                }
            }
        }
        for (int i=0;i<n;i++){
            int left = 0,right = n-1;
            while (left<right){
                a[i][left]^=a[i][right];
                a[i][right]^=a[i][left];
                a[i][left]^=a[i][right];
                left++;
                right--;
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
    sc.close();

    }
}
