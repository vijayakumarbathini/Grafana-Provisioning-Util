package com.util.provisioning;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Datasources {

	public static void main(String[] args) {

		// Put the data sources required to create
		Map<String, String> datasourcesMap = new LinkedHashMap<String, String>();
		datasourcesMap.put("tenants", "ao_dxi_tenants_1");
		datasourcesMap.put("AIOps_Metadata_ts", "");

		System.out.println("apiVersion: 2");
		System.out.println("");
		System.out.println("datasources:");
		IntStream.range(1, 10).forEach(index -> {
			for (Map.Entry<String, String> entry : datasourcesMap.entrySet()) {
				System.out.println("    -");
				System.out.println("        name: " + entry.getKey());
				System.out.println("        type: elastic-wrapper-datasource");
				System.out.println("        access: proxy");
				System.out.println("        orgId: " + index);
				System.out.println("        url: ''");
				System.out.println("        database: '" + entry.getValue() + "'");
				System.out.println("        jsonData:");
				System.out.println("          timeField: '@timestamp'");
				System.out.println("          esVersion: 70");
				System.out.println("          index: " + entry.getValue() + "");
				System.out.println();
				System.out.println();
			}

		});
	}
}
