package com.tech.heathcilff.designpatterns.AbstractFactory;

import com.tech.heathcilff.designpatterns.AbstractFactory.cpu.Cpu;
import com.tech.heathcilff.designpatterns.AbstractFactory.mainBoard.MainBoard;

/**
 *
 * Created by zhangliang on 2016/12/26.
 */

public class Phone {
	private Cpu cpu;
	private MainBoard mainBoard;

	public Phone(Cpu cpu, MainBoard mainBoard) {
		this.cpu = cpu;
		this.mainBoard = mainBoard;
	}

	public void displayInformation() {
		if(cpu != null) {
			cpu.calculate();
		}
		if(mainBoard != null) {
			mainBoard.calculate();
		}
	}

}
