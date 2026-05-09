package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.CylinderFill: ImageVector
    get() {
        if (_CylinderFill != null) {
            return _CylinderFill!!
        }
        _CylinderFill = ImageVector.Builder(
            name = "Filled.CylinderFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 16f)
                curveTo(87.63f, 16f, 56f, 35.33f, 56f, 60f)
                lineTo(56f, 196f)
                curveToRelative(0f, 24.67f, 31.63f, 44f, 72f, 44f)
                reflectiveCurveToRelative(72f, -19.33f, 72f, -44f)
                lineTo(200f, 60f)
                curveTo(200f, 35.33f, 168.37f, 16f, 128f, 16f)
                close()
                moveTo(128f, 224f)
                curveToRelative(-29.83f, 0f, -56f, -13.08f, -56f, -28f)
                lineTo(72f, 77.43f)
                curveTo(82.92f, 88.5f, 103.9f, 96f, 128f, 96f)
                reflectiveCurveToRelative(45.08f, -7.5f, 56f, -18.57f)
                lineTo(184f, 196f)
                curveTo(184f, 210.92f, 157.83f, 224f, 128f, 224f)
                close()
            }
        }.build()

        return _CylinderFill!!
    }

@Suppress("ObjectPropertyName")
private var _CylinderFill: ImageVector? = null
