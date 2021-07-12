package com.example.esPractice.repository;

import com.example.esPractice.models.Blog;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface BlogEsRepository extends ElasticsearchRepository<Blog,String> {

}
