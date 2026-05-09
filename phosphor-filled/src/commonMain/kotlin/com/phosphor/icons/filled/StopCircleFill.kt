package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.StopCircleFill: ImageVector
    get() {
        if (_StopCircleFill != null) {
            return _StopCircleFill!!
        }
        _StopCircleFill = ImageVector.Builder(
            name = "Filled.StopCircleFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 24f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 232f, 128f)
                arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                close()
                moveTo(160f, 156f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 4f)
                lineTo(100f, 160f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, -4f)
                lineTo(96f, 100f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, -4f)
                horizontalLineToRelative(56f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
                close()
            }
        }.build()

        return _StopCircleFill!!
    }

@Suppress("ObjectPropertyName")
private var _StopCircleFill: ImageVector? = null
