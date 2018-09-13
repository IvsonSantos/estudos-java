package java8.pararellstream;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 *  Operations on sequential streams are performed on a single thread while operations on parallel 
 *  streams are performed concurrent on multiple threads.
 */
public class TestaParallelStream {

	public static void main(String[] args) {
		
		// it is easy to increase the performance by using parallel streams.
		//First we create a large list of unique elements:

		int max = 1000000;
		List<String> values = new ArrayList<>(max);
		for (int i = 0; i < max; i++) {
		    UUID uuid = UUID.randomUUID();
		    values.add(uuid.toString());
		}
		
		
		//Sequential Sort
		long t0 = System.nanoTime();
		long count = values.stream().sorted().count();
		System.out.println(count);
		long t1 = System.nanoTime();
		long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
		System.out.println(String.format("sequential sort took: %d ms", millis));
		// sequential sort took: 1141 ms
		
		//Parallel Sort
		long t01 = System.nanoTime();
		long count1 = values.parallelStream().sorted().count();
		System.out.println(count1);
		long t11 = System.nanoTime();
		long millis1 = TimeUnit.NANOSECONDS.toMillis(t11 - t01);
		System.out.println(String.format("parallel sort took: %d ms", millis1));
		// parallel sort took: 539 ms (50% mais rapido)
	}
}
