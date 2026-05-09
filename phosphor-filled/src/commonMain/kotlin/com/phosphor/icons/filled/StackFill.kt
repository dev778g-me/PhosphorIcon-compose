package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.StackFill: ImageVector
    get() {
        if (_StackFill != null) {
            return _StackFill!!
        }
        _StackFill = ImageVector.Builder(
            name = "Filled.StackFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(220f, 169.09f)
                lineToRelative(-92f, 53.65f)
                lineTo(36f, 169.09f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 28f, 182.91f)
                lineToRelative(96f, 56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.06f, 0f)
                lineToRelative(96f, -56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 220f, 169.09f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(220f, 121.09f)
                lineToRelative(-92f, 53.65f)
                lineTo(36f, 121.09f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 28f, 134.91f)
                lineToRelative(96f, 56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.06f, 0f)
                lineToRelative(96f, -56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 220f, 121.09f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(28f, 86.91f)
                lineToRelative(96f, 56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.06f, 0f)
                lineToRelative(96f, -56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -13.82f)
                lineToRelative(-96f, -56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.06f, 0f)
                lineToRelative(-96f, 56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 13.82f)
                close()
            }
        }.build()

        return _StackFill!!
    }

@Suppress("ObjectPropertyName")
private var _StackFill: ImageVector? = null
