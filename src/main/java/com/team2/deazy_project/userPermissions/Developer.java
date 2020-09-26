package com.team2.deazy_project.userPermissions;

public class Developer extends General {

    public Developer(
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
        setRole("Developer");
        setSearchOwnProject(true);
    }

}