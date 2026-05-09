package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.BellSimpleFill: ImageVector
    get() {
        if (_BellSimpleFill != null) {
            return _BellSimpleFill!!
        }
        _BellSimpleFill = ImageVector.Builder(
            name = "Filled.BellSimpleFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(168f, 224f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                lineTo(96f, 232f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(64f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 224f)
                close()
                moveTo(221.81f, 175.94f)
                curveTo(216.25f, 166.38f, 208f, 139.33f, 208f, 104f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = false, -160f, 0f)
                curveToRelative(0f, 35.34f, -8.26f, 62.38f, -13.81f, 71.94f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 200f)
                lineTo(208f, 200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.8f, -24.06f)
                close()
            }
        }.build()

        return _BellSimpleFill!!
    }

@Suppress("ObjectPropertyName")
private var _BellSimpleFill: ImageVector? = null
