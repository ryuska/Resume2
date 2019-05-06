package com.company;

import java.util.ArrayList;

public class Resume {
    ArrayList<Personal> personalInfo = new ArrayList<>();
    ArrayList<Education> educations = new ArrayList<>();
    ArrayList<Experience> experiences = new ArrayList<>();
    ArrayList<Skills> skills = new ArrayList<>();

    public Resume() {
    }

    public void displayResume() {
        for (Personal p : personalInfo) {
            p.displayPersonal();
        }
        System.out.println("Education");
        for (Education e : educations) {
            e.displayEducation();
        }
        System.out.println("Experience");
        for (Experience e : experiences) {
            e.displayExperience();
        }
        System.out.println("Skills");
        for (Skills s : skills) {
            s.displaySkills();
        }
    }

    public ArrayList<String> displaySkills() {
        ArrayList<String> skillList = new ArrayList<>();
        for (Skills skill : skills) {
            skillList.add(skill.getSkillName());
        }
        return skillList;
    }

    public Personal getPersonalInfo(int i) {

        return personalInfo.get(i);
    }

    public void addPersonalInfo(Personal info) {
        personalInfo.add(info);
    }

    public Education getEducations(int i) {
        return educations.get(i);
    }

    public void addEducations(Education edu) {
        educations.add(edu);
    }

    public Experience getExperiences(int i) {
        return experiences.get(i);
    }

    public void addExperiences(Experience exp) {
        experiences.add(exp);
    }

    public Skills getSkills(int i) {
        return skills.get(i);
    }

    public void addSkills(Skills skl) {

        skills.add(skl);
    }
}




