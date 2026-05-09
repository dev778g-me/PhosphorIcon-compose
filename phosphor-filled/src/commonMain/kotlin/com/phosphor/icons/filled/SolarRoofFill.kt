package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.SolarRoofFill: ImageVector
    get() {
        if (_SolarRoofFill != null) {
            return _SolarRoofFill!!
        }
        _SolarRoofFill = ImageVector.Builder(
            name = "Filled.SolarRoofFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(247.16f, 124.42f)
                lineToRelative(-40f, -80f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 40f)
                lineTo(56f, 40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.16f, 4.42f)
                lineToRelative(-40f, 80f)
                arcTo(8.08f, 8.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 128f)
                verticalLineToRelative(56f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(232f, 200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(248f, 128f)
                arcTo(8.08f, 8.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 247.16f, 124.42f)
                close()
                moveTo(99.06f, 56f)
                lineToRelative(12f, 24f)
                lineTo(80.94f, 80f)
                lineToRelative(-12f, -24f)
                close()
                moveTo(147.06f, 56f)
                lineTo(159.06f, 80f)
                lineTo(128.94f, 80f)
                lineToRelative(-12f, -24f)
                close()
                moveTo(100.94f, 120f)
                lineTo(88.94f, 96f)
                horizontalLineToRelative(30.12f)
                lineToRelative(12f, 24f)
                close()
                moveTo(148.94f, 120f)
                lineTo(136.94f, 96f)
                horizontalLineToRelative(30.12f)
                lineToRelative(12f, 24f)
                close()
                moveTo(196.94f, 120f)
                lineTo(184.94f, 96f)
                horizontalLineToRelative(30.12f)
                lineToRelative(12f, 24f)
                close()
                moveTo(207.06f, 80f)
                lineTo(176.94f, 80f)
                lineToRelative(-12f, -24f)
                horizontalLineToRelative(30.12f)
                close()
                moveTo(104f, 184f)
                lineTo(104f, 136f)
                lineTo(232f, 136f)
                verticalLineToRelative(48f)
                close()
            }
        }.build()

        return _SolarRoofFill!!
    }

@Suppress("ObjectPropertyName")
private var _SolarRoofFill: ImageVector? = null
