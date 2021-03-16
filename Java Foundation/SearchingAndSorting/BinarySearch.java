public class BinarySearch{
	public static int binarySearch(int[] a, int key){
		int l=0, h=a.length-1, mid = (l+h)/2;
		while(l<=h){
			if(a[mid]==key){return mid;}
			else if(a[mid]>key){h=mid-1;}
			else{l=mid+1;}
		}
		return -1;
	}
	public static void main(String[] args){
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		int i = binarySearch(a, 4);
		System.out.println(i);
	}
}
