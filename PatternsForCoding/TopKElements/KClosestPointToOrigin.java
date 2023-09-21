package PatternsForCoding.TopKElements;

import java.util.PriorityQueue;

public class KClosestPointToOrigin {
    public static int[][] kClosest(int[][] points, int k){
        PriorityQueue<int[]> p = new PriorityQueue<>((a1,a2)-> a2[0]*a2[0] + a2[1]*a2[1] -a1[0]*a1[0] - a1[1]*a1[1]);

        for(int[] i: points){
            p.offer(i);

            if(p.size()>k){
                p.poll();
            }
        }

        int[][] ans = new int[k][2];

        for(int i= k-1; i>=0; i--){
            ans[i] = p.poll();
        }

        return ans;
    }
    public static void main(String[] args) {
        int[][] points = {{1,3},{-2,4},{3,-2}};
        int[][] ans = kClosest(points, 2);

        for(int[] i: ans){
            System.out.print("[");
            System.out.print(i[0] + "," + i[1]);
            System.out.print("]");
                if (i != ans[ans.length - 1]) {
            System.out.print(",");
            }
        }
    }
    
}
