Feature:  As a Demo User I Validate Preview Thumbnail
Scenario Outline: Validate links,texts ,Play and Pause actions 

Given I Go to "<url>" on "<Browser>"
Then I Click On "<foottext>"Footer Text
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
|url|Browser|foottext|demolink|h1tit|poption|
|https://demo.theoplayer.com|Chrome|//h2[contains(text(),'Related content')]|//a[contains(text(),'Preview thumbnail')]|Preview Thumbnails with THEOplayer|Normal|
|https://demo.theoplayer.com|Firefox|//h2[contains(text(),'Related content')]|//a[contains(text(),'Preview thumbnail')]|Preview Thumbnails with THEOplayer|Normal|
|https://demo.theoplayer.com|Edge|//h2[contains(text(),'Related content')]|//a[contains(text(),'Preview thumbnail')]|Preview Thumbnails with THEOplayer|Normal|