package com.monster.model;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class MonsterVO implements java.io.Serializable {
    private String M_no;
    private String M_name;
    //    private String M_pic;角色圖片，先略過
    private String M_tybe;
    private String PassiveSkill; //反陷阱能力，先略過
    private String EnergySkill;
    private String InvolvedSkill;
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
