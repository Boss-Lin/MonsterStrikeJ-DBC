package com.monster.model;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class MonsterVO implements java.io.Serializable {
    private String M_no;
    private String M_name;
    private String Name;
    //    private String M_pic;角色圖片，先略過
    private String M_tybe;
    private String Skill_A1;
    private String Skill_A2;
    private String Skill_A3;
    private String Skill_A4;
    private String Skill_B1;
    private String Skill_B2;
    private String Skill_B3;
    private String Skill_B4;
    private String Skill_C1;
    private String Skill_C2;
    private String PassiveSkill_1;//反陷阱能力，先略過
    private String PassiveSkill_2;
    private String PassiveSkill_3;
    private String PassiveSkill_4;
    private String EnergySkill_1;
    private String EnergySkill_2;
    private String EnergySkill_3;
    private String EnergySkill_4;
    private String InvolvedSkill_1;
    private String InvolvedSkill_2;
    private String M_luckySkill;
    private String M_hit;
    private String M_combatType;
    private String M_rarity;
    private String M_race;
    private String M_ftuit;
    private String M_type;
    private String M_friendskill1;
    private String M_friendskill2;
    private String M_get;
    private String M_spec;
    private String M_pool;
    private Timestamp M_createtime;
    private Timestamp M_updatetime;

}
