package com.tech.heathcilff.designpatterns.builder;

import com.tech.heathcilff.designpatterns.builder.builder.HouseBuilder;

/**
 *
 * Created by zhangliang on 2016/12/27.
 */

public class Designer {
	private HouseBuilder builder;

	public Designer(HouseBuilder builder) {
		this.builder = builder;
	}

	public House getHouse() {
		return builder.getHouse();
	}

	public void order() {
		builder.createNewHouse();
		builder.buildWindow();
		builder.buildWall();
		builder.buildFloor();
	}
}
