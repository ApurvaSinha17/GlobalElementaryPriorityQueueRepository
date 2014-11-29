package demo;

public class UnorderedMaxPQ {

	private int N;
	private int[] pq = new int[1];
	
	public Boolean isEmpty(){
		return N==0;
	}
	
	public void insert(int number){
		if(N==pq.length-1){
			resizePQdouble(pq);
		}
		pq[N++] = number;
	}
	
	public int delMax(){
		
		if(N==pq.length/4)
			resizePQHalf(pq);
		
		int max = 0;
		for(int i=0;i<N;i++){
			if(pq[i]>pq[max])
				max=i;
		}
		int temp = pq[--N];
		pq[N] = pq[max];
		pq[max] = temp;
		return pq[N];
	}
	
	private void resizePQdouble(int[] a){
		
		int newLength = 2 * a.length;
		System.out.println("Priority Queue Length Doubled: "+newLength);
		int[] temp = new int[newLength];
		for(int i=0;i<a.length;i++)
			temp[i] = a[i];
		pq = temp;
	}
	
	private void resizePQHalf(int[] a){
		
		int newLength = a.length/2;
		System.out.println("Priority Queue Length Halved: "+newLength);
		int[] temp = new int[newLength];
		for(int i=0;i<newLength;i++)
			temp[i] = a[i];
		pq = temp;
	}
}
