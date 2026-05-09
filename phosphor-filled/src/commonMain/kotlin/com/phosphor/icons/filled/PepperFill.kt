package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.PepperFill: ImageVector
    get() {
        if (_PepperFill != null) {
            return _PepperFill!!
        }
        _PepperFill = ImageVector.Builder(
            name = "Filled.PepperFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(167.27f, 40.42f)
                arcTo(40.06f, 40.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.85f, 16.66f)
                arcTo(64.08f, 64.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, 104f)
                curveToRelative(0f, 46.75f, -25.75f, 78f, -76.53f, 93f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.77f, 31.13f)
                arcTo(264.8f, 264.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 66.75f, 232f)
                curveToRelative(40.78f, 0f, 86.16f, -9.15f, 117.53f, -35.46f)
                curveTo(210.64f, 174.44f, 224f, 143.3f, 224f, 104f)
                horizontalLineToRelative(0f)
                arcTo(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 167.27f, 40.42f)
                close()
                moveTo(192f, 95f)
                lineTo(163.58f, 80.83f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.16f, 0f)
                lineTo(128f, 95f)
                lineToRelative(-13.37f, -6.68f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 90.74f, 0f)
                close()
            }
        }.build()

        return _PepperFill!!
    }

@Suppress("ObjectPropertyName")
private var _PepperFill: ImageVector? = null
