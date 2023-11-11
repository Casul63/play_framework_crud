package models;

import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;

@Entity
public class Makanan extends Model {
    public String nama_makanan;
    public int harga;
    @ManyToOne
    public PemilikMakanan makanan_jualan;
}