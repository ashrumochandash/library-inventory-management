package za.co.librarymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import za.co.librarymanagement.entity.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long>{

}
