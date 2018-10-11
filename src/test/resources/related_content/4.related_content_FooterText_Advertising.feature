Feature:  As a Demo User I Validate Advertising with VAST 3.0, VMAP And VPAID 2.0 AND Google IMA
Scenario Outline: Validate links,texts ,Play and Pause actions and validate event logs when Play and Pause actions 

Given I Go to "<url>" on "<Browser>"
Then I Click On "<Linktext>"Image
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
|url|Browser|Linktext|linktext|httitle|
|https://demo.theoplayer.com|Chrome|//h2[contains(text(),'Related content')]|//a[contains(text(),'Advertising')]|Advertising with VAST 3.0, VMAP And VPAID 2.0 AND Google IMA|
|https://demo.theoplayer.com|Firefox|//h2[contains(text(),'Related content')]|//a[contains(text(),'Advertising')]|Advertising with VAST 3.0, VMAP And VPAID 2.0 AND Google IMA|
|https://demo.theoplayer.com|Edge|//h2[contains(text(),'Related content')]|//a[contains(text(),'Advertising')]|Advertising with VAST 3.0, VMAP And VPAID 2.0 AND Google IMA|
