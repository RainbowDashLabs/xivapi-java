package de.chojo.xivapi.entities.item.sub;

import com.fasterxml.jackson.annotation.JsonProperty;
import de.chojo.xivapi.entities.item.sub.classjobrepair.ItemSoulCrystal;
import de.chojo.xivapi.entities.item.sub.classjobrepair.LimitBreak;

public record ClassJobRepair(
        @JsonProperty("Abbreviation") String abbreviation,
        @JsonProperty("Abbreviation_ja") String abbreviationJa,
        @JsonProperty("MonsterNote") Object monsterNote,
        @JsonProperty("NameEnglish_de") String nameEnglishDe,
        @JsonProperty("Name") String name,
        @JsonProperty("ClassJobCategory") ClassJobCategory classJobCategory,
        @JsonProperty("Name_ja") String nameJa,
        @JsonProperty("UIPriority") int uIPriority,
        @JsonProperty("UnlockQuest") Object unlockQuest,
        @JsonProperty("Abbreviation_fr") String abbreviationFr,
        @JsonProperty("StartingTown") Object startingTown,
        @JsonProperty("ID") int id,
        @JsonProperty("ModifierPiety") int modifierPiety,
        @JsonProperty("DohDolJobIndex") int dohDolJobIndex,
        @JsonProperty("BattleClassIndex") String battleClassIndex,
        @JsonProperty("ModifierDexterity") int modifierDexterity,
        @JsonProperty("ModifierMind") int modifierMind,
        @JsonProperty("ExpArrayIndex") int expArrayIndex,
        @JsonProperty("NameEnglish_fr") String nameEnglishFr,
        @JsonProperty("Role") int role,
        @JsonProperty("Abbreviation_en") String abbreviationEn,
        @JsonProperty("PartyBonus") int partyBonus,
        @JsonProperty("ClassJobParent") Object classJobParent,
        @JsonProperty("Icon") String icon,
        @JsonProperty("Name_fr") String nameFr,
        @JsonProperty("ModifierManaPoints") int modifierManaPoints,
        @JsonProperty("Prerequisite") Object prerequisite,
        @JsonProperty("RelicQuest") Object relicQuest,
        @JsonProperty("ItemSoulCrystal") ItemSoulCrystal itemSoulCrystal,
        @JsonProperty("ModifierVitality") int modifierVitality,
        @JsonProperty("PvPActionSortRow") int pvPActionSortRow,
        @JsonProperty("NameEnglish_ja") String nameEnglishJa,
        @JsonProperty("StartingLevel") int startingLevel,
        @JsonProperty("Name_de") String nameDe,
        @JsonProperty("ModifierStrength") int modifierStrength,
        @JsonProperty("NameEnglish_en") String nameEnglishEn,
        @JsonProperty("NameEnglish") String nameEnglish,
        @JsonProperty("Abbreviation_de") String abbreviationDe,
        @JsonProperty("ModifierHitPoints") int modifierHitPoints,
        @JsonProperty("ModifierIntelligence") int modifierIntelligence,
        @JsonProperty("CanQueueForDuty") int canQueueForDuty,
        @JsonProperty("LimitBreak3") LimitBreak limitBreak3,
        @JsonProperty("LimitBreak2") LimitBreak limitBreak2,
        @JsonProperty("PrimaryStat") int primaryStat,
        @JsonProperty("LimitBreak1") LimitBreak limitBreak1,
        @JsonProperty("Name_en") String nameEn,
        @JsonProperty("ItemStartingWeapon") Object itemStartingWeapon,
        @JsonProperty("JobIndex") int jobIndex,
        @JsonProperty("IsLimitedJob") int isLimitedJob,
        @JsonProperty("LimitBreak3TargetID") int limitBreak3TargetID,
        @JsonProperty("MonsterNoteTargetID") int monsterNoteTargetID,
        @JsonProperty("ItemSoulCrystalTarget") String itemSoulCrystalTarget,
        @JsonProperty("LimitBreak1TargetID") int limitBreak1TargetID,
        @JsonProperty("UnlockQuestTarget") String unlockQuestTarget,
        @JsonProperty("PrerequisiteTarget") String prerequisiteTarget,
        @JsonProperty("MonsterNoteTarget") String monsterNoteTarget,
        @JsonProperty("StartingTownTargetID") int startingTownTargetID,
        @JsonProperty("ClassJobParentTarget") String classJobParentTarget,
        @JsonProperty("RelicQuestTargetID") int relicQuestTargetID,
        @JsonProperty("ClassJobCategoryTarget") String classJobCategoryTarget,
        @JsonProperty("LimitBreak2Target") String limitBreak2Target,
        @JsonProperty("ClassJobCategoryTargetID") int classJobCategoryTargetID,
        @JsonProperty("LimitBreak2TargetID") int limitBreak2TargetID,
        @JsonProperty("ItemStartingWeaponTarget") String itemStartingWeaponTarget,
        @JsonProperty("StartingTownTarget") String startingTownTarget,
        @JsonProperty("RelicQuestTarget") String relicQuestTarget,
        @JsonProperty("LimitBreak1Target") String limitBreak1Target,
        @JsonProperty("PrerequisiteTargetID") int prerequisiteTargetID,
        @JsonProperty("LimitBreak3Target") String limitBreak3Target,
        @JsonProperty("UnlockQuestTargetID") int unlockQuestTargetID,
        @JsonProperty("ItemSoulCrystalTargetID") int itemSoulCrystalTargetID,
        @JsonProperty("ClassJobParentTargetID") int classJobParentTargetID,
        @JsonProperty("ItemStartingWeaponTargetID") int itemStartingWeaponTargetID
) {
}
