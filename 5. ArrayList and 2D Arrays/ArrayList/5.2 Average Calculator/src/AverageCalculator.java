import java.util.ArrayList;

public class AverageCalculator {
    public static double getAverageOf(ArrayList<Integer> numbers) {
		double average = 0;
		for (int index = 0; index < numbers.size(); index++) {
			average = average + numbers.get(index);
		}
		return (average / numbers.size());
    }
}