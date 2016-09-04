package com.pnclasses.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.pnclasses.order.dao.PersonalDetailsDao;
import com.pnclasses.order.vo.PersonalDetailsVO;

@Component
public interface PersonalDetailsService {

public  List<PersonalDetailsVO> getPersonalDetails(); 
}
