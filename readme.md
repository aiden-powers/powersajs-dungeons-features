# Powersaj's Dungeons Features
Porting fundamental gameplay features from Minecraft Dungeons.

## Implemented Changes
*Most references are redirects to a video of the [1.0 walkthrough video](https://youtu.be/QreqqKleLpw?si=kgIs19TJzEAG4B8z)*

- Player movement speed increased.
  - *[¹ Code](src/client/java/powersaj/dungeonsfeatures/function/playerSpeed.java), [² Reference](https://youtu.be/QreqqKleLpw?si=kgIs19TJzEAG4B8z)*
- All entities auto-step to one block tall. 
  - *[¹ Code](src/client/java/powersaj/dungeonsfeatures/mixin/client/LivingEntityMixin.java), [² Reference](https://youtu.be/QreqqKleLpw?si=kgIs19TJzEAG4B8z)*

## System Design
### Mixins Accessing Outside Variables?
*Referencing [DungeonsFeaturesValues.java](src/client/java/powersaj/dungeonsfeatures/DungeonsFeaturesValues.java)*
- Almost all variables (at this moment, I believe all) are stored in a single class, `DungeonsFeaturesValues`.
- This is because I wanted to make it easy to change values and have them be consistent across the mod. 
- Just the idea of the mixin system makes most people think you can't reference your own variables/functions from a mixin, but you can. This is why I have a `DungeonsFeaturesValues` class that is referenced from every [mixin on the client](src/client/java/powersaj/dungeonsfeatures/mixin/client).