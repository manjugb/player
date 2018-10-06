Feature:  As a Demo User I Validate chapters using Image Click 
Scenario Outline: Validate links,texts ,Play and Pause actions song info 

Given I Go to "<url>" on "<Browser>"
Then I Click On "<image>"Footer Text
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
Then I Click on Pause From Play Chapter
Then I Verify "<h1title>"h1Title
Then I Wait Vedio For Some Time
Then I Close Browser

Examples:
|url|Browser|image|demolink|h1title|
|https://demo.theoplayer.com|Chrome|/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[2]/center[1]/div[1]/nav[1]/div[2]/div[1]/div[1]/a[1]/div[1]/div[1]/img[1]|//a[contains(text(),'Chapters')]|Optimally present your content with chapter markers|
|https://demo.theoplayer.com|Firefox|/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[2]/center[1]/div[1]/nav[1]/div[2]/div[1]/div[1]/a[1]/div[1]/div[1]/img[1]|//a[contains(text(),'Chapters')]|Optimally present your content with chapter markers|
|https://demo.theoplayer.com|Edge|/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[2]/center[1]/div[1]/nav[1]/div[2]/div[1]/div[1]/a[1]/div[1]/div[1]/img[1]|//a[contains(text(),'Chapters')]|Optimally present your content with chapter markers|
