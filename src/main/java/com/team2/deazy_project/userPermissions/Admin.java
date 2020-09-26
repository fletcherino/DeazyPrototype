package com.team2.deazy_project.userPermissions;

public class Admin extends General {

    // The Admin user class inherits from the default constructor in the General user class and also inherits the getters and setters in the AllUsers class.
    // The aim of this was to limit the required duplicate code but also to allow for extended types of users in the future.


    public Admin(
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
        setRole("Admin");
        setCreateUser(true);
        setModifyUser(true);
        setDeleteUser(true);
        setFreezeUser(true);
    }



}