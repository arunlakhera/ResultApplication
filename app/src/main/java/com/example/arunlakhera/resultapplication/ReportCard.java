package com.example.arunlakhera.resultapplication;

public class ReportCard {

    private String m_StudentName;
    private int m_EnglishGrade;
    private int m_MathGrade;
    private int m_PhysicsGrade;
    private int m_ChemistryGrade;
    private int m_BiologyGrade;
    private int m_SocialScienceGrade;

    public ReportCard(String studentName, int englishGrade, int mathGrade, int physicsGrade, int chemistryGrade, int biologyGrade, int socialScienceGrade) {

        this.m_StudentName = studentName;
        this.m_EnglishGrade = englishGrade;
        this.m_MathGrade = mathGrade;
        this.m_PhysicsGrade = physicsGrade;
        this.m_ChemistryGrade = chemistryGrade;
        this.m_BiologyGrade = englishGrade;
        this.m_SocialScienceGrade = socialScienceGrade;
    }

    public String getM_StudentName() {
        return m_StudentName;
    }

    public void setM_StudentName(String m_StudentName) {
        this.m_StudentName = m_StudentName;
    }

    public int getM_EnglishGrade() {
        return m_EnglishGrade;
    }

    public void setM_EnglishGrade(int m_EnglishGrade) {
        this.m_EnglishGrade = m_EnglishGrade;
    }

    public int getM_MathGrade() {
        return m_MathGrade;
    }

    public void setM_MathGrade(int m_MathGrade) {
        this.m_MathGrade = m_MathGrade;
    }

    public int getM_PhysicsGrade() {
        return m_PhysicsGrade;
    }

    public void setM_PhysicsGrade(int m_PhysicsGrade) {
        this.m_PhysicsGrade = m_PhysicsGrade;
    }

    public int getM_ChemistryGrade() {
        return m_ChemistryGrade;
    }

    public void setM_ChemistryGrade(int m_ChemistryGrade) {
        this.m_ChemistryGrade = m_ChemistryGrade;
    }

    public int getM_BiologyGrade() {
        return m_BiologyGrade;
    }

    public void setM_BiologyGrade(int m_BiologyGrade) {
        this.m_BiologyGrade = m_BiologyGrade;
    }

    public int getM_SocialScienceGrade() {
        return m_SocialScienceGrade;
    }

    public void setM_SocialScienceGrade(int m_SocialScienceGrade) {
        this.m_SocialScienceGrade = m_SocialScienceGrade;
    }

    @Override
    public String toString() {
        return "Name: " + m_StudentName + "\n" +
                "English Grade: " + m_EnglishGrade + "\n" +
                "Math Grade: " + m_MathGrade + "\n" +
                "Physics Grade: " + m_PhysicsGrade + "\n" +
                "Chemistry Grade: " + m_ChemistryGrade + "\n" +
                "Biology Grade: " + m_BiologyGrade;
    }
}
