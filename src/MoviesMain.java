import java.util.Scanner;
public class MoviesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Movies Movie1 = new Movies("Insidious 3", "Horror", 5);
Movies Movie2 = new Movies("Captain UnderPants", "Family", 5);
Movies Movie3 = new Movies("The Human Centipede", "Horror", 2);
Movies Movie4 = new Movies("The Wedding Ringer", "Comedy", 5);
Movies Movie5 = new Movies("Jumanji: Welcome to the Jungle", "Comedy", 5);

Scanner scanner = new Scanner(System.in);
System.out.println("Do you want to search movies by genre or rating?");
String gor = scanner.nextLine();

if(gor.equals("genre")){
	System.out.println("What genre?");
	String g = scanner.nextLine();

if(g.equals("action")){
System.out.print("We do not have this genre");
	}
if(g.equals("comedy")){
	System.out.println(Movie4.Name + " , " + Movie5.Name);
}

if(g.equals("horror")){
	System.out.println(Movie1.Name + " , " + Movie3.Name);
}

if(g.equals("family")){
	System.out.println(Movie2.Name);
}

}
if(gor.equals("rating")){
	System.out.println("What rating 1-5?");
	int r = scanner.nextInt();
	if (r ==2){
		System.out.println(Movie3.Name);
	}
	
	if(r == 5){
		System.out.println(Movie1.Name + "," + Movie2.Name + "," + Movie4.Name + "," + Movie5.Name);
	}
	
	
}
	
	}	
}