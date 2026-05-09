package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.PentagonFill: ImageVector
    get() {
        if (_PentagonFill != null) {
            return _PentagonFill!!
        }
        _PentagonFill = ImageVector.Builder(
            name = "Filled.PentagonFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(231.26f, 105.19f)
                lineToRelative(-32f, 107.54f)
                lineToRelative(-0.06f, 0.17f)
                arcTo(15.94f, 15.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 184f, 224f)
                horizontalLineTo(72f)
                arcTo(15.94f, 15.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56.8f, 212.9f)
                lineToRelative(-0.06f, -0.17f)
                lineToRelative(-32f, -107.54f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.7f, -17.63f)
                lineToRelative(87.92f, -68.31f)
                lineToRelative(0.18f, -0.14f)
                arcToRelative(15.93f, 15.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.92f, 0f)
                lineToRelative(0.18f, 0.14f)
                lineToRelative(87.92f, 68.31f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 231.26f, 105.19f)
                close()
            }
        }.build()

        return _PentagonFill!!
    }

@Suppress("ObjectPropertyName")
private var _PentagonFill: ImageVector? = null
