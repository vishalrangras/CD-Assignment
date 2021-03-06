package com.frt.controller;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frt.model.Client;
import com.frt.model.FinancialData;

import com.frt.model.Project;
import com.frt.model.ProjectResource;
import com.frt.model.SubProject;
import com.frt.service.ClientService;
import com.frt.service.FinancialDataService;

import com.frt.service.ProjectResourceService;
import com.frt.service.ProjectService;
import com.frt.service.SubProjectService;
import com.mysql.fabric.xmlrpc.base.Array;

//@RestController
public class TestController {

	@Autowired
	ClientService clientService;

	@Autowired
	HttpServletResponse response;

	@Autowired
	ProjectService projectService;

	@Autowired
	ProjectResourceService projectResourceService;

	@Autowired
	FinancialDataService financialDataService;

	@Autowired
	SubProjectService subProjectService;

	@Autowired
	HttpServletRequest request;

	Project project1 = new Project("IBM Portal", "IBM User Management Portal",
			true, "EE", "Managed T&M", true, "portal", "liferay", "consulting",
			new Date(), "USA", "Java", "Vishal");

	Project project2 = new Project("Apple IOS game", "Apple IOS game", true,
			"EE", "Fixed Bid", true, "portal", "liferay", "consulting",
			new Date(), "INDIA", "IOS", "Vishal");

	Project project3 = new Project("Licence", "Licence", false, "NN",
			"Licence", false, "Magento Licence", "Magento Licence", "Licence",
			new Date(), "USA", "Licence", "Vishal");

	ProjectResource projectResource1 = new ProjectResource("CAD1111111A",
			"Juhi Soni", "Developer", "Java", "USA", "Resource",
			"Onsite Vendor");
	ProjectResource projectResource2 = new ProjectResource("CAD1111111B",
			"Charmy Raval", "Developer", "Java", "Ahmedabad", "Resource",
			"Offshore Employee");
	ProjectResource projectResource3 = new ProjectResource("CAD1111111C",
			"Krina Akhani", "QA", "D3", "Ahmedabad", "Resource",
			"Offshore Employee");
	ProjectResource projectResource4 = new ProjectResource("CAD150506E",
			"Vishal Rangras", "Technical Lead", "IOS", "Ahmedabad", "Resource",
			"Offshore Employee");
	ProjectResource projectResource5 = new ProjectResource("CAD150508F",
			"Isha Mehta", "Developer", "Testing", "Noida", "Resource",
			"Offshore Employee");
	ProjectResource projectResource6 = new ProjectResource("CAD150508R",
			"Nehal Soni", "Developer", "UI", "Ahmedabad", "Resource",
			"Offshore Employee");
	ProjectResource projectResource7 = new ProjectResource("Licence",
			"Licence", "Licence", "Licence", "Licence", "Licence", "Licence");

	Client client1 = new Client("IBM", "Networking", "USA", "New");
	Client client2 = new Client("Apple", "Entertainment", "APJ", "Existing");
	Client client3 = new Client("Microsoft", "IT", "USA", "Existing");

	SubProject subProject1 = new SubProject("Liferay Portal");
	SubProject subProject2 = new SubProject("Liferay Portal");
	SubProject subProject3 = new SubProject("Liferay Portal");
	SubProject subProject4 = new SubProject("IOS");
	SubProject subProject5 = new SubProject("IOS");
	SubProject subProject6 = new SubProject("UX");

	FinancialData financialData1 = new FinancialData("april", 2016,
			"Anand Shah", "Paul Anthony", "Paul Anthony", "Srinivas Tadeparti",
			30, 10000.00, 5940.00, 4060.00, 40.60, 120, 55000.00, 26000.00,
			29000.00, 52.73);
	FinancialData financialData2 = new FinancialData("april", 2016,
			"Anand Shah", "Paul Anthony", "Paul Anthony", "Srinivas Tadeparti",
			28, 9400.00, 5940.00, 3460.00, 36.81, 110, 52000.00, 24000.00,
			28000.00, 55.73);
	FinancialData financialData3 = new FinancialData("april", 2016,
			"Anand Shah", "Paul Anthony", "Paul Anthony", "Srinivas Tadeparti",
			29, 9600.00, 5940.00, 3460.00, 36.81, 110, 52000.00, 24000.00,
			28000.00, 55.73);
	FinancialData financialData4 = new FinancialData("may", 2016, "Anand Shah",
			"Paul Anthony", "Paul Anthony", "Srinivas Tadeparti", 30, 10000.00,
			5940.00, 4060.00, 40.60, 120, 55000.00, 26000.00, 29000.00, 52.73);
	FinancialData financialData5 = new FinancialData("may", 2016, "Anand Shah",
			"Paul Anthony", "Paul Anthony", "Srinivas Tadeparti", 28, 9400.00,
			5940.00, 3460.00, 36.81, 110, 52000.00, 24000.00, 28000.00, 55.73);
	FinancialData financialData6 = new FinancialData("may", 2016, "Anand Shah",
			"Paul Anthony", "Paul Anthony", "Srinivas Tadeparti", 29, 9600.00,
			5940.00, 3460.00, 36.81, 110, 52000.00, 24000.00, 28000.00, 55.73);
	FinancialData financialData7 = new FinancialData("april", 2016, "Jogen G",
			"Ashish T", "Ashish T", "PKV Sastry", 30, 15000.00, 6200.00,
			8800.00, 58.61, 120, 55000.00, 26000.00, 29000.00, 52.73);
	FinancialData financialData8 = new FinancialData("april", 2016, "Jogen G",
			"Paul Anthony", "Paul Anthony", "PKV Sastry", 30, 14200.00,
			6200.00, 8000.00, 56.36, 120, 55000.00, 26000.00, 29000.00, 52.73);
	FinancialData financialData9 = new FinancialData("april", 2016, "Jogen G",
			"Paul Anthony", "Paul Anthony", "PKV Sastry", 30, 9000.00, 5200.00,
			3800.00, 42.22, 120, 55000.00, 26000.00, 29000.00, 52.73);
	FinancialData financialData10 = new FinancialData("may", 2016,
			"Kruti Shah", "Paul Anthony", "Paul Anthony", "PKV Sastry", 30,
			14200.00, 6200.00, 8000.00, 56.36, 120, 55000.00, 26000.00,
			29000.00, 52.73);
	FinancialData financialData11 = new FinancialData("may", 2016,
			"Kruti Shah", "Paul Anthony", "Paul Anthony", "PKV Sastry", 30,
			9000.00, 5200.00, 3800.00, 42.22, 120, 55000.00, 26000.00,
			29000.00, 52.73);
	FinancialData financialData12 = new FinancialData("may", 2016,
			"Kruti Shah", "Paul Anthony", "Paul Anthony", "PKV Sastry", 30,
			9000.00, 5200.00, 3800.00, 42.22, 120, 55000.00, 26000.00,
			29000.00, 52.73);
	FinancialData financialData13 = new FinancialData("april", 2016, "Jogen G",
			"Pinkal K", "Pinkal K", "PKV Sastry", 0, 0.00, 0.00, 0.00, 0.00, 0,
			0.00, 0.00, 0.00, 0.00);
	FinancialData financialData14 = new FinancialData("may", 2016, "Jogen G",
			"Pinkal K", "Pinkal K", "PKV Sastry", 0, 0.00, 0.00, 0.00, 0.00, 0,
			0.00, 0.00, 0.00, 0.00);

	// uncomment the code to save the data
	/*
	 * @RequestMapping(value = "/") public String projectData() {
	 * 
	 * projectx();
	 * 
	 * projecty();
	 * 
	 * projectz();
	 * 
	 * return "index";
	 * 
	 * }
	 */

	//@RequestMapping(value = "/list")
	public Map<String, Double> getFinanceDataByManagementTeamPerson(
			String ManagementTeamPerson, String typeOfData) {

		List<FinancialData> financeDataList = new ArrayList<>();
		Map<String, Double> revenueOfManagementTeamPerson = new HashMap<>();
		String typeOfFinanceData = "Margin";

		Double totalFinanceDataPerJanuary = 0.0;
		Double totalFinanceDataPerFebruary = 0.0;
		Double totalFinanceDataPerMarch = 0.0;
		Double totalFinanceDataPerApril = 0.0;
		Double totalFinanceDataPerMay = 0.0;
		Double totalFinanceDataPerJune = 0.0;
		Double totalFinanceDataPerJuly = 0.0;
		Double totalFinanceDataPerAugust = 0.0;
		Double totalFinanceDataPerSeptember = 0.0;
		Double totalFinanceDataPerOctober = 0.0;
		Double totalFinanceDataPerNovember = 0.0;
		Double totalFinanceDataPerDecember = 0.0;

		financeDataList = financialDataService.getRevenueByProjectManager(
				"april", "may", 2016, "deliveryHead", "Srinivas Tadeparti");

		for (FinancialData data : financeDataList) {

			Double financeData = 0.0;

			if (typeOfFinanceData.equals("Revenue")) {
				financeData = data.getActualRevenue();
			} else if (typeOfFinanceData.equals("Cost")) {
				financeData = data.getActualCost();
			} else {
				financeData = data.getActualMarginPercentage();
			}

			String month = data.getMonth();

			switch (month) {

			case "january":
				totalFinanceDataPerJanuary += financeData;
				revenueOfManagementTeamPerson.put("january",
						totalFinanceDataPerJanuary);
				break;

			case "february":

				totalFinanceDataPerFebruary += financeData;
				revenueOfManagementTeamPerson.put("february",
						totalFinanceDataPerFebruary);
				break;

			case "march":
				totalFinanceDataPerMarch += financeData;
				revenueOfManagementTeamPerson.put("march",
						totalFinanceDataPerMarch);
				break;

			case "april":
				totalFinanceDataPerApril += financeData;
				revenueOfManagementTeamPerson.put("april",
						totalFinanceDataPerApril);
				break;

			case "may":
				totalFinanceDataPerMay += financeData;
				revenueOfManagementTeamPerson
						.put("may", totalFinanceDataPerMay);
				break;

			case "june":
				totalFinanceDataPerJune += financeData;
				revenueOfManagementTeamPerson.put("june",
						totalFinanceDataPerJune);
				break;

			case "july":
				totalFinanceDataPerJuly += financeData;
				revenueOfManagementTeamPerson.put("july",
						totalFinanceDataPerJuly);
				break;

			case "august":
				totalFinanceDataPerAugust += financeData;
				revenueOfManagementTeamPerson.put("august",
						totalFinanceDataPerAugust);
				break;

			case "september":
				totalFinanceDataPerSeptember += financeData;
				revenueOfManagementTeamPerson.put("september",
						totalFinanceDataPerSeptember);
				break;

			case "october":
				totalFinanceDataPerOctober += financeData;
				revenueOfManagementTeamPerson.put("october",
						totalFinanceDataPerOctober);
				break;

			case "november":
				totalFinanceDataPerNovember += financeData;
				revenueOfManagementTeamPerson.put("november",
						totalFinanceDataPerNovember);
				break;

			case "december":
				totalFinanceDataPerDecember += financeData;
				revenueOfManagementTeamPerson.put("december",
						totalFinanceDataPerDecember);
				break;
			}
		}

		return revenueOfManagementTeamPerson;
	}

	public void projectz() {

		List<Project> projectList3 = new ArrayList<>();
		projectList3.add(project3);

		client3.setProjectList(projectList3);

		financialData13.setProject(project3);
		financialData13.setProjectResource(projectResource7);
		financialData13.setClient(client3);
		financialData14.setProject(project3);
		financialData14.setProjectResource(projectResource7);
		financialData14.setClient(client3);

		List<ProjectResource> projectResourcesList3 = new ArrayList<>();
		projectResourcesList3.add(projectResource7);
		project3.setProjectResourcesList(projectResourcesList3);

		clientService.saveClient(client3);
		projectService.saveProject(project3);
		projectResourceService.saveProjectResource(projectResource7);
		financialDataService.saveFinanceData(financialData13);
		financialDataService.saveFinanceData(financialData14);
	}

	public void projecty() {

		List<Project> projectList2 = new ArrayList<>();
		projectList2.add(project2);
		projectResource4.setProjectList(projectList2);

		client2.setProjectList(projectList2);

		List<SubProject> subProjectList2 = new ArrayList<SubProject>();
		subProjectList2.add(subProject4);
		subProjectList2.add(subProject5);
		subProjectList2.add(subProject6);
		project2.setSubProjectList(subProjectList2);

		financialData7.setProject(project2);
		financialData8.setProject(project2);
		financialData9.setProject(project2);
		financialData10.setProject(project2);
		financialData11.setProject(project2);
		financialData12.setProject(project2);

		financialData7.setClient(client2);
		financialData8.setClient(client2);
		financialData9.setClient(client2);
		financialData10.setClient(client2);
		financialData11.setClient(client2);
		financialData12.setClient(client2);

		financialData7.setSubProject(subProject4);
		financialData8.setSubProject(subProject5);
		financialData9.setSubProject(subProject6);
		financialData10.setSubProject(subProject4);
		financialData11.setSubProject(subProject5);
		financialData12.setSubProject(subProject6);

		financialData7.setProjectResource(projectResource4);
		financialData8.setProjectResource(projectResource5);
		financialData9.setProjectResource(projectResource6);
		financialData10.setProjectResource(projectResource4);
		financialData11.setProjectResource(projectResource5);
		financialData12.setProjectResource(projectResource6);

		List<ProjectResource> projectResourcesList2 = new ArrayList<>();
		projectResourcesList2.add(projectResource4);
		projectResourcesList2.add(projectResource5);
		projectResourcesList2.add(projectResource6);
		project2.setProjectResourcesList(projectResourcesList2);

		clientService.saveClient(client2);
		projectService.saveProject(project2);
		projectResourceService.saveProjectResource(projectResource4);
		projectResourceService.saveProjectResource(projectResource5);
		projectResourceService.saveProjectResource(projectResource6);
		subProjectService.saveSubProject(subProject4);
		subProjectService.saveSubProject(subProject5);
		subProjectService.saveSubProject(subProject6);
		financialDataService.saveFinanceData(financialData7);
		financialDataService.saveFinanceData(financialData8);
		financialDataService.saveFinanceData(financialData9);
		financialDataService.saveFinanceData(financialData10);
		financialDataService.saveFinanceData(financialData11);
		financialDataService.saveFinanceData(financialData12);
	}

	public void projectx() {

		List<Project> projectList1 = new ArrayList<>();
		projectList1.add(project1);
		projectResource1.setProjectList(projectList1);

		client1.setProjectList(projectList1);

		financialData1.setProject(project1);
		financialData2.setProject(project1);
		financialData3.setProject(project1);
		financialData4.setProject(project1);
		financialData5.setProject(project1);
		financialData6.setProject(project1);

		financialData1.setClient(client1);
		financialData2.setClient(client1);
		financialData3.setClient(client1);
		financialData4.setClient(client1);
		financialData5.setClient(client1);
		financialData6.setClient(client1);

		financialData1.setSubProject(subProject1);
		financialData2.setSubProject(subProject2);
		financialData3.setSubProject(subProject3);
		financialData4.setSubProject(subProject1);
		financialData5.setSubProject(subProject2);
		financialData6.setSubProject(subProject3);

		financialData1.setProjectResource(projectResource1);
		financialData2.setProjectResource(projectResource2);
		financialData3.setProjectResource(projectResource3);
		financialData4.setProjectResource(projectResource1);
		financialData5.setProjectResource(projectResource2);
		financialData6.setProjectResource(projectResource3);

		List<ProjectResource> projectResourcesList1 = new ArrayList<>();
		projectResourcesList1.add(projectResource1);
		projectResourcesList1.add(projectResource2);
		projectResourcesList1.add(projectResource3);
		project1.setProjectResourcesList(projectResourcesList1);

		List<SubProject> subProjectList1 = new ArrayList<SubProject>();
		subProjectList1.add(subProject1);
		subProjectList1.add(subProject2);
		subProjectList1.add(subProject3);
		project1.setSubProjectList(subProjectList1);

		clientService.saveClient(client1);
		projectService.saveProject(project1);
		projectResourceService.saveProjectResource(projectResource1);
		projectResourceService.saveProjectResource(projectResource2);
		projectResourceService.saveProjectResource(projectResource3);
		financialDataService.saveFinanceData(financialData1);
		financialDataService.saveFinanceData(financialData2);
		financialDataService.saveFinanceData(financialData3);
		financialDataService.saveFinanceData(financialData4);
		financialDataService.saveFinanceData(financialData5);
		financialDataService.saveFinanceData(financialData6);
		subProjectService.saveSubProject(subProject1);
		subProjectService.saveSubProject(subProject2);
		subProjectService.saveSubProject(subProject3);
	}
}
