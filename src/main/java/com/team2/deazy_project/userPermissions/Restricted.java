package com.team2.deazy_project.userPermissions;
public class Restricted extends AllUsers {

    public Restricted (
            String username,
            String password,
            String firstName,
            String lastName,
            String company,
            String email,
            String displayPicture
    ){
        setUsername(username);
        setPassword(password);
        setFirstName(firstName);
        setlastName(lastName);
        setCompany(company);
        setEmail(email);
        setDisplayPicture(displayPicture);
        setRole("Restricted");
        setCreateUser(false);
        setModifyUser(false);
        setDeleteUser(false);
        setFreezeUser(false);
        setSearchTeams(false);
        setSearchOwnProject(true);
        setSearchAllProject(false);
        setAddTestimonial(true);
        setRequestCaseStudy(true);
        setEditCaseStudy(true);
        setReviewCaseStudies(false);
        setCreateProject(true);
    }
}
