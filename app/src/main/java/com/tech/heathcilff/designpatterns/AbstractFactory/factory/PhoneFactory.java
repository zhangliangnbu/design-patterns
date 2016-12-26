package com.tech.heathcilff.designpatterns.AbstractFactory.factory;

import com.tech.heathcilff.designpatterns.AbstractFactory.cpu.Cpu;
import com.tech.heathcilff.designpatterns.AbstractFactory.mainBoard.MainBoard;

/**
 *
 * Created by zhangliang on 2016/12/26.
 */

public interface PhoneFactory {
	Cpu createCpu();
	MainBoard createMainBoard();
}
