• Character (abstract class): Represents any game character. Has a name and level. Requires a
method speak().
• Hero (class): Inherits from Character. Represents playable characters.
• Enemy (class): Inherits from Character. Represents game enemies.
• Questable (interface): Characters that can accept quests must implement this. It includes ac-
ceptQuest(String questName).
• QuestBoard (class): Assigns quests to characters that implement Questable.
• BattleManager (class): Simulates a battle between a Hero and an Enemy.