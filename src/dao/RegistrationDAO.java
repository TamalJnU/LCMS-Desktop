package dao;

import DatabaseConnect.DBCon;
import model.Registration;
import commonDao.IComDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class RegistrationDAO implements IComDao<Registration> {
    Connection con;

    public RegistrationDAO() {
        con = DBCon.getConnect();
    }
    

    @Override
    public int save(Registration reg) {
        int status = 0;
        
        String sql = "insert into registration (id, first_name, last_name, gender, date_of_birth, present_address, permanent_address, email, "
                + "phone, department_id, department_name, batch_id, position, rank_id, police_station_id, placement_date, weapon_id, weapon_serial, "
                + "court_id, court_type, court_name, court_city, tribunal_name, judge_id, judge_name, chief_justice, pp_id, pp_name, jail_id, "
                + "jail_type, jail_name, jail_city, user_id, password) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
                + "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement psmt = con.prepareStatement(sql);
            psmt.setInt(1, reg.getId());
            psmt.setString(2, reg.getFirstName());
            psmt.setString(3, reg.getLastName());
            psmt.setString(4, reg.getGender());
            psmt.setDate(5, reg.getDateOfBirth());
            psmt.setString(6, reg.getPresentAddress());
            psmt.setString(7, reg.getPermanentAddress());
            psmt.setString(8, reg.getEmail());
            psmt.setInt(9, reg.getPhone());
            psmt.setInt(10, reg.getDepartmentId());
            psmt.setString(11, reg.getDepartmentName());
            psmt.setInt(12, reg.getBatchId());
            psmt.setString(13, reg.getPosition());
            psmt.setInt(14, reg.getRankId());
            psmt.setString(15, reg.getPoliceStationId());
            psmt.setDate(16, reg.getPlacementDate());
            psmt.setInt(17, reg.getWeaponId());
            psmt.setString(18, reg.getWeaponSerial());
            psmt.setInt(19, reg.getCourtId());
            psmt.setString(20, reg.getCourtType());
            psmt.setString(21, reg.getCourtName());
            psmt.setString(22, reg.getCourtCity());
            psmt.setString(23, reg.getTribunalName());
            psmt.setInt(24, reg.getJudgeId());
            psmt.setString(25, reg.getJudgeName());
            psmt.setString(26, reg.getChiefJustice());
            psmt.setInt(27, reg.getPpId());
            psmt.setString(28, reg.getPpName());
            psmt.setInt(29, reg.getJailId());
            psmt.setString(30, reg.getJailType());
            psmt.setString(31, reg.getJailName());
            psmt.setString(32, reg.getJailCity());
            psmt.setInt(33, reg.getUserId());
            psmt.setString(34, reg.getPassword());

            status = psmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    @Override
    public int update(Registration t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Registration> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
