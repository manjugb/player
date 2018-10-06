Feature:  As a Demo User I Validate Advertising with VAST 3.0, VMAP And VPAID 2.0 AND Google IMA
Scenario Outline: Validate links,texts ,Play and Pause actions and validate event logs when Play and Pause actions 

Given I Go to "<url>" on "<Browser>"
Then I Click On "<imageName>"Image
Then I Wait For Some Time
Then I Click on Pause From Play Chapter
Then I Scroll Bar
Then I Click On "<linktext>"Footer Text
And I Verify htitle Advertising as "<httitle>"
Then I Scroll Vertically
Then I Wait For Some Time
Then I Click First time Play Image
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Click on Pause From Play Chapter
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Scroll Vertically
Then I Click ylaplay
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
|url|Browser|imageName|linktext|httitle|
|https://demo.theoplayer.com|Chrome|/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[2]/center[1]/div[1]/nav[1]/div[2]/div[1]/div[1]/a[1]/div[1]/div[1]/img[1]|//a[contains(text(),'Advertising')]|Advertising with VAST 3.0, VMAP And VPAID 2.0 AND Google IMA|
|https://demo.theoplayer.com|Firefox|/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[2]/center[1]/div[1]/nav[1]/div[2]/div[1]/div[1]/a[1]/div[1]/div[1]/img[1]|//a[contains(text(),'Advertising')]|Advertising with VAST 3.0, VMAP And VPAID 2.0 AND Google IMA|
|https://demo.theoplayer.com|Headless|/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[2]/center[1]/div[1]/nav[1]/div[2]/div[1]/div[1]/a[1]/div[1]/div[1]/img[1]|//a[contains(text(),'Advertising')]|Advertising with VAST 3.0, VMAP And VPAID 2.0 AND Google IMA|
|https://demo.theoplayer.com|Edge|/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[2]/center[1]/div[1]/nav[1]/div[2]/div[1]/div[1]/a[1]/div[1]/div[1]/img[1]|//a[contains(text(),'Advertising')]|Advertising with VAST 3.0, VMAP And VPAID 2.0 AND Google IMA|
