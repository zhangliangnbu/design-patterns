package com.tech.heathcilff.designpatterns.AbstractFactory.cpu;

/**
 *
 * Created by zhangliang on 2016/12/26.
 */

public class SnapdragonCpu implements Cpu {
	private String model = "820";

	public SnapdragonCpu(String model) {
		this.model = model;
	}

	@Override
	public void calculate() {
		System.out.println("SnapdragonCpu-" + model);
	}
}
