package com.syntax.class10;

public class AllFrom2DArray {

	public static void main(String[] args) {
		String[][] food= {
				{"redbull", "burger","steak", "fries"}, //0
				{"curry", "biriyani", "butter chicken"}, //1
				{"noodles", "pad thai", "ton yum"}, //2
				{"pizza", "pasta"} //3
		}; 
		
		for (int row=0; row<food.length; row++ ) {
			for (int dish=0; dish<food[row].length; dish++) {
				System.out.print(food[row][dish]+" ");
			}
		}
		
		System.out.println("   ALL VALUES FROM 2D ARRAY USING FOR EACH LOOP     ");
		for (String[] cuisine:food) {
			for (String f:cuisine) {
				System.out.println(f+" ");
			}
		}

	}

}
