package com.example.springgmvc.workshop.orangecat.photo.web;

import com.example.springgmvc.workshop.orangecat.photo.bo.Photo;
import com.example.springgmvc.workshop.orangecat.photo.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PhotoController {
    @Autowired
    private PhotoService photoService;
    @RequestMapping("/photo/{photoId}")
    @ResponseBody
    public String photoDetail(@PathVariable Long photoId) throws Exception{
        Photo photo = photoService.getPhoto(photoId);
        return photo.getPhotoName();
    }
}
