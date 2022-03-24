package com.monster.model;

import java.io.IOException;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {

        MonsterJDBCDAO dao = new MonsterJDBCDAO();

        /**新增(成功)*/
//        MonsterVO monsterVO1 = new MonsterVO();
//        monsterVO1.setM_name("五條");
//        monsterVO1.setM_tybe("T_5");
//
//        monsterVO1.setSkill_A1("Skill13");
//        monsterVO1.setSkill_A2("Skill06");
//        monsterVO1.setSkill_A3("Skill01");
//        monsterVO1.setSkill_A4("Skill01");
//        monsterVO1.setSkill_B1("Skill11");
//        monsterVO1.setSkill_B2("Skill01");
//        monsterVO1.setSkill_B3("Skill01");
//        monsterVO1.setSkill_B4("Skill01");
//        monsterVO1.setSkill_C1("Skill01");
//        monsterVO1.setSkill_C2("Skill01");
//
//        monsterVO1.setM_luckySkill("LuckySkill0002");
//        monsterVO1.setM_hit("Hit02");
//        monsterVO1.setM_combatType("CombatType0005");
//        monsterVO1.setM_rarity("rarity02");
//        monsterVO1.setM_race("race0007");
//        monsterVO1.setM_ftuit("有");
//        monsterVO1.setM_type("type0003");
//        monsterVO1.setM_friendskill1("力量驅動");
//        monsterVO1.setM_friendskill2("印記炸彈");
//        monsterVO1.setM_get("Get01");
//        monsterVO1.setM_spec("超強");
//        monsterVO1.setM_pool("咒術回戰");
//        dao.insert(monsterVO1);
//        System.out.println("成功新增");
//        System.out.println("---------------------");

        /**更新(成功)*/
//        MonsterVO monsterVO2 = new MonsterVO();
//        monsterVO2.setM_name("意翔");
//        monsterVO2.setM_tybe("T_2");
//        monsterVO2.setSkill_A1("Skill13");
//        monsterVO2.setSkill_A2("Skill06");
//        monsterVO2.setSkill_A3("Skill01");
//        monsterVO2.setSkill_A4("Skill01");
//        monsterVO2.setSkill_B1("Skill11");
//        monsterVO2.setSkill_B2("Skill01");
//        monsterVO2.setSkill_B3("Skill01");
//        monsterVO2.setSkill_B4("Skill01");
//        monsterVO2.setSkill_C1("Skill01");
//        monsterVO2.setSkill_C2("Skill01");
//        monsterVO2.setM_luckySkill("LuckySkill0003");
//        monsterVO2.setM_hit("Hit01");
//        monsterVO2.setM_combatType("CombatType0004");
//        monsterVO2.setM_rarity("rarity02");
//        monsterVO2.setM_race("race0015");
//        monsterVO2.setM_ftuit("有");
//        monsterVO2.setM_type("type0003");
//        monsterVO2.setM_friendskill1("漸伸線領域・More");
//        monsterVO2.setM_friendskill2("漸伸線領域・Narrow");
//        monsterVO2.setM_get("Get02");
//        monsterVO2.setM_spec("超強強");
//        monsterVO2.setM_pool("鬼滅");
//        monsterVO2.setM_no("No.0008");
//        dao.update(monsterVO2);
//        System.out.println("成功更新");
//        System.out.println("---------------------");

        /**刪除(成功)*/
//        dao.delete("M0006");
//        System.out.println("成功刪除");
//        System.out.println("---------------------");

        /**查詢_名稱(M_name)*/
        /**查詢_屬性(M_tybe)*/
        /**查詢_擊種(M_hit)*/
        /**查詢_戰型(M_combatType)*/
        /**查詢_稀有度(M_rarity)*/
        /**查詢_種族(M_race)*/
        /**查詢_取得方式(M_get)*/
        /**查詢_卡池(M_pool)*/
//        List<MonsterVO> list = dao.findByPool("%鬼滅%");
//        for (MonsterVO Monsters_pool : list) {
//            System.out.println(Monsters_pool.getM_no() + ",");
//            System.out.println(Monsters_pool.getPassiveSkill_1() + ",");
//            System.out.println(Monsters_pool.getPassiveSkill_2() + ",");
//            System.out.println(Monsters_pool.getPassiveSkill_3() + ",");
//            System.out.println(Monsters_pool.getPassiveSkill_4() + ",");
//            System.out.println(Monsters_pool.getEnergySkill_1() + ",");
//            System.out.println(Monsters_pool.getEnergySkill_2() + ",");
//            System.out.println(Monsters_pool.getEnergySkill_3() + ",");
//            System.out.println(Monsters_pool.getEnergySkill_4() + ",");
//            System.out.println(Monsters_pool.getInvolvedSkill_1() + ",");
//            System.out.println(Monsters_pool.getInvolvedSkill_2() + ",");
//            System.out.println(Monsters_pool.getM_luckySkill() + ",");
//            System.out.println(Monsters_pool.getM_hit() + ",");
//            System.out.println(Monsters_pool.getM_combatType() + ",");
//            System.out.println(Monsters_pool.getM_rarity() + ",");
//            System.out.println(Monsters_pool.getM_race() + ",");
//            System.out.println(Monsters_pool.getM_ftuit() + ",");
//            System.out.println(Monsters_pool.getM_type() + ",");
//            System.out.println(Monsters_pool.getM_friendskill1() + ",");
//            System.out.println(Monsters_pool.getM_friendskill2() + ",");
//            System.out.println(Monsters_pool.getM_get() + ",");
//            System.out.println(Monsters_pool.getM_spec() + ",");
//            System.out.println(Monsters_pool.getM_pool() + ",");
//            System.out.println(Monsters_pool.getM_createtime() + ",");
//            System.out.println(Monsters_pool.getM_updatetime() + ",");
//            System.out.println("");
//        }

        /**查詢_全部*/
        List<MonsterVO> list = dao.findByAll();
        for (MonsterVO allMonsters : list) {
            System.out.println(allMonsters.getM_no() + ",");
            System.out.println(allMonsters.getName() + ",");
            System.out.println(allMonsters.getM_tybe() + ",");
            System.out.println(allMonsters.getPassiveSkill_1() + ",");
            System.out.println(allMonsters.getPassiveSkill_2() + ",");
            System.out.println(allMonsters.getPassiveSkill_3() + ",");
            System.out.println(allMonsters.getPassiveSkill_4() + ",");
            System.out.println(allMonsters.getEnergySkill_1() + ",");
            System.out.println(allMonsters.getEnergySkill_2() + ",");
            System.out.println(allMonsters.getEnergySkill_3() + ",");
            System.out.println(allMonsters.getEnergySkill_4() + ",");
            System.out.println(allMonsters.getInvolvedSkill_1() + ",");
            System.out.println(allMonsters.getInvolvedSkill_2() + ",");
            System.out.println(allMonsters.getM_luckySkill() + ",");
            System.out.println(allMonsters.getM_hit() + ",");
            System.out.println(allMonsters.getM_combatType() + ",");
            System.out.println(allMonsters.getM_rarity() + ",");
            System.out.println(allMonsters.getM_race() + ",");
            System.out.println(allMonsters.getM_ftuit() + ",");
            System.out.println(allMonsters.getM_type() + ",");
            System.out.println(allMonsters.getM_friendskill1() + ",");
            System.out.println(allMonsters.getM_friendskill2() + ",");
            System.out.println(allMonsters.getM_get() + ",");
            System.out.println(allMonsters.getM_spec() + ",");
            System.out.println(allMonsters.getM_pool() + ",");
            System.out.println(allMonsters.getM_createtime() + ",");
            System.out.println(allMonsters.getM_updatetime() + ",");
            System.out.println("");

            System.out.println("成功查詢全部角色");
            System.out.println("---------------------");
//        }

        }
    }
}
