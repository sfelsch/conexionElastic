package ar.com.cdt.elastic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.cdt.elastic.models.Producto;
import ar.com.cdt.elastic.services.ProductoService;

@RestController
@RequestMapping("/apis")
public class ProductoController {

	@Autowired
	private ProductoService productoService;
	
	@GetMapping("/dindAll")
	Iterable< Producto> findAll(){
		return productoService.getProductos();
	}
	
	@PostMapping("/dindong")
	public Producto insertar(@RequestBody Producto producto) {
		return productoService.insertProducto(producto);
	}
	
}
