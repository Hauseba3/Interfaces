package ListaEje3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Persona {
	
		private String nombre;
		private String apellidos;
		private LocalDate fechaNac;
		private String dni;
		
		public Persona() {
			this.fechaNac=LocalDate.now();
			this.nombre="";
			this.apellidos="";
			this.dni="";
		}
		
		public Persona(String nombre, String apellidos, String dni) {
			this.nombre=nombre;
			this.apellidos=apellidos;
			this.dni=dni;
			this.fechaNac=LocalDate.now();
		}
		
		public void setNombre(String nombre) {
			this.nombre=nombre;
		}
		
		public String getNombre() {
			return this.nombre;
		}

		public String getApellidos() {
			return apellidos;
		}

		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}

		public LocalDate getFechaNac() {
			return fechaNac;
		}

		public void setFechaNac(LocalDate fechaNac) {
			this.fechaNac = fechaNac;
		}
		
		public void setFechaNac(int dia, int mes, int a�o) {
			this.fechaNac=LocalDate.of(a�o, mes, dia);
		}
		

		public long getEdad() {
			return this.fechaNac.until(LocalDate.now(),ChronoUnit.YEARS);
		}
		

		public String getDni() {
			return dni;
		}

		public void setDni(String dni) {
			this.dni = dni;
		}

		@Override
		public String toString() {
			return "Persona [nombre=" + nombre + ", apellidos=" + apellidos 
					+ ", Edad=" + getEdad() +", dni=" + dni+"]";
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
			if (obj instanceof String)
				dni.equals((String)obj);
			if (getClass() != obj.getClass())
				return false;
			Persona other = (Persona) obj;
			return Objects.equals(dni, other.dni);
		}

		
		
		
		
	}


