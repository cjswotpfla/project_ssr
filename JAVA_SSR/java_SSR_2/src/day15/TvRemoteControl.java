package day15;
//RemoteControl 인터페이스를 구현한 TvRemoteControl 구현 클래스
public class TvRemoteControl implements RemoteControl {
	
	private boolean power;
	private int channel;
	private final int MAX_CHANNER = 999;
	@Override
	public void powerOn() {power=true;}
	@Override
	public void powerOff() {power=false;}
	
	public void channelUp() {
		if(!power) {
			return;
		}
		channel++;
		if(channel>MAX_CHANNER) {
			channel = 1;
		}
	}
	public void channelDown() {
		if(!power) {
			return;
		}
		channel--;
		if(channel<1) {
			channel=MAX_CHANNER;
		}
	}
	public void setChannel(int channel) {
		if(!power) {
			return;
		}
		this.channel = channel;
		if(channel<1||channel>MAX_CHANNER) {
			channel=MAX_CHANNER;
		}
	}
}
