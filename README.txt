ASSESMENT 6: CRM

1. Description
The present project consists con a first version of a Customer Relationship Management (CRM) wich objective is to enable to create, edit and
show a list of project opportunities (project that is still being defined), which could became client opportunities (a defined project that
suppose the formalization of the contract). There will be also a page to show the contacts (all the interactions made with the entity that 
has contracted our services), a calendar and data profile. 

Once you access to the page, the first thing that can be seen is the data profile and a fixed menu on the left side of the screen with 6 
buttons: Profile (the main page that shows the users information), Entities (which leads to a page with a list of business or individuals
with whom there are ongoing  project, status:not completed), Contact or interactions (which leads to a page with a list of interactions
made for the development of a project  project), Project Opportunities, Clients Project and Calendar (which should lead to a calendar).

In the page of Project Opportunity, there is also a button on the right of the title that enable the user to add new project opportunities
and leads to another page with a form that asks for the Opportunity Name, the Entity Name, the First contact (first interaction of the 
project), starting date and description. This button is also present in Clients Project but its form page is not ready yet. 

For the moment, the functional pages are the profile, which takes the data from the java programme (with spring), the navigation, tests 
made with selenium to check the functionality of the front (two test: 1º to check that the username is not empty and therefore we are 
taking information from the backend and 2º to check the navigation and that it's possible to introduce data in the form of "new project
opportunity", although the data introduced is not taken but the java programme yet). 

On the backend part of the project, the entities are created. The controllers are also created for eachone (except for ProjectEntity), but 
currently, the only one with a working method is the MainUserController (getUsername method), which create default data to give it to the 
front. The tests of the controllers are created for eachone too (except for ProjectEntity), but currently, the only one with a working test 
is the MainUserControllerTest getUsersData_dataAvailable test). It checks that entityName, email, entityID, address and phone of MainUser 
are not empty. There is also a file of selenium to test the pages. 

2.How to use
First, it's needed to run the java program (string data should appear on http://localhost:8080/crmentitymain). Then, run the react project
(the main page which let us start the navigation should appear on https://localhost:3000/). We can check that the selenium part of the 
java programs works.