package sample;

public class player {
    String name;
    int age;
    String type;
    int runsScored;
    int wicketsTaken;

    public player(String name,int age,String type,int runsScored,int wicketsTaken){

    }
	
	public double getBattingAvg(){
		double battingAvg = this.runsScored/15;
		return battingAvg;
	}
	
	public void getPlayerDetails(){
		System.out.println("Player name            :"+this.name);
		System.out.println("Player age             :"+this.age);
		System.out.println("Player type            :"+this.type);
		System.out.println("Player runs scored     :"+this.runsScored);
		System.out.println("Player wickets taken   :"+this.wicketsTaken);
	}
	
}
