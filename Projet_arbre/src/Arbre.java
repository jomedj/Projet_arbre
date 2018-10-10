
public class Arbre {
	private ArrayList<Noeud> noeuds;
	
	public Arbre() {
		this.noeuds= new ArrayList<Noeud>();
	}
	
	public boolean contains(int v) {
		for(Noeud n : noeuds) {
			if(n.getValue) {
				return true;
			}
		}
		return false;
	}
	public ArrayList<Noeud> getNoeuds(){
		return Noeuds;
	}
}
