Feature:  As a Demo User I Validate Protected content and list selected as DRM
Scenario Outline: Validate links,texts ,Play and Pause actions 

Given I Go to "<url>" on "<Browser>"
Then I Click On "<footertext>"Footer Text
Then I Wait For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Click On "<demolink>"Footer Text
Then I Scroll Vertically protected CONTENT
Then I Wait Vedio For Some Time
Then I Should Select "<listvalue>"listValue
Then I Wait For Some Time
Then I Wait For Some Time
And I Verify "<Note>"Note
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Click on Pause From Play Chapter
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Click and Pause
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Click on Pause From Play Chapter
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Close Browser


Examples:
|url|Browser|footertext|demolink|listvalue|Note|
|https://demo.theoplayer.com|Chrome|//h2[contains(text(),'Related content')]|//a[contains(text(),'Content protection')]|Digital Right Management|Note: the DRM example only supports Widevine and PlayReady.|
|https://demo.theoplayer.com|Firefox|//h2[contains(text(),'Related content')]|//a[contains(text(),'Content protection')]|Digital Right Management|Note: the DRM example only supports Widevine and PlayReady.|
|https://demo.theoplayer.com|Edge|//h2[contains(text(),'Related content')]|//a[contains(text(),'Content protection')]||Digital Right Management|Note: the DRM example only supports Widevine and PlayReady.|
