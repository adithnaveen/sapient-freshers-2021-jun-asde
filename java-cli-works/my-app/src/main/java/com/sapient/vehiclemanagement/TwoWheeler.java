package com.sapient.vehiclemanagement;

import org.slf4j.LoggerFactory;

import com.mycompany.app.App;

import ch.qos.logback.classic.Logger;

public class TwoWheeler extends Vehicle {
	private static final Logger log = (ch.qos.logback.classic.Logger) LoggerFactory.getLogger(TwoWheeler.class);

	public void selfStart(boolean isSelf) {
		log.info(isSelf?"Two Wheelear Has Self":"Not Self Supported");
	}

	@Override
	public void nuts() {
		log.info("the two-wheeler nuts are used in two-wheeler");
	}

}
