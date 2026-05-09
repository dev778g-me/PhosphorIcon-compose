package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.DiamondFill: ImageVector
    get() {
        if (_DiamondFill != null) {
            return _DiamondFill!!
        }
        _DiamondFill = ImageVector.Builder(
            name = "Filled.DiamondFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(240f, 128f)
                arcToRelative(15.85f, 15.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.67f, 11.28f)
                lineToRelative(-96.05f, 96.06f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -22.56f, 0f)
                horizontalLineToRelative(0f)
                lineToRelative(-96f, -96.06f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -22.56f)
                lineToRelative(96.05f, -96.06f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.56f, 0f)
                lineToRelative(96.05f, 96.06f)
                arcTo(15.85f, 15.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 128f)
                close()
            }
        }.build()

        return _DiamondFill!!
    }

@Suppress("ObjectPropertyName")
private var _DiamondFill: ImageVector? = null
