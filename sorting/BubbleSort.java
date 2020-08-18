/* 
1. Repeate for round = 1,2,3,..N
2. Repeate for i = 0,1,2,..N-round
3. if(A[i]>A[i+1])
    then swap both.
Note: In each round largest value will reach at last.
*/
public class BubbleSort{
    public static void main(String args[]){
        int array[] = new int[] {34, 15, 29, 8, 3, 19, 99, 99, 99, 99};
        // int array[] = {34,15,29,8};
        int N = array.length;
        for(int round=1; round<N;round ++){
            for(int i=0; i<N-round;i++){
                System.out.println("round :"+ round + "," + "i = " + i);
                if(array[i]>array[i+1])
                {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+",");
        }

    }
}
