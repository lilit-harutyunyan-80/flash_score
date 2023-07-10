package service;

import model.News;

import java.util.List;

public interface NewsService {
    List<News> getAllNews();

    List<News> getAllNewsById(int id);

    List<News> getThreeNews();
}
