
public class Noeud {
	private Noeud fg;
	private Noeud fd;
	private int value;
	
	public Noeud(Noeud fg, Noeud fd) {
		this.fg = fg;
		this.fd = fd;
	}
}
