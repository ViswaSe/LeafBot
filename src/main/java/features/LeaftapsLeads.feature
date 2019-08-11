Feature: Leaftaps Login

Scenario Outline: TC_001_CreateLead

Given Enter the username as <username>
And Enter the password as <password>
And Click on Login Button
And Click crmsfa link button
And Click Leads link 
And Click CreateLead Link
And Enter the companyname as <companyname>
And Enter the firstname as <firstname>
And Enter the lastname as <lastname>

When Click on CreateLeadButton
Then Lead should be created successfully with firstname as <firstName>

Examples:
|username|password|companyname|firstname|lastname|
|DemoSalesManager|crmsfa|Aspire Systems|Vishveshwar|Duraiswamy|
|DemoCSR|crmsfa|Aspire Systems|Vishvesh|D|
