package agenda.model;


public class Contacto {
	private String nombre;
	private String alias;
	private String direccion;
	private String telefono;
	private String email;

	public Grupo[] listaGrupos;
	private Reunion[] listaReuniones;

	public Contacto() {
		super();
	}

	public Contacto(String nombre, String alias, String direccion, String telefono, String email, int numeroGrupos,
			int numeroReuniones) {
		super();
		this.nombre = nombre;
		this.alias = alias;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
		this.listaGrupos = new Grupo[numeroGrupos];
		this.listaReuniones = new Reunion[numeroReuniones];
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Grupo[] getListaGrupos() {
		return listaGrupos;
	}

	public void setListaGrupos(Grupo[] listaGrupos) {
		this.listaGrupos = listaGrupos;
	}

	public Reunion[] getListaReuniones() {
		return listaReuniones;
	}

	public void setListaReuniones(Reunion[] listaReuniones) {
		this.listaReuniones = listaReuniones;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contacto other = (Contacto) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (telefono == null) {
			if (other.telefono != null)
				return false;
		} else if (!telefono.equals(other.telefono))
			return false;
		return true;
	}

	public void agregarGrupo(Grupo grupo) {
		// Verificar si el grupo ya existe en la lista
		for (int i = 0; i < listaGrupos.length; i++) {
			if (listaGrupos[i] != null && listaGrupos[i].equals(grupo)) {
				System.out.println("El grupo ya existe en la lista");
				return;
			}
		}
		// Buscar un espacio vac�o en la lista de grupos
		for (int i = 0; i < listaGrupos.length; i++) {
			if (listaGrupos[i] == null) {
				listaGrupos[i] = grupo;
				System.out.println("Grupo agregado con �xito");
				return;
			}
		}
		System.out.println("No hay espacio para agregar m�s grupos");
	}

	public String toString() {
		return "Nombre: " + nombre + "\nAlias: " + alias + "\nDirecci�n: " + direccion + "\nTel�fono: " + telefono
				+ "\nEmail: " + email;
	}

}