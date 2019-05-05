package com.company;

public class Skills {
    private String skillName;
    private String skillCompetency;

    public Skills() {
    }

    public Skills(String skillName, String skillCompetency) {
        this.skillName = skillName;
        this.skillCompetency = skillCompetency;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getSkillCompetency() {
        return skillCompetency;
    }

    public void setSkillCompetency(String skillCompetency) {
        this.skillCompetency = skillCompetency;
    }

    public void displaySkills(){
        System.out.println(getSkillName() + " " + getSkillCompetency());
    }
}
