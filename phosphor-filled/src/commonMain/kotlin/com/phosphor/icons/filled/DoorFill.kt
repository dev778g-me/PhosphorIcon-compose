package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.DoorFill: ImageVector
    get() {
        if (_DoorFill != null) {
            return _DoorFill!!
        }
        _DoorFill = ImageVector.Builder(
            name = "Filled.DoorFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(232f, 216f)
                lineTo(208f, 216f)
                lineTo(208f, 40f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
                lineTo(64f, 24f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 40f)
                lineTo(48f, 216f)
                lineTo(24f, 216f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                lineTo(232f, 232f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                close()
                moveTo(164f, 144f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 164f, 144f)
                close()
            }
        }.build()

        return _DoorFill!!
    }

@Suppress("ObjectPropertyName")
private var _DoorFill: ImageVector? = null
