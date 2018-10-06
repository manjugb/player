Feature:  As a Demo User I will go look and home page verify information about Theo Player
Scenario Outline: Validate links and Text from the home Page

Given I Go to "<url>" on "<Browser>"
And  I Verify h1 "<h1title>"Title
And I Verify Contains "<cnttext>"Text
And I Verify h3 "<h3title>"Title
Then I Wait For Some Time
Then I Close Browser

Examples:
|url|Browser|h1title|cnttext|h3title|
|https://demo.theoplayer.com|Chrome|Discover what the Universal Video Player can do|Every device. Every platform. No plugins.|Do you want to get started with THEOplayer?|
|https://demo.theoplayer.com|Firefox|Discover what the Universal Video Player can do|Every device. Every platform. No plugins.|Do you want to get started with THEOplayer?|