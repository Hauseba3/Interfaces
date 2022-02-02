/**
 * 
 */
package biblioteca;

import java.util.Objects;

/**
 * @author Jose
 *
 */
public class Libro {
	
	private String isbn;
	private String titulo;
	private String editorial;
	private int num_pags;
	private double precio;
	private double precioCd;
	
	public Libro(String isbn, String titulo, String editorial, int num_pags, double precio, double precioCd) {
		this.isbn=isbn;
		this.titulo=titulo;
		this.editorial=editorial;
		this.num_pags=num_pags;
		this.precio=precio;
		this.precioCd=precioCd;
	}
	
	public Libro() {
		this.isbn="";
		this.titulo="";
		this.editorial="";
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getNum_pags() {
		return num_pags;
	}

	public void setNum_pags(int num_pags) {
		this.num_pags = num_pags;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getPrecioCd() {
		return precioCd;
	}

	public void setPrecioCd(double precioCd) {
		this.precioCd = precioCd;
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(isbn, other.isbn);
	}

	@Override
	public String toString() {
		return "ISBN: " + isbn + "\n" + "Titulo: " + titulo + "\n" + "Editorial: " + editorial + "\n" + "NumPags: " + num_pags
				+ "\n" + "Precio: " + precio + "\n" + "PrecioCD: " + precioCd + "\n";
	}
	
	
	

}
