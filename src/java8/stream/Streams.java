package java8.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Streams {

	private enum Status {
		OPEN, CLOSED
	};

	private static final class Task {
		
		private final Status status;
		private final Integer points;

		Task(final Status status, final Integer points) {
			this.status = status;
			this.points = points;
		}

		public Integer getPoints() {
			return points;
		}

		public Status getStatus() {
			return status;
		}

		@Override
		public String toString() {
			return String.format("[%s, %d]", status, points);
		}
	}
	
	final static Collection< Task > tasks = Arrays.asList(
			new Task( Status.OPEN, 5 ),
			new Task( Status.OPEN, 13 ),
			new Task( Status.CLOSED, 8 )
	);
	
	public static void main(String[] args) {
		
		// Calculate total points of all active tasks using sum()
		final long totalPointsOfOpenTasks = tasks
				.stream()
				.filter( task -> task.getStatus() == Status.OPEN )
				.mapToInt(Task::getPoints)
				.sum();
		System.out.println( "Total points: " + totalPointsOfOpenTasks );
		
		
		// calculate total points of all tasks
		final double totalPoints = tasks
					 			   .stream()
					 			   .parallel()
					 			   .map(task -> task.getPoints())
					 			   .reduce(0, Integer::sum);		
		System.out.println( "Total points (all tasks): " + totalPoints );
		
		
		// Group tasks by their status
		final Map<Status, List<Task>> map = tasks
											.stream()
											.collect(Collectors.groupingBy(Task::getStatus));
		System.out.println( map );
	}
}
