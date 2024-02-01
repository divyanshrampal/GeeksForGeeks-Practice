//{ Driver Code Starts
import java.util.Scanner;
import java.lang.Math;

class Convert_To_Five {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(new GfG().convertfive(N));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG {
    int convertfive(int num) {
        int save = num;
        int ans = num;
        
        int i = 1;
        
        while(save > 0){
            int rem = save%10;
            
            if(rem == 0){
                int adder = 5*i;
                ans += adder;
            }
            
            save /= 10;
            
            i = i*10;
        }
        
        return ans;
    }
}