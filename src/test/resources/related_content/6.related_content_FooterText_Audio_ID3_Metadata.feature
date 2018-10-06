Feature:  As a Demo User I Validate Audio ID3 Metadata
Scenario Outline: Validate links,texts ,Play and Pause actions song info 

Given I Go to "<url>" on "<Browser>"
Then I Click On "<footext>"Footer Text
Then I Wait For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Click on Pause From Play Chapter
Then I Click On "<linktext>"Footer Text
Then I Verify "<atitle>"audiTitle
Then I Click on Pause From Play Chapter
Then I Click on Mute From Play Chapter
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Click on Pause From Play Chapter
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Verify "<songartist>"songArtist
Then I Verify "<songtitle>"songTitle
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Close Browser


Examples:
|url|Browser|footext|linktext|atitle|songartist|songtitle|
|https://demo.theoplayer.com|Chrome| //h2[contains(text(),'Related content')]|//a[contains(text(),'Audio ID3')]|Audio ID3 Metadata|Greg Guidry|Goin' Down|
|https://demo.theoplayer.com|Firefox| //h2[contains(text(),'Related content')]|//a[contains(text(),'Audio ID3')]|Audio ID3 Metadata|Greg Guidry|Goin' Down|
|https://demo.theoplayer.com|Headless| //h2[contains(text(),'Related content')]|//a[contains(text(),'Audio ID3')]|Audio ID3 Metadata|Greg Guidry|Goin' Down|
|https://demo.theoplayer.com|Edge| //h2[contains(text(),'Related content')]|//a[contains(text(),'Audio ID3')]|Audio ID3 Metadata|Greg Guidry|Goin' Down|
