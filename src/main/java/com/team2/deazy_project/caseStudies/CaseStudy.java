package com.team2.deazy_project.caseStudies;

public class CaseStudy {
    private String teamName;
    private String caseStudyTitle;
    private String caseStudyContent;
    private int id;

        public CaseStudy(
                String teamName,
                String caseStudyTitle,
                String caseStudyContent,
                int id){
            this.teamName = teamName;
            this.caseStudyTitle = caseStudyTitle;
            this.caseStudyContent = caseStudyContent;
            this.id = id;
        }





    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getCaseStudyTitle() {
        return caseStudyTitle;
    }

    public void setCaseStudyTitle(String caseStudyTitle) {
        this.caseStudyTitle = caseStudyTitle;
    }

    public String getCaseStudyContent() {
        return caseStudyContent;
    }

    public void setCaseStudyContent(String caseStudyContent) {
        this.caseStudyContent = caseStudyContent;
    }
}
