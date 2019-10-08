package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	//Object[] array = new Object[10];
	Object[] array = (Object[]) new Object[0];

	/*
	public ArrayList() {
		
	}
	*/
	
	public T get(int loc) throws IndexOutOfBoundsException {
		for (int i = 0; i < array.length; i++) {
			if(i == loc) {
		        T castedObject = (T)array[i];
		        System.out.println(castedObject);
				return castedObject;
			}
		}
		return null;
	}
	
	public void add(T val) {
		Object[] newArray = new Object[array.length + 1];
		for (int i = 0; i < array.length; i++) {
			newArray[i] = (T)array[i];
			System.out.println(newArray[i]);

		}
		newArray[newArray.length - 1] = val;
		array = newArray;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		Object[] newArray = new Object[array.length + 1];
		for (int i = 0; i < array.length; i++) {
			if(i == loc) {
				newArray[i] = val;
			}
			else {
			newArray[i] = (T)array[i];
			}

		}
		array = newArray;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		Object[] newArray = new Object[array.length + 1];
		for (int i = 0; i < array.length; i++) {
			if(i == loc) {
				newArray[i] = val;
			}
			else {
			newArray[i] = (T)array[i];
			}

		}
		array = newArray;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		Object[] newArray = new Object[array.length - 1];
		for (int i = 0; i < array.length; i++) {
			newArray[i] = (T)array[i];
			System.out.println(newArray[i]);

		}
		newArray[newArray.length - 1] = val;
		array = newArray;
	
	}
	
	public boolean contains(T val) {
		
		return false;
	}
}