package com.example.Dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.Model.Office;
import com.example.Util.DBConnection;


public class AppDao implements AppDaoIf{

    public void add(com.example.Model.Office off){

        String query = "insert into office values(?,?,?)";

        try(Connection conn = DBConnection.getConn()){
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1,off.getId());
            ps.setString(2,off.getName());
            ps.setString(3,off.getDept());

            ps.execute();
        }
        catch(SQLException e){
            e.printStackTrace();
        }

    }

    public List<Office> all(){

        String query = "select * from office";
        List<Office> list=new ArrayList<>();

        try(Connection conn = DBConnection.getConn()){
            PreparedStatement ps = conn.prepareStatement(query);

            ResultSet rs = ps.executeQuery();
            Office off=null;
            while(rs.next()){
                off = new Office(rs.getInt(1),rs.getString(2),rs.getString(3));
                list.add(off);
            }
            return list;
        }
        catch(SQLException e){
            e.printStackTrace();
        }

        return list;
        
    }

}
