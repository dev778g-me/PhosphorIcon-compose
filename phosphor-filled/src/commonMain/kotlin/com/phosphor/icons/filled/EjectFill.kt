package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.EjectFill: ImageVector
    get() {
        if (_EjectFill != null) {
            return _EjectFill!!
        }
        _EjectFill = ImageVector.Builder(
            name = "Filled.EjectFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(33.31f, 126.24f)
                arcToRelative(15.59f, 15.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.1f, -17.12f)
                horizontalLineToRelative(0f)
                lineToRelative(73.73f, -77.51f)
                arcToRelative(24.76f, 24.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 35.72f, 0f)
                lineToRelative(73.73f, 77.51f)
                arcToRelative(15.59f, 15.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.1f, 17.12f)
                arcTo(16.18f, 16.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 207.76f, 136f)
                horizontalLineTo(48.24f)
                arcTo(16.18f, 16.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 33.31f, 126.24f)
                close()
                moveTo(208f, 152f)
                horizontalLineTo(48f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 16f)
                verticalLineToRelative(16f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineTo(208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                verticalLineTo(168f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 152f)
                close()
            }
        }.build()

        return _EjectFill!!
    }

@Suppress("ObjectPropertyName")
private var _EjectFill: ImageVector? = null
