public class JvmComprehension {

	// Система ClassLoader-ов подгружает класс JvmComprehension
	// Информация о классе JvmComprehension хранится в MetaSpace

	public static void main(String[] args) { // - В Стеке (Stack Memory) создается фрейм main()
		int i = 1; // 1 - В Стеке (Stack Memory) в фрейме main() создается переменная i
					// примитивного типа int и присваивается 1
		Object o = new Object(); // 2 - в Куче (Heap) создается объект Object, в стеке создается ссылка "o" на
									// объект в куче
		Integer ii = 2; // 3 - в Куче (Heap) создается объект Integer со значением 2, в стеке в фрейме
						// main() создается ссылка "ii" на объект в куче
		printAll(o, i, ii); // 4 - В Стеке (Stack Memory) создается фрейм printAll(), в который передается
							// ссылка "o" на объект Object в куче, передается переменная i, передается
							// ссылка "ii" на объект Integer в куче (heap)
		System.out.println("finished"); // 7 - В Стеке (Stack Memory) в фрейм println() передается ссылка на объект типа
										// String со значением "finished", созданный в Куче (Heap)
	}

	// Отрабатывает сборщик мусора Garbage Collector, по ходу выполнения программы.

	private static void printAll(Object o, int i, Integer ii) {
		Integer uselessVar = 700; // 5 - В Куче (Heap) создается объект Integer со значением 700,
		System.out.println(o.toString() + i + ii); // 6 - В Стеке (Stack Memory) создается фрейм println(), куда
													// передаются ссылки "o" на Object в Куче (Heap), "i" на int во
													// фрейме main() в Стеке (Stack Memory), "ii" на Integer в Куче
													// (Heap). В Стеке (Stack Memory) создается фрейм toString()
	}
}
