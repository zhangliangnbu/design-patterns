package com.tech.heathcilff.designpatterns.AbstractFactory.cpu;

/**
 *
 * Created by zhangliang on 2016/12/26.
 */

public class AppleCpu implements Cpu {
	private String model = "A10";

	public AppleCpu(String model) {
		this.model = model;
	}

	@Override
	public void calculate() {
		System.out.println("AppleCpu-" + model);
	}
}
