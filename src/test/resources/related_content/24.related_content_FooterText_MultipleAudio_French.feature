Feature:  As a Demo User I Validate Multiple Audio French
Scenario Outline: Validate links,texts ,Play and Pause actions 

Given I Go to "<url>" on "<Browser>"
Then I Click On "<footertext>"Image
Then I Wait For Some Time
Then I Click on Pause From Play Chapter
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Click On "<demolink>"Footer Text
And  I Verify "<h1tit>"h1Title
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Click on Pause From Play Chapter
Then I Click on Subtitles ON Play Chapter
Then I Wait For Some Time
Then I Click on French Sub Title
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
|url|Browser|footertext|demolink|h1tit|
|https://demo.theoplayer.com|Chrome|//h2[contains(text(),'Related content')]|//a[contains(text(),'Multiple audio')]|Multiple Audio and Multiple Language|
|https://demo.theoplayer.com|Firefox|//h2[contains(text(),'Related content')]|//a[contains(text(),'Multiple audio')]|Multiple Audio and Multiple Language|
|https://demo.theoplayer.com|Edge|//h2[contains(text(),'Related content')]|//a[contains(text(),'Multiple audio')]|Multiple Audio and Multiple Language|