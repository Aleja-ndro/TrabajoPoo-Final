package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConferenciaDAO 
{
	Connection conexion=null;
	
	public ConferenciaDAO() throws ClassNotFoundException
	{
		Conexion con = new Conexion();
		conexion=con.getConnection();
		
		}
	public List<Oradores> listarOradores()
	{
		PreparedStatement ps;
		ResultSet rs;
		List<Oradores>lista = new ArrayList<Oradores>();
		try 
		{
			ps=conexion.prepareStatement("select * from oradores");
			rs=ps.executeQuery();
			while (rs.next())
			{
				int id=rs.getInt("id_oradores");
				String nombre=rs.getString("nombre");
				String apellido=rs.getString("apellido");
				String mail=rs.getString("mail");
				int telefono=rs.getInt("telefono");
				
				Oradores oradores=new Oradores(id,nombre,apellido,mail,telefono);
				lista.add(oradores);
				
				
			}
			
			return lista;
		} 
		catch (SQLException e) {
			System.err.println(e);		}
			return null;
		
		}
	
	public List<Compradores> listarCompradores()
	{
		PreparedStatement ps;
		ResultSet rs;
		List<Compradores>lista = new ArrayList<Compradores>();
		try 
		{
			ps=conexion.prepareStatement("select * from compradores");
			rs=ps.executeQuery();
			while (rs.next())
			{
				int id=rs.getInt("id_compradores");
				String nombre=rs.getString("nombre");
				String apellido=rs.getString("apellido");
				String mail=rs.getString("mail");
				int canTickets=rs.getInt("canTickets");
				
				Compradores compradores=new Compradores (id,nombre,apellido,mail,canTickets);
				lista.add(compradores);
				
				
			}
			
			return lista;
		} 
		catch (SQLException e) {
			System.err.println(e);	
			}
			return null;
	}
	
	public boolean agregarOrador(Oradores oradores) 
	{
		PreparedStatement ps;
	
		try 
		{
			ps=conexion.prepareStatement("insert into oradores(nombre,apellido,mail,telefono)values(?,?,?,?,?)");
			ps.setString(1,oradores.getNombre());
			ps.setString(2,oradores.getApellido());
			ps.setString(3,oradores.getMail());
			ps.setInt(4,oradores.getTelefono());
			ps.execute();
			
			return true;
		 		
		}
		
		catch (SQLException e) 
		{System.err.println(e);
		return false;
			
		}
		
	public boolean agregarCompradores(Compradores comprador) 
	{
		PreparedStatement ps;
		try 
		{
			ps=conexion.prepareStatement("insert into compradores(nombre,apellido,mail,canTickets)values(?,?,?,?)");
			ps.setString(1,comprador.getNombre());
			ps.setString(2,comprador.getApellido());
			ps.setString(3, comprador.getMail());
			ps.setInt(4, comprador.getCanTickets());
			ps.execute();
			return true;
			
		} 
		catch (SQLException e)
		{
			System.out.println(e);
			return false;
		}
		
		
		
	}


}
