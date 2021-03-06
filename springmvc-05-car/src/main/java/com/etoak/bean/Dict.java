package com.etoak.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Dict implements Serializable {
	
	/**
	 * 字典表对应的实体类
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String groupId;
	private String name;
	private String value;
	private Integer sort;
	
}
