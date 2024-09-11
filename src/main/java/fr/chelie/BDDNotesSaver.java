package fr.chelie;

import fr.chelie.interfaces.NotesSaver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BDDNotesSaver implements NotesSaver {

    @Override
    public int SauvegarderListe(List<Note> lesNotes) {
        try ( Connection con = DbConnex.connection()){
            String sql = "INSERT INTO  " +
                    "`note`(titre,contenu,dateCrea,dateModif) " +
                    "VALUES (?,?,?,?)";
            try (PreparedStatement stmt = con.prepareStatement(sql)){
                for(Note note : lesNotes){
                    stmt.setString(1,note.getTitre());
                    stmt.setString(2,note.getContenu());
                    stmt.setDate(3, java.sql.Date.valueOf(note.getDateCreation()));
                    stmt.setDate(4, java.sql.Date.valueOf(note.getDateCreation()));
                    stmt.executeUpdate();
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return 0;
    }

    public int LaFonctionDefectueuse(){
        try (Connection con = DbConnex.connection()) {
            String sql = "Select * from note";
            Statement stmt = con.createStatement();
            stmt.execute(sql);
            return 1;
        }catch (Exception e){
            e.printStackTrace();
        }
        return 1;
    }

    @Override
    public List<Note> ChargerFichier() {
        List<Note> lesNotes= new ArrayList<>();
        try ( Connection con = DbConnex.connection()){
            String sql = "SELECT * FROM note";
            try (PreparedStatement stmt = con.prepareStatement(sql)){
                ResultSet rs = stmt.executeQuery();
                while(rs.next()){
                    Note note = new Note(rs.getString(2),rs.getString(3), rs.getDate(4).toLocalDate(),rs.getDate(5).toLocalDate());
                    lesNotes.add(note);
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lesNotes;
    }

}
