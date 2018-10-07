Feature:  As a Demo User I Validate Picture in Picture
Scenario Outline: Validate links,texts ,Play and Pause actions 

Given I Go to "<url>" on "<Browser>"
Then I Click On "<FooterText>"Image
Then I Wait For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Click on Pause From Play Chapter
Then I Click On "<demolink>"Footer Text
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Click on Language on Video Chapter
Then I Language one click
Then I Click on Language on Video Chapter
And  I Verify "<h1tit>"h1Title
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Click on Pause From Play Chapter
Then I Wait For Some Time
Then I Wait For Some Time
Then I Click on Language on Video Chapter
Then I Language Two click
Then I Click on Language on Video Chapter
Then I Wait For Some Time
Then I Wait For Some Time
Then I Scroll Vertically
Then I Wait For Some Time
Then I Wait For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Click on Play From Play Chapter
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Close Browser

Examples:
|url|Browser|FooterText|demolink|h1tit|
|https://demo.theoplayer.com|Chrome|//h2[contains(text(),'Related content')]|//a[contains(text(),'Picture-in-picture')]|Keep THEOplayer visible with picture-in-picture|
|https://demo.theoplayer.com|Firefox|//h2[contains(text(),'Related content')]|//a[contains(text(),'Picture-in-picture')]|Keep THEOplayer visible with picture-in-picture|
|https://demo.theoplayer.com|Edge|//h2[contains(text(),'Related content')]|//a[contains(text(),'Picture-in-picture')]|Keep THEOplayer visible with picture-in-picture|

