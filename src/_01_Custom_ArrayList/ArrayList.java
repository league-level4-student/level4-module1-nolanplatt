package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	//Object[] array = new Object[10];
	Object[] array = (Object[]) new Object[10];

	public ArrayList() {

	}
	
	public Object get(int loc) throws IndexOutOfBoundsException {
		for (int i = 0; i < array.length; i++) {
			if(i == loc) {
				return array[i];
			}
		}
		return null;
	}
	
	public void add(T val) {
		Object[] newArray = new Object[array.length + 1];
		for (int i = 0; i < array.length; i++) {
			if(i == 10) {
				newArray[i] = val;
			}
			else {
			newArray[i] = array[i];
			}
		}
		for (int i = 0; i < array.length; i++) {
			array[i] = newArray[i];
		}
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		
	}
	
	public boolean contains(T val) {
		
		return false;
	}
}