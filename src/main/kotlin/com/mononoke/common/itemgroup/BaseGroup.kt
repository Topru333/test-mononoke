package com.mononoke.common.itemgroup

import com.mononoke.common.registry.libs.LibItems
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack

object BaseGroup : ItemGroup(0, "MononokeTab") {

    override fun createIcon(): ItemStack {
        return ItemStack(LibItems.HITODAMA_ORDINARY_ITEM)
    }

}