package com.hg.mongodb.repositorio;
import com.hg.mongodb.modelos.ProductoDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface IProductoDAO extends MongoRepository<ProductoDTO,String> {
}
