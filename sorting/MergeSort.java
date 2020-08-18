public class MergeSort{
    //  public static void merge(int A[], int L, int M, int R){
    //      int N1 = M - L + 1;
    //      int N2 = R - M;
    //      int arr1[] = new int[N1];
    //      int arr2[] = new int[N2];
    //      for(int i=0;i<N1;i++){
    //          arr1[i] = A[L+i];
    //      }
    //      for(int j=0;j<N2;j++){
    //          arr2[j] = A[M+1+j];
            
    //      }
    //      int i = 0;
    //      int j = 0;
    //      int k = L;
    //     while(i<N1 && j<N2){
    //         if(arr1[i]<= arr2[j]){
    //             A[k] = arr1[i];
    //                 i++;
                   
    //         }
    //         else{
    //             A[k] = arr2[j];
    //             j++;
              
    //         }
              
    //             k++;
    //     }

    //     while(i<N1){
    //         A[k] = arr1[i];
    //         i++;
    //         k++;
    //     }

    //     while(j<N2){
    //         A[k] = arr1[j];
    //         j++;
    //         k++;
    //     }
         
    // }
     static void merge(int arr[], int l, int m, int r) 
    { 
        // Find sizes of two subarrays to be merged 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        /* Create temp arrays */
        int L[] = new int[n1]; 
        int R[] = new int[n2]; 
  
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j = 0; j < n2; ++j) 
            R[j] = arr[m + 1 + j]; 
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2) { 
            if (L[i] <= R[j]) { 
                arr[k] = L[i]; 
                i++; 
            } 
            else { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
    public static void sort(int A[], int L, int R){

            if(L<R){
                int mid = (L+R)/2;
                sort(A,L,mid);
                sort(A,mid+1,R);
                merge(A,L,mid,R);
            }
    }

    public static void main(String args[]){
        int A[]={89, 25, 45, 63, 78, 24, 22, 61};
        int N = A.length;
        int R = N-1;
        int L = 0;
        sort(A,L,R);
        
   

        
        for(int i=0;i<N;i++)
            {
                System.out.print(A[i]+ ", ");
            }

    }
}