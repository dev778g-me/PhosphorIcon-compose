package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.VectorThreeFill: ImageVector
    get() {
        if (_VectorThreeFill != null) {
            return _VectorThreeFill!!
        }
        _VectorThreeFill = ImageVector.Builder(
            name = "Filled.VectorThreeFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(237.66f, 141.66f)
                lineToRelative(-32f, 32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 168f)
                verticalLineTo(144f)
                horizontalLineTo(123.31f)
                lineToRelative(-40f, 40f)
                lineToRelative(18.35f, 18.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 216f)
                horizontalLineTo(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                verticalLineTo(160f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.66f, -5.66f)
                lineTo(72f, 172.69f)
                lineToRelative(40f, -40f)
                verticalLineTo(64f)
                horizontalLineTo(88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.66f, -13.66f)
                lineToRelative(32f, -32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 0f)
                lineToRelative(32f, 32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 152f, 64f)
                horizontalLineTo(128f)
                verticalLineToRelative(64f)
                horizontalLineToRelative(64f)
                verticalLineTo(104f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.66f, -5.66f)
                lineToRelative(32f, 32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 237.66f, 141.66f)
                close()
            }
        }.build()

        return _VectorThreeFill!!
    }

@Suppress("ObjectPropertyName")
private var _VectorThreeFill: ImageVector? = null
