package com.example.springgmvc.workshop.orangecat.photo.service;

import com.example.springgmvc.workshop.orangecat.photo.bo.Photo;
import com.example.springgmvc.workshop.orangecat.photo.dao.PhotoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("photoService")
public class PhotoServiceImpl implements PhotoService {

    @Autowired
    PhotoDao photoDao;
    @Override
    public Photo getPhoto(Long photoId) throws Exception {
        return photoDao.getPhoto(photoId);
    }
}
