package futbol;

public abstract class Futbolista implements Comparable<Futbolista>{
	private String nombre;
	private int edad;
	String posicion;
	
	//constructores
	
	public Futbolista(String nombre,int edad,String posicion) {
		this.nombre=nombre;
		this.edad=edad;
		this.posicion=posicion;
	}
	
	public Futbolista() {
		this("Maradona", 30, "delantero");
	}
	
	//metodos
	
	public String toString() {
	return "El futbolista " + nombre + " tiene " + edad + ", y juega de " + posicion;
	}
	
	public boolean equals(Futbolista f) {
		if (this.compareTo(f)==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//metodoabstracto 
	
	public abstract boolean jugarConLasManos();
	
	public abstract int compareTo(Futbolista f);
	 
	//metodos get y set
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad=edad;
	}
	
	public String getPosicion() {
		return posicion;
	}
	
	public void setPosicion(String posicion) {
		this.posicion=posicion;
	}
	
	public static void main(String Args[]) {
		
	}

}
