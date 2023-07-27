package repository;

import model.News;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NewsRepository extends JpaRepository<News, Integer> {
    List<News> findAllById(int id);

    List<News> findTop3ByOrderById();
}
