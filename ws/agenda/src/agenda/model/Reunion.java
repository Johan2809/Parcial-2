package agenda.model;
import java.util.ArrayList;

public class Reunion {
    private String descripcion;
    private String fecha;
    private ArrayList<Contacto> contactosAsistentes;

    public Reunion(String descripcion, String fecha) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.contactosAsistentes = new ArrayList<Contacto>();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Contacto> getContactosAsistentes() {
		return contactosAsistentes;
	}

	public void setContactosAsistentes(ArrayList<Contacto> contactosAsistentes) {
		this.contactosAsistentes = contactosAsistentes;
	}

	public void agregarContactoAsistente(Contacto contacto) {
        if (contactosAsistentes.size() >= 10) {
            System.out.println("No se pueden agregar m�s contactos a esta reuni�n.");
        }

        if (contactosAsistentes.contains(contacto)) {
            System.out.println("Este contacto ya est� en la lista de asistentes.");
        }

        contactosAsistentes.add(contacto);
        System.out.println("Contacto a�adido a la lista de asistentes.");
    }

    public void eliminarContactoAsistente(Contacto contacto) {
        if (contactosAsistentes.contains(contacto)) {
            contactosAsistentes.remove(contacto);
            System.out.println("Contacto eliminado de la lista de asistentes.");
        } else {
            System.out.println("Este contacto no est� en la lista de asistentes.");
        }
    }


}
