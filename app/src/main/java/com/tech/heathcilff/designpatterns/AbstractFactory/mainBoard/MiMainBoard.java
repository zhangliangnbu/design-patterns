package com.tech.heathcilff.designpatterns.AbstractFactory.mainBoard;

/**
 *
 * Created by zhangliang on 2016/12/26.
 */

public class MiMainBoard implements MainBoard {
	private String model = "m4";

	public MiMainBoard(String model) {
		this.model = model;
	}

	@Override
	public void calculate() {
		System.out.println("MiMainBoard-" + model);
	}
}
