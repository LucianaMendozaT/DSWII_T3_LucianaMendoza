package cibertec.edu.pe.DSWII_T3_LucianaMendoza.repository;


import cibertec.edu.pe.DSWII_T3_LucianaMendoza.model.bd.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RolRepository extends
        JpaRepository<Rol, Integer> {

    Rol findByNomrol(String nombrerol);
}