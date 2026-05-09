package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.BellSimpleZFill: ImageVector
    get() {
        if (_BellSimpleZFill != null) {
            return _BellSimpleZFill!!
        }
        _BellSimpleZFill = ImageVector.Builder(
            name = "Filled.BellSimpleZFill",
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
                moveTo(221.85f, 192f)
                arcTo(15.8f, 15.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 200f)
                lineTo(48f, 200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -13.8f, -24.06f)
                curveTo(39.75f, 166.38f, 48f, 139.34f, 48f, 104f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = true, 160f, 0f)
                curveToRelative(0f, 35.33f, 8.26f, 62.38f, 13.81f, 71.94f)
                arcTo(15.89f, 15.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 221.84f, 192f)
                close()
                moveTo(152f, 144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                lineTo(127f, 136f)
                lineToRelative(23.7f, -35.56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 144f, 88f)
                lineTo(112f, 88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(17.05f)
                lineToRelative(-23.7f, 35.56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 112f, 152f)
                horizontalLineToRelative(32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 152f, 144f)
                close()
            }
        }.build()

        return _BellSimpleZFill!!
    }

@Suppress("ObjectPropertyName")
private var _BellSimpleZFill: ImageVector? = null
