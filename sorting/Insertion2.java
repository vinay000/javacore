public class Insertion2{
    public static void main(String args[]){
        int A[] = {31,45, 11, 89, 55, 19, 21, 8, 40};
        int N = A.length;

        for(int i=1; i<N; i++){
            int j = i;
            while(j>0 && A[j]<A[j-1]){
                int temp = A[j];
                A[j] = A[j-1];
                A[j-1] = temp;
                j--;
            }
        }
       
    for(int i=0;i<N;i++)
            {
                System.out.print(A[i]+ ", ");
            }

        }

        
    }