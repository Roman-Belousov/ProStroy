package Store;

import java.util.Random;
import java.text.DecimalFormat;

public class ProStroyStore {

	static String name[] = { "Молоток", "Топор", "Ножницы", "Ножовка", "Стеклорез", "Струбцина", "Штангенциркуль",
			"Стеклорез" };
	static String model[] = { "Fiscars", "Bosch", "Wurth", "3M", "Projanh", "Bohle" };
	static String names[] = { "Михаил", "Терентий", "Николай", "Назар", "Степан", "Сергей", "Роман" };
	static String surnames[] = { "Миронов", "Терешков", "Николайкин", "Никифоров", "Страпилкин", "Семкин", "Романов" };

	public static String fromArr(String arr[]) {
		Random random = new Random();
		return arr[random.nextInt(arr.length)];

	}

	public static Customer generatenames() {
		Customer customer = new Customer();
		Random random = new Random();
		customer.names = fromArr(names) + " " + fromArr(surnames);
		return customer;

	}

	public static Goods generate() {
		Goods goods = new Goods();
		Random random = new Random();
		goods.name = fromArr(name) + " " + fromArr(model);

		return goods;
	}

	public static double generateprice() {

		double price = Math.random() * 100;
		return price;
	}

	public static void main(String[] args) {
		Goods goods[] = new Goods[10];
		Customer customer[] = new Customer[10];
		double price[] = new double[10];
		for (int i = 0; i < goods.length; i++) {
			goods[i] = generate();
			price[i] = generateprice();
			DecimalFormat df = new DecimalFormat("#.##");
			System.out.println(goods[i].name + " " + " цена за 1 шт." + "  " + (df.format(price[i])) + " руб.");
			for (int j = 0; j < 5; j++) {
				goods[j] = generate();
				price[i] = generateprice();
				DecimalFormat df1 = new DecimalFormat("#.##");
				System.out.println("С этим товаром покупают  " + goods[j].name + " " + " цена за 1 шт." + "  "
						+ (df1.format(price[i])) + " руб.");
			}
		}
		for (int h = 0; h < customer.length; h++) {
			customer[h] = generatenames();
			// System.out.println("Постоянные покупатели: " + customer[h].names);
		}
		Order orderpurchase = new Order();
		orderpurchase.Purchase();

		Customer addorder = new Customer();
		addorder.AddOrder();

	}

}
