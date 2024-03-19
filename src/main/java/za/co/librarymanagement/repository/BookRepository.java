package za.co.librarymanagement.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import za.co.librarymanagement.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Long>{

}
