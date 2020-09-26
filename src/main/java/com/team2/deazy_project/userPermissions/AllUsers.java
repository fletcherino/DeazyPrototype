package com.team2.deazy_project.userPermissions;

public abstract class AllUsers {

    // This is an abstract class which all user classes inherit from.
    // The purpose of this class is to restrict access to the way users are created and create the objects based off values set in this class.
    // Might use private variables instead of protected variables as the consistent use of getters and setters paired with current use of the inherited default constructor allows these to have private access.
    // If more variables are added to this class (specifically booleans), ensure that they are added to any constructors and default constructor inherited from this.

    // TODO - add moore variables here if needed & ensure they are added to the inherited constructors in other user classes.

    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String company;
    private String email;
    private String role;
    private String displayPicture;
    private boolean createUser;
    private boolean modifyUser;
    private boolean deleteUser;
    private boolean freezeUser;
    private boolean searchTeams;
    private boolean searchOwnProject;
    private boolean searchAllProject;
    private boolean addTestimonial;
    private boolean requestCaseStudy;
    private boolean editCaseStudy;
    private boolean reviewCaseStudies;
    private boolean createProject;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDisplayPicture() {
        return displayPicture;
    }

    public void setDisplayPicture(String displayPicture) {
        this.displayPicture = displayPicture;
    }

    public boolean isCreateUser() {
        return createUser;
    }

    public void setCreateUser(boolean createUser) {
        this.createUser = createUser;
    }

    public boolean isCreateProject() {
        return createProject;
    }

    public void setCreateProject(boolean createProject) {
        this.createProject = createProject;
    }

    public boolean isModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(boolean modifyUser) {
        this.modifyUser = modifyUser;
    }

    public boolean isDeleteUser() {
        return deleteUser;
    }

    public void setDeleteUser(boolean deleteUser) {
        this.deleteUser = deleteUser;
    }

    public boolean isFreezeUser() {
        return freezeUser;
    }

    public void setFreezeUser(boolean freezeUser) {
        this.freezeUser = freezeUser;
    }

    public boolean isSearchTeams() {
        return searchTeams;
    }

    public void setSearchTeams(boolean searchTeams) {
        this.searchTeams = searchTeams;
    }

    public boolean isSearchOwnProject() {
        return searchOwnProject;
    }

    public void setSearchOwnProject(boolean searchOwnProject) {
        this.searchOwnProject = searchOwnProject;
    }

    public boolean isSearchAllProject() {
        return searchAllProject;
    }

    public void setSearchAllProject(boolean searchAllProject) {
        this.searchAllProject = searchAllProject;
    }

    public boolean isAddTestimonial() {
        return addTestimonial;
    }

    public void setAddTestimonial(boolean addTestimonial) {
        this.addTestimonial = addTestimonial;
    }

    public boolean isRequestCaseStudy() {
        return requestCaseStudy;
    }

    public void setRequestCaseStudy(boolean requestCaseStudy) {
        this.requestCaseStudy = requestCaseStudy;
    }

    public boolean isEditCaseStudy() {
        return editCaseStudy;
    }

    public void setEditCaseStudy(boolean editCaseStudy) {
        this.editCaseStudy = editCaseStudy;
    }

    public boolean isReviewCaseStudies() {
        return reviewCaseStudies;
    }

    public void setReviewCaseStudies(boolean reviewCaseStudies) {
        this.reviewCaseStudies = reviewCaseStudies;
    }
}
