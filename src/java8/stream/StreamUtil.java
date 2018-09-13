package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Stream represents a sequence of objects from a source, which supports aggregate operations. 
 * Following are the characteristics of a Stream −

		Sequence of elements − A stream provides a set of elements of specific type in a sequential 
							  manner. A stream gets/computes elements on demand. 
							  It never stores the elements.

		Source − Stream takes Collections, Arrays, or I/O resources as input source.

		Aggregate operations − Stream supports aggregate operations like filter, map, limit, reduce,
		 					   find, match, and so on.

		Pipelining − Most of the stream operations return stream itself so that their result 
					 can be pipelined. These operations are called intermediate operations 
					 and their function is to take input, process them, and return output 
					 to the target. collect() method is a terminal operation which is normally 
					 present at the end of the pipelining operation to mark the end of the stream.

		Automatic iterations − Stream operations do the iterations internally over the source 
							   elements provided, in contrast to Collections where explicit iteration 
							   is required.
							   
	With Java 8, Collection interface has two methods to generate a Stream.
		stream() 		 − Returns a sequential stream considering collection as its source.
		parallelStream() − Returns a parallel Stream considering collection as its source.
 */
public class StreamUtil {

	public void criarStream() {
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		
		System.out.println(filtered);
	}
}
