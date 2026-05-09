package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.FileCodeFill: ImageVector
    get() {
        if (_FileCodeFill != null) {
            return _FileCodeFill!!
        }
        _FileCodeFill = ImageVector.Builder(
            name = "Filled.FileCodeFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(213.66f, 82.34f)
                lineToRelative(-56f, -56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 152f, 24f)
                lineTo(56f, 24f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 40f)
                lineTo(40f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(200f, 232f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(216f, 88f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 213.66f, 82.34f)
                close()
                moveTo(109.66f, 170.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 11.32f)
                lineToRelative(-24f, -24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -11.32f)
                lineToRelative(24f, -24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 11.32f)
                lineTo(91.31f, 152f)
                close()
                moveTo(181.66f, 157.66f)
                lineTo(157.66f, 181.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, -11.32f)
                lineTo(164.69f, 152f)
                lineToRelative(-18.35f, -18.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, -11.32f)
                lineToRelative(24f, 24f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 181.66f, 157.66f)
                close()
                moveTo(152f, 88f)
                lineTo(152f, 44f)
                lineToRelative(44f, 44f)
                close()
            }
        }.build()

        return _FileCodeFill!!
    }

@Suppress("ObjectPropertyName")
private var _FileCodeFill: ImageVector? = null
