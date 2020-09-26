package com.team2.deazy_project.userPermissions;

public class General extends AllUsers {

    // The following constructor uses setters in the AllUsers class to create "Users" within the ArrayList "allUserArrayList".
    // If no inputs are sent to the constructor, all strings are returned as "null" and all booleans are returned as "false".
    // TODO - Need to create logic to check for blank inputs inputted into the fields either through the frontend or create a class in Java to deal with the logic.


    public General(
           String username,
           String password,
           String firstName,
           String lastName,
           String company,
           String email,
           String displayPicture
    ) {
        setUsername(username);
        setPassword(password);
        setFirstName(firstName);
        setlastName(lastName);
        setCompany(company);
        setEmail(email);
        setDisplayPicture(displayPicture);
        setRole("General");
        setCreateUser(false);
        setModifyUser(false);
        setDeleteUser(false);
        setFreezeUser(false);
        setSearchTeams(true);
        setSearchOwnProject(false);
        setSearchAllProject(true);
        setAddTestimonial(true);
        setRequestCaseStudy(false);
        setEditCaseStudy(true);
        setReviewCaseStudies(true);
        setCreateProject(true);


    }

    // The following constructor is the default constructor which is called when a child class inherits from this class.
    // Because the constructor has no parameters required, the child class parameters are all that are taken into account.
    // This is why "setUsername(), setPassword, ..." have not been included in this constructor.
    // As more booleans are created in the AllUsers class, the setters will also need to be added here.
    // TODO - add setters here when booleans are added into the AllUsers class.

    public General(){

        setCreateUser(false);
        setModifyUser(false);
        setDeleteUser(false);
        setFreezeUser(false);
        setSearchTeams(true);
        setSearchOwnProject(false);
        setSearchAllProject(true);
        setAddTestimonial(true);
        setRequestCaseStudy(false);
        setEditCaseStudy(true);
        setReviewCaseStudies(true);
        setCreateProject(true);
    }

}