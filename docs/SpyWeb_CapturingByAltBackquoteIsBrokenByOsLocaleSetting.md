Spy web: Capturing by ALT+\` keystroke fails due to dependency on the Locale and Language settings of OS
====

## OS
Windows 7 (Locale and Language = ja_JP) with a Keyboard of JIS layout

## Katalon Studio Version
5.3.1.1

## Katalon Studio logs:
not relevant

## Environment (for Web testing)
Firefox 59.0.2

## Environment (for Mobile testing)
not relevant

## Steps to reproduce -
1. start Katalon Studio
2. File> New Sample Project > Sample WebUI Testing project and create the project in some diretory
3. call up "Spy Web"
4. set URL: http://demoaut.katalaon.com and Start with Firefox
5. Browser window opens and navigates to the CURA Healthcare Service page opened.
6. Hoover on mouse on "Make Appoint" button. The button is highlighted with RED border.
7. I press ALT + Backquote on my JIS-Layout Keyboard. No reaction. No highlit with GREEN border.

## Expected Behavior -
When I press key on the button, the button is highlighted with GREEN border and an object is captured by Object Spy.

## Actual Behavior -
No object captured

## My guess

People living in US would be using Windows PC of which Locale and Language settings=en_US with US-Layout Keyboard.

![Local Language settings: en_US](https://github.com/kazurayam/KeyCodeViewer/blob/master/docs/images/LocaleAndLanguage_DefaultLang=US.PNG?raw=true)
![US-Layout Keyboard](https://github.com/kazurayam/KeyCodeViewer/blob/master/docs/images/keyboardlayout-US.png?raw=true)

On the other hand I live outside US, I am using a Windonws PC of which Locale and Language settings=ja_JP with JIS-Layout Keyboard.

![My Locale and Settings is ja_JP](https://github.com/kazurayam/KeyCodeViewer/blob/master/docs/images/LocaleAndLanguage_DefaultLang=JP.PNG?raw=true)
![JIS-Layout Keyboard](https://github.com/kazurayam/KeyCodeViewer/blob/master/docs/images/keyboardlayout-JP.png?raw=true)

*Your attention please! The Backstroke ( \` ) is located on different place on those two Keyboard.*

The Spy Web would certainly be expecting the KeyCode emitted by Alt+Backquotes on US-Layout keyboard.

I thought that the KeyCode emitted by Alt+Backquote on JIS-Layout keyboard with Locale=ja_JP could be different from the one expected by Spy Web. If so there is no way capturing works with JIS-Keyboard.


# Sum up
The KeyCode emitted by keystroke of ALT+Backquote depends on the Locale and Language setting of Windows OS. Spy Web's Alt+Backstroke would work for those who use US-Layout Keyboard, but it would not work for those who use JIS-Layout Keybord.
