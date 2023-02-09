package com.example.p1.services;

import com.example.p1.models.User;
import com.example.p1.repositories.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchService {
    @Autowired
    private SearchRepository searchRepository;

    public List<User> search(String q) {
        return searchRepository.search(q);
    }

}