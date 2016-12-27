package com.tech.heathcilff.designpatterns.builder.builder;

/**
 *
 * Created by zhangliang on 2016/12/27.
 */

public class RussiaBuilder extends HouseBuilder {
	@Override
	public void buildWall() {
		house.setWall("russia wall");
	}

	@Override
	public void buildWindow() {
		house.setWindow("russia window");
	}

	@Override
	public void buildFloor() {
		house.setFloor("russia floor");
	}
}
