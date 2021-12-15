package com.monster.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MonsterJDBCDAO implements MonsterDAO_interface {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/MonsterStrike?user=root&password=123456";
    private static final String USER = "root";
    private static final String PASSWORD = "123456";

    private static final String INSERT_SQL = "INSERT INTO MONSTER (M_name, M_tybe, Skill_A1, Skill_A2, Skill_A3, Skill_A4, Skill_B1, Skill_B2, Skill_B3, Skill_B4, Skill_C1, Skill_C2, M_luckySkill, M_hit, M_combatType, M_rarity, M_race, M_ftuit, M_type, M_friendskill1, M_friendskill2, M_get, M_spec, M_pool) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String UPDATE_SQL = "UPDATE MONSTER SET M_name = ?, M_tybe = ?, Skill_A1 = ?, Skill_A2 = ?, Skill_A3 = ?, Skill_A4 = ?, Skill_B1 = ?, Skill_B2 = ?, Skill_B3 = ?, Skill_B4 = ?, Skill_C1 = ?, Skill_C2 = ?, M_luckySkill = ?, M_hit = ?, M_combatType = ?, M_rarity = ?, M_race = ?, M_ftuit = ?, M_type = ?, M_friendskill1 = ?, M_friendskill2 = ?, M_get = ?, M_spec = ?, M_pool  = ? WHERE M_no = ?";
    private static final String DELETE_SQL = "DELETE FROM MONSTER WHERE M_no = ?";

    private static final String Monsters_no = "SELECT * FROM VIEW_MONSTER WHERE M_no = ?";
    private static final String Monsters_name = "SELECT * FROM VIEW_MONSTER WHERE Name = ?";
    private static final String Monsters_tybe = "SELECT * FROM VIEW_MONSTER WHERE Tybe = ?";
    private static final String Monsters_hit = "SELECT * FROM VIEW_MONSTER WHERE Hit = ?";
    private static final String Monsters_combatType = "SELECT * FROM VIEW_MONSTER WHERE CombatType = ?";
    private static final String Monsters_rarity = "SELECT * FROM VIEW_MONSTER WHERE Rarity = ?";
    private static final String Monsters_race = "SELECT * FROM VIEW_MONSTER WHERE Race = ?";
    private static final String Monsters_get = "SELECT * FROM VIEW_MONSTER WHERE Get_name = ?";
    private static final String Monsters_pool = "SELECT * FROM VIEW_MONSTER WHERE Pool like ?";
    private static final String AllMonsters = "SELECT * FROM VIEW_MONSTER;";

    static {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Couldn't load database driver."
                    + e.getMessage());
        }
    }

    @Override
    public String insert(MonsterVO monsterVO) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String gKey = "";

        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            String[] key = {"M_no"};
            pstmt = con.prepareStatement(INSERT_SQL, key);
            pstmt.setString(1, monsterVO.getM_name());
            pstmt.setString(2, monsterVO.getM_tybe());
            pstmt.setString(3, monsterVO.getSkill_A1());
            pstmt.setString(4, monsterVO.getSkill_A2());
            pstmt.setString(5, monsterVO.getSkill_A3());
            pstmt.setString(6, monsterVO.getSkill_A4());

            pstmt.setString(7, monsterVO.getSkill_B1());
            pstmt.setString(8, monsterVO.getSkill_B2());
            pstmt.setString(9, monsterVO.getSkill_B3());
            pstmt.setString(10, monsterVO.getSkill_B4());

            pstmt.setString(11, monsterVO.getSkill_C1());
            pstmt.setString(12, monsterVO.getSkill_C2());

            pstmt.setString(13, monsterVO.getM_luckySkill());
            pstmt.setString(14, monsterVO.getM_hit());
            pstmt.setString(15, monsterVO.getM_combatType());
            pstmt.setString(16, monsterVO.getM_rarity());
            pstmt.setString(17, monsterVO.getM_race());
            pstmt.setString(18, monsterVO.getM_ftuit());
            pstmt.setString(19, monsterVO.getM_type());
            pstmt.setString(20, monsterVO.getM_friendskill1());
            pstmt.setString(21, monsterVO.getM_friendskill2());
            pstmt.setString(22, monsterVO.getM_get());
            pstmt.setString(23, monsterVO.getM_spec());
            pstmt.setString(24, monsterVO.getM_pool());

            pstmt.executeUpdate();

            rs = pstmt.getGeneratedKeys();

            if (rs.next()) {
                gKey = rs.getString(1);
            }

        } catch (SQLException e) {
            throw new RuntimeException("A database error occured. "
                    + e.getMessage());
        } finally {
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return gKey;
    }

    @Override
    public void update(MonsterVO monsterVO) {
        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            pstmt = con.prepareStatement(UPDATE_SQL);
            pstmt.setString(1, monsterVO.getM_name());
            pstmt.setString(2, monsterVO.getM_tybe());
            pstmt.setString(3, monsterVO.getSkill_A1());
            pstmt.setString(4, monsterVO.getSkill_A2());
            pstmt.setString(5, monsterVO.getSkill_A3());
            pstmt.setString(6, monsterVO.getSkill_A4());

            pstmt.setString(7, monsterVO.getSkill_B1());
            pstmt.setString(8, monsterVO.getSkill_B2());
            pstmt.setString(9, monsterVO.getSkill_B3());
            pstmt.setString(10, monsterVO.getSkill_B4());

            pstmt.setString(11, monsterVO.getSkill_C1());
            pstmt.setString(12, monsterVO.getSkill_C2());
            pstmt.setString(13, monsterVO.getM_luckySkill());
            pstmt.setString(14, monsterVO.getM_hit());
            pstmt.setString(15, monsterVO.getM_combatType());
            pstmt.setString(16, monsterVO.getM_rarity());
            pstmt.setString(17, monsterVO.getM_race());
            pstmt.setString(18, monsterVO.getM_ftuit());
            pstmt.setString(19, monsterVO.getM_type());
            pstmt.setString(20, monsterVO.getM_friendskill1());
            pstmt.setString(21, monsterVO.getM_friendskill2());
            pstmt.setString(22, monsterVO.getM_get());
            pstmt.setString(23, monsterVO.getM_spec());
            pstmt.setString(24, monsterVO.getM_pool());
            pstmt.setString(25, monsterVO.getM_no());

            pstmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("A database error occured. "
                    + e.getMessage());
        } finally {
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void delete(String M_no) {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            pstmt = con.prepareStatement(DELETE_SQL);
            pstmt.setString(1, M_no);
            pstmt.executeUpdate();

        } catch (SQLException se) { // Handle any SQL errors
            throw new RuntimeException("A database error occured. "
                    + se.getMessage());
            // Clean up JDBC resources
        } finally {
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException se) {
                    se.printStackTrace(System.err);
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (Exception e) {
                    e.printStackTrace(System.err);
                }
            }
        }
    }

    @Override
    public List<MonsterVO> findByName(String M_name) {
        return null;
    }

    @Override
    public List<MonsterVO> findByTybe(String M_tybe) {
        return null;
    }

    @Override
    public List<MonsterVO> findByHit(String M_hit) {
        return null;
    }

    @Override
    public List<MonsterVO> findByCombatype(String M_combatType) {
        return null;
    }

    @Override
    public List<MonsterVO> findByRarity(String M_rarity) {
        return null;
    }

    @Override
    public List<MonsterVO> findByRace(String M_race) {
        return null;
    }

    @Override
    public List<MonsterVO> findByGet(String M_get) {
        return null;
    }

    @Override
    public List<MonsterVO> findByPool(String M_pool) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        MonsterVO vo = null;
        List<MonsterVO> list = new ArrayList<MonsterVO>();
        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            pstmt = con.prepareStatement(Monsters_pool);
            pstmt.setString(1, M_pool);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                vo = new MonsterVO();
                vo.setM_no(rs.getString("M_no"));
                vo.setM_name(rs.getString("Name"));
                vo.setM_tybe(rs.getString("Tybe"));
                vo.setPassiveSkill_1(rs.getString("PassiveSkill_1"));
                vo.setPassiveSkill_2(rs.getString("PassiveSkill_2"));
                vo.setPassiveSkill_3(rs.getString("PassiveSkill_3"));
                vo.setPassiveSkill_4(rs.getString("PassiveSkill_4"));
                vo.setEnergySkill_1(rs.getString("EnergySkill_1"));
                vo.setEnergySkill_2(rs.getString("EnergySkill_2"));
                vo.setEnergySkill_3(rs.getString("EnergySkill_3"));
                vo.setEnergySkill_4(rs.getString("EnergySkill_4"));
                vo.setInvolvedSkill_1(rs.getString("InvolvedSkill_1"));
                vo.setInvolvedSkill_2(rs.getString("InvolvedSkill_2"));
                vo.setM_luckySkill(rs.getString("LuckySkill"));
                vo.setM_hit(rs.getString("Hit"));
                vo.setM_combatType(rs.getString("CombatType"));
                vo.setM_rarity(rs.getString("Rarity"));
                vo.setM_race(rs.getString("Race"));
                vo.setM_ftuit(rs.getString("Ftuit"));
                vo.setM_type(rs.getString("Type"));
                vo.setM_friendskill1(rs.getString("friendskill1"));
                vo.setM_friendskill2(rs.getString("friendskill2"));
                vo.setM_get(rs.getString("Get_name"));
                vo.setM_spec(rs.getString("Spec"));
                vo.setM_pool(rs.getString("Pool"));
                vo.setM_createtime(rs.getTimestamp("Createtime"));
                vo.setM_updatetime(rs.getTimestamp("Updatetime"));

                list.add(vo);
            }
        } catch (SQLException e) {
            throw new RuntimeException("A database error occured. "
                    + e.getMessage());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }

    @Override
    public List<MonsterVO> getAllMonsters() {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        MonsterVO vo = null;
        List<MonsterVO> list = new ArrayList<MonsterVO>();
        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            pstmt = con.prepareStatement(AllMonsters);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                vo = new MonsterVO();
                vo.setM_no(rs.getString("M_no"));
                vo.setM_name(rs.getString("Name"));
                vo.setM_tybe(rs.getString("Tybe"));
                vo.setPassiveSkill_1(rs.getString("PassiveSkill_1"));
                vo.setPassiveSkill_2(rs.getString("PassiveSkill_2"));
                vo.setPassiveSkill_3(rs.getString("PassiveSkill_3"));
                vo.setPassiveSkill_4(rs.getString("PassiveSkill_4"));
                vo.setEnergySkill_1(rs.getString("EnergySkill_1"));
                vo.setEnergySkill_2(rs.getString("EnergySkill_2"));
                vo.setEnergySkill_3(rs.getString("EnergySkill_3"));
                vo.setEnergySkill_4(rs.getString("EnergySkill_4"));
                vo.setInvolvedSkill_1(rs.getString("InvolvedSkill_1"));
                vo.setInvolvedSkill_2(rs.getString("InvolvedSkill_2"));
                vo.setM_luckySkill(rs.getString("LuckySkill"));
                vo.setM_hit(rs.getString("Hit"));
                vo.setM_combatType(rs.getString("CombatType"));
                vo.setM_rarity(rs.getString("Rarity"));
                vo.setM_race(rs.getString("Race"));
                vo.setM_ftuit(rs.getString("Ftuit"));
                vo.setM_type(rs.getString("Type"));
                vo.setM_friendskill1(rs.getString("friendskill1"));
                vo.setM_friendskill2(rs.getString("friendskill2"));
                vo.setM_get(rs.getString("Get_name"));
                vo.setM_spec(rs.getString("Spec"));
                vo.setM_pool(rs.getString("Pool"));
                vo.setM_createtime(rs.getTimestamp("Createtime"));
                vo.setM_updatetime(rs.getTimestamp("Updatetime"));

                list.add(vo);
            }
        } catch (SQLException e) {
            throw new RuntimeException("A database error occured. "
                    + e.getMessage());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }
}
