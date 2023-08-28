package com.indeed.server.service;

import com.indeed.server.dao.PostDao;
import com.indeed.server.dto.PostDTO;
import com.indeed.server.model.PostModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    PostDao postDao;
    @Override
    public PostModel savePost(PostDTO postDTO) {
        PostModel postModel=new PostModel();

        postModel.setProfile(postDTO.getProfile());
        postModel.setDecription(postDTO.getDecription());
        postModel.setTechnology(postDTO.getTechnology());
        postModel.setExperience(postDTO.getExperience());
        postModel.setSalary(postDTO.getSalary());
        postModel.setType(postDTO.getType());

        return postDao.save(postModel);
    }
}
