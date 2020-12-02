package filehandling;

public class BillBoard {
	private String songName;
	private int rating;
	private String artist;
	private String songWriter;
	public BillBoard(String songName, int rating, String artist, String songWriter) {
		super();
		this.songName = songName;
		this.rating = rating;
		this.artist = artist;
		this.songWriter = songWriter;
	}
	
	public BillBoard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getSongWriter() {
		return songWriter;
	}
	public void setSongWriter(String songWriter) {
		this.songWriter = songWriter;
	}
	@Override
	public String toString() {
//		//return "BillBoard [songName=" + songName + ", rating=" + rating + ", artist=" + artist + ", songWriter="
//				+ songWriter + "]";
		return "BillBoard: " + "name of song is : " + songName + ", rating is " + rating + ", artist is " + artist + ", songWriter is "
		+ songWriter;
	}
	
	
}
