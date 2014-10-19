package main;

import others.IArtist;

public class Music implements IAlbom, IArtist {

	private String name, albom;
	
	Music(String name, String albom) {
		this.name = name;
		this.albom = albom;
	}
	
	public void showName() {
		System.out.println("Artist: " + name);
	}

	public void showTitle() {
		System.out.println("Albom: " + albom);
	}

	public void showTitle(String title) {
		System.out.println("Albom: " + title);
	}
}
