package com.tech.heathcilff.designpatterns;

import com.tech.heathcilff.designpatterns.AbstractFactory.Phone;
import com.tech.heathcilff.designpatterns.AbstractFactory.PhoneManufacturer;
import com.tech.heathcilff.designpatterns.AbstractFactory.factory.Mi6PhoneFactory;
import com.tech.heathcilff.designpatterns.builder.Designer;
import com.tech.heathcilff.designpatterns.builder.builder.RussiaBuilder;

import org.junit.Test;

/**
 *
 * Created by zhangliang on 2016/12/26.
 */

public class DesignPatternsTest {
	@Test
	public void testAbstractFactory() {
		PhoneManufacturer manufacturer = new PhoneManufacturer();
		Phone phone = manufacturer.makePhone(new Mi6PhoneFactory());
		phone.displayInformation();
	}

	@Test
	public void testBuilderPattern() {
		Designer designer = new Designer(new RussiaBuilder());
		designer.order();
		System.out.println(designer.getHouse().toString());
	}
}
