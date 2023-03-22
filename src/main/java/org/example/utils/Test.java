package org.example.utils;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.apache.pdfbox.multipdf.PDFMergerUtility;
import org.dom4j.DocumentException;
import org.example.WebHook;
import org.jsoup.Jsoup;
import org.springframework.core.io.FileSystemResource;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.support.StandardMultipartHttpServletRequest;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.security.KeyStore;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
public class Test {
    public static void main(String[] args) throws ParseException {
        Map<Integer,WebHook> map= new HashMap<>();
//        map.put(1,(new WebHook("222","111","111","0010","10010","10100","101010","1010100",
//                LocalDateTime.now())));


//        List<WebHook> result= new ArrayList<>();
//            try {
//                result.add(map.get(null));
//            }
//            catch (NullPointerException e){
//                System.out.println("No 1");
//            }
            String a= "pooo";
            Double no= 12390.00;
        DecimalFormat decimalFormat= new DecimalFormat("#,##0.00");
        double value = DecimalFormat.getNumberInstance().parse(decimalFormat.format(no)).doubleValue();
//        double value1= Double.parseDouble(decimalFormat.format(a));
//        System.out.println(decimalFormat.format(no));

        System.out.println(a.substring(1));
        }
//        result.add(null);
//        result.add(null);
//        result.add(null);
//        System.out.println(result.size());
//        System.out.println(result);
//        System.out.println(System.currentTimeMillis());
//        byte[] bytes = convertHtmlToPdfBytes("<html>\n" +
//                "<head>\n" +
//                "\t<style type=\"text/css\">\n" +
//                "#hd1{ max-width: 100%; position: relative; opacity: 1; z-index: 0; background-size: cover; background-position: 50% 40%; } #hd2{ position:relative; opacity:1; z-index:0; max-width:900px; background-size:cover; background-position:50% 40%; background-color:#b18446; } a{ position:relative; color:#000; text-decoration:none; } .footer a{ position:relative; color:#fff; text-decoration: underline; } .purpleBg{ background-color:#62266b; } body{ margin:0; padding:0; } p{ font-weight: 400; } .hdLogo { margin-left: 20px; } @media only screen and (max-width:480px){ .fourCol { width: 46%; float: left; min-height: 168px; margin-right: 10px; margin-bottom: 10px; } .fourCol img{ width:100%; margin-bottom: 10px; max-width: 100% !important; margin: 0px !important; } .baseBttn, .MAS-600 { width:100%; margin-bottom: 0x; max-width: 100% !important; margin: 0px !important; } .baseBttn img { width: 96; margin-bottom: 10px; max-width: 96 !important; margin: 0px !important; } img.fourCol1 { width:99%; } .twoCol{ width:100%; } .twoCol img, .headerWrap, .headerImg, .footer, .hdWrap { width:100%; margin-bottom: 10px; max-width: 100% !important; } .social-media { width: auto; float: left; text-align: left; } .hdLogo { margin-left: 20px; } .getMore { margin-right: 20px; } table.threeCol { width: 33.3%; } table.threeCol img{ width: 100%; } }\n" +
//                "</style>\n" +
//                "</head>\n" +
//                "<body>\n" +
//                "\t<table align=\"center\" width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"\" style=\" background-color:#B20075;position: relative; opacity: 1; z-index: 0; top: 0px; left: 0px; \">\n" +
//                "\t\t<tr>\n" +
//                "\t\t\t<td bgcolor=\"\" align=\"center\">\n" +
//                "\t\t\t\t<table width=\"100%\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" class=\"zay600\">\n" +
//                "\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t<td align=\"center\">\n" +
//                "\t\t\t\t\t\t\t<table class=\"hdWrap\" width=\"600\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" style=\"padding: 0; max-width: 750px; background-color: #B20075; font-family: raleway,Arial,Helvetica,sans-serif;\">\n" +
//                "\t\t\t\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t\t\t\t<td height=\"10\"> </td>\n" +
//                "\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t<tr align=\"center\">\n" +
//                "\t\t\t\t\t\t\t\t\t<td>\n" +
//                "\t\t\t\t\t\t\t\t\t\t<table width=\"140\" border=\"0\" align=\"left\" cellpadding=\"0\" cellspacing=\"0\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t<tbody>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t<tr align=\"center\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"25\" align=\"left\" style=\"line-height:0px; padding-top: 7px; padding-left: 20px;\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"https://vbank.ng/\" style=\"\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"https://mcusercontent.com/ebb747025879ae990c1b7500d/images/efa0ac98-1d97-4f7d-a51a-e71a930a5b47.png\" width=\"\" height=\"\" alt=\"img\" style=\"max-width: 55px;\" class=\"hdLogoOff\"/>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t</tbody>\n" +
//                "\t\t\t\t\t\t\t\t\t\t</table>\n" +
//                "\t\t\t\t\t\t\t\t\t\t<table width=\"140\" border=\"0\" align=\"right\" cellpadding=\"0\" cellspacing=\"0\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t<tbody>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t<tr align=\"center\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"25\" align=\"right\" style=\"line-height:0px; padding-top: 7px; padding-right: 25px\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"https://mcusercontent.com/ebb747025879ae990c1b7500d/images/be9763d5-1d1a-4d64-aca4-c67004dc8b80.png\" width=\"\" height=\"\" alt=\"img\" style=\"max-width: 85px;\" class=\"getMore\"/>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t</tbody>\n" +
//                "\t\t\t\t\t\t\t\t\t\t</table>\n" +
//                "\t\t\t\t\t\t\t\t\t</td>\n" +
//                "\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t<!--  end social  -->\n" +
//                "\t\t\t\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t\t\t\t<td height=\"7\" align=\"center\" style=\"font-family: raleway,Arial,'Open Sans', Arial, sans-serif; color: #ffffff; font-size: 13px; \"> </td>\n" +
//                "\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t</table>\n" +
//                "\t\t\t\t\t\t\t<!--  end right  -->\n" +
//                "\t\t\t\t\t\t</td>\n" +
//                "\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t</table>\n" +
//                "\t\t\t</td>\n" +
//                "\t\t</tr>\n" +
//                "\t</table>\n" +
//                "\t<!--  End Section 1  -->\n" +
//                "\t<table width=\"100%\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"position: relative; opacity: 1; z-index: 0; top: 0px; left: 0px;\" class=\"currentTable\">\n" +
//                "\t\t<tr>\n" +
//                "\t\t\t<td align=\"center\">\n" +
//                "\t\t\t\t<table class=\"headerWrap\" width=\"600\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"max-width: 700px;\">\n" +
//                "\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t<td height=\"15\"/>\n" +
//                "\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t<tr style=\"font-family: raleway, Arial,Helvetica,sans-serif; font-size:14px; line-height: 21px; font-weight:400;color:rgb(47,47,47);\">\n" +
//                "\t\t\t\t\t\t<td height=\"70\">\n" +
//                "\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"padding:20px; font-family: raleway,Arial,Helvetica,sans-serif; font-size:14px; line-height: 21px; \">\n" +
//                "\t\t\t\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t\t\t\t<td>\n" +
//                "\t\t\t\t\t\t\t\t\t\t<p style=\"color:#000408; font-size:13px; text-align:left; font-family: Futara\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t2022-01-01\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t<br/>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t<br/>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t<strong>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\tMike\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t<br/>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t</strong>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t4, ABC, Lagos\n" +
//                "\t\t\t\t\t\t\t\t\t\t</p>\n" +
//                "\t\t\t\t\t\t\t\t\t\t<p>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t<div style=\"color:#000408; font-family: Futara; text-align:left;font-size:14px;\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\tDear\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\tSir\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t,\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t</div>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t<div style=\"color:#000408; font-family: Futara; text-align:center;font-size:14px;\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t<strong>FIXED DEPOSIT CONFIRMATION CERTIFICATE</strong>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t<br/>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t</div>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t<div style=\"color:#000408; font-family: Futara; text-align:left;font-size:14px;\">We confirm your Fixed Deposit Investment with us under the following terms and conditions:</div>\n" +
//                "\t\t\t\t\t\t\t\t\t\t</p>\n" +
//                "\t\t\t\t\t\t\t\t\t\t<p style=\"color:#000408; font-size:14px; text-align:left; font-family: Futara\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" style=\"border-spacing:0\" bgcolor=\"#FFFFFF\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t<tbody>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"inner\" style=\"padding-top:10px;padding-bottom:10px; padding-right:10px;padding-left:10px;\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table class=\"contents\" style=\"border-spacing:0; width:100%\" bgcolor=\"#FFFFFF\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tbody style=\"color:#000408; font-size:14px; text-align:left; font-family: Futara\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Product Name: </th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tFD\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Account Number: </th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1010101\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Discounted Value: </th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tNGN\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t10\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Interest Rate per annum (%): </th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t%\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Tenor (in days): </th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t365\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Gross Interest: </th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tNGN\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t3\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Withholding Tax: </th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tNGN\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t3\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Net Interest: </th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tNGN\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t10\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Face Value:</th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tNGN\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1000\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Effective Date: </th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t2022-10-10\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Maturity Date: </th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t2022-10-10\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Pre-liquidation Penalty: </th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>40% of Interest Earned</th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tbody>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t</tbody>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t<p style=\"color:#000408; font-size:14px; text-align:left; font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif, Geneva, sans-serif\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\tYours faithfully,\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t<br/>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t<Strong>VFD Microfinance Bank Limited</Strong>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t</p>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t<p style=\"color:#000408; font-size:10px; text-align:left; font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif, Geneva, sans-serif\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\tPlease confirm that the investment booking details agrees with your records, if otherwise, kindly contact our customer care unit for regularization on (+234) 1 227 1396 or sending an email to support@vbank.ng\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t<br/>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t**Kindly confirm to us your rollover instructions on or before maturity if there is any change.**\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t<br/>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t**The bank also reserves the right to adjust the rates upwards or downwards in line with market realities.**\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t<br/>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t**This is an electronically generated certificate and requires no signature.**\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t</p>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t<p style=\"color:#000408; font-size:14px; text-align:right; font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif, Geneva, sans-serif\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t<Strong>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\tWant to share the V?\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t<br/>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\tRate us on your app store right\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"http://onelink.to/8da7tp\" style=\"\">HERE</a>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t</Strong>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t</p>\n" +
//                "\t\t\t\t\t\t\t\t\t\t</p>\n" +
//                "\t\t\t\t\t\t\t\t\t</td>\n" +
//                "\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t</table>\n" +
//                "\t\t\t\t\t\t</td>\n" +
//                "\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t<td height=\"15\"/>\n" +
//                "\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t</table>\n" +
//                "\t\t\t</td>\n" +
//                "\t\t</tr>\n" +
//                "\t</table>\n" +
//                "\t<table align=\"center\" width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"\" style=\" background-color:#B20075;position: relative; opacity: 1; z-index: 0; top: 0px; left: 0px;\">\n" +
//                "\t\t<tr>\n" +
//                "\t\t\t<td align=\"center\">\n" +
//                "\t\t\t\t<table class=\"footer\" width=\"600\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" style=\"padding:20px; max-width: 600px; background-color:#B20075; font-family: raleway,Arial,Helvetica,sans-serif; \">\n" +
//                "\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t<td height=\"10\"> </td>\n" +
//                "\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t<tr align=\"center\">\n" +
//                "\t\t\t\t\t\t<td>\n" +
//                "\t\t\t\t\t\t\t<table width=\"140\" border=\"0\" align=\"left\" cellpadding=\"0\" cellspacing=\"0\">\n" +
//                "\t\t\t\t\t\t\t\t<tbody>\n" +
//                "\t\t\t\t\t\t\t\t\t<tr align=\"center\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t<td width=\"25\" align=\"left\" style=\"line-height:0px; padding-top: 7px\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t<a href=\"https://vbank.ng/\" style=\"\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"https://mcusercontent.com/ebb747025879ae990c1b7500d/images/31f38f3d-99fb-49a5-8461-52caaa944c01.png\" width=\"\" height=\"\" alt=\"img\" style=\"max-width: 46px;\"/>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t</a>\n" +
//                "\t\t\t\t\t\t\t\t\t\t</td>\n" +
//                "\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t</tbody>\n" +
//                "\t\t\t\t\t\t\t</table>\n" +
//                "\t\t\t\t\t\t\t<table width=\"50%\" border=\"0\" align=\"right\" cellpadding=\"0\" cellspacing=\"0\" class=\"social-media\">\n" +
//                "\t\t\t\t\t\t\t\t<tbody>\n" +
//                "\t\t\t\t\t\t\t\t\t<tr align=\"center\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t<td width=\"25\" style=\"line-height: 20px; color: #fff; font-size: 10px; text-align: right; padding-bottom: 5px; \"> Join our community on </td>\n" +
//                "\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t\t<tr align=\"center\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t<td style=\"line-height:0px;\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t<table width=\"140\" border=\"0\" align=\"right\" cellpadding=\"0\" cellspacing=\"0\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t<tbody>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t<tr align=\"center\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"25\" style=\"line-height:0px;\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"https://www.facebook.com/vbankng/\" style=\"color:rgb(249,59,99);\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"https://mcusercontent.com/ebb747025879ae990c1b7500d/images/88287593-93d4-4aef-aa7c-fe4c1bcc8c0a.png\" width=\"\" alt=\"img\" style=\"max-width: 25px;\"/>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"5\"> </td>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"25\" style=\"line-height:0px;\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"https://www.instagram.com/vbankng/\" style=\"color:rgb(249,59,99);\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"https://mcusercontent.com/ebb747025879ae990c1b7500d/images/ca0d3b80-ddd6-4d27-8c41-5cec7528f282.png\" width=\"\" height=\"\" alt=\"img\" style=\"max-width: 25px;\"/>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"5\"> </td>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"25\" style=\"line-height:0px;\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"https://twitter.com/TheVbankng\" style=\"color:rgb(249,59,99);\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"https://mcusercontent.com/ebb747025879ae990c1b7500d/images/03e00aed-3d3d-4d36-b9b3-486198275683.png\" width=\"\" height=\"\" alt=\"img\" style=\"max-width: 25px;\"/>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"5\"> </td>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"25\" style=\"line-height:0px;\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"https://www.linkedin.com/company/vbankng/\" style=\"color:rgb(249,59,99);\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"https://mcusercontent.com/ebb747025879ae990c1b7500d/images/2b638eaa-cceb-4cca-89a8-ec1771fcad99.png\" width=\"\" height=\"\" alt=\"img\" style=\"max-width: 25px;\"/>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t</tbody>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
//                "\t\t\t\t\t\t\t\t\t\t</td>\n" +
//                "\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t</tbody>\n" +
//                "\t\t\t\t\t\t\t</table>\n" +
//                "\t\t\t\t\t\t</td>\n" +
//                "\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t<td height=\"7\" align=\"center\" style=\"font-family: raleway,Arial,'Open Sans', Arial, sans-serif; color: #ffffff; font-size: 13px; \"> </td>\n" +
//                "\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t<td height=\"10\" align=\"left\" style=\"font-family:raleway,Arial, 'Open Sans', Arial, sans-serif;color:#ffffff;font-size:11px;line-height:20px;\">\n" +
//                "\t\t\t\t\t\t\t<img src=\"https://mcusercontent.com/ebb747025879ae990c1b7500d/images/04aed716-0d39-4677-925d-3765f6e81bf8.png\" width=\"\" height=\"\" alt=\"img\" style=\"max-width: 86px;\"/>\n" +
//                "\t\t\t\t\t\t\t<br/>\n" +
//                "\t\t\t\t\t\t\t5th Floor, Elephant House, 214 Broad Street, Marina, Lagos-Island, Nigeria.\n" +
//                "\t\t\t\t\t\t\t<br/>\n" +
//                "\t\t\t\t\t\t\t<em>Copyright V by VFD, All rights reserved.</em>\n" +
//                "\t\t\t\t\t\t</td>\n" +
//                "\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t<td align=\"left\">\n" +
//                "\t\t\t\t\t\t\t<table class=\"MAS-600\" width=\"350\" border=\"0\" align=\"left\" cellpadding=\"0\" cellspacing=\"0\">\n" +
//                "\t\t\t\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t\t\t\t<td align=\"left\" class=\"footer-link\" style=\"font-family: raleway,Arial,'Open Sans', Arial, sans-serif;color:#979797;font-size:11px;line-height:20px;\"> </td>\n" +
//                "\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t</table>\n" +
//                "\t\t\t\t\t\t</td>\n" +
//                "\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t<td height=\"30\" align=\"center\" style=\"font-family: raleway,Arial, 'Open Sans', Arial, sans-serif;color:#ffffff;font-size:12px;line-height:24px;\"> </td>\n" +
//                "\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t</table>\n" +
//                "\t\t\t\t<!--  end right  -->\n" +
//                "\t\t\t</td>\n" +
//                "\t\t</tr>\n" +
//                "\t</table>\n" +
//                "</body>\n" +
//                "</html>\n" +
//                "\n");
//        byte[] bytes1 = convertHtmlToPdfBytes("<html>\n" +
//                "<head>\n" +
//                "\t<style type=\"text/css\">\n" +
//                "#hd1{ max-width: 100%; position: relative; opacity: 1; z-index: 0; background-size: cover; background-position: 50% 40%; } #hd2{ position:relative; opacity:1; z-index:0; max-width:900px; background-size:cover; background-position:50% 40%; background-color:#b18446; } a{ position:relative; color:#000; text-decoration:none; } .footer a{ position:relative; color:#fff; text-decoration: underline; } .purpleBg{ background-color:#62266b; } body{ margin:0; padding:0; } p{ font-weight: 400; } .hdLogo { margin-left: 20px; } @media only screen and (max-width:480px){ .fourCol { width: 46%; float: left; min-height: 168px; margin-right: 10px; margin-bottom: 10px; } .fourCol img{ width:100%; margin-bottom: 10px; max-width: 100% !important; margin: 0px !important; } .baseBttn, .MAS-600 { width:100%; margin-bottom: 0x; max-width: 100% !important; margin: 0px !important; } .baseBttn img { width: 96; margin-bottom: 10px; max-width: 96 !important; margin: 0px !important; } img.fourCol1 { width:99%; } .twoCol{ width:100%; } .twoCol img, .headerWrap, .headerImg, .footer, .hdWrap { width:100%; margin-bottom: 10px; max-width: 100% !important; } .social-media { width: auto; float: left; text-align: left; } .hdLogo { margin-left: 20px; } .getMore { margin-right: 20px; } table.threeCol { width: 33.3%; } table.threeCol img{ width: 100%; } }\n" +
//                "</style>\n" +
//                "</head>\n" +
//                "<body>\n" +
//                "\t<table align=\"center\" width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"\" style=\" background-color:#B20075;position: relative; opacity: 1; z-index: 0; top: 0px; left: 0px; \">\n" +
//                "\t\t<tr>\n" +
//                "\t\t\t<td bgcolor=\"\" align=\"center\">\n" +
//                "\t\t\t\t<table width=\"100%\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" class=\"zay600\">\n" +
//                "\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t<td align=\"center\">\n" +
//                "\t\t\t\t\t\t\t<table class=\"hdWrap\" width=\"600\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" style=\"padding: 0; max-width: 750px; background-color: #B20075; font-family: raleway,Arial,Helvetica,sans-serif;\">\n" +
//                "\t\t\t\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t\t\t\t<td height=\"10\"> </td>\n" +
//                "\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t<tr align=\"center\">\n" +
//                "\t\t\t\t\t\t\t\t\t<td>\n" +
//                "\t\t\t\t\t\t\t\t\t\t<table width=\"140\" border=\"0\" align=\"left\" cellpadding=\"0\" cellspacing=\"0\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t<tbody>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t<tr align=\"center\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"25\" align=\"left\" style=\"line-height:0px; padding-top: 7px; padding-left: 20px;\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"https://vbank.ng/\" style=\"\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"https://mcusercontent.com/ebb747025879ae990c1b7500d/images/efa0ac98-1d97-4f7d-a51a-e71a930a5b47.png\" width=\"\" height=\"\" alt=\"img\" style=\"max-width: 55px;\" class=\"hdLogoOff\"/>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t</tbody>\n" +
//                "\t\t\t\t\t\t\t\t\t\t</table>\n" +
//                "\t\t\t\t\t\t\t\t\t\t<table width=\"140\" border=\"0\" align=\"right\" cellpadding=\"0\" cellspacing=\"0\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t<tbody>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t<tr align=\"center\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"25\" align=\"right\" style=\"line-height:0px; padding-top: 7px; padding-right: 25px\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"https://mcusercontent.com/ebb747025879ae990c1b7500d/images/be9763d5-1d1a-4d64-aca4-c67004dc8b80.png\" width=\"\" height=\"\" alt=\"img\" style=\"max-width: 85px;\" class=\"getMore\"/>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t</tbody>\n" +
//                "\t\t\t\t\t\t\t\t\t\t</table>\n" +
//                "\t\t\t\t\t\t\t\t\t</td>\n" +
//                "\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t<!--  end social  -->\n" +
//                "\t\t\t\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t\t\t\t<td height=\"7\" align=\"center\" style=\"font-family: raleway,Arial,'Open Sans', Arial, sans-serif; color: #ffffff; font-size: 13px; \"> </td>\n" +
//                "\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t</table>\n" +
//                "\t\t\t\t\t\t\t<!--  end right  -->\n" +
//                "\t\t\t\t\t\t</td>\n" +
//                "\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t</table>\n" +
//                "\t\t\t</td>\n" +
//                "\t\t</tr>\n" +
//                "\t</table>\n" +
//                "\t<!--  End Section 1  -->\n" +
//                "\t<table width=\"100%\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"position: relative; opacity: 1; z-index: 0; top: 0px; left: 0px;\" class=\"currentTable\">\n" +
//                "\t\t<tr>\n" +
//                "\t\t\t<td align=\"center\">\n" +
//                "\t\t\t\t<table class=\"headerWrap\" width=\"600\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"max-width: 700px;\">\n" +
//                "\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t<td height=\"15\"/>\n" +
//                "\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t<tr style=\"font-family: raleway, Arial,Helvetica,sans-serif; font-size:14px; line-height: 21px; font-weight:400;color:rgb(47,47,47);\">\n" +
//                "\t\t\t\t\t\t<td height=\"70\">\n" +
//                "\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"padding:20px; font-family: raleway,Arial,Helvetica,sans-serif; font-size:14px; line-height: 21px; \">\n" +
//                "\t\t\t\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t\t\t\t<td>\n" +
//                "\t\t\t\t\t\t\t\t\t\t<p style=\"color:#000408; font-size:13px; text-align:left; font-family: Futara\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t2022-01-1\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t<br/>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t<br/>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t<strong>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\tTom\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t<br/>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t</strong>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t12 Test Lagos\n" +
//                "\t\t\t\t\t\t\t\t\t\t</p>\n" +
//                "\t\t\t\t\t\t\t\t\t\t<p>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t<div style=\"color:#000408; font-family: Futara; text-align:left;font-size:14px;\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\tDear\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\tMale\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t,\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t</div>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t<div style=\"color:#000408; font-family: Futara; text-align:center;font-size:14px;\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t<strong>FIXED DEPOSIT CONFIRMATION CERTIFICATE</strong>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t<br/>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t</div>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t<div style=\"color:#000408; font-family: Futara; text-align:left;font-size:14px;\">We confirm your Fixed Deposit Investment with us under the following terms and conditions:</div>\n" +
//                "\t\t\t\t\t\t\t\t\t\t</p>\n" +
//                "\t\t\t\t\t\t\t\t\t\t<p style=\"color:#000408; font-size:14px; text-align:left; font-family: Futara\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" style=\"border-spacing:0\" bgcolor=\"#FFFFFF\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t<tbody>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"inner\" style=\"padding-top:10px;padding-bottom:10px; padding-right:10px;padding-left:10px;\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table class=\"contents\" style=\"border-spacing:0; width:100%\" bgcolor=\"#FFFFFF\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tbody style=\"color:#000408; font-size:14px; text-align:left; font-family: Futara\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Product Name: </th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tFD\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Account Number: </th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t10101999\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Discounted Value: </th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tNGN\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t12000\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Interest Rate per annum (%): </th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t10\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t%\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Tenor (in days): </th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t365\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Gross Interest: </th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tNGN\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t10\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Withholding Tax: </th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tNGN\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t2\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Net Interest: </th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tNGN\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t10\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Face Value:</th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tNGN\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t12000\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Effective Date: </th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t2022-09-01\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Maturity Date: </th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t2022-10-10\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Pre-liquidation Penalty: </th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>40% of Interest Earned</th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tbody>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t</tbody>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t<p style=\"color:#000408; font-size:14px; text-align:left; font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif, Geneva, sans-serif\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\tYours faithfully,\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t<br/>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t<Strong>VFD Microfinance Bank Limited</Strong>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t</p>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t<p style=\"color:#000408; font-size:10px; text-align:left; font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif, Geneva, sans-serif\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\tPlease confirm that the investment booking details agrees with your records, if otherwise, kindly contact our customer care unit for regularization on (+234) 1 227 1396 or sending an email to support@vbank.ng\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t<br/>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t**Kindly confirm to us your rollover instructions on or before maturity if there is any change.**\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t<br/>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t**The bank also reserves the right to adjust the rates upwards or downwards in line with market realities.**\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t<br/>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t**This is an electronically generated certificate and requires no signature.**\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t</p>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t<p style=\"color:#000408; font-size:14px; text-align:right; font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif, Geneva, sans-serif\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t<Strong>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\tWant to share the V?\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t<br/>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\tRate us on your app store right\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"http://onelink.to/8da7tp\" style=\"\">HERE</a>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t</Strong>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t</p>\n" +
//                "\t\t\t\t\t\t\t\t\t\t</p>\n" +
//                "\t\t\t\t\t\t\t\t\t</td>\n" +
//                "\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t</table>\n" +
//                "\t\t\t\t\t\t</td>\n" +
//                "\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t<td height=\"15\"/>\n" +
//                "\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t</table>\n" +
//                "\t\t\t</td>\n" +
//                "\t\t</tr>\n" +
//                "\t</table>\n" +
//                "\t<table align=\"center\" width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"\" style=\" background-color:#B20075;position: relative; opacity: 1; z-index: 0; top: 0px; left: 0px;\">\n" +
//                "\t\t<tr>\n" +
//                "\t\t\t<td align=\"center\">\n" +
//                "\t\t\t\t<table class=\"footer\" width=\"600\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" style=\"padding:20px; max-width: 600px; background-color:#B20075; font-family: raleway,Arial,Helvetica,sans-serif; \">\n" +
//                "\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t<td height=\"10\"> </td>\n" +
//                "\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t<tr align=\"center\">\n" +
//                "\t\t\t\t\t\t<td>\n" +
//                "\t\t\t\t\t\t\t<table width=\"140\" border=\"0\" align=\"left\" cellpadding=\"0\" cellspacing=\"0\">\n" +
//                "\t\t\t\t\t\t\t\t<tbody>\n" +
//                "\t\t\t\t\t\t\t\t\t<tr align=\"center\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t<td width=\"25\" align=\"left\" style=\"line-height:0px; padding-top: 7px\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t<a href=\"https://vbank.ng/\" style=\"\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"https://mcusercontent.com/ebb747025879ae990c1b7500d/images/31f38f3d-99fb-49a5-8461-52caaa944c01.png\" width=\"\" height=\"\" alt=\"img\" style=\"max-width: 46px;\"/>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t</a>\n" +
//                "\t\t\t\t\t\t\t\t\t\t</td>\n" +
//                "\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t</tbody>\n" +
//                "\t\t\t\t\t\t\t</table>\n" +
//                "\t\t\t\t\t\t\t<table width=\"50%\" border=\"0\" align=\"right\" cellpadding=\"0\" cellspacing=\"0\" class=\"social-media\">\n" +
//                "\t\t\t\t\t\t\t\t<tbody>\n" +
//                "\t\t\t\t\t\t\t\t\t<tr align=\"center\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t<td width=\"25\" style=\"line-height: 20px; color: #fff; font-size: 10px; text-align: right; padding-bottom: 5px; \"> Join our community on </td>\n" +
//                "\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t\t<tr align=\"center\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t<td style=\"line-height:0px;\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t<table width=\"140\" border=\"0\" align=\"right\" cellpadding=\"0\" cellspacing=\"0\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t<tbody>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t<tr align=\"center\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"25\" style=\"line-height:0px;\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"https://www.facebook.com/vbankng/\" style=\"color:rgb(249,59,99);\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"https://mcusercontent.com/ebb747025879ae990c1b7500d/images/88287593-93d4-4aef-aa7c-fe4c1bcc8c0a.png\" width=\"\" alt=\"img\" style=\"max-width: 25px;\"/>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"5\"> </td>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"25\" style=\"line-height:0px;\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"https://www.instagram.com/vbankng/\" style=\"color:rgb(249,59,99);\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"https://mcusercontent.com/ebb747025879ae990c1b7500d/images/ca0d3b80-ddd6-4d27-8c41-5cec7528f282.png\" width=\"\" height=\"\" alt=\"img\" style=\"max-width: 25px;\"/>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"5\"> </td>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"25\" style=\"line-height:0px;\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"https://twitter.com/TheVbankng\" style=\"color:rgb(249,59,99);\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"https://mcusercontent.com/ebb747025879ae990c1b7500d/images/03e00aed-3d3d-4d36-b9b3-486198275683.png\" width=\"\" height=\"\" alt=\"img\" style=\"max-width: 25px;\"/>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"5\"> </td>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"25\" style=\"line-height:0px;\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"https://www.linkedin.com/company/vbankng/\" style=\"color:rgb(249,59,99);\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"https://mcusercontent.com/ebb747025879ae990c1b7500d/images/2b638eaa-cceb-4cca-89a8-ec1771fcad99.png\" width=\"\" height=\"\" alt=\"img\" style=\"max-width: 25px;\"/>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t</tbody>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
//                "\t\t\t\t\t\t\t\t\t\t</td>\n" +
//                "\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t</tbody>\n" +
//                "\t\t\t\t\t\t\t</table>\n" +
//                "\t\t\t\t\t\t</td>\n" +
//                "\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t<td height=\"7\" align=\"center\" style=\"font-family: raleway,Arial,'Open Sans', Arial, sans-serif; color: #ffffff; font-size: 13px; \"> </td>\n" +
//                "\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t<td height=\"10\" align=\"left\" style=\"font-family:raleway,Arial, 'Open Sans', Arial, sans-serif;color:#ffffff;font-size:11px;line-height:20px;\">\n" +
//                "\t\t\t\t\t\t\t<img src=\"https://mcusercontent.com/ebb747025879ae990c1b7500d/images/04aed716-0d39-4677-925d-3765f6e81bf8.png\" width=\"\" height=\"\" alt=\"img\" style=\"max-width: 86px;\"/>\n" +
//                "\t\t\t\t\t\t\t<br/>\n" +
//                "\t\t\t\t\t\t\t5th Floor, Elephant House, 214 Broad Street, Marina, Lagos-Island, Nigeria.\n" +
//                "\t\t\t\t\t\t\t<br/>\n" +
//                "\t\t\t\t\t\t\t<em>Copyright V by VFD, All rights reserved.</em>\n" +
//                "\t\t\t\t\t\t</td>\n" +
//                "\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t<td align=\"left\">\n" +
//                "\t\t\t\t\t\t\t<table class=\"MAS-600\" width=\"350\" border=\"0\" align=\"left\" cellpadding=\"0\" cellspacing=\"0\">\n" +
//                "\t\t\t\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t\t\t\t<td align=\"left\" class=\"footer-link\" style=\"font-family: raleway,Arial,'Open Sans', Arial, sans-serif;color:#979797;font-size:11px;line-height:20px;\"> </td>\n" +
//                "\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t</table>\n" +
//                "\t\t\t\t\t\t</td>\n" +
//                "\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t<td height=\"30\" align=\"center\" style=\"font-family: raleway,Arial, 'Open Sans', Arial, sans-serif;color:#ffffff;font-size:12px;line-height:24px;\"> </td>\n" +
//                "\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t</table>\n" +
//                "\t\t\t\t<!--  end right  -->\n" +
//                "\t\t\t</td>\n" +
//                "\t\t</tr>\n" +
//                "\t</table>\n" +
//                "</body>\n" +
//                "</html>\n" +
//                "\n");
//
//        byte[] bytes2 = convertHtmlToPdfBytes("<html>\n" +
//                "<head>\n" +
//                "\t<style type=\"text/css\">\n" +
//                "#hd1{ max-width: 100%; position: relative; opacity: 1; z-index: 0; background-size: cover; background-position: 50% 40%; } #hd2{ position:relative; opacity:1; z-index:0; max-width:900px; background-size:cover; background-position:50% 40%; background-color:#b18446; } a{ position:relative; color:#000; text-decoration:none; } .footer a{ position:relative; color:#fff; text-decoration: underline; } .purpleBg{ background-color:#62266b; } body{ margin:0; padding:0; } p{ font-weight: 400; } .hdLogo { margin-left: 20px; } @media only screen and (max-width:480px){ .fourCol { width: 46%; float: left; min-height: 168px; margin-right: 10px; margin-bottom: 10px; } .fourCol img{ width:100%; margin-bottom: 10px; max-width: 100% !important; margin: 0px !important; } .baseBttn, .MAS-600 { width:100%; margin-bottom: 0x; max-width: 100% !important; margin: 0px !important; } .baseBttn img { width: 96; margin-bottom: 10px; max-width: 96 !important; margin: 0px !important; } img.fourCol1 { width:99%; } .twoCol{ width:100%; } .twoCol img, .headerWrap, .headerImg, .footer, .hdWrap { width:100%; margin-bottom: 10px; max-width: 100% !important; } .social-media { width: auto; float: left; text-align: left; } .hdLogo { margin-left: 20px; } .getMore { margin-right: 20px; } table.threeCol { width: 33.3%; } table.threeCol img{ width: 100%; } }\n" +
//                "</style>\n" +
//                "</head>\n" +
//                "<body>\n" +
//                "\t<table align=\"center\" width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"\" style=\" background-color:#B20075;position: relative; opacity: 1; z-index: 0; top: 0px; left: 0px; \">\n" +
//                "\t\t<tr>\n" +
//                "\t\t\t<td bgcolor=\"\" align=\"center\">\n" +
//                "\t\t\t\t<table width=\"100%\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" class=\"zay600\">\n" +
//                "\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t<td align=\"center\">\n" +
//                "\t\t\t\t\t\t\t<table class=\"hdWrap\" width=\"600\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" style=\"padding: 0; max-width: 750px; background-color: #B20075; font-family: raleway,Arial,Helvetica,sans-serif;\">\n" +
//                "\t\t\t\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t\t\t\t<td height=\"10\"> </td>\n" +
//                "\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t<tr align=\"center\">\n" +
//                "\t\t\t\t\t\t\t\t\t<td>\n" +
//                "\t\t\t\t\t\t\t\t\t\t<table width=\"140\" border=\"0\" align=\"left\" cellpadding=\"0\" cellspacing=\"0\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t<tbody>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t<tr align=\"center\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"25\" align=\"left\" style=\"line-height:0px; padding-top: 7px; padding-left: 20px;\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"https://vbank.ng/\" style=\"\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"https://mcusercontent.com/ebb747025879ae990c1b7500d/images/efa0ac98-1d97-4f7d-a51a-e71a930a5b47.png\" width=\"\" height=\"\" alt=\"img\" style=\"max-width: 55px;\" class=\"hdLogoOff\"/>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t</tbody>\n" +
//                "\t\t\t\t\t\t\t\t\t\t</table>\n" +
//                "\t\t\t\t\t\t\t\t\t\t<table width=\"140\" border=\"0\" align=\"right\" cellpadding=\"0\" cellspacing=\"0\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t<tbody>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t<tr align=\"center\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"25\" align=\"right\" style=\"line-height:0px; padding-top: 7px; padding-right: 25px\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"https://mcusercontent.com/ebb747025879ae990c1b7500d/images/be9763d5-1d1a-4d64-aca4-c67004dc8b80.png\" width=\"\" height=\"\" alt=\"img\" style=\"max-width: 85px;\" class=\"getMore\"/>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t</tbody>\n" +
//                "\t\t\t\t\t\t\t\t\t\t</table>\n" +
//                "\t\t\t\t\t\t\t\t\t</td>\n" +
//                "\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t<!--  end social  -->\n" +
//                "\t\t\t\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t\t\t\t<td height=\"7\" align=\"center\" style=\"font-family: raleway,Arial,'Open Sans', Arial, sans-serif; color: #ffffff; font-size: 13px; \"> </td>\n" +
//                "\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t</table>\n" +
//                "\t\t\t\t\t\t\t<!--  end right  -->\n" +
//                "\t\t\t\t\t\t</td>\n" +
//                "\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t</table>\n" +
//                "\t\t\t</td>\n" +
//                "\t\t</tr>\n" +
//                "\t</table>\n" +
//                "\t<!--  End Section 1  -->\n" +
//                "\t<table width=\"100%\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"position: relative; opacity: 1; z-index: 0; top: 0px; left: 0px;\" class=\"currentTable\">\n" +
//                "\t\t<tr>\n" +
//                "\t\t\t<td align=\"center\">\n" +
//                "\t\t\t\t<table class=\"headerWrap\" width=\"600\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"max-width: 700px;\">\n" +
//                "\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t<td height=\"15\"/>\n" +
//                "\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t<tr style=\"font-family: raleway, Arial,Helvetica,sans-serif; font-size:14px; line-height: 21px; font-weight:400;color:rgb(47,47,47);\">\n" +
//                "\t\t\t\t\t\t<td height=\"70\">\n" +
//                "\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"padding:20px; font-family: raleway,Arial,Helvetica,sans-serif; font-size:14px; line-height: 21px; \">\n" +
//                "\t\t\t\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t\t\t\t<td>\n" +
//                "\t\t\t\t\t\t\t\t\t\t<p style=\"color:#000408; font-size:13px; text-align:left; font-family: Futara\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t2022-01-1\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t<br/>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t<br/>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t<strong>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\tDan\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t<br/>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t</strong>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t12 Test Lagos\n" +
//                "\t\t\t\t\t\t\t\t\t\t</p>\n" +
//                "\t\t\t\t\t\t\t\t\t\t<p>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t<div style=\"color:#000408; font-family: Futara; text-align:left;font-size:14px;\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\tDear\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\tMale\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t,\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t</div>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t<div style=\"color:#000408; font-family: Futara; text-align:center;font-size:14px;\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t<strong>FIXED DEPOSIT CONFIRMATION CERTIFICATE</strong>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t<br/>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t</div>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t<div style=\"color:#000408; font-family: Futara; text-align:left;font-size:14px;\">We confirm your Fixed Deposit Investment with us under the following terms and conditions:</div>\n" +
//                "\t\t\t\t\t\t\t\t\t\t</p>\n" +
//                "\t\t\t\t\t\t\t\t\t\t<p style=\"color:#000408; font-size:14px; text-align:left; font-family: Futara\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" style=\"border-spacing:0\" bgcolor=\"#FFFFFF\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t<tbody>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"inner\" style=\"padding-top:10px;padding-bottom:10px; padding-right:10px;padding-left:10px;\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table class=\"contents\" style=\"border-spacing:0; width:100%\" bgcolor=\"#FFFFFF\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tbody style=\"color:#000408; font-size:14px; text-align:left; font-family: Futara\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Product Name: </th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tFD\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Account Number: </th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t10101999\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Discounted Value: </th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tNGN\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t12000\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Interest Rate per annum (%): </th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t10\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t%\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Tenor (in days): </th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t365\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Gross Interest: </th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tNGN\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t10\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Withholding Tax: </th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tNGN\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t2\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Net Interest: </th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tNGN\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t10\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Face Value:</th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tNGN\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t12000\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Effective Date: </th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t2022-09-01\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Maturity Date: </th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t2022-10-10\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Pre-liquidation Penalty: </th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>40% of Interest Earned</th>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tbody>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t</tbody>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t<p style=\"color:#000408; font-size:14px; text-align:left; font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif, Geneva, sans-serif\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\tYours faithfully,\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t<br/>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t<Strong>VFD Microfinance Bank Limited</Strong>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t</p>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t<p style=\"color:#000408; font-size:10px; text-align:left; font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif, Geneva, sans-serif\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\tPlease confirm that the investment booking details agrees with your records, if otherwise, kindly contact our customer care unit for regularization on (+234) 1 227 1396 or sending an email to support@vbank.ng\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t<br/>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t**Kindly confirm to us your rollover instructions on or before maturity if there is any change.**\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t<br/>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t**The bank also reserves the right to adjust the rates upwards or downwards in line with market realities.**\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t<br/>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t**This is an electronically generated certificate and requires no signature.**\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t</p>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t<p style=\"color:#000408; font-size:14px; text-align:right; font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif, Geneva, sans-serif\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t<Strong>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\tWant to share the V?\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t<br/>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\tRate us on your app store right\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"http://onelink.to/8da7tp\" style=\"\">HERE</a>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t</Strong>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t</p>\n" +
//                "\t\t\t\t\t\t\t\t\t\t</p>\n" +
//                "\t\t\t\t\t\t\t\t\t</td>\n" +
//                "\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t</table>\n" +
//                "\t\t\t\t\t\t</td>\n" +
//                "\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t<td height=\"15\"/>\n" +
//                "\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t</table>\n" +
//                "\t\t\t</td>\n" +
//                "\t\t</tr>\n" +
//                "\t</table>\n" +
//                "\t<table align=\"center\" width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"\" style=\" background-color:#B20075;position: relative; opacity: 1; z-index: 0; top: 0px; left: 0px;\">\n" +
//                "\t\t<tr>\n" +
//                "\t\t\t<td align=\"center\">\n" +
//                "\t\t\t\t<table class=\"footer\" width=\"600\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" style=\"padding:20px; max-width: 600px; background-color:#B20075; font-family: raleway,Arial,Helvetica,sans-serif; \">\n" +
//                "\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t<td height=\"10\"> </td>\n" +
//                "\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t<tr align=\"center\">\n" +
//                "\t\t\t\t\t\t<td>\n" +
//                "\t\t\t\t\t\t\t<table width=\"140\" border=\"0\" align=\"left\" cellpadding=\"0\" cellspacing=\"0\">\n" +
//                "\t\t\t\t\t\t\t\t<tbody>\n" +
//                "\t\t\t\t\t\t\t\t\t<tr align=\"center\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t<td width=\"25\" align=\"left\" style=\"line-height:0px; padding-top: 7px\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t<a href=\"https://vbank.ng/\" style=\"\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"https://mcusercontent.com/ebb747025879ae990c1b7500d/images/31f38f3d-99fb-49a5-8461-52caaa944c01.png\" width=\"\" height=\"\" alt=\"img\" style=\"max-width: 46px;\"/>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t</a>\n" +
//                "\t\t\t\t\t\t\t\t\t\t</td>\n" +
//                "\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t</tbody>\n" +
//                "\t\t\t\t\t\t\t</table>\n" +
//                "\t\t\t\t\t\t\t<table width=\"50%\" border=\"0\" align=\"right\" cellpadding=\"0\" cellspacing=\"0\" class=\"social-media\">\n" +
//                "\t\t\t\t\t\t\t\t<tbody>\n" +
//                "\t\t\t\t\t\t\t\t\t<tr align=\"center\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t<td width=\"25\" style=\"line-height: 20px; color: #fff; font-size: 10px; text-align: right; padding-bottom: 5px; \"> Join our community on </td>\n" +
//                "\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t\t<tr align=\"center\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t<td style=\"line-height:0px;\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t<table width=\"140\" border=\"0\" align=\"right\" cellpadding=\"0\" cellspacing=\"0\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t<tbody>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t<tr align=\"center\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"25\" style=\"line-height:0px;\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"https://www.facebook.com/vbankng/\" style=\"color:rgb(249,59,99);\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"https://mcusercontent.com/ebb747025879ae990c1b7500d/images/88287593-93d4-4aef-aa7c-fe4c1bcc8c0a.png\" width=\"\" alt=\"img\" style=\"max-width: 25px;\"/>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"5\"> </td>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"25\" style=\"line-height:0px;\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"https://www.instagram.com/vbankng/\" style=\"color:rgb(249,59,99);\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"https://mcusercontent.com/ebb747025879ae990c1b7500d/images/ca0d3b80-ddd6-4d27-8c41-5cec7528f282.png\" width=\"\" height=\"\" alt=\"img\" style=\"max-width: 25px;\"/>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"5\"> </td>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"25\" style=\"line-height:0px;\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"https://twitter.com/TheVbankng\" style=\"color:rgb(249,59,99);\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"https://mcusercontent.com/ebb747025879ae990c1b7500d/images/03e00aed-3d3d-4d36-b9b3-486198275683.png\" width=\"\" height=\"\" alt=\"img\" style=\"max-width: 25px;\"/>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"5\"> </td>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"25\" style=\"line-height:0px;\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"https://www.linkedin.com/company/vbankng/\" style=\"color:rgb(249,59,99);\">\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"https://mcusercontent.com/ebb747025879ae990c1b7500d/images/2b638eaa-cceb-4cca-89a8-ec1771fcad99.png\" width=\"\" height=\"\" alt=\"img\" style=\"max-width: 25px;\"/>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t\t</tbody>\n" +
//                "\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
//                "\t\t\t\t\t\t\t\t\t\t</td>\n" +
//                "\t\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t\t</tbody>\n" +
//                "\t\t\t\t\t\t\t</table>\n" +
//                "\t\t\t\t\t\t</td>\n" +
//                "\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t<td height=\"7\" align=\"center\" style=\"font-family: raleway,Arial,'Open Sans', Arial, sans-serif; color: #ffffff; font-size: 13px; \"> </td>\n" +
//                "\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t<td height=\"10\" align=\"left\" style=\"font-family:raleway,Arial, 'Open Sans', Arial, sans-serif;color:#ffffff;font-size:11px;line-height:20px;\">\n" +
//                "\t\t\t\t\t\t\t<img src=\"https://mcusercontent.com/ebb747025879ae990c1b7500d/images/04aed716-0d39-4677-925d-3765f6e81bf8.png\" width=\"\" height=\"\" alt=\"img\" style=\"max-width: 86px;\"/>\n" +
//                "\t\t\t\t\t\t\t<br/>\n" +
//                "\t\t\t\t\t\t\t5th Floor, Elephant House, 214 Broad Street, Marina, Lagos-Island, Nigeria.\n" +
//                "\t\t\t\t\t\t\t<br/>\n" +
//                "\t\t\t\t\t\t\t<em>Copyright V by VFD, All rights reserved.</em>\n" +
//                "\t\t\t\t\t\t</td>\n" +
//                "\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t<td align=\"left\">\n" +
//                "\t\t\t\t\t\t\t<table class=\"MAS-600\" width=\"350\" border=\"0\" align=\"left\" cellpadding=\"0\" cellspacing=\"0\">\n" +
//                "\t\t\t\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t\t\t\t<td align=\"left\" class=\"footer-link\" style=\"font-family: raleway,Arial,'Open Sans', Arial, sans-serif;color:#979797;font-size:11px;line-height:20px;\"> </td>\n" +
//                "\t\t\t\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t\t\t</table>\n" +
//                "\t\t\t\t\t\t</td>\n" +
//                "\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t\t<tr>\n" +
//                "\t\t\t\t\t\t<td height=\"30\" align=\"center\" style=\"font-family: raleway,Arial, 'Open Sans', Arial, sans-serif;color:#ffffff;font-size:12px;line-height:24px;\"> </td>\n" +
//                "\t\t\t\t\t</tr>\n" +
//                "\t\t\t\t</table>\n" +
//                "\t\t\t\t<!--  end right  -->\n" +
//                "\t\t\t</td>\n" +
//                "\t\t</tr>\n" +
//                "\t</table>\n" +
//                "</body>\n" +
//                "</html>\n" +
//                "\n");

//        List<File> files = files(bytes, bytes1, bytes2);
//        deleteFiles(files);

    private static void deleteFiles(List<File> files) {
       for(File file: files){
           file.delete();
       }
    }

    private static List<File> files(byte[] bytes, byte[] bytes1, byte[] bytes2){
        try {
            List<File> files= new ArrayList<>();
            File file1= new File("C:\\Users\\Michael.Egbe-iyon\\Documents\\wallet_webhook\\test.pdf");
            OutputStream os = new FileOutputStream(file1);
            os.write(bytes);
            File file2= new File("C:\\Users\\Michael.Egbe-iyon\\Documents\\wallet_webhook\\test1.pdf");
            OutputStream os1 = new FileOutputStream(file2);
            os1.write(bytes1);
            File file3=  new File("C:\\Users\\Michael.Egbe-iyon\\Documents\\wallet_webhook\\test2.pdf");
            OutputStream os2 = new FileOutputStream(file3);
            os2.write(bytes2);
            os.close();
            os1.close();
            os2.close();

            files.add(file1);
            files.add(file2);
            files.add(file3);


            PDFMergerUtility pdfMergerUtility= new PDFMergerUtility();
            pdfMergerUtility.setDestinationFileName(
                    "C:\\Users\\Michael.Egbe-iyon\\Documents\\wallet_webhook\\test9.pdf");
            pdfMergerUtility.addSource(file1);
            pdfMergerUtility.addSource(file2);
            pdfMergerUtility.addSource(file3);
            pdfMergerUtility.mergeDocuments(null);

            return files;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static byte[] convertHtmlToPdfBytes(String htmlString) {
        Document document = new Document();

        ByteArrayOutputStream out = new ByteArrayOutputStream();

        PdfWriter writer;
        try {
            String xhtml = convertToXHTML(htmlString);

            writer = PdfWriter.getInstance(document, out);  // Creates and Adds an instance of the pdf writer to a pdf document, this ensures that the PDF representation of each element in the document is written to the output stream
            document.open();
            InputStream inputStream = IOUtils.toInputStream(xhtml, StandardCharsets.UTF_8);
            XMLWorkerHelper.getInstance().parseXHtml(writer, document, inputStream); // parses xhtml to pdf and store as pdf in document, which is then written by the writer to the output stream
            document.close();
            inputStream.close();
            out.close();

        } catch (com.itextpdf.text.DocumentException | IOException e ) {
            log.error("Exception thrown: "+e.getMessage());
        }
        return out.toByteArray();
    }
    private static String convertToXHTML(String s){
        final org.jsoup.nodes.Document document = Jsoup.parse(s);
        document.outputSettings().syntax(org.jsoup.nodes.Document.OutputSettings.Syntax.xml);
        String html = document.html();
        return html;
    }

}
