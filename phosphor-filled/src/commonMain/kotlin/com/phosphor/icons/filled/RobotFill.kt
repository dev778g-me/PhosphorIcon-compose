package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.RobotFill: ImageVector
    get() {
        if (_RobotFill != null) {
            return _RobotFill!!
        }
        _RobotFill = ImageVector.Builder(
            name = "Filled.RobotFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(200f, 48f)
                lineTo(136f, 48f)
                lineTo(136f, 16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                lineTo(120f, 48f)
                lineTo(56f, 48f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 80f)
                lineTo(24f, 192f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 32f)
                lineTo(200f, 224f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, -32f)
                lineTo(232f, 80f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 48f)
                close()
                moveTo(172f, 96f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 172f, 96f)
                close()
                moveTo(96f, 184f)
                lineTo(80f, 184f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -32f)
                lineTo(96f, 152f)
                close()
                moveTo(84f, 120f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 84f, 120f)
                close()
                moveTo(144f, 184f)
                lineTo(112f, 184f)
                lineTo(112f, 152f)
                horizontalLineToRelative(32f)
                close()
                moveTo(176f, 184f)
                lineTo(160f, 184f)
                lineTo(160f, 152f)
                horizontalLineToRelative(16f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 32f)
                close()
            }
        }.build()

        return _RobotFill!!
    }

@Suppress("ObjectPropertyName")
private var _RobotFill: ImageVector? = null
