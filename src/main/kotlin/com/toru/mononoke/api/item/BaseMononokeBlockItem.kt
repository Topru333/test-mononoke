package com.toru.mononoke.api.item

import com.toru.mononoke.common.itemgroup.BaseGroup
import net.minecraft.block.Block
import net.minecraft.item.BlockItem

open class BaseMononokeBlockItem(block: Block, settings: Settings = Settings()) : BlockItem(block, settings.group(BaseGroup))