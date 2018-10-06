Feature:  As a Demo User I Validate chapters using FooterText Related Content-Manual Behaviour
Scenario Outline: Validate links,texts ,Play and Pause actions song info 

Given I Go to "<url>" on "<Browser>"
Then I Click On "<foottext>"Footer Text
Then I Wait For Some Time
Then I Wait Vedio For Some Time
Then I Click on Pause From Play Chapter
Then I Click On "<demolink>"Footer Text
Then I Scroll Vertically ChromeCast
Then I Click on Manual Behaviour Vedio
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Verify "<h1title>"h1Title
Then I Wait Vedio For Some Time
Then I Close Browser

Examples:
|url|Browser|foottext|demolink|h1title|
|https://demo.theoplayer.com|Chrome|//h2[contains(text(),'Related content')]|//a[@class='yellow'][contains(text(),'Chromecast')]|Go Big Screen With THEOplayer and Chromecast|
|https://demo.theoplayer.com|Firefox|//h2[contains(text(),'Related content')]|//a[@class='yellow'][contains(text(),'Chromecast')]|Go Big Screen With THEOplayer and Chromecast|
|https://demo.theoplayer.com|Edge|/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[2]/center[1]/div[1]/nav[1]/div[2]/div[1]/div[1]/a[1]/div[1]/div[1]/img[1]|//a[@class='yellow'][contains(text(),'Chromecast')]|Go Big Screen With THEOplayer and Chromecast|