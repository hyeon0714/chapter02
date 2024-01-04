package com.javaex.ex05;

public class SongApp {
	
	//객체(인스턴스)
	public static void main(String[] args) {
		
		Song a = new Song();
		Song b = new Song();
		Song c = new Song();
		
		
		//a=아이유
		a.setTitle("좋은날");
		a.setArtist("아이유");
		a.setAlbum("Real");
		a.setComposer("이민수 작곡");
		a.setYear(2010);
		a.setTrack("3번 Track");
		
		
		//b=빅뱅
		b.setTitle("거짓말");
		b.setArtist("BIGBANG");
		b.setAlbum("Always");
		b.setComposer("G-DRAGON 작곡");
		b.setYear(2007);
		b.setTrack("2번 Track");
		
		
		//c=버스커버스커
		c.setTitle("벚꽃엔딩");
		c.setArtist("버스커버스커");
		c.setAlbum("버스커버스커 1집");
		c.setComposer("장범준 작곡");
		c.setYear(2012);
		c.setTrack("4번 Track");
		
		//일반 메소드
		a.showInfo();
		b.showInfo();
		c.showInfo();
		
		System.out.println();
		
		//toString출력
		System.out.println(a.toString());
	}
}
