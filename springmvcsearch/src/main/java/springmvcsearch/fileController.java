package springmvcsearch;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class fileController {

	@RequestMapping("/file")
	public String showUploadForm() {
		return "file";

	}

	@RequestMapping(path = "/uploadimage", method = RequestMethod.POST)
	public String showImage(@RequestParam("txtimage") CommonsMultipartFile file, HttpSession s,Model m) {
		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getFileItem());
		System.out.println(file.getStorageDescription());
		System.out.println("Image Uploaded");

		byte[] b = file.getBytes();

		// We have to save these file
		String path = s.getServletContext().getRealPath("/") + "WEB-INF" + File.separator + "resources" + File.separator
				+ "image" + File.separator + file.getOriginalFilename();

		System.out.println(path);
		try {
			FileOutputStream fo = new FileOutputStream(path);
			fo.write(b);
			fo.close();
			m.addAttribute("msg", "upload successfullly");
			m.addAttribute("filename", file.getOriginalFilename());
			System.out.println("File Uploaded succesfully");
		} catch (IOException e) {
			e.printStackTrace();
			m.addAttribute("msg", "uploding error");
			System.out.println("Upload image error");
		}

		return "filesuccess";
	}

}
