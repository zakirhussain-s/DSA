/*
	reverse the same array ex: [1,2,3,4] to [4,3,2,1]
*/

public final class ReverseArray {

    public static void main(String[] args) {
        int[] x = {1,2,3,4,5};
        int m = (x.length/2);
        int j = x.length-1;
        for(int i=0;i< x.length-1;i++){

            if(i > m || j < m)
                break;
            else{
                int temp = x[i];
                x[i] = x[j];
                x[j] = temp;
                j--;
            }
        }
        for(int result:x)
            System.out.println("final array "+result);
    }
}
