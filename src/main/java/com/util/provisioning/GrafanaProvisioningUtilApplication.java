package com.util.provisioning;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GrafanaProvisioningUtilApplication {

	private static final Logger logger = LoggerFactory.getLogger(GrafanaProvisioningUtilApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(GrafanaProvisioningUtilApplication.class, args);

		// Read Input from User
		try (Scanner sc = new Scanner(System.in)) {
			logger.info("Enter \n 1.  Creating Dashboard File \n 2.  Creating Datasources File");
			int scan = sc.nextInt();
			while (scan > 2) {
				logger.info("Invalid Input, Please Enter only 1-2");
				logger.info("Enter \n 1.  Creating Dashboard File \n 2.  Creating Datasources File");
				scan = sc.nextInt();
			}

			HandleCreation(sc, scan);
		}
	}

	private static void HandleCreation(Scanner sc, int scan) {
		if (scan == 1) {

			logger.info("Provide Dashboards Path");
			String path = sc.next();
			logger.info("Enter Number of Orgs to be created");
			int orgCount = sc.nextInt();
			// Creating Dashboards YML file content which can be used during provision
			Dashboards dashboards = new Dashboards();
			// Provide Path and Number of Orgs
			dashboards.getDashboards(path, orgCount);
		} else {
			// Put the data sources required to create
			Map<String, String> datasourcesMap = new LinkedHashMap<String, String>();
			datasourcesMap.put("tenants", "ao_dxi_tenants_1");
			datasourcesMap.put("AIOps_Metadata_ts", "");
			Datasources datasources = new Datasources();
			datasources.getDataSources(datasourcesMap);
		}
	}

}
