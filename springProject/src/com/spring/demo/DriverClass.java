package com.spring.demo;

public class DriverClass {
	

	public static void binarySearch(int[] array, int key, int first, int last){
		
		int mid = (first + last)/2; //1
		while (first<= last){
			
			
			if(array[mid]<key){
				first = mid +1; //5
			}
				else if(array[mid]==key){
					System.out.println(key +"is at index" +mid);
					break;
			}else {
				last = mid-1;
			}
			mid = (first + last)/2;
			
		}
		if(first>last){
			System.out.println("element is not found");
		}
		
	}
	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5,6,7};
		
		int key = 2;
		int first = 0;
		int last = array.length-1; //6
		binarySearch(array,key, first,last);
		}
		
	}


