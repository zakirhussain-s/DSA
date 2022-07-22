/*
Maximum and minimum of the array
{1,4,2,1,56,7,88,65,8}
*/
public final class MaxMinOfArray {

    public static void main(String[] args) {
        int[] x = {-3, -2, -1, -56, -10000, -167};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        if(x.length == 0) return;
        
        for(int i=0;i< x.length;i++){
            if(x[i] > max)
                max = x[i];
            if(x[i] < min)
                min = x[i];
        }
        System.out.println(max+" "+min);
    }
}
