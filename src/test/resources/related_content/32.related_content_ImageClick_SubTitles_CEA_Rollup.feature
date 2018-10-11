Feature:  As a Demo User I Validate Protected content and list selected as CEA_608_Rollup
Scenario Outline: Validate links,texts ,Play and Pause actions 

Given I Go to "<url>" on "<Browser>"
Then I Click On "<imageName>"Image
Then I Wait For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Click On "<demolink>"Footer Text
Then I Should Select "<listvalue>"listValue
Then I Wait For Some Time
And  I Verify "<h1tit>"h1Title
Then I Wait For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Click on Pause From Play Chapter
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Click on Pause From Play Chapter
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Click on Subtitles ON Play Chapter
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Close Browser


Examples:
|url|Browser|imageName|demolink|listvalue|h1tit|
|https://demo.theoplayer.com|Chrome|/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[2]/center[1]/div[1]/nav[1]/div[2]/div[1]/div[1]/a[1]/div[1]/div[1]/img[1]|//a[contains(text(),'Subtitles')]|CEA608: Rollup and paint on|CEA Closed Captions and Subtitles With THEOplayer|
|https://demo.theoplayer.com|Firefox|/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[2]/center[1]/div[1]/nav[1]/div[2]/div[1]/div[1]/a[1]/div[1]/div[1]/img[1]|//a[contains(text(),'Subtitles')]|CEA608: Rollup and paint on|CEA Closed Captions and Subtitles With THEOplayer|
|https://demo.theoplayer.com|Edge|/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[2]/center[1]/div[1]/nav[1]/div[2]/div[1]/div[1]/a[1]/div[1]/div[1]/img[1]|//a[contains(text(),'Subtitles')]|CEA608: Rollup and paint on|CEA Closed Captions and Subtitles With THEOplayer|
