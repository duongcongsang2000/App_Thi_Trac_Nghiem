/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sang2k.app_tracnghiem.Dao;

import com.sang2k.app_tracnghiem.Sql.DatabaseLogin;
import com.sang2k.app_tracnghiem.entity.BoDe;
import com.sang2k.app_tracnghiem.entity.CauHoi;
import com.sang2k.app_tracnghiem.entity.SinhVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yahiko
 */
public class BoDeDao {
    public List<BoDe> FindBoDe() throws Exception{
        int dem=0;
        int[] a=new int[32];
        String sql="SELECT * FROM [dbo].[BODE] WHERE [CAUHOI]=?";
            for (int i=0;i<5;i++)
            {
            a[i]=1 + (int)(Math.random() * ((100 - 1) + 1));
            }
            
            List<BoDe> list=new ArrayList<BoDe>();
            for (int i=0;i<30;i++)
            {
            try (
            Connection con=DatabaseLogin.openConnection();
            PreparedStatement dtb= con.prepareStatement(sql);
            )
            {
                dtb.setInt(1,a[i]);
                try(ResultSet rs=dtb.executeQuery())
            {
                if (rs.next())
                {
                BoDe sb=new BoDe();
                sb.setCauHoi(rs.getString("CAUHOI"));
                sb.setTrinhDo(rs.getString("TRINHDO"));
                sb.setNoiDung(rs.getString("NOIDUNG"));
                sb.setA(rs.getString("A"));
                sb.setB(rs.getString("B"));
                sb.setC(rs.getString("C"));
                sb.setD(rs.getString("D"));
                sb.setDapAn(rs.getString("DAP_AN"));
                list.add(sb);
                }
            }    
            }
        }
        return list;
}
}