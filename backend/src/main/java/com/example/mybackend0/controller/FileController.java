package com.example.mybackend0.controller;


import com.example.mybackend0.FileUpload.FileResponse;
import com.example.mybackend0.FileUpload.FileStorageService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.IOException;

@RestController
@RequestMapping(value = "/api/v6/upload")
@CrossOrigin("http://localhost:3000")
public class FileController {

    @Autowired
    private FileStorageService fileStorageService;

    public ResponseEntity<FileResponse> uploadFile(MultipartFile file, String imgName, String imgCategory, String uploadDir){
        String fileName = fileStorageService.storeFile(file,imgName,uploadDir);
        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/api/v6/upload/"+imgCategory+"/")
                .path(fileName)
                .toUriString();

        FileResponse fileResponse = new FileResponse(fileName, fileDownloadUri, file.getContentType(), file.getSize());
        return new ResponseEntity<FileResponse>(fileResponse, HttpStatus.OK);
    }

    // load function
    public ResponseEntity<Resource> LoadFile(String fileName, String fileDir, HttpServletRequest request){
        Resource resource = fileStorageService.loadFileAsResource(fileName,fileDir);
        String contentType = null;
        try {
            contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
        }catch(IOException ex) {
            System.out.println("Could not determine fileType");
        }
        if(contentType==null) {
            contentType = "application/octet-stream";
        }
        if(resource==null){
            System.out.print("null");
            return ResponseEntity.ok()
                    .contentType(MediaType.parseMediaType(contentType))
                    .body( null);
        }
        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(contentType))
                .body( resource);
    }

    //material pics
    @PostMapping("/uploadmaterialpic/{material_id}")
    public ResponseEntity<FileResponse> MaterialPicture(@RequestParam("file") MultipartFile file,@PathVariable int material_id){
        String imgName=Integer.toString(material_id)+".jpg";
        String uploadDir="materialPic";
        return uploadFile(file,imgName,"materialPic",uploadDir);
    }

    @GetMapping("/materialPic/{material_id}")
    public ResponseEntity<Resource> downloadFile(@PathVariable int material_id, HttpServletRequest request){
        String fileName=Integer.toString(material_id)+".jpg";
        String fileDir="materialPic";
        return LoadFile(fileName,fileDir,request);
    }

    //profile pics
    @PostMapping("/uploadprofilepic/{userId}")
    public ResponseEntity<FileResponse> ProfilePicture(@RequestParam("file") MultipartFile file,@PathVariable int userId){
        String imgName=Integer.toString(userId)+".jpg";
        String uploadDir="profilePic";
        return uploadFile(file,imgName,"profilePic",uploadDir);
    }

    @GetMapping("/propic/{userId}")
    public ResponseEntity<Resource> downloadProPic(@PathVariable int userId, HttpServletRequest request){
        String fileName=Integer.toString(userId)+".jpg";
        String fileDir="profilePic";
        return LoadFile(fileName,fileDir,request);
    }

    //branch
    @PostMapping("/uploadbranchpic/{branch_id}")
    public ResponseEntity<FileResponse> BranchPicture(@RequestParam("file") MultipartFile file,@PathVariable int branch_id){
        String imgName=Integer.toString(branch_id)+".jpg";
        String uploadDir="branchPic";
        return uploadFile(file,imgName,"branchPic",uploadDir);
    }

    @GetMapping("/branchpic/{branch_id}")
    public ResponseEntity<Resource> downloadBranchPic(@PathVariable int branch_id, HttpServletRequest request){
        String fileName=Integer.toString(branch_id)+".jpg";
        String fileDir="branchPic";
        return LoadFile(fileName,fileDir,request);
    }


}
