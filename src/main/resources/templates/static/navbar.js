// Create navigation bar element
const navbar = document.createElement("nav");
navbar.style.display = "flex";
navbar.style.justifyContent = "space-between";
navbar.style.alignItems = "center";
navbar.style.padding = "10px";
navbar.style.backgroundColor = "#333";
navbar.style.color = "white";
navbar.style.fontSize = "18px";

// Create left column element
const leftColumn = document.createElement("div");

// Create link elements for left column
const characterCreationLink = document.createElement("a");
characterCreationLink.href = "http://localhost:8080/characterSheet";
characterCreationLink.textContent = "Character Creation";
characterCreationLink.classList.add("active");

const npcCreationLink = document.createElement("a");
npcCreationLink.href = "http://localhost:8080/NPCSheet.html";
npcCreationLink.textContent = "NPC Creation";

// Append link elements to left column
leftColumn.appendChild(characterCreationLink);
leftColumn.appendChild(npcCreationLink);

// Create center column element with image anchor
const centerColumn = document.createElement("a");
centerColumn.href = "#";

const logoImage = document.createElement("img");
logoImage.src = "RedLegacy.png";
logoImage.alt = "Logo";
logoImage.style.maxHeight = "50px";
logoImage.style.margin = "0 auto";

centerColumn.appendChild(logoImage);

// Create right column element
const rightColumn = document.createElement("div");

// Create link elements for right column
const characterListLink = document.createElement("a");
characterListLink.href = "http://localhost:8080/characterList.html";
characterListLink.textContent = "Character List";

const npcListLink = document.createElement("a");
npcListLink.href = "http://localhost:8080/NPCList.html";
npcListLink.textContent = "NPC List";

// Append link elements to right column
rightColumn.appendChild(characterListLink);
rightColumn.appendChild(npcListLink);

// Append left, center, and right columns to navigation bar
navbar.appendChild(leftColumn);
navbar.appendChild(centerColumn);
navbar.appendChild(rightColumn);

// Add navigation bar to the page
document.body.prepend(navbar);
/*
In this example, we first create the navigation bar element using document.createElement and set its styles using the style property. We then create the left, center, and right columns as separate elements and append them to the navigation bar using appendChild.

We also create link elements for each column and set their href, textContent, and classList properties as needed. Finally, we add the link elements to their corresponding columns using appendChild.

Finally, we add the navigation bar to the body element using document.body.prepend. Note that this example assumes that you want to add the navigation bar to the top of the page, but you can modify this as needed.*/