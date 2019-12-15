package Store;

import java.text.DecimalFormat;
import java.util.Random;

public class Customer {
	String names;
	String surnames;
	private static int numberoforders = 0;
	private static double averagecost = 0;

	public Customer() {
		this.names = names;
		this.surnames = surnames;
	}

	public static void AddOrder() {
		Goods[] goods = new Goods[20];
		for (int i = 0; i < goods.length; i++) {
			numberoforders++;
			double price = ProStroyStore.generateprice();
			averagecost += price;

		}
		System.out.println("���������� �������:  " + numberoforders);
		DecimalFormat df1 = new DecimalFormat("#.##");
		System.out.println("��������� �������:  " + (df1.format(averagecost)));
		double midleCost = averagecost / numberoforders;
		System.out.println("������� ��������� �������:  " + (df1.format(midleCost)));

	}
}
