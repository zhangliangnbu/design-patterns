package com.tech.heathcilff.designpatterns.AbstractFactory;

import com.tech.heathcilff.designpatterns.AbstractFactory.cpu.Cpu;
import com.tech.heathcilff.designpatterns.AbstractFactory.factory.PhoneFactory;
import com.tech.heathcilff.designpatterns.AbstractFactory.mainBoard.MainBoard;

/**
 *
 * Created by zhangliang on 2016/12/26.
 */

public class PhoneManufacturer {
	public Phone makePhone(PhoneFactory factory) {
		Cpu cpu = factory.createCpu();
		MainBoard mainBoard = factory.createMainBoard();
		return new Phone(cpu, mainBoard);
	}
}
