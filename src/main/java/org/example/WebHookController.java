package org.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.List;

@RestController
@Slf4j
public class WebHookController {
    @Autowired
    private WebHookService service;

    @Autowired
    private WebHookRepo webHookRepo;
    @PostMapping("/webhook")
    public void saveWebHook(@RequestBody WebHookRequest webHookRequest,
                            @RequestHeader("Authorization") String token) {
        try {
            System.out.println("Webhook request "+webHookRequest);
            service.saveWebHook(webHookRequest,token);
//            service.getIds();
        } catch (Exception e) {
            log.error("Exception message: " + e.getMessage());
        }
    }
    @GetMapping("/print")
    public List<BigInteger> print() {
        try {
            return service.getIds();
        } catch (Exception e) {
            log.error("Exception message: " + e.getMessage());
            return null;
        }
    }

    @PostMapping("/file")
    public void save(@RequestParam(name = "file") MultipartFile multipartFile){
        try {
            byte[] input= multipartFile.getBytes();

            OutputStream os = new FileOutputStream(new File("\"C:\\Users\\Michael.Egbe-iyon\\OneDrive - VFD Group\\Documents\\My_Coverletter.pdf\""));
            os.write(input);
            os.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @PostMapping("/test1")
    private List<WalletPreviewDTO> test( ){
        return service.getData();
//        if(test.isStatus()){
//            System.out.println("Saving test");
//        }
//        else {
//            System.out.println("do nothing");
//        }
    }
}
