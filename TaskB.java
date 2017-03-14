package cf;

import P.InputReader;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt(), ans = 0;
        int L = 0, R = 0;
        int arr[] = new int[n];
        int sarr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            sarr[i] = in.nextInt();
            L += arr[i];
            R += sarr[i];
        }
        int max = Math.abs(L-R);
        for (int i = 0; i < n; i++) {
            int cur = Math.abs((L-arr[i]+sarr[i]) - (R-sarr[i]+arr[i]));
            if (cur > max) {
                ans = i+1;
                max = cur;
            }
        }
        out.println(ans);
    }
}
