package futbol;

public class Portero extends Futbolista {
	public short golesRecibidos;
	public byte dorsal;
	
	//constructor
	
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre,edad,"Portero");
		this.golesRecibidos=golesRecibidos;
		this.dorsal=dorsal;
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
	public int compareTo(Object f) {
		Portero a=(Portero) f;
		return Math.abs(this.golesRecibidos-a.golesRecibidos);
	}
	}
