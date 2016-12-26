package com.tech.heathcilff.designpatterns.AbstractFactory.factory;

import com.tech.heathcilff.designpatterns.AbstractFactory.cpu.Cpu;
import com.tech.heathcilff.designpatterns.AbstractFactory.cpu.SnapdragonCpu;
import com.tech.heathcilff.designpatterns.AbstractFactory.mainBoard.MainBoard;
import com.tech.heathcilff.designpatterns.AbstractFactory.mainBoard.MiMainBoard;

/**
 *
 * Created by zhangliang on 2016/12/26.
 */

public class Mi6PhoneFactory implements PhoneFactory{
	@Override
	public Cpu createCpu() {
		return new SnapdragonCpu("835");
	}

	@Override
	public MainBoard createMainBoard() {
		return new MiMainBoard("mi6");
	}
}
