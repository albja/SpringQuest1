package com.Quest1.Quest1Spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {

    @GetMapping("/doctor/1")
    @ResponseBody
    public String getDoctor1() {
        return "<img src='https://i.guim.co.uk/img/static/sys-images/Guardian/About/General/2013/8/22/1377166162583/William-Hartnell-in-1966--010.jpg?width=620&quality=85&dpr=1&s=none' alt='William Hartnell' title='William Hartnell'/>";
    }

    @GetMapping("/doctor/10")
    @ResponseBody
    public String getDoctor10() {
        return "<img src='https://www.premiere.fr/sites/default/files/styles/scale_crop_1280x720/public/2022-10/David-Tennant-se-penche-sur-Doctor-Who-Shocker-dans-le-980x400.jpeg' alt='David Tennant' title='David Tennant'/>";
    }

    @GetMapping("/doctor/13")
    @ResponseBody
    public String getDoctor13() {
        return "<img src='https://img.20mn.fr/TZ6RgmKFQCm-fxgXXERJ1Q/640x410_jodie-whittaker-13e-incarnation-doctor-who' alt='Jodie Whittaker' title='Jodie Whittaker'/>";
    }

    @GetMapping("/surprise")
    @ResponseBody
    public String surprise() {
        return "<img src='https://4.bp.blogspot.com/-Db1oT7s12Rc/VPCCsQpEurI/AAAAAAAAA_o/dwCqbJmPT10/s1600/daleks-exterminate.jpg'  alt='Surprise' title='Surprise'/>";
    }
}
