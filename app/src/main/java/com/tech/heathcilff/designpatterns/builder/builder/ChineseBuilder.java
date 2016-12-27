package com.tech.heathcilff.designpatterns.builder.builder;

/**
 *
 * Created by zhangliang on 2016/12/27.
 */

public class ChineseBuilder extends HouseBuilder {


	@Override
	public void buildWall() {
		house.setWall("chinese wall");
	}

	@Override
	public void buildWindow() {
		house.setWindow("chinese window");
	}

	@Override
	public void buildFloor() {
		house.setFloor("chinese floor");
	}

}
