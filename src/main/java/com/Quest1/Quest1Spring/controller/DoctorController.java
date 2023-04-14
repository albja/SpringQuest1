package com.Quest1.Quest1Spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {

    @GetMapping("/doctor/1")
    @ResponseBody
    public String getDoctor1() {
        return "Greetings from <a href='https://i.guim.co.uk/img/static/sys-images/Guardian/Pix/pictures/2014/8/22/1408703477321/William-Hartnell-as-Docto-006.jpg?width=1200&height=630&quality=85&auto=format&fit=crop&overlay-align=bottom%2Cleft&overlay-width=100p&overlay-base64=L2ltZy9zdGF0aWMvb3ZlcmxheXMvdGctZGVmYXVsdC5wbmc&enable=upscale&s=9cc5aacc6bebc490a3dbf9661c7c834a'>William Hartnell</a>";
    }

    @GetMapping("/doctor/10")
    @ResponseBody
    public String getDoctor10() {
        return "https://www.premiere.fr/sites/default/files/styles/scale_crop_1280x720/public/2022-10/David-Tennant-se-penche-sur-Doctor-Who-Shocker-dans-le-980x400.jpeg";
    }

    @GetMapping("/doctor/13")
    @ResponseBody
    public String getDoctor13() {
        return "https://img.20mn.fr/TZ6RgmKFQCm-fxgXXERJ1Q/640x410_jodie-whittaker-13e-incarnation-doctor-who'";
    }

    @GetMapping("/surprise")
    @ResponseBody
    public String surprise() {
        return "https://4.bp.blogspot.com/-Db1oT7s12Rc/VPCCsQpEurI/AAAAAAAAA_o/dwCqbJmPT10/s1600/daleks-exterminate.jpg";
    }
}
