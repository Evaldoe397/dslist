package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.GameList;

public class GameListDTO {

	private long id;
	private String name;
	
	public GameListDTO() {
	}
	
	public GameListDTO(GameList entity) {
		//BeanUtils.copyProperties(entity, this) "Poderia fazer dessa forma como o GameDtO"
		id = entity.getId();
		name = entity.getName();
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	
}
