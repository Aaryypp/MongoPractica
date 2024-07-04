package com.hg.mongodb.controlador;
import com.hg.mongodb.modelos.ProductoDTO;
import com.hg.mongodb.repositorio.IProductoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins ="*",methods ={RequestMethod.POST,RequestMethod.GET,RequestMethod.PUT,RequestMethod.DELETE})
@RequestMapping("/api/productos")

public class ProductoController {
    @Autowired
    private IProductoDAO repository;
    @PostMapping("/producto")
    public ProductoDTO crearProducto(@Validated @RequestBody ProductoDTO producto) {
        return repository.insert(producto);
    }
    @GetMapping("/")
    public List<ProductoDTO> obtenerProductos() {
        return repository.findAll();
    }
    @PutMapping("/producto/{id}")
    public ProductoDTO actualizarProducto(@PathVariable String id, @Validated @RequestBody ProductoDTO producto) {
        return repository.save(producto);
    }
    @DeleteMapping("/producto/{id}")
    public void eliminarProducto(@PathVariable String id) {
        repository.deleteById(id);
    }
}
