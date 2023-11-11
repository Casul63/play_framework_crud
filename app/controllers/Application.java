package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        List daftar = Makanan.findAll();
        render(daftar);
    }

    public static void create_menu(){
        List daftar = PemilikMakanan.findAll();
        render(daftar);
    }

    public static void store_menu(Makanan makanan){
        makanan = makanan.merge();
        makanan.save();
        index();
    }

}