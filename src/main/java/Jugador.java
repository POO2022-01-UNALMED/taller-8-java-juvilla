package futbol;

public class Jugador extends Futbolista {
	public short golesMarcados;
	public byte dorsal;
	
	//constructores
	
	public Jugador(String nombre,int edad,String posicion,short golesMarcados,byte dorsal) {
		super(nombre,edad,posicion);
		this.golesMarcados=golesMarcados;
		this.dorsal=dorsal;
	}
	
	public Jugador() {
		super();
		this.golesMarcados=289;
		this.dorsal=7;
	}
	
	//metodos
	
	@Override
	public String toString() {
		return "El futbolista " + this.getNombre() + " tiene " + this.getEdad() + ", y juega de "+ this.getPosicion() + " con el dorsal " + dorsal + ". Ha marcado "+ golesMarcados;
	}
	
	public boolean jugarConLasManos() {
		return false;
	}
	
    @Override
	public int compareTo(Object f) {
    	Jugador a=(Jugador) f;
		return Math.abs(this.getEdad()-a.getEdad());
	}
	
}