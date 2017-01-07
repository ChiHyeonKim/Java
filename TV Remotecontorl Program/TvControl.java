class Tv {
   private int channel;
   private int volume;
   final int MAX_VOLUME = 100; final int MIN_VOLUME = 0; final int MAX_CHANNEL = 100;      final int MIN_CHANNEL = 1;
   int prechannel[] = new int[2];	//이전채널을 저장하는 변수
   int count=0;	//채널이 바뀐걸 나타내주는 변수
   
   void setChannel(int n) { 
	   channel = n;
	   prechannel[count] = channel; //채널이 바뀔때마다 이전채널  배열에 저장
	   count++;	//바뀐 횟수 증가
	   } 
   int getChannel () {return channel;}
   void setVolume(int n) {volume = n;}
   int getVolume () {return volume;}
   void PrevChannel() {
	   channel = prechannel[count-2];	//현재 채널 값을 이전 채널이 저장되있는 배열값으로 변경
	   count++;
   }
}
class TvControl {
   public static void main(String args[]) {
      Tv mytv = new Tv();
mytv.setChannel(10); System.out.println("CH:" + mytv.getChannel());
mytv.setVolume(10); System.out.println("VOL:"+ mytv.getVolume());
mytv.setChannel(50); System.out.println("CH:" + mytv.getChannel());
mytv.setVolume(30); System.out.println("VOL:"+ mytv.getVolume());
mytv.PrevChannel(); System.out.println("CH:" + mytv.getChannel());
mytv.PrevChannel(); System.out.println("CH:" + mytv.getChannel());}
}