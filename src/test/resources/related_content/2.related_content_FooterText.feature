Feature:  As a Demo User I Validate Related content using Footer Text with actions Play and Pause
Scenario Outline: Validate links,texts ,Play and Pause actions and validate event logs when Play and Pause actions 

Given I Go to "<url>" on "<Browser>"
Then I Click On "<FooterText>"Footer Text
Then I Wait For Some Time
Then I Wait For Some Time
Then I Wait For Some Time
Then I Scroll Bar
And I Verify RelatedContentPage "<h1title>"h1title
And I Verify RelatedContentPage "<h2title>"h2title
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Click on Pause From Play Chapter
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Click on Play From Play Chapter
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Click on Mute From Play Chapter
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Click on Pause From Play Chapter
Then I Click on UnMute From Play Chapter
Then I Close Browser


Examples:
|url|Browser|FooterText|h1title|h2title|
|https://demo.theoplayer.com|Chrome|//h2[contains(text(),'Related content')]|Promote similar videos with Related Content|About Related Content|
|https://demo.theoplayer.com|Firefox|//h2[contains(text(),'Related content')]|Promote similar videos with Related Content|About Related Content|

	