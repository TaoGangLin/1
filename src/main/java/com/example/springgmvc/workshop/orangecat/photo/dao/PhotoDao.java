package com.example.springgmvc.workshop.orangecat.photo.dao;

import com.example.springgmvc.workshop.orangecat.photo.bo.Photo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface PhotoDao {
    Photo getPhoto(@Param("photoId")Long photoId) throws Exception;
}
