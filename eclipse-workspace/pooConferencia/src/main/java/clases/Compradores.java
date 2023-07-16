package clases;

public class Compradores 
{
	private int id;
	private String nombre;
	private String apellido;
	private String mail;
	private int canTickets;
	
	


	public Compradores(int id, String nombre, String apellido, String mail, int canTickets) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.canTickets = canTickets;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public int getCanTickets() {
		return canTickets;
	}


	public void setCanTickets(int canTickets) {
		this.canTickets = canTickets;
	}
	
	
	
	
}
