
public class Player {
	
	String name;
	PlayingPiecee playingPiece;
	public Player(String name, PlayingPiecee playingPiece) {
		super();
		this.name = name;
		this.playingPiece = playingPiece;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PlayingPiecee getPlayingPiece() {
		return playingPiece;
	}
	public void setPlayingPiece(PlayingPiecee playingPiece) {
		this.playingPiece = playingPiece;
	}
	
	

}
