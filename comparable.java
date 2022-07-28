package Day7;
import lombok.Getter;
import lombok.Setter;
import java.io.*;
import java.util.*;


public class comparable {
	public static void main(String[] args) {
		rating r1 = new rating("movie1", 5);
		rating r2 = new rating("movie2", 2);
		
		List<rating> movies = new ArrayList<>();
		movies.add(r1);
		movies.add(r2);
		System.out.println("Before sorting: ");
		for (rating r: movies) {
			System.out.println(r.getName()+" "+r.getRated());
		}
		
		Collections.sort(movies);
		System.out.println("After sorting: ");
		for (rating r: movies) {
			System.out.println(r.getName()+" "+r.getRated());
		}
		
		player p1 = new player("John", 33);
		player p2 = new player("Zach", 27);
		
		List<player> players = new ArrayList<>();
		players.add(p1);
		players.add(p2);
		System.out.println("Before sorting: ");
		for (player p: players) {
			System.out.println(p.getName()+" "+p.getAge());
		}
		
		playerAgeComparator playerAge = new playerAgeComparator();
		Collections.sort(players, playerAge);
		System.out.println("After sorting:");
		for (player p: players) {
			System.out.println(p.getName()+" "+p.getAge());
		}
		
	}
}


@Getter
@Setter
class rating implements Comparable<rating>{
	private int rated;
	private String name;
	
	@Override
	public int compareTo(rating r) {
		return Integer.compare(getRated(), r.getRated());
	}
	public rating(String n,int i) {
		name = n;
		rated = i;
	}
}

@Getter
@Setter
class player implements Comparator<player>{
	private String name;
	private int age;
	
	@Override 
	public int compare(player p1, player p2) {
		return Integer.compare(p1.getAge(), p2.getAge());
	}
	player(String n, int i){
		name = n;
		age = i;
	}
}



