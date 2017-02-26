

import java.io.*;
import java.util.Scanner;

public class ShoppingList {
	String[] items;
	int[] prices;
	String Line [] = new String[6];
	String subLine [] = new String[6];
	int costs = 0;
	String CIS;
	public ShoppingList() {
		File sam = new File("prices.txt");
		try {
			Scanner sc= new Scanner(sam);
			int i;
			for( i =0;i<6;i++){
				 Line[i] =sc.nextLine();
				 //System.out.println(Line[i]);
			}
			}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	private void buy(String[] list) {
		int total=0;
		for(int x=0;x<3;x++){
		for(int i=0;i<6;i++){
			String item=Line[i].substring(0,Line[i].indexOf(","));			if(list[x].equals(item)){
				//System.out.println(list[x]);
				//System.out.println("total price:");
				CIS = Line[i].substring(Line[i].indexOf(",")+1);
				//System.out.println(CIS);
				costs = Integer.parseInt(CIS);
				total +=costs;
				
			}
		}
	}
		//TODO Calculate and display total price of the items in the list
		System.out.println("total price:"+total);
	}	

	private Object subStringLine(int i, Object indexOf) {
		// TODO Auto-generated method stub
		return null;
	}
	private Object indexOf(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	public static void main(String[] args){
		ShoppingList shoppingList=new ShoppingList();
		String[] list = {"pen","pencil","cartridge"};
		shoppingList.buy(list);
	}
	
}
