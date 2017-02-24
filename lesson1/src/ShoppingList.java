

import java.io.*;

public class ShoppingList {
	String[] items;
	int[] prices;
	public ShoppingList(){
		//TODO read prices.txt
	}
	private void buy(String[] list) {
		//TODO Calculate and display total price of the items in the list
		System.out.println("total price:");
	}	

	public static void main(String[] args){
		ShoppingList shoppingList=new ShoppingList();
		String[] list = {"pen","pencil","cartridge"};
		shoppingList.buy(list);
	}
	
}
