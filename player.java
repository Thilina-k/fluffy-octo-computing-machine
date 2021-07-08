package sample;

import java.util.Scanner;

public class player {
    String name;
    int age;
    String type;
    int runsScored;
    int wicketsTaken;
	
	static int bestPerformance = 0;
	static String bestName = "";
	static int bestRuns = 0;
	static int bestWickets = 0;
	
    Scanner myScanner = new Scanner(System.in);

    public player(String name,int age,String type,int runsScored,int wicketsTaken){
		 this.name = name;
		 this.age = age;
		 this.type = type;
		 this.runsScored = runsScored;
		 this.wicketsTaken = wicketsTaken;
		 
		 int temp = runsScored + wicketsTaken;
		 if (temp > this.bestPerformance){
			this.bestPerformance = temp;
			this.bestName = name;
			this.bestRuns = runsScored;
			this.bestWickets = wicketsTaken;
		 }
    }
	
	
	public void getBestPerformance(){
		System.out.println("Best Player               : "+bestName);
		System.out.println("Best Player Runs Scored   : "+bestRuns);
		System.out.println("Best Player Wickets Taken : "+bestWickets);
	}
	

    public void getPlayerType(){
        System.out.println("Player type is: "+type);
    }

    public void  getBattingAvg(){
        double battingAvg = this.runsScored/15;
        System.out.println("Batsman average is : "+battingAvg);
    }

    public void getPlayerDetails(){
        System.out.println("Player name            :"+this.name);
        System.out.println("Player age             :"+this.age);
        System.out.println("Player type            :"+this.type);
        System.out.println("Player runs scored     :"+this.runsScored);
        System.out.println("Player wickets taken   :"+this.wicketsTaken);
    }
	
    public static void main(String[]args){
            player Perera = new player("perera",25,"batsman",165,0);
            Perera.getPlayerType();
            Perera.getBattingAvg();
            Perera.getPlayerDetails();
			Perera.getBestPerformance();

    }
}