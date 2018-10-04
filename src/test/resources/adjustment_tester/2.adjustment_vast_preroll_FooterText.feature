Feature:  As a Demo User I Validate Adjustement Tester using Footer Text Click with actions Play and Pause
Scenario Outline: Validate links,texts ,Play and Pause actions and validate event logs when Play and Pause actions 

Given I Go to "<url>" on "<Browser>"
Then I Click On "<strFooterText>"Footer Text 
Then  I Wait For Some Time
And I Verify h1 adjustement "<h1titleadj>"Title
And I Verify "<adurl>"as Adurl
And I Verify "<vdurl>"as Vdurl
And I Verify "<content1>"Content1
And I Verify "<content2>"Content2
And I Verify "<content3>"Content3
Then I Click First time Play Image
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
And I Verify "<vcontent>"EventLog
And I Check Ad Contains "<adeventname>"EventLog
Then I Click on Pause From Play Chapter
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Click on Play From Play Chapter
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Click on Mute From Play Chapter
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Wait Vedio For Some Time
Then I Click on UnMute From Play Chapter
Then I Wait Vedio For Some Time
Then I Close Browser

Examples:
|url|Browser|strFooterText|h1titleadj|adurl|vdurl|content1|content2|content3|vontent|adeventname|
|https://demo.theoplayer.com|Chrome|Advertisement tester|THEOplayer 2.X: Advertisements Tester (VAST, VPAID, VMAP)|//cdn.theoplayer.com/demos/preroll.xml|//cdn.theoplayer.com/video/big_buck_bunny/big_buck_bunny_metadata.m3u8|This advertisement tester allows you to preview ads in THEOplayer.|Switch between VAST and VPAID ads with an ad position, or test your ads in VMAP, using the configuration panel at the right.|Learn more about our different client side advertisement solutions|The content will resume|adbreakbegin|
|https://demo.theoplayer.com|Firefox|Advertisement tester|THEOplayer 2.X: Advertisements Tester (VAST, VPAID, VMAP)|//cdn.theoplayer.com/demos/preroll.xml|//cdn.theoplayer.com/video/big_buck_bunny/big_buck_bunny_metadata.m3u8|This advertisement tester allows you to preview ads in THEOplayer.|Switch between VAST and VPAID ads with an ad position, or test your ads in VMAP, using the configuration panel at the right.|Learn more about our different client side advertisement solutions|The content will resume|adbreakbegin|
