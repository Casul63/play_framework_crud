package models;

import play.*;
import play.db.jpa.*;
 
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.*;

@Entity
public class Makanan extends Model {
    public String nama_makanan;
    public int harga;
    @ManyToOne(targetEntity=PemilikMakanan.class)
    public PemilikMakanan pemilik_makanan;
}