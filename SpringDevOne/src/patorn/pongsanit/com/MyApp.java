package patorn.pongsanit.com;

public class MyApp {
	public static void main(String[] args){
		Coach golfCoach = new FootballCoach();
		System.out.println(golfCoach.getDailyRoutine());
	}
}
