
public class QuickString{
	
	public static void main (String[] args) {
		
		String text = "GeeksForGeek";
		int len = text.length();
		QuickString ob = new QuickString();
		ob.quickFuction();
			
	}
	void partition(text,low,high){
		
		
		while(low<=high){
			
		
		int pivot = (low+high)/2;
		
		
		while(text.charAt(low) < text.charAt(pivot)){
				low++;
				
			}
		while(text.charAt(pivot)< text.charAt(high)){
		
				high--;
				
		}
		
		if(low<=high){
			char temp = text.charAt(low);
			text.charAt(low) = text.charAt(high);
			text.charAt(high) = temp;
			low++;
			high--;	
		}				
	
	}
	return low;
}

int quickFuction(String str, int low, int high){
		
		int pi = partition(str,low,high);
		
		if(low<pi-1){
				
				quickFunction(str,low,pi-1);
		}
		if(pi<high){
				
				quickFuction(str,pi,high);
		}		
		
}

void show(String text){
	for(int i=0; i<text.length();i++){
		
		System.out.print(text.charAt(i));
	}
  }	
	


}

