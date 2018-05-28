package pattern.builder;

public class App {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		MealBuilder mealBuilder = new MealBuilder();

		Meal vegMeal = mealBuilder.prepareVegMeal();
		vegMeal.showItems();
		System.out.println(vegMeal.getCost());

		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		nonVegMeal.showItems();
		System.out.println(nonVegMeal.getCost());

		/* Builder */
		BankAccount bankAccount = new BankAccount.BankAccountBuilder("giaduc", "oo24u8sf")
				.withEmail("lgduc1913@gmail.com").withNewsLetter(true).build();

		System.out.println(bankAccount.toString());
	}

}
