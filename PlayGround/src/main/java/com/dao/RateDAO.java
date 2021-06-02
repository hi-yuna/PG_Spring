package com.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.GameDTO;

@Repository
public class RateDAO {
	@Autowired
	SqlSessionTemplate session;
	
	public List<Double> rateRecommendSelect() {
		return session.selectList("RateMapper.rateRecommendSelect");
	}
	
	public List<Double> rateTagSelect(List<Integer> listTags) {
		return session.selectList("RateMapper.rateTagSelect", listTags);
	}
}