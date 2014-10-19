package com.lqas.oop;


public class TeamM {

	public String teamName;
	public int playersQuantity;
	
	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String name) {
		this.teamName = name;
	}

	public int getPlayersQuantity() {
		return playersQuantity;
	}

	public void setPlayersQuantity(int playersQuantity) {
		this.playersQuantity = playersQuantity;
	}

	public TeamM(String name, int playersQuantity) {
		this.teamName = name;
		this.playersQuantity = playersQuantity;
	}
	
	public TeamM(String name) {
		super();
		this.teamName = name;
	}
	
	int move(int a, int b){return 2;}
	int move(int b){return 2;}
	
	
	public TeamM() {
		// TODO Auto-generated constructor stub
	}

	static TeamM betterTeam(TeamM t1, TeamM t2){
		if(t1.teamName.contains("karpaty lviv")){
			return t1;
		}
		else return t2;
	}
	
	static String returnMonday(){
		return "Monday";
	}
	
}
