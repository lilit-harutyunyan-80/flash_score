package service.impl;

import lombok.RequiredArgsConstructor;
import model.News;
import org.springframework.stereotype.Service;
import repository.NewsRepository;
import service.NewsService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NewsServiceImpl implements NewsService {
    private final NewsRepository newsRepository;
    @Override
    public List<News> getAllNews() {
        return newsRepository.findAll();
    }

    @Override
    public List<News> getAllNewsById(int id) {
        return newsRepository.findAllById(id);
    }

    @Override
    public List<News> getThreeNews() {
        return newsRepository.findTop3ByOrderById();
    }
}
