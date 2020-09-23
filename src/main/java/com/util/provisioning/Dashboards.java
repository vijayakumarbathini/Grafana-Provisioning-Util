package com.util.provisioning;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Dashboards {

	private static final Logger log = LoggerFactory.getLogger(Dashboards.class);

	public void getDashboards(String path, int count) {

		log.info("apiVersion: 1");
		log.info("");
		log.info("providers:");
		log.info("");
		for (int i = 1; i <= count; i++) {
			log.info("- name: 'tenant" + i + "'");
			log.info("  orgId: " + i);
			log.info("  folder: ''");
			log.info("  type: file");
			log.info("  disableDeletion: false");
			log.info("  editable: true");
			log.info("  updateIntervalSeconds: 604800");
			log.info("  options:");
			log.info(path);
			log.info("");
		}
	}
}
