package com.lqas.oop;

public class OOPTutorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TeamM t1 = new TeamM("fc karpaty lviv", 12);
		TeamM t2 = new TeamM ("fc barcelona");
		TeamM t3 = new TeamM();
		
		t1.setTeamName("fc Borussia Dortmund");
		String nameOfT2 = t2.getTeamName();
		
		
	}

	static double degrees(double a){
		return a + 2;
	}

}
