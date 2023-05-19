package ar.com.cdt.elastic.repositories;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import ar.com.cdt.elastic.models.Producto;

public interface ProductoRepository extends ElasticsearchRepository<Producto, Integer> {

}
