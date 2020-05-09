package kz.iitu.projects.ex7.repository;

import kz.iitu.projects.ex7.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepository extends JpaRepository<Books, Long> {
}
