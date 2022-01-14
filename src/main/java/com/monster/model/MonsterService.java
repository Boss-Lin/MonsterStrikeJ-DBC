package com.monster.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonsterService {
    @Autowired
    private static MonsterDAO_interface dao;

    public MonsterService() {
        dao = new MonsterJDBCDAO();
    }

    public MonsterVO addMonster(String M_name, String M_tybe, String Skill_A1, String Skill_A2, String Skill_A3, String Skill_A4, String Skill_B1, String Skill_B2, String Skill_B3, String Skill_B4, String Skill_C1, String Skill_C2,
                                String M_luckySkill, String M_hit, String M_combatType, String M_rarity, String M_race, String M_ftuit, String M_type, String M_friendskill1, String M_friendskill2, String M_get, String M_spec, String M_pool) {
        MonsterVO monsterVO = new MonsterVO();
        monsterVO.setM_no(M_name);
        monsterVO.setM_tybe(M_tybe);
        monsterVO.setSkill_A1(Skill_A1);
        monsterVO.setSkill_A2(Skill_A2);
        monsterVO.setSkill_A3(Skill_A3);
        monsterVO.setSkill_A4(Skill_A4);

        monsterVO.setSkill_B1(Skill_B1);
        monsterVO.setSkill_B2(Skill_B2);
        monsterVO.setSkill_B3(Skill_B3);
        monsterVO.setSkill_B4(Skill_B4);

        monsterVO.setSkill_C1(Skill_C1);
        monsterVO.setSkill_C2(Skill_C2);

        monsterVO.setM_luckySkill(M_luckySkill);
        monsterVO.setM_hit(M_hit);
        monsterVO.setM_combatType(M_combatType);
        monsterVO.setM_rarity(M_rarity);
        monsterVO.setM_race(M_race);
        monsterVO.setM_ftuit(M_ftuit);
        monsterVO.setM_type(M_type);
        monsterVO.setM_friendskill1(M_friendskill1);
        monsterVO.setM_friendskill2(M_friendskill2);
        monsterVO.setM_get(M_get);
        monsterVO.setM_spec(M_spec);
        monsterVO.setM_pool(M_pool);

        monsterVO.setM_no(dao.insert(monsterVO));
        return monsterVO;
    }

    public MonsterVO updateMonster(String M_name, String M_tybe, String Skill_A1, String Skill_A2, String Skill_A3, String Skill_A4, String Skill_B1, String Skill_B2, String Skill_B3, String Skill_B4, String Skill_C1, String Skill_C2,
                                   String M_luckySkill, String M_hit, String M_combatType, String M_rarity, String M_race, String M_ftuit, String M_type, String M_friendskill1, String M_friendskill2, String M_get, String M_spec, String M_pool) {
        MonsterVO monsterVO = new MonsterVO();
        monsterVO.setM_no(M_name);
        monsterVO.setM_tybe(M_tybe);
        monsterVO.setSkill_A1(Skill_A1);
        monsterVO.setSkill_A2(Skill_A2);
        monsterVO.setSkill_A3(Skill_A3);
        monsterVO.setSkill_A4(Skill_A4);

        monsterVO.setSkill_B1(Skill_B1);
        monsterVO.setSkill_B2(Skill_B2);
        monsterVO.setSkill_B3(Skill_B3);
        monsterVO.setSkill_B4(Skill_B4);

        monsterVO.setSkill_C1(Skill_C1);
        monsterVO.setSkill_C2(Skill_C2);

        monsterVO.setM_luckySkill(M_luckySkill);
        monsterVO.setM_hit(M_hit);
        monsterVO.setM_combatType(M_combatType);
        monsterVO.setM_rarity(M_rarity);
        monsterVO.setM_race(M_race);
        monsterVO.setM_ftuit(M_ftuit);
        monsterVO.setM_type(M_type);
        monsterVO.setM_friendskill1(M_friendskill1);
        monsterVO.setM_friendskill2(M_friendskill2);
        monsterVO.setM_get(M_get);
        monsterVO.setM_spec(M_spec);
        monsterVO.setM_pool(M_pool);
        dao.update(monsterVO);
        return monsterVO;
    }

    public void deleteMonster(String M_no) {
        dao.delete(M_no);
    }

    public List<MonsterVO> findByName(String M_name) {
        return dao.findByName(M_name);
    }

    public List<MonsterVO> findByTybe(String M_tybe) {
        return dao.findByTybe(M_tybe);
    }


    public List<MonsterVO> findByHit(String M_hit) {
        return dao.findByHit(M_hit);
    }


    public List<MonsterVO> findByCombatype(String M_combatType) {
        return dao.findByCombatype(M_combatType);
    }


    public List<MonsterVO> findByRarity(String M_rarity) {
        return dao.findByRarity(M_rarity);
    }


    public List<MonsterVO> findByRace(String M_race) {
        return dao.findByRace(M_race);
    }

    public List<MonsterVO> findByGet(String M_get) {
        return dao.findByGet(M_get);
    }

    public List<MonsterVO> findByPool(String M_pool) {
        return dao.findByPool(M_pool);
    }

    public static List<MonsterVO> findByAll() {
        return dao.findByAll();
    }

}
