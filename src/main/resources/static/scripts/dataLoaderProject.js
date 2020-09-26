console.log(data);

var length = data.length;

var main = document.getElementsByTagName("main")[0];

var projectsOuterBox = document.getElementById("projectsOuterBox");

for(var j = 0; j < length; j++){

    var projectsInnerBox = document.createElement("div");
    projectsInnerBox.setAttribute("class", "projectsInnerBox");

    var teamProTitleBox = document.createElement("div");
    teamProTitleBox.setAttribute("class", "teamProTitleBox");

    var teamProTitle = document.createElement("p");
    teamProTitle.setAttribute("class", "teamProTitle");

    var teamNameBox = document.createElement("div");
    teamNameBox.setAttribute("class", "teamNameBox");

    var teamName = document.createElement("p");
    teamName.setAttribute("class", "teamName");

    var teamLinkBox = document.createElement("div");
    teamLinkBox.setAttribute("class", "teamLinkBox");

    var teamProjectLink = document.createElement("a");
    teamProjectLink.setAttribute("class", "teamProjectLink");
    teamProjectLink.innerHTML = "Link to the project";

    var teamPDBox = document.createElement("div");
    teamPDBox.setAttribute("class", "teamPDBox");

    var teamProDesc = document.createElement("p");
    teamProDesc.setAttribute("class", "teamProDesc");

    var tagsBox = document.createElement("div");
    tagsBox.setAttribute("class", "tagsBox");

    var tags = document.createElement("p");
    tags.setAttribute("class", "tags");

    teamName.innerHTML = data[j].team;
    teamProTitle.innerHTML = data[j].name;
    teamProjectLink.href = data[j].link;
    teamProDesc.innerHTML = data[j].description;
    tags.innerHTML = data[j].tag;


    teamProTitleBox.appendChild(teamProTitle);
    teamNameBox.appendChild(teamName);
    teamLinkBox.appendChild(teamProjectLink);
    teamPDBox.appendChild(teamProDesc);
    tagsBox.appendChild(tags);

    projectsInnerBox.appendChild(teamProTitleBox);
    projectsInnerBox.appendChild(teamNameBox);
    projectsInnerBox.appendChild(teamLinkBox);
    projectsInnerBox.appendChild(teamPDBox);
    projectsInnerBox.appendChild(tagsBox);

    projectsOuterBox.appendChild(projectsInnerBox);
}

main.appendChild(projectsOuterBox);
