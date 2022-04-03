package classroom;

public enum Tipo {
	DISCIPLINAR(10,"Disciplinar"),FUNDAMENTACION(20,"Fundamentacion"),ELECTIVA(30,"Electiva");
	
	private int codigo;
	private String nombre;
	private Tipo(int codigo,String nombre) {
		this.setCodigo(codigo);
		this.setNombre(nombre);
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
