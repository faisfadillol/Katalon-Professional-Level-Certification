
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import com.kms.katalon.core.testobject.TestObject

import java.lang.String

import org.openqa.selenium.WebElement

import java.util.List


 /**
	 * Check if element present in timeout
	 * @param to Katalon test object
	 * @param timeout time to wait for element to show up 
	 * @return true if element present, otherwise false
	 */ 
def static "com.example.WebUICustomKeywords.isElementPresent"(
    	TestObject to	
     , 	int timeout	) {
    (new com.example.WebUICustomKeywords()).isElementPresent(
        	to
         , 	timeout)
}

 /**
	 * Get all rows of HTML table
	 * @param table Katalon test object represent for HTML table
	 * @param outerTagName outer tag name of TR tag, usually is TBODY
	 * @return All rows inside HTML table 
	 */ 
def static "com.example.WebUICustomKeywords.getHtmlTableRows"(
    	TestObject table	
     , 	String outerTagName	) {
    (new com.example.WebUICustomKeywords()).getHtmlTableRows(
        	table
         , 	outerTagName)
}

 /**
	 * Get all cells of HTML table row
	 * @param row a WebElement instance represent for HTML table row 
	 * @param tagName HTML column tag name, usually is TD/TH
	 * @return All cells inside HTML table row 
	 */ 
def static "com.example.WebUICustomKeywords.getHtmlTableColumns"(
    	WebElement row	
     , 	String tagName	) {
    (new com.example.WebUICustomKeywords()).getHtmlTableColumns(
        	row
         , 	tagName)
}


def static "randomData.TestDataGenerator.getRandomParagraphs"(
    	int a	
     , 	int b	) {
    (new randomData.TestDataGenerator()).getRandomParagraphs(
        	a
         , 	b)
}


def static "randomData.TestDataGenerator.getRandomName"(
    	int a	
     , 	int b	) {
    (new randomData.TestDataGenerator()).getRandomName(
        	a
         , 	b)
}


def static "randomData.TestDataGenerator.getRandomFemaleName"() {
    (new randomData.TestDataGenerator()).getRandomFemaleName()
}


def static "randomData.TestDataGenerator.getRandomMaleName"() {
    (new randomData.TestDataGenerator()).getRandomMaleName()
}


def static "randomData.TestDataGenerator.getRandomFirstName"() {
    (new randomData.TestDataGenerator()).getRandomFirstName()
}


def static "randomData.TestDataGenerator.getRandomLastName"() {
    (new randomData.TestDataGenerator()).getRandomLastName()
}


def static "randomData.TestDataGenerator.getRandomCity"() {
    (new randomData.TestDataGenerator()).getRandomCity()
}


def static "randomData.TestDataGenerator.getRandomHeading"(
    	int numberofWords	) {
    (new randomData.TestDataGenerator()).getRandomHeading(
        	numberofWords)
}


def static "randomData.TestDataGenerator.getRandomHeading_two"(
    	int Wordsfrom	
     , 	int wordstwo	) {
    (new randomData.TestDataGenerator()).getRandomHeading_two(
        	Wordsfrom
         , 	wordstwo)
}


def static "randomData.TestDataGenerator.getRandomEmail"() {
    (new randomData.TestDataGenerator()).getRandomEmail()
}


def static "randomData.TestDataGenerator.set_RandomNumber"(
    	long len	) {
    (new randomData.TestDataGenerator()).set_RandomNumber(
        	len)
}


def static "randomData.TestDataGenerator.set_RandomNumberWithText"(
    	int length	) {
    (new randomData.TestDataGenerator()).set_RandomNumberWithText(
        	length)
}


def static "newpackage.VerifyDrodownValues_AlphabeticalOrder.verifyOptionsInDropdownInAphabeticalOrder"(
    	TestObject objectto	) {
    (new newpackage.VerifyDrodownValues_AlphabeticalOrder()).verifyOptionsInDropdownInAphabeticalOrder(
        	objectto)
}


def static "newpackage.VerifyExpectedAndActualOptionsInDropdown.VerifyExpectedAndActual"(
    	TestObject objectto	
     , 	java.util.List<String> listOfOptions	) {
    (new newpackage.VerifyExpectedAndActualOptionsInDropdown()).VerifyExpectedAndActual(
        	objectto
         , 	listOfOptions)
}


def static "newpackage.HighlightElement.run"(
    	TestObject objectto	) {
    (new newpackage.HighlightElement()).run(
        	objectto)
}
