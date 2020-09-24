package com.util.provisioning;

import java.util.Map;
import java.util.stream.IntStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Datasources {

	private static final Logger log = LoggerFactory.getLogger(Datasources.class);
	public void getDataSources(Map<String, String> datasourcesMap) {

		log.info("apiVersion:  2");
		log.info("");
		log.info("datasources:");
		IntStream.range(1, 10).forEach(index -> {
			for (Map.Entry<String, String> entry : datasourcesMap.entrySet()) {
				log.info("    -");
				log.info("        name: " + entry.getKey());
				log.info("        type: elastic-wrapper-datasource");
				log.info("        access: proxy");
				log.info("        orgId: " + index);
				log.info("        url: ''");
				log.info("        database: '" + entry.getValue() + "'");
				log.info("        jsonData:");
				log.info("          timeField: '@timestamp'");
				log.info("          esVersion: 70");
				log.info("          index: " + entry.getValue() + "");
				log.info("");
				log.info("");
			}

		});
	}
}
