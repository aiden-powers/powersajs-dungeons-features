# Powersaj's Dungeons Features
Mod that takes inspiration from, and intends to implement features from, the game Minecraft Dungeons.

## Changes From Vanilla (So far)
- Player movement speed increased to be similar to MD.
- Player auto-snap to block height increased to more than one block (MD has a 1.25 block height snap).

## System Design
### Mixins Accessing Outside Variables?? [DungeonsFeaturesValues.java](src/client/java/powersaj/dungeonsfeatures/DungeonsFeaturesValues.java)
- Almost all variables (at this moment, I believe all) are stored in a single class, `DungeonsFeaturesValues`.
- This is because I wanted to make it easy to change values and have them be consistent across the mod.
- The Fabric Mixin System makes you think that you cannot reference your own code from a Mixin, but you can. This is why I have a `DungeonsFeaturesValues` class that is referenced from Mixins. 