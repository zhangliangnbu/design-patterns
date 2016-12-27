package com.tech.heathcilff.designpatterns.builder;

/**
 *
 * Created by zhangliang on 2016/12/27.
 */

public class House {
	private String wall = "";
	private String window = "";
	private String floor = "";

	public void setWall(String wall) {
		this.wall = wall;
	}

	public void setWindow(String window) {
		this.window = window;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	@Override
	public String toString() {
		return "House{" +
				"wall='" + wall + '\'' +
				", window='" + window + '\'' +
				", floor='" + floor + '\'' +
				'}';
	}
}
