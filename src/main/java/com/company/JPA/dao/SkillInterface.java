package com.company.JPA.dao;



import com.company.JPA.entity.Skill;

import java.util.List;

public interface SkillInterface {
    public List<Skill> getSkillByID(int user_id);

    public List<Skill> getAllSkills();

    public boolean insertSkill(Skill skill);
}
