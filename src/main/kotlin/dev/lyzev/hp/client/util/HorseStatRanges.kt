/*
 * Copyright (c) 2026. Lyzev
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 */

package dev.lyzev.hp.client.util

/**
 * The minimum and maximum values a horse stat can have.
 *
 * Up until Minecraft 1.21.x these values were exposed as constants on
 * `AbstractHorseEntity` (e.g. `MIN_MOVEMENT_SPEED_BONUS`), but they were
 * removed in Minecraft 26.x, when stat generation was refactored into
 * [net.minecraft.world.entity.animal.equine.AbstractHorse.generateSpeed],
 * [net.minecraft.world.entity.animal.equine.AbstractHorse.generateJumpStrength]
 * and [net.minecraft.world.entity.animal.equine.AbstractHorse.generateMaxHealth].
 *
 * The values below mirror the vanilla generation formulas:
 * - speed:  `(0.45 + r * 0.3 + r * 0.3 + r * 0.3) * 0.25` -> `[0.1125, 0.3375]`
 * - jump:   `0.4 + r * 0.2 + r * 0.2 + r * 0.2`           -> `[0.4, 1.0]`
 * - health: `15 + nextInt(8) + nextInt(9)`                -> `[15.0, 30.0]`
 */
object HorseStatRanges {

    const val MIN_MOVEMENT_SPEED = 0.1125
    const val MAX_MOVEMENT_SPEED = 0.3375

    const val MIN_JUMP_STRENGTH = 0.4
    const val MAX_JUMP_STRENGTH = 1.0

    const val MIN_HEALTH = 15.0
    const val MAX_HEALTH = 30.0
}
