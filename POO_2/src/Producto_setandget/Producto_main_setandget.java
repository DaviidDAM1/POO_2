package Producto_setandget;

public class Producto_main_setandget {

	public static void main(String[] args) {
		Producto pr = new Producto();
		pr.setnombre(pr.getnombre());
		pr.setprecio(pr.precio());
		pr.setStock(pr.stock());
		System.out.println("el producto es un " + pr.getnombre());
		System.out.println("el balon cuesta " + pr.precio());
		System.out.println("el producto tiene un stock de " + pr.stock());

	}

}
