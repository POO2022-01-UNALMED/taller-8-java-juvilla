package futbol;

public class Portero extends Futbolista {
	public short golesRecibidos;
	public byte dorsal;
	
	//constructor
	
	public Portero() {
		super("Toromax",69,"Portero");
		this.golesRecibidos=0;
		this.dorsal=1;
	}
	
	//metodos
	public boolean jugarConLasManos() {
		return true;
	}
	
	@Override
	public String toString() {
		return "El futbolista " + this.getNombre() + " tiene " + this.getEdad() + ", y juega de "+ this.getPosicion() + " con el dorsal " + dorsal + ". Le han marcado "+ golesRecibidos;
	}

	@Override
	public int compareTo(Futbolista f) {
		Portero a=(Portero) f;
		return Math.abs(this.golesRecibidos-a.golesRecibidos);
	}
	
}
