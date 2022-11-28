package jp.co.lbm.bindjavascript

import android.webkit.JavascriptInterface

public class BindJavaScript {

    // sample.xmlの全項目
    @JavascriptInterface
    fun setSettingJSON(settings: String) {

    }

    @JavascriptInterface
    fun getSettingJSON(): String {
        return ""
    }

    @JavascriptInterface
    fun setSettingKEY(key: String, Value: String) {

    }


    @JavascriptInterface
    fun getSettingKEY(key: String): String {
        return "";
    }

    @JavascriptInterface
    fun getTerminalUUID(): String {
        return ""
    }

    @JavascriptInterface
    fun setTerminalJSON(terminal: String) {

    }

    @JavascriptInterface
    fun getTerminalJSON(): String {
        return ""
    }

    @JavascriptInterface
    fun callingTheWaitingPerson(json: String) {

    }

}