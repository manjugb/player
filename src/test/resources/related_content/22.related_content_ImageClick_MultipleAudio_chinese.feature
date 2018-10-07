Feature:  As a Demo User I Validate Multiple Audio Chinese
Scenario Outline: Validate links,texts ,Play and Pause actions 

Given I Go to "<url>" on "<Browser>"
Then I Click On "<imageName>"Image
Then I Wait For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Click On "<demolink>"Footer Text
And  I Verify "<h1tit>"h1Title
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Click on Pause From Play Chapter
Then I Click on Subtitles ON Play Chapter
Then  I Wait For Some Time
Then I Click on Chinios Sub Title
Then I Wait For Some Time
Then I Click on Subtitles ON Play Chapter
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Click on Play From Play Chapter
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Close Browser

Examples:
|url|Browser|imageName|demolink|h1tit|
|https://demo.theoplayer.com|Chrome|/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[2]/center[1]/div[1]/nav[1]/div[2]/div[1]/div[1]/a[1]/div[1]/div[1]/img[1]|//a[contains(text(),'Multiple audio')]|Multiple Audio and Multiple Language|
|https://demo.theoplayer.com|Firefox|/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[2]/center[1]/div[1]/nav[1]/div[2]/div[1]/div[1]/a[1]/div[1]/div[1]/img[1]|//a[contains(text(),'Multiple audio')]|Multiple Audio and Multiple Language|
|https://demo.theoplayer.com|Edge|/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[2]/center[1]/div[1]/nav[1]/div[2]/div[1]/div[1]/a[1]/div[1]/div[1]/img[1]|//a[contains(text(),'Multiple audio')]|Multiple Audio and Multiple Language|