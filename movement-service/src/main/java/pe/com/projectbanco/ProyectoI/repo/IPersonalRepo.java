package pe.com.projectbanco.ProyectoI.repo;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import pe.com.projectbanco.ProyectoI.model.Customer;
import pe.com.projectbanco.ProyectoI.model.Personal;
//import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonalRepo extends ReactiveMongoRepository<Personal,String> {


}
