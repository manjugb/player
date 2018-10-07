Feature:  As a Demo User I Validate Picture in Picture
Scenario Outline: Validate links,texts ,Play and Pause actions 

Given I Go to "<url>" on "<Browser>"
Then I Click On "<FooterText>"Footer Text
Then I Wait For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Click on Pause From Play Chapter
Then I Click On "<demolink>"Footer Text
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
And  I Verify "<h1tit>"h1Title
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Click on Pause From Play Chapter
Then I Wait For Some Time
Then I Wait For Some Time
Then I Wait For Some Time
Then I Wait For Some Time
Then I Click on Subtitles ON Play Chapter
Then I Wait For Some Time
Then I Click on French Sub Title
Then I Click on Subtitles ON Play Chapter
Then I Wait For Some Time
Then I Wait For Some Time
Then I Click on Playback Rate
Then I Choose Playback "<poption>"Option
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Click on Play From Play Chapter
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Close Browser

Examples:
|url|Browser|FooterText|demolink|h1tit|poption|
|https://demo.theoplayer.com|Chrome|//h2[contains(text(),'Related content')]|//a[contains(text(),'Playback speed')]|Playback Speed with THEOplayer: Slow Motion or High Speed|Options|
|https://demo.theoplayer.com|Firefox|//h2[contains(text(),'Related content')]|//a[contains(text(),'Playback speed')]|Playback Speed with THEOplayer: Slow Motion or High Speed|Normal|
|https://demo.theoplayer.com|Edge|//h2[contains(text(),'Related content')]|//a[contains(text(),'Playback speed')]|Playback Speed with THEOplayer: Slow Motion or High Speed|Normal|



