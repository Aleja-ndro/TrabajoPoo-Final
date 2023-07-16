package proyecto23047;
import java.util.Date;
import java.time.LocalDate;

public class Socios

{
	 private int id_socio;
	 private String nombre;
	 private String apellido;
	 private int dni;
	 private String mail;
	 private Boolean estado;
	 private LocalDate fecha_alta;
	 
	 public Socios(int id, String nombre, String apellido, int dni, String mail, Boolean estado,LocalDate fecha_alta)
	 {
		 this.id_socio=id;
		 this.setId_socio(id);
		 this.setNombre(nombre);
		 this.setApellido(apellido);
		 this.setDni(dni);
		 this.setMail(mail);
		 this.setEstado(estado);
		 this.setFecha_alta(fecha_alta);
		 
				 
	 }
			 


	public int getId_socio() {
		return id_socio;
	}
	public void setId_socio(int id_socio) {
		this.id_socio = id_socio;
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
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	public LocalDate getFecha_alta() {
		return fecha_alta;
	}
	public void setFecha_alta(LocalDate fecha_alta) {
		this.fecha_alta = fecha_alta;
	}
	 
	 

}
