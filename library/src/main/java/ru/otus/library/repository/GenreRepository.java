package ru.otus.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.otus.library.domain.Genre;

import java.util.Optional;


public interface GenreRepository extends JpaRepository<Genre, Long> {
    public Optional<Genre> getByDescription(String description);
   }
