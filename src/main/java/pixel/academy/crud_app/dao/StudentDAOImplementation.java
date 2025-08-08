package pixel.academy.crud_app.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pixel.academy.crud_app.entity.Student;

@Repository
public class StudentDAOImplementation  implements StudentDAO {
    //Camp pentru EntityManager (va fi utilizat pentru interactiune cu baza de date)
    private EntityManager entityManager;

    //Injectare EntityManager prin constructor (practica recomandata pentru testabilitate si modulare
    @Autowired
    public void StudentDAOImplementation(EntityManager entityManager) {
        this.entityManager = entityManager;

    }
    //Implementarea metodei save pentru salvarea unui obiect

    @Override
    @Transactional
    public void save(Student theStudent){

    }

    @Override
    public Student findById(Integer Id) {
        return entityManager.find(Student.class, Id);
    }
}
