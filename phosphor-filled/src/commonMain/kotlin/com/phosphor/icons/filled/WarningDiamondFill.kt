package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.WarningDiamondFill: ImageVector
    get() {
        if (_WarningDiamondFill != null) {
            return _WarningDiamondFill!!
        }
        _WarningDiamondFill = ImageVector.Builder(
            name = "Filled.WarningDiamondFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(235.33f, 116.72f)
                lineTo(139.28f, 20.66f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -22.56f, 0f)
                lineToRelative(-96f, 96.06f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 22.56f)
                lineToRelative(96.05f, 96.06f)
                horizontalLineToRelative(0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.56f, 0f)
                lineToRelative(96.05f, -96.06f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -22.56f)
                close()
                moveTo(120f, 80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                verticalLineToRelative(56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                close()
                moveTo(128f, 184f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 184f)
                close()
            }
        }.build()

        return _WarningDiamondFill!!
    }

@Suppress("ObjectPropertyName")
private var _WarningDiamondFill: ImageVector? = null
