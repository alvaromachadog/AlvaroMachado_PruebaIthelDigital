package co.com.itheldigital.demo.repository;

        import co.com.itheldigital.demo.model.Descuento;
        import org.springframework.data.repository.CrudRepository;

public interface DescuentoRepository extends CrudRepository<Descuento, Long> {
}
