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

    public static void create_pemilik(){
        render();
    }

    public static void store_menu(Makanan makanan){
        makanan.merge();
        index();
    }

    public static void store_pemilik(PemilikMakanan pemilik){
        pemilik.save();
        pemilik_makanan();
    }
    public static void pemilik_makanan(){
        List daftar = PemilikMakanan.findAll();
        render(daftar);
    }

    public static void delete_menu(Long id){
        Makanan makanan = Makanan.find("id=?1", id).first();
        makanan.delete();
        index();
    }

    public static void delete_pemilik(Long id){
        PemilikMakanan pemilik_lama = PemilikMakanan.find("id=?1", id).first();
        pemilik_lama.delete();
        pemilik_makanan();
    }

    public static void edit_menu(Long id){
        Makanan makanan_lama = Makanan.find("id=?1", id).first();
        List daftar = PemilikMakanan.findAll();
        render(makanan_lama, daftar);
    }
    
    public static void edit_pemilik(Long id){
        PemilikMakanan pemilik_lama = PemilikMakanan.find("id=?1", id).first();
        render(pemilik_lama);
    }
}