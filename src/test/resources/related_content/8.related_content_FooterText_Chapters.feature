Feature:  As a Demo User I Validate chapters using Image Click 
Scenario Outline: Validate links,texts ,Play and Pause actions song info 

Given I Go to "<url>" on "<Browser>"
Then I Click On "<linktext>"Image
Then I Wait For Some Time
Then I Wait Vedio For Some Time
Then I Click on Pause From Play Chapter
Then I Click On "<demolink>"Footer Text
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Click on Pause From Play Chapter
Then I Wait Vedio For Some Time
Then I Click on Mute From Play Chapter
Then I Click on Play From Play Chapter
Then I Verify "<h1title>"h1Title
Then I Wait Vedio For Some Time
Then I Close Browser

Examples:
|url|Browser|linktext|demolink|h1title|
|https://demo.theoplayer.com|Chrome|//h2[contains(text(),'Related content')]|//a[contains(text(),'Chapters')]|Optimally present your content with chapter markers|
|https://demo.theoplayer.com|Firefox| //h2[contains(text(),'Related content')]|//a[contains(text(),'Chapters')]|Optimally present your content with chapter markers|
|https://demo.theoplayer.com|Edge|//h2[contains(text(),'Related content')]|//a[contains(text(),'Chapters')]|Optimally present your content with chapter markers|
