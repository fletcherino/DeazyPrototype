package com.team2.deazy_project.repositories;

import com.team2.deazy_project.caseStudies.CaseStudy;
import com.team2.deazy_project.caseStudies.Input;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProjectRepository {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public ProjectRepository(JdbcTemplate aTemplate) {
        jdbcTemplate = aTemplate;
    }

    //    @Override
    public List<CaseStudy> findAll() {
        return jdbcTemplate.query("select team_name, case_study_title, case_study_content, id from case_studies",
                new Object[]{},
                (rs, i) -> new CaseStudy(
                        rs.getString("team_name"),
                        rs.getString("case_study_title"),
                        rs.getString("case_study_content"),
                        rs.getInt("id")
                )
        );
    }

    //    @Override
    public int save(Input input) {
        return jdbcTemplate.update(
                "insert into case_studies (team_name, case_study_title, case_study_content) values(?,?,?)",
                input.getTeamName(), input.getTitle(), input.getContent());
    }
}