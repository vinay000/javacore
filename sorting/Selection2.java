public class Selection2{
    public static void main(String args[]){
        int A[]={89,25,45,63,78,24,22,61};
        int N = A.length;
        
        
        for(int i = 0;i<N-1; i++){
            int min = i;
            for(int j=i+1;j<N;j++){
                if(A[j]<A[min]){
                    min = j;
                }
            }
            int temp;
            temp = A[i];
            A[i] = A[min];
            A[min] = temp;

        }
        for(int i=0;i<N;i++)
            {
                System.out.print(A[i]+ ", ");
            }

    }
}