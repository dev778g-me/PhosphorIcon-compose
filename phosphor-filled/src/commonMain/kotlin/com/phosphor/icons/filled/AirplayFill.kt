package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.AirplayFill: ImageVector
    get() {
        if (_AirplayFill != null) {
            return _AirplayFill!!
        }
        _AirplayFill = ImageVector.Builder(
            name = "Filled.AirplayFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(174.15f, 210.88f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 224f)
                horizontalLineTo(88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.15f, -13.12f)
                lineToRelative(40f, -48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.29f, 0f)
                close()
                moveTo(208f, 40f)
                horizontalLineTo(48f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 64f)
                verticalLineTo(176f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 24f)
                horizontalLineTo(68.22f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.07f, -1.44f)
                lineToRelative(38.28f, -45.92f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, -8.51f)
                arcToRelative(24.68f, 24.68f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.25f, 8.94f)
                lineToRelative(37.91f, 45.49f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.07f, 1.44f)
                horizontalLineTo(208f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, -24f)
                verticalLineTo(64f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 40f)
                close()
            }
        }.build()

        return _AirplayFill!!
    }

@Suppress("ObjectPropertyName")
private var _AirplayFill: ImageVector? = null
