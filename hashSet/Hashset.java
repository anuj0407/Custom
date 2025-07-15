package hashSet;

class Set{
	int key;
	Set(int data){
		this.key = data;
	}
}

public class Hashset {
	Set obj = new Set(-1);
	static int size = -1;
	Set[] array;
	Hashset() {
		this.array = new Set[10];
		for(int i = 0;i<10;i++) {
			array[i] = obj;
		}
	}
	
	public void resize() {
		if(size > array.length) {
			Set[] newArr = new Set[array.length*2];
			for(int i = 0; i<array.length;i++) {
				newArr[i] = array[i];
			}
			for(int i = array.length;i<newArr.length;i++) {
				newArr[i] = obj;
			}
			array = newArr;
		}
	}
	
	public void add(int data) {
		Hashset set = new Hashset();
		if(!set.contains(data)) {
			Set obj = new Set(data);
			size++;
			resize();
			array[size] = obj;
		}
	}
	
	public boolean remove(int data) {
		boolean exist = false;
		for(int i = 0;i<array.length;i++) {
			if(array[i].key == data) {
				array[i] = obj;
				exist = true;
				break;
			}
		}
		if(exist) {
			Set[] newArr = new Set[size-1];
			int idx = 0;
			for(int i = 0;i<size;i++) {
				if(array[i].key != -1) {
					newArr[idx] = array[i];
					idx++;
				}
			}
			size--;
			return exist;
		}
		return exist;
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean contains(int data) {
		for(int i = 0;i<size;i++) {
			if(array[i].key == data) {
				return true;
			}
		}
		return false;
	}
	
	public void displayAll() {
		for(int i = 0;i<size;i++) {
			if(i != size-1) {
				System.out.print(array[i].key+" ");
			}
			else {
				System.out.print(array[i].key);
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Hashset set = new Hashset();
		set.add(1);
		set.add(5);
		set.add(34);
		set.add(5);//duplicate entry will not add by set
		System.out.println("Set contains:--");
		set.displayAll();
		System.out.println("34 removed : "+ set.remove(34));//remove element from set 
		System.out.println("34 exist ? "+set.contains(34));
		set.displayAll();
		
	}
	
}
