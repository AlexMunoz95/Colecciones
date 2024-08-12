package arraylist;
import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Arraylist {

	private static List<Product> productos;

	public static Product[] obtenerProductos() {
		Product[] productos = { new Product("H&M", "Gris", "Pay", "32L"), new Product("H&M", "Verde", "Pay", "32L"),
				new Product("Zara", "Gris", "Coco", "32L"), new Product("Lacoste", "Verde", "Crown", "32L"),
				new Product("Farm", "Azul", "Holos", "32L"), new Product("Ho!", "Gris", "Pay", "32L"),
				new Product("H&M", "Gris", "Pay", "32L"), new Product("H&M", "Gris", "Pay", "32L"),
				new Product("Lacoste", "Gris", "Pay", "32L") };

		return productos;
	}

	public static void main(String[] args) {
		List<String> elementos = new ArrayList<String>();
		elementos.add("Diego");
		elementos.add("Carlos");
		elementos.add("Diego");
		elementos.add("Eduardo");
		elementos.add("Wilson");
		System.out.println(elementos.get(0).equals(elementos.get(2)));
		
		List<String> elementos2 = new ArrayList<String>(elementos);
		elementos2.forEach(elemento -> System.out.println(elemento));
		
		//Iteradores
		ListIterator<String> iterator = elementos.listIterator();
		
		/*Iterator solo permite recorrer list Set y Queue
		  ListIterator es para list y permite adicionalmente recorrer la lista en ambos sentidos y poder modificar la lista durate la iteración*/
		
		while(iterator.hasNext()) {
			String value = iterator.next();
			System.out.println("Nombre: "+value);
			if(value.equals("Diego")) {
				iterator.remove();
			}
		}
		
		
		System.out.println("Recorrido inverso");
		while(iterator.hasPrevious()) {
			System.out.println("Nombre: "+iterator.previous());
		}
		
		//Arrays.asList retorna una lista de tamaño definido
		List<Product> products = new ArrayList<Arraylist.Product>(Arrays.asList(obtenerProductos()));
		System.out.println("previous delete");
		products.forEach(element -> System.out.println(element));
		Iterator<Product> productsIterator = products.listIterator();
		String [] brands = {"H&M", "Lacoste"};
		
		while(productsIterator.hasNext()) {
			Product element = productsIterator.next();
			if(Arrays.asList(brands).contains(element.getMarca())) {
				productsIterator.remove();
			}
		}
		System.out.println("after delete");
		products.forEach(element -> System.out.println(element));
		
		
	}

	static class Product {
		private String marca;
		private String color;
		private String modelo;
		private String talla;

		public Product(String marca, String color, String modelo, String talla) {
			this.marca = marca;
			this.color = color;
			this.modelo = modelo;
			this.talla = talla;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public String getTalla() {
			return talla;
		}

		public void setTalla(String talla) {
			this.talla = talla;
		}

		@Override
		public String toString() {
			return "Producto{" + "marca=" + marca + ", color=" + color + ", modelo=" + modelo + ", talla=" + talla
					+ '}';
		}

	}
}
