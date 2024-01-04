package com.javaex.ex08;

public class Song {
	
	String title;
	String artist;
	String album;
	String composer;
	private int year;
	private int track;
	
	public Song() {
		System.out.println("Song");
	}
	public Song(String title, String artist) {
		this.title=title;
		this.artist=artist;
		System.out.println("Song(title, artist)");
	}
	public Song(String title, String artist, String album, String composer) {
		this(title, artist);
		this.album=album;
		this.composer=composer;
		System.out.println("Song(String title, String artist, String album, String composer)");
	}
	public Song(String title, String artist, String album, String composer, int year, int track) {
		this(title, artist, album, composer);
		this.year=year;
		this.track=track;
		System.out.println("Song(String title, String artist, String album, String composer, int year, int track)");
	}
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}




	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}
	
	
	
	
	
}
