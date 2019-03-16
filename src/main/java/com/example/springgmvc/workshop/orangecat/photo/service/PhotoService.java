package com.example.springgmvc.workshop.orangecat.photo.service;

import com.example.springgmvc.workshop.orangecat.photo.bo.Photo;

public interface PhotoService {
    Photo getPhoto(Long photoId) throws Exception;
}
