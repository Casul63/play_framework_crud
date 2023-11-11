package models;

import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;

@Entity
public class PemilikMakanan extends Model {
    public String nama_pemilik;
    public String nomor_telepon;   
}