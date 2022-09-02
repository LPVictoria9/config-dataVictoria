package pe.com.projectbanco.ProyectoI.service;



import org.springframework.data.mongodb.repository.Query;
import pe.com.projectbanco.ProyectoI.model.Business;
import reactor.core.publisher.Flux;

public interface IBusinessService extends ICRUD<Business, String> {

    @Query("{'ruc':?0}")
    Flux<Business> findByRUC(String ruc);

}
