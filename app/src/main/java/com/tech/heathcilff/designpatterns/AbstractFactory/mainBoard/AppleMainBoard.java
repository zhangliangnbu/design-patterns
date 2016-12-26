package com.tech.heathcilff.designpatterns.AbstractFactory.mainBoard;

/**
 *
 * Created by zhangliang on 2016/12/26.
 */

public class AppleMainBoard implements MainBoard {
	private String model = "iphone4";

	public AppleMainBoard(String model) {
		this.model = model;
	}

	@Override
	public void calculate() {
		System.out.println("AppleMainBoard-" + model);
	}
}
