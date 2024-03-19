package za.co.librarymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import za.co.librarymanagement.entity.Patron;

@Repository
public interface PatronRepository extends JpaRepository<Patron, Long>{

}
