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

	public static void Purchase() {
		Goods[] goods = new Goods[20];
		for (int i = 0; i < goods.length; i++) {
			numberoforders++;
			goods[i] = ProStroyStore.generate();
			double price = ProStroyStore.price;
			averagecost += price;

			System.out.println("������������ �������:  " + goods[i].name);
		}
		System.out.println("���������� �������:  " + numberoforders);
		DecimalFormat df1 = new DecimalFormat("#.##");
		System.out.println("��������� �������:  " + (df1.format(averagecost)));
		double midleCost = averagecost / numberoforders;
		System.out.println("������� ��������� �������:  " + (df1.format(midleCost)));

	}
}
