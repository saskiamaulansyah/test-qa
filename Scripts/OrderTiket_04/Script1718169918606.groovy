import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.Rectangle as Rectangle

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev.etorpromotor.com/index.php/beli-tiket/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Beli/svg_-_bi-plus b-icon bi'))

WebUI.click(findTestObject('Object Repository/Page_Beli/button_Pesan Tiket'))

WebUI.click(findTestObject('Object Repository/Page_Beli/img_Nama Pemesan belum diisi_icon-12'))

WebUI.setText(findTestObject('Object Repository/Page_Beli/input_Data Pemesan_name'), 'test2014')

WebUI.setText(findTestObject('Object Repository/Page_Beli/input__phone'), '081123456789')

WebUI.setText(findTestObject('Object Repository/Page_Beli/input__email'), 'test2014@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Beli/button_Simpan Data'))

WebUI.click(findTestObject('Object Repository/Page_Beli/button_Tiket Category  GOLDIsi Data Pengunjung'))

WebUI.setText(findTestObject('Object Repository/Page_Beli/input_Data Pemesan_name'), 'test2014')

WebUI.setText(findTestObject('Object Repository/Page_Beli/input__phone'), '081123456789')

WebUI.setText(findTestObject('Object Repository/Page_Beli/input__email'), 'test2014@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Beli/button_Simpan Data'))

WebUI.click(findTestObject('Object Repository/Page_Beli/button_Pembayaran'))

WebUI.click(findTestObject('Object Repository/Page_Beli/button_Pembayaran_1'))

WebUI.click(findTestObject('Object Repository/Page_Beli/div_Kartu Kredit'))

WebUI.click(findTestObject('Object Repository/Page_Beli/input_Credit Card_payment'))

WebUI.click(findTestObject('Object Repository/Page_Beli/button_Bayar Pesanan'))

WebUI.switchToWindowTitle('Faspay Credit Card Payment Page')

WebUI.click(findTestObject('Object Repository/Page_Faspay/a_Cancel payment'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_MetalGO/div_Pembayaran GagalMohon Maaf, pembayaran _fcb983'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_MetalGO/p_Pembayaran Gagal'), 0)

WebUI.switchToWindowTitle('Beli Tiketmu Sekarang! – ETOR PROMOTOR')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Beli/p_Pembayaran Gagal'), 
    0)

WebUI.closeBrowser()

