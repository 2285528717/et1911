package com.etoak.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.etoak.bean.Car;
import com.etoak.bean.CarVo;

public interface CarMapper {

	int addCar(Car car);
	
	List<CarVo> queryList(CarVo carVo);
	
	//获取所有的品牌
	List<String> getAllBrand();
	
	//根据品牌查找车系
	List<String> getSeriesByBrand(@Param("brand") String brand);
}
