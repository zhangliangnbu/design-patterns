package com.tech.heathcilff.designpatterns.builder.builder;

import com.tech.heathcilff.designpatterns.builder.House;

/**
 *
 * Created by zhangliang on 2016/12/27.
 */

public abstract class HouseBuilder {
	protected House house;
	public void createNewHouse() {
		house = new House();
	}
	public House getHouse() {
		return house == null ? new House() : house;
	}

	public abstract void buildWall();
	public abstract void buildWindow();
	public abstract void buildFloor();
}
