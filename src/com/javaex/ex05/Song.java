package com.javaex.ex05;

public class Song {
	
	//클래스
	//필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private String track;
	
	//세터 메소드
	public void setTitle(String title) {
		this.title=title;
	}
	public void setArtist(String artist) {
		this.artist=artist;
	}
	public void setAlbum(String album) {
		this.album=album;
	}
	public void setComposer(String composer) {
		this.composer=composer;
	}
	public void setYear(int year) {
		this.year=year;
	}
	public void setTrack(String track) {
		this.track=track;
	}
	
	//게터 메소드
	public String getTitle() {
		return this.title;
	}
	public String getArtist() {
		return this.artist;
	}
	public String getAlbum() {
		return this.album;
	}
	public String getComposer() {
		return this.composer;
	}
	public int getYear() {
		return this.year;
	}
	public String getTrack() {
		return this.track;
	}
	
	
	
	//일반 메소드
	public void showInfo() {
		System.out.println(this.artist+", "+this.title+" ( "+this.album+", "+this.year+", "+this.track+", "+this.composer+")");
	}
	
}
