class Tv {
   private int channel;
   private int volume;
   final int MAX_VOLUME = 100; final int MIN_VOLUME = 0; final int MAX_CHANNEL = 100;      final int MIN_CHANNEL = 1;
   int prechannel[] = new int[2];	//����ä���� �����ϴ� ����
   int count=0;	//ä���� �ٲ�� ��Ÿ���ִ� ����
   
   void setChannel(int n) { 
	   channel = n;
	   prechannel[count] = channel; //ä���� �ٲ𶧸��� ����ä��  �迭�� ����
	   count++;	//�ٲ� Ƚ�� ����
	   } 
   int getChannel () {return channel;}
   void setVolume(int n) {volume = n;}
   int getVolume () {return volume;}
   void PrevChannel() {
	   channel = prechannel[count-2];	//���� ä�� ���� ���� ä���� ������ִ� �迭������ ����
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