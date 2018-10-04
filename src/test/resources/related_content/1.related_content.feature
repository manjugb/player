Feature:  As a Demo User I Validate Related content using Image Click with actions Play and Pause
Scenario Outline: Validate links,texts ,Play and Pause actions and validate event logs when Play and Pause actions 

Given I Go to "<url>" on "<Browser>"
Then I Click On "<imageName>"Image 
Then I Wait For Some Time
And I Verify RelatedContentPage "<h1title>"h1title
And I Verify RelatedContentPage "<h2title>"h2title
Then I Click First time Play Image
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
Then I Click on UnMute From Play Chapter
Then I Wait Vedio For Some Time
Then I Close Browser

Examples:
|url|Browser|imageName|h1title|h2title|
|https://demo.theoplayer.com|Chrome|/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[2]/center[1]/div[1]/nav[1]/div[2]/div[1]/div[1]/a[1]/div[1]/div[1]/img[1]|Promote similar videos with Related Content|About Related Content|	