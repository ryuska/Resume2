package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String educationAdd;
        String experienceAdd;
        String skillsAdd;
        String displayResume;

        Resume a = new Resume();

        Personal resumeInfo;
        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Email: ");
        String email = scanner.nextLine();
        System.out.println();

        resumeInfo = new Personal(name, email);
        a.addPersonalInfo(resumeInfo);

        educationAdd = "";
        Education educations;
        System.out.println("Education");
        System.out.println("Degree type: ");
        String degree = scanner.nextLine();
        System.out.println("Major: ");
        String major = scanner.nextLine();
        System.out.println("University name: ");
        String uniName = scanner.nextLine();
        System.out.println("Graduation year: ");
        String gradYear = scanner.nextLine();
        scanner.nextLine();

        educations = new Education(degree, major, uniName, gradYear);
        a.addEducations(educations);

        experienceAdd = "";
        Experience experiences = new Experience();
        System.out.println("Experience");
        System.out.println("Company: ");
        String company = scanner.nextLine();
        System.out.println("Job Title: ");
        String jobTytle = scanner.nextLine();
        System.out.println("Start Date: ");
        String startDate = scanner.nextLine();
        System.out.println("End Date: ");
        String endDate = scanner.nextLine();
        System.out.println("Job Description");
        experiences.addJobDescription(scanner.nextLine());

        experiences.setCompany(company);
        experiences.setJobTitle(jobTytle);
        experiences.setStartDate(startDate);
        experiences.setEndDate(endDate);

        a.addExperiences(experiences);


        skillsAdd = "";
        Skills skills;
        System.out.println("Skills");
        System.out.println("Skill Name: ");
        String skillName = scanner.nextLine();
        System.out.println("Competency Rating: ");
        String skillCompetency = scanner.nextLine();

        skills = new Skills(skillName, skillCompetency);
        a.addSkills(skills);


        System.out.println("Would you like to display your resume?: ");
        displayResume = scanner.nextLine();
        if (displayResume.equalsIgnoreCase("Y")){
            a.displayResume();
        }

    }

}


