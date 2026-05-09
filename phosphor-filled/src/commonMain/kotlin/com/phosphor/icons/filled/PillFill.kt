package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.PillFill: ImageVector
    get() {
        if (_PillFill != null) {
            return _PillFill!!
        }
        _PillFill = ImageVector.Builder(
            name = "Filled.PillFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216.43f, 39.6f)
                arcToRelative(53.27f, 53.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, -75.33f, 0f)
                lineTo(39.6f, 141.09f)
                arcToRelative(53.26f, 53.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, 75.32f, 75.31f)
                lineTo(216.43f, 114.91f)
                arcTo(53.32f, 53.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216.43f, 39.6f)
                close()
                moveTo(205.11f, 103.6f)
                lineTo(154.36f, 154.34f)
                lineTo(101.67f, 101.66f)
                lineTo(152.42f, 50.91f)
                arcToRelative(37.26f, 37.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 52.69f, 52.69f)
                close()
                moveTo(189.68f, 82.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 11.32f)
                lineToRelative(-24f, 24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -11.31f, -11.32f)
                lineToRelative(24f, -24f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 189.68f, 82.34f)
                close()
            }
        }.build()

        return _PillFill!!
    }

@Suppress("ObjectPropertyName")
private var _PillFill: ImageVector? = null
