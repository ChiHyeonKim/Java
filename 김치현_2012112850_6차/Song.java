
public class Song {
	String title;	//�뷡 ���� ����
	
	public Song(String a){	//�Ű������� �ϳ��� Song ������
		this.title = a;
	}
	
	public String getTitle(){	//title�� ��ȯ�ϴ� getTitle �Լ�
		return this.title;
	}

	public static void main(String[] args) {
		Song mySong = new Song("Let it go");
		Song yourSong = new Song("������Ÿ��");
		System.out.println("�� �뷡�� " + mySong.getTitle());
		System.out.println("�� �뷡�� " + yourSong.getTitle());
	}

}
