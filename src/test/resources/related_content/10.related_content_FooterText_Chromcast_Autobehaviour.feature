Feature:  As a Demo User I Validate chapters using Footer Text as Related content-Cromecast-Auto Behaviour 
Scenario Outline: Validate links,texts ,Play and Pause actions song info 

Given I Go to "<url>" on "<Browser>"
Then I Click On "<linktext>"Footer Text
Then I Wait For Some Time
Then I Wait Vedio For Some Time
Then I Click on Pause From Play Chapter
Then I Click On "<demolink>"Footer Text
Then I Scroll Vertically
Then I Click on Auto Behaviour Vedio
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
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Verify "<h1title>"h1Title
Then I Wait Vedio For Some Time
Then I Close Browser

Examples:
|url|Browser|linktext|demolink|h1title|
|https://demo.theoplayer.com|Chrome|//h2[contains(text(),'Related content')]|//a[@class='yellow'][contains(text(),'Chromecast')]|Go Big Screen With THEOplayer and Chromecast|
|https://demo.theoplayer.com|Firefox|//h2[contains(text(),'Related content')]|//a[@class='yellow'][contains(text(),'Chromecast')]|Go Big Screen With THEOplayer and Chromecast|
|https://demo.theoplayer.com|Edge|//h2[contains(text(),'Related content')]|//a[@class='yellow'][contains(text(),'Chromecast')]|Go Big Screen With THEOplayer and Chromecast|