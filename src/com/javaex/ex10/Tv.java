package com.javaex.ex10;

public class Tv {
	
	private int channel;
	private int volume;
	private boolean power;
	
	//생성자
	public Tv() {
		
	}
	public Tv(int channel, int volume, boolean power) {
		this.channel=channel;
		this.volume=volume;
		this.power=power;
	}
	
	//게터
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public boolean isPower() {
		return power;
	}
	
	
	
	//일반
	public int volume(int volume) {
		if(volume<0) {
			volume=0;
		}else if(volume>100) {
			volume=100;
		}
		return this.volume=volume;
	}
	
	public int volume(boolean up) {
		if(up==true&&volume<=99) {
			volume=volume+1;

		}else if(up==false&&volume>=1)	{
			volume=volume-1;
		}
		return this.volume;
	}
	
	public int channel(int channel) {
		if(channel<0) {
			channel=0;
		}else if(channel>255) {
			channel=255;
		}
		return this.channel=channel;
	}
	
	public int channel(boolean up) {
		if(up==true&&channel<=254) {
			channel=channel+1;

		}else if(up==false&&channel>=1)	{
			channel=channel-1;
		}
		return this.channel;
	}
	
	public boolean power(boolean power) {
		if(power==true) {
			return this.power=power;
		}else {
			return this.power=power;
		}
		
	}
	
	
	public void status() {
		System.out.println("채널:"+channel+" \t볼륨:"+volume+" \t파워:"+power);
	}
	
}
