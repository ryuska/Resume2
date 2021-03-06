package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Resume> resumes = new ArrayList<>();
        int w;
        for (w = 0; w < 2; w++) {

            String displayResume;

            Resume a = new Resume();

            Personal resumeInfo;
            System.out.println("Name: ");
            String name = scanner.nextLine();
            System.out.println("Email: ");
            String email = scanner.nextLine();
            System.out.println("Phone number: ");
            String phone = scanner.nextLine();
            System.out.println();

            resumeInfo = new Personal(name, email, phone);
            a.addPersonalInfo(resumeInfo);


            int v;
            v = 0;
            System.out.println("Education");

            Education educations;
            while (v == 0) {


                System.out.println("Degree type: ");
                String degree = scanner.nextLine();
                System.out.println("Major: ");
                String major = scanner.nextLine();
                System.out.println("University name: ");
                String uniName = scanner.nextLine();
                System.out.println("Graduation year: ");
                String gradYear = scanner.nextLine();
                System.out.println();

                educations = new Education(degree, major, uniName, gradYear);
                a.addEducations(educations);
                System.out.println("Would you like to add education info ? ");
                String resp = scanner.nextLine();
                if (resp.equalsIgnoreCase("y")) {
                    v = 0;
                    System.out.println("Additional education information; ");
                } else {
                    v = 1;
                }
            }


            int d;
            d = 0;
            Experience experiences = new Experience();
            System.out.println("Experience");

            while (d == 0) {
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
                System.out.println();

                experiences.setCompany(company);
                experiences.setJobTitle(jobTytle);
                experiences.setStartDate(startDate);
                experiences.setEndDate(endDate);
                a.addExperiences(experiences);
                System.out.println("Would you like to add experience info ? ");
                String resp = scanner.nextLine();
                if (resp.equalsIgnoreCase("y")) {
                    d = 0;
                    System.out.println("Additional experience information; ");
                } else {
                    d = 1;
                }
            }


            Skills skills;
            System.out.println("Skills");
            for (int n = 0; n < 3; n++) {
                System.out.println("Skill Name: ");
                String skillName = scanner.nextLine();
                System.out.println("Competency Rating: ");
                String skillCompetency = scanner.nextLine();
                skills = new Skills(skillName, skillCompetency);
                a.addSkills(skills);
            }

            System.out.println("Would you like to display your resume?: ");
            displayResume = scanner.nextLine();
            if (displayResume.equalsIgnoreCase("Y")) {
                a.displayResume();
            }

            System.out.println("Resume complete.\n");
            a.displayResume();
            resumes.add(a);
        }

        for (Resume s : resumes) {
            s.displayResume();

        }
    }
}






