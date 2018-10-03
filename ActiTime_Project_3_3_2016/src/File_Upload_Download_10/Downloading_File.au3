#include <file.au3>

_Log("----new session----")

if $CmdLine[0] <> 3 then
; Arguments are not enough
 msgbox(0,"Error","Supply all the Arguments, Browser name and path to upload")
_Log("Arguments are wrong")
Exit
EndIf

;Activate firefox/IE browser
If (StringCompare($CmdLine[1],"firefox",0) = 0) Then
    $waitTime=$CmdLine[3]
    if (WinWait("[Class:MozillaDialogClass]","",$waitTime)==0) Then
        _Log("Window Not Found From FireFox")
    Else
    _Log("Waiting For Download Window From FireFox")
    _FFDownload()
    EndIf

ElseIf (StringCompare($CmdLine[1],"ie",0) = 0) Then
    WinWait("File Download - Security Warning")
    _Log("Waiting For Download Window From IE")
    _IEDownload()
Else
    Exit
EndIf
;Used For IE and Tested on IE6
Func _IEDownload()

    $hResult = WinActivate("File Download - Security Warning")
    If($hResult == 0) Then
        _Log("Unable to find Download Window from IE")
    Else
        $IETitle=WinGetTitle("File Download - Security Warning")
        _Log("Download Window activated"&$IETitle)
        WinActivate($IETitle)
        ControlClick($IETitle, "","[CLASS:Button; INSTANCE:2]")
        _Log("FileChooser Window opend")
        _Log("CommandLine Parameter Found and Value is:"&$CmdLine[2])
        WinActivate("Save As")
        _Log("FileChooser Window opend"&WinGetTitle("Save As"))
        ControlSetText(WinGetTitle("Save As"),"","Edit1",$CmdLine[2])
        Send("!s")
    EndIf
EndFunc

;Used for FireFox Browser
Func _FFDownload()
    $hResult = WinActivate("[Class:MozillaDialogClass]");

    If($hResult == 0) Then
        _Log("Unable to find Download Window From FireFox")
    Else
        ; If firefox is set the save the file on some specif location without asking to user.
        ; It will be save after this point.
        ;If not A new Dialog will appear prompting for Path to save
        _Log("Download Window activated")
        ;To change the focus on save button
        Send("{TAB}")
        Sleep(400)
        Send("{TAB}")
        _Log("Change Focus to Save Button")
        ;This is use for if dialoguebox have save and openwith option
        Send("!s")
        ;Click on Enter to Save
        Sleep(400)
        Send("{ENTER}")
        _Log("Press Enter")
        Sleep(400)

        If(WinExists(WinGetTitle("[active]"))) Then
            WinActivate("Enter name of file to save to…")
            $title = WinGetTitle("[active]")
            if($title=="Enter name of file to save to…")Then
            _Log("Active Window Title Is:"&WinGetTitle("[active]") )
            _Log("EnterName Window Opened And Tiltle is:"&$title)
            ControlSetText($title,"","Edit1",$CmdLine[2])
            ; Save File
            _Log("CommandLine Parameter Found For FilePath and Value is:"&$CmdLine[2])
            Send("!s")
            EndIf
        EndIf

    EndIf
EndFunc
;used for logging
Func _Log($sLogMsg)
_FileWriteLog(@ScriptDir & "\AutoItLog.log",$sLogMsg)
EndFunc