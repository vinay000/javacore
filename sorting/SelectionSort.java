/*
start index= 0
step1: find the minimum value(min) by min() function, return index = LOC.
step2: swap  A[0] with A[LOC]
***
step3: start index =1 (repeate Step1,and step2)
*/

public class SelectionSort{
    public static int min(int A[],int k, int N){
        int j,LOC,min;
        min = A[k];             //intialize min = A[k];
        LOC = k;
        for(int i= k; i<N; i++){
            if(min > A[i]){
                min = A[i];             //update value of min
                LOC = i;        //update LOC or index of min
            }
        }
        return LOC;

    }
    public static void main(String args[]){
        int A[] = {31,45, 11, 89, 55, 19, 21, 8, 40};
        int N = A.length;
        int LOC,temp;
        for(int k=0; k<N-1; k++){
            
            LOC = min(A,k,N); //return LOC
            temp = A[k];
            A[k] = A[LOC];
            A[LOC] = temp;

        }
        for(int i=0;i<N;i++)
            {
                System.out.print(A[i]+ ", ");
            }



    }
}