package Store;

import java.text.DecimalFormat;

public class Order {
	static double goodsPrice;

	public static void Purchase() {
		Goods[] goods = new Goods[20];
		Customer customer[] = new Customer[20];
		double[] GoodsPrice = new double[20];
		for (int i = 0; i < goods.length; i++) {
			goods[i] = ProStroyStore.generate();
			customer[i] = ProStroyStore.generatenames();
			GoodsPrice[i] = ProStroyStore.generateprice();

			System.out.println(" Покупатель:  " + customer[i].names);
			DecimalFormat df1 = new DecimalFormat("#.##");
			System.out.println("  Заказанный товар:  " + goods[i].name + " Стоимость: " + (df1.format(GoodsPrice[i])));

		

		Goods[] dopgoods = new Goods[20];
		double[] dopgoodsPrice = new double[20];
		//double[] goodsPrice = new double[20];
		for (int j = 0; j < dopgoods.length; j++) {
			// dopgoods[j] = ProStroyStore.generate();
		//	goodsPrice[i] = ProStroyStore.generateprice();
			dopgoodsPrice[j] = ProStroyStore.generateprice();
			if (dopgoodsPrice[j] < GoodsPrice[i]) {
				dopgoods[j] = ProStroyStore.generate();
				//dopgoodsPrice[j] = ProStroyStore.generateprice();

				DecimalFormat df = new DecimalFormat("#.##");
				System.out.println(
						"Дополнительное предложение: " + dopgoods[j].name + " " + (df.format(dopgoodsPrice[j])));

			}
		}
		}
	}
}
