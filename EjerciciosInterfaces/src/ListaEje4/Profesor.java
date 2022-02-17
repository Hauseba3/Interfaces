package ListaEje4;

import java.util.Objects;

public class Profesor {
	
	private double salario;
	private String nombre;
	private String dni;
	private boolean fijo;
	
	public void profesor() {
		this.nombre="";
		this.dni="";
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public boolean isFijo() {
		return fijo;
	}
	public void setFijo(boolean fijo) {
		this.fijo = fijo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profesor other = (Profesor) obj;
		return Objects.equals(dni, other.dni);
	}

	@Override
	public String toString() {
		return "Profesor [salario=" + salario + ", nombre=" + nombre + ", dni=" + dni + ", fijo=" + fijo + "]";
	}
	
	
	
	

}
