package demo;

public class UnorderedMaxPQ {

	private int N;
	private int[] pq;
	
	public UnorderedMaxPQ(int capacity){
		pq = new int[capacity];
	}
	
	public Boolean isEmpty(){
		return N==0;
	}
	
	public void insert(int number){
		pq[N++] = number;
	}
	
	public int delMax(){
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
}
