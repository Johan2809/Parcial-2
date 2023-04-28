package agenda.model;

public class Nota {
	private String codigo;
	private String fecha;
	private String comentarios;


	public Nota(String codigo, String fecha, String comentarios, CategoriaNotas categoriaNotas) {
		super();
		this.codigo = codigo;
		this.fecha = fecha;
		this.comentarios = comentarios;
		this.categoriaNotas = categoriaNotas;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	public CategoriaNotas getCategoriaNotas() {
		return categoriaNotas;
	}
	public void setCategoriaNotas(CategoriaNotas categoriaNotas) {
		this.categoriaNotas = categoriaNotas;
	}
	private CategoriaNotas categoriaNotas;


}
