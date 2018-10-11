Feature:  As Demo User I will valid HLS DASH Player using Image Click with actions Play and Pause
Scenario Outline: Validate links,texts ,Play and Pause actions

Given I Go to "<url>" on "<Browser>"
Then I Click On "<imageName>"Image
Then I Wait For Some Time
And I Verify DemoHlsDashPage "<h1title>"h1title
Then I Click First time Play Image
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Click on Pause From Play Chapter
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Click on Mute From Play Chapter
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
And I Verify on Vedio Player "<ctime>"current time
And I Verify on Vedio Player "<durtime>"end time
Then I Click on Play From Play Chapter
Then I Click on UnMute From Play Chapter
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Verify DemoHlsDashPage "<enventlog>"EventLog
Then I Click on Play From Play Chapter
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Click on UnMute From Play Chapter
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Close Browser

Examples:
|url|Browser|imageName|h1title|strContent|ctime|durtime|enventlog|
|https://demo.theoplayer.com|Chrome|/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[2]/center[1]/div[1]/nav[1]/div[1]/a[1]/div[1]/div[1]/img[1]|THEOplayer playback statistics|Stream with no limits, in any browser or device with our Universal Video Player. Paste here your stream, then click the LOAD YOUR STREAMING button and experience THEOplayer in action.|00:05|10:53|Player paused playback|
|https://demo.theoplayer.com|Firefox|/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[2]/center[1]/div[1]/nav[1]/div[1]/a[1]/div[1]/div[1]/img[1]|THEOplayer playback statistics|Stream with no limits, in any browser or device with our Universal Video Player. Paste here your stream, then click the LOAD YOUR STREAMING button and experience THEOplayer in action.|00:057|10:53|Player paused playback|
|https://demo.theoplayer.com|Edge|/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[2]/center[1]/div[1]/nav[1]/div[1]/a[1]/div[1]/div[1]/img[1]|THEOplayer playback statistics|Stream with no limits, in any browser or device with our Universal Video Player. Paste here your stream, then click the LOAD YOUR STREAMING button and experience THEOplayer in action.|00:057|10:53|Player paused playback|
