package corejava;

public class ReverseArray {

	public static void main(String[] args) {

		int arr[] = {15,8,9,2,11,4};
		
		int temp=0;
		for(int i=arr.length-1;i>=0;i--) {
			arr[temp]=arr[i];
			temp++;
		}
		for(int n:arr) {
			System.out.print(n+" ");
		}
	}

}
