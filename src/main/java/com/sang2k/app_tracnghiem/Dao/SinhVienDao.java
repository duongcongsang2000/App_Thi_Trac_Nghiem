/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sang2k.app_tracnghiem.Dao;

import com.sang2k.app_tracnghiem.Sql.DatabaseLogin;
import com.sang2k.app_tracnghiem.entity.SinhVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Yahiko
 */
public class SinhVienDao {
    public SinhVien FindSV(String UserName,String Password) throws Exception{
        String sql="SELECT * FROM [dbo].[SINHVIEN] WHERE [UserName]=? AND [PassWord]=?";
            try (
            Connection con=DatabaseLogin.openConnection();
            PreparedStatement dtb= con.prepareStatement(sql);
            )
            {
                dtb.setString(1,UserName);
                dtb.setString(2, Password);
                try(ResultSet rs=dtb.executeQuery())
            {
                if (rs.next())
            {
                SinhVien sb=new SinhVien();
                sb.setMaSV(rs.getString("MASV"));
                sb.setHo(rs.getString("HO"));
                sb.setTen(rs.getString("TEN"));
                sb.setNgaySinh(rs.getDate("NGAYSINH"));
                sb.setDiaChi(rs.getString("DIACHI"));
                sb.setUsername(UserName);
                sb.setPassword(Password);
                return sb;
            }    
            }
            }
        
        return null;
}
}
