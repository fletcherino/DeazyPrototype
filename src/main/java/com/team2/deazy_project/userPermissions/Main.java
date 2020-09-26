package com.team2.deazy_project.userPermissions;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        ArrayList<AllUsers> allUserArrayList = new ArrayList<>();

        // The following code adds test users to the allUserArrayList.
        // The user object requires a username, password, firstName, lastName, company, email & displayPicture.
        // The display picture should be an optional field, and if the field is none, return a default display picture already in the /images/ directory.


        // TODO - create logic for checking user inputs are valid for each field. This could either be done in the frontend, in a separate class, or checked in both.

        Scanner scanner = new Scanner(System.in);

        String username;
        String password;
        String firstName;
        String lastName;
        String company;
        String email;
        String displayPicture;



    System.out.println
            ("Please enter the role which you would like the user to have: ");

    String role = scanner.next();
    String roleLower = role.toLowerCase();

    System.out.println
            ("Please enter the the username for the user: ");
    username = scanner.next();
    System.out.println
            ("Please enter the the password for the user: ");
    password = scanner.next();
    System.out.println
            ("Please enter the the first name for the user: ");
    firstName = scanner.next();
    System.out.println
            ("Please enter the the lastName for the user: ");
    lastName = scanner.next();
    System.out.println
            ("Please enter the the company for the user: ");
    company = scanner.next();
    System.out.println
            ("Please enter the the email for the user: ");

    email = scanner.next();
    displayPicture = "/images/" + username + ".png";

// The following code creates a user based on the input from the scanner above.
    // Each option is a case as part of the switch and creates an object of type AllUser to the allUserArrayList made in its own unique class.
    // If the input doesn't match a role, it simply returns an error.

    switch (roleLower) {

        case "admin": {
            allUserArrayList.add(new Admin(
                    username,
                    password,
                    firstName,
                    lastName,
                    company,
                    email,
                    displayPicture));
            break;
        }
        case "developer": {
            allUserArrayList.add(new Developer(
                    username,
                    password,
                    firstName,
                    lastName,
                    company,
                    email,
                    displayPicture));
            break;
        }

        case "general": {
            allUserArrayList.add(new General(
                    username,
                    password,
                    firstName,
                    lastName,
                    company,
                    email,
                    displayPicture));
            break;
        }

        case "restricted": {
            allUserArrayList.add(new Restricted(
                    username,
                    password,
                    firstName,
                    lastName,
                    company,
                    email,
                    displayPicture));
            break;
        }

        default: {
            System.out.println("Something went wrong, most likely because " + role + " is not a valid role.");
            System.out.println();
            System.out.println("Restarting...");
            System.out.println("_________________________________________");
            System.out.println();
        }

    }





        for (int i = 0; i < allUserArrayList.size(); i++) {


            //       The following would be the way to implement the values inputted into the MySQL database.
            //
            //       statement.executeUpdate("INSERT INTO Users " + "VALUES (allUserArrayList.get(i).getUsername(),

            System.out.println(
                    "Username: " + allUserArrayList.get(i).getUsername() + "  |  Password : " + allUserArrayList.get(i).getPassword() + "  |  First Name: " + allUserArrayList.get(i).getFirstName() + "  |  lastName: " + allUserArrayList.get(i).getlastName() + "  |  Company: " + allUserArrayList.get(i).getCompany() + "  |  Email: " + allUserArrayList.get(i).getEmail() + "  |  Role: " + allUserArrayList.get(i).getRole() + "  |  Display Picture: " + allUserArrayList.get(i).getDisplayPicture() + "  |  Create User: " + allUserArrayList.get(i).isCreateUser() + "  |  Modify User: " + allUserArrayList.get(i).isModifyUser() + "  |  Delete User: " + allUserArrayList.get(i).isDeleteUser() + "  |  Freeze User: " + allUserArrayList.get(i).isFreezeUser() + "  |  Search Teams: " + allUserArrayList.get(i).isSearchTeams() + "  |  Search Own Projects: " + allUserArrayList.get(i).isSearchOwnProject() + "  |  Search All Projects: " + allUserArrayList.get(i).isSearchAllProject() + "  |  Add Testimonial: " + allUserArrayList.get(i).isAddTestimonial() + "  |  Request Case Study: " + allUserArrayList.get(i).isRequestCaseStudy() + "  |  Edit Case Study: " + allUserArrayList.get(i).isEditCaseStudy() + "  |  Review Case Study: " + allUserArrayList.get(i).isReviewCaseStudies() + "  |  Create Project: " + allUserArrayList.get(i).isCreateProject());
        }
    }
}
