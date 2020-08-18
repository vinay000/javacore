public class InsertionSort{
    public static void main(String args[]){
        int array[] = {31,45, 11, 89, 55, 19, 21, 8, 40};
        int temp, j;
        int N = array.length;
        for(int i = 1; i<N; i++){
            temp = array[i];
            for(j = i-1;j>=0 && temp<array[j]; j--){
                    array[j+1] = array[j]; 
                }
                array[j+1] = temp;
            }

            for(int i=0;i<N;i++)
            {
                System.out.print(array[i]+ ", ");
            }
            
        }

        
    }

    // other wat to check condition
// if(temp<array[j]){
                //     array[j+1] = array[j]; 
                // }
                // else{
                //     break;
                // }