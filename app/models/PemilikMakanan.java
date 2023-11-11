package models;

import play.*;
import play.db.jpa.*;
 
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.*;

@Entity
public class PemilikMakanan extends Model {
    public String nama_pemilik;
    public String nomor_telepon;   
    
    @OneToMany(mappedBy = "pemilik_makanan")
    public List<Makanan> makananku;
}