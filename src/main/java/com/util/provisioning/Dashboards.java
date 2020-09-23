package com.util.provisioning;

public class Dashboards {

	public static void main(String[] args) {
		System.out.println("apiVersion: 1");
		System.out.println("");
		System.out.println("providers:");
		System.out.println("");
		for (int i = 1; i <= 900; i++) {
			System.out.println("- name: 'tenant" + i + "'");
			System.out.println("  orgId: " + i);
			System.out.println("  folder: ''");
			System.out.println("  type: file");
			System.out.println("  disableDeletion: false");
			System.out.println("  editable: true");
			System.out.println("  updateIntervalSeconds: 604800");
			System.out.println("  options:");
			System.out.println("    path: /etc/grafana/dashboards");
			System.out.println("");
		}
	}
}
