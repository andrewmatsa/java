package main;

public class Main {
	final static int N = 5;

	private String artist;
	private String nameOfSound;
	private double duration;
	private int year;
	
	static int count = 0;
	
	protected Main() {
		count++;
	}
	
	protected Main(String artist, String nameOfSound, double duration, int year) {
		count++;
		this.artist = artist;
		this.nameOfSound = nameOfSound;
		this.duration = duration;
		this.year = year;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getNameOfSound() {
		return nameOfSound;
	}

	public void setNameOfSound(String nameOfSound) {
		this.nameOfSound = nameOfSound;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	// methods
	public String getSongInfo() {
		return this.artist + " " + this.nameOfSound + " "
				+ Double.toString(this.duration) + " "
				+ Integer.toString(this.year);
	}

	public boolean isNew() {
		return (this.year > 2008 && this.duration > 4.0) ? true : false;
	}

	public double getSomeNum() {
		return this.duration + this.year;
	}

	//static method
	public static void test() {
		System.out.println("static");
	}
	
	public static void test(String someStr) {
		System.out.println("static" + someStr);
	}

	public void testNotFinal() {
		System.out.println("finalNotMethod");
	}

	public final void testFinal() {
		System.out.println("finalMethod");
	}
	
	public static void main(String[] args) {
		Program42 child = new Program42();
		Main p = new Main("Lana dell ray", "Cola", 4.33, 2013);
		System.out.println(p.getSongInfo());

		Main[] pArr = new Main[N];
		for (int i = 0; i < pArr.length; i++) {
			pArr[i] = new Main();
			pArr[i].duration = i + 0.5;
			pArr[i].year = i + 2000;
			System.out.println(pArr[i].getSomeNum());
		}
				
		System.out.println("Count of objects: " + Main.count);
		
		if (p.isNew()) {
			System.out.println("new");

		} else {
			System.out.println("this song is old " + p.getNameOfSound());
		}
		System.out.println(p.getSomeNum());
		test();
		Main.test(" test overloading");
		
		System.out.println(Math.abs(-100));

		System.out.println("\t***");
		p.testFinal();
		p.testNotFinal();
		child.testFinal();
		child.testNotFinal();
		Program42.test();

		System.out.println("\t***");
		Real ro = new Real();
		ro.doIt();
		ro.doElse();
		ro.doJob();
		
		System.out.println("\t***");
		Albom a = new Albom();
		a.music = "Trance";
		a.title = "Tiesto";
		a.showTitle();
		a.showTitle("Rap");

		// Create object which implements 2 interfaces. The last sentence.
		System.out.println("\t***");
		Music m = new Music("Tiesto", "Super mega album");
		m.showName();
		m.showTitle();
		m.showTitle("Rap");
	}
	
}
