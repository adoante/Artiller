# Artiller

Artiller is a 2-D artillery game app where players shoot down increasingly fast and numerous
fleets of ships and planes before they can reach the island’s shores. Between waves, the player
can repair their base, increase its fortifications, buy missiles and order bombing runs, and
attempt to win the game by investing in a peace negotiation.

## ENEMY LIST

|          |HEALTH|BASE SPEED|DAMAGE|CASH EARNED|OTHER                                                                           |
|----------|------|----------|------|-----------|:-------------------------------------------------------------------------------|
|PT BOAT   |1     |25        |1     |250        |                                                                                |
|DESTROYER |1     |15        |2     |500        |                                                                                |
|BATTLESHIP|2     |10        |5     |1000       |                                                                                |
|FIGHTER   |1     |35        |1     |           |Fighter changes height after every shot                                         |
|BOMBER    |1     |25        |5     |           |Bombers (and Fighters) leave battlefield after doing damage, going to next enemy|

## GAMEPLAY

Wave 1 begins with 4 ships/planes. Each following wave adds 4 ships to the size of the wave.
The player adjusts a Horizontal and a Vertical component to their shot, with power ranging from
1-10. When the shot is fired, it travels through the air, pulled by gravity (with a power of 1) and
wind (ranging from a power of 5 to the left to a power of 5 to the right)

If the ship is hit, it is destroyed (unless it is a battleship, then it must be hit again), the wave
counter goes down by 1, and a new ship is added to the right side of the screen. If the shot
misses, the ship moves forward a distance based on its speed, then stops and allows the player
to fire again. If the ship is close enough to the island, it deals damage every turn until it is
destroyed or the player runs out of health. If the enemy is a plane (Fighters and Bombers), the
plane “flies over” instead, dealing damage once and moving on to the next enemy.

When all the enemies in a wave are defeated, the player is taken to the Store, which has 5
options in it.

- REPAIR BASE: Heals 1 HP, up to the maximum, costs $1000
- FORTIFICATION: Adds 1 HP to the base’s maximum health. Costs $2500 + 500 for each time it is purchased.
- MISSILE: A shot that ignores gravity and wind. Fired using a different button than the button used to fire a normal shot. Costs $1000.
- BOMBING RUN: Sends 5 Bombers to attack the enemy fleet. When the bombers are attacking, there is a 50% chance that some bombers are destroyed. Costs $2500 + $1000 for every bomber destroyed in the run. This purchase halves the number of ships in the next wave, and can be used multiple times, halving what is left over each time. A little animation is used for this purchase.
- PEACE TREATY: Invest money to sue for peace. The chance that the treaty will succeed is based on how much money is invested, with $1,000,000 making the chance 100% and $1 being a 1 in a million chance. New investments will add onto previous ones, increasing the odds with each new amount added. If the treaty succeeds, the player wins. (Win chance = (money added + money previously added) / 1,000,000)

When the player is done buying stuff, they move to the next wave.

