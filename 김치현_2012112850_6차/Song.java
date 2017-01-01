
public class Song {
	String title;	//노래 제목 변수
	
	public Song(String a){	//매개변수가 하나인 Song 생성자
		this.title = a;
	}
	
	public String getTitle(){	//title을 반환하는 getTitle 함수
		return this.title;
	}

	public static void main(String[] args) {
		Song mySong = new Song("Let it go");
		Song yourSong = new Song("강남스타일");
		System.out.println("내 노래는 " + mySong.getTitle());
		System.out.println("내 노래는 " + yourSong.getTitle());
	}

}
