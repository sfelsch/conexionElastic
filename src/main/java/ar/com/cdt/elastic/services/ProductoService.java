package ar.com.cdt.elastic.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.cdt.elastic.models.Producto;
import ar.com.cdt.elastic.repositories.ProductoRepository;

@Service
public class ProductoService {

	@Autowired
	private ProductoRepository productoRepository;

	public Iterable<Producto> getProductos() {
		return productoRepository.findAll();
	}

	public Producto insertProducto(Producto producto) {
		return productoRepository.save(producto);
	}

	public Producto updateProducto(Producto producto, int id) {
		Producto producto1 = productoRepository.findById(id).get();
		producto1.setPrecio(producto.getPrecio());
		return producto1;
	}
}
