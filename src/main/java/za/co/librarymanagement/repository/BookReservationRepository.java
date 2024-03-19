package za.co.librarymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import za.co.librarymanagement.entity.BookReservationInfo;

@Repository
public interface BookReservationRepository extends JpaRepository<BookReservationInfo, Long>{

}
