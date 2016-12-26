package com.tech.heathcilff.designpatterns.AbstractFactory.factory;

import com.tech.heathcilff.designpatterns.AbstractFactory.cpu.AppleCpu;
import com.tech.heathcilff.designpatterns.AbstractFactory.cpu.Cpu;
import com.tech.heathcilff.designpatterns.AbstractFactory.mainBoard.AppleMainBoard;
import com.tech.heathcilff.designpatterns.AbstractFactory.mainBoard.MainBoard;

/**
 *
 * Created by zhangliang on 2016/12/26.
 */

public class Iphone8Factory implements PhoneFactory {
	@Override
	public Cpu createCpu() {
		return new AppleCpu("A11");
	}

	@Override
	public MainBoard createMainBoard() {
		return new AppleMainBoard("iphone_main_board8");
	}
}
