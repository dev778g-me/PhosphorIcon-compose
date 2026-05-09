package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.CrownFill: ImageVector
    get() {
        if (_CrownFill != null) {
            return _CrownFill!!
        }
        _CrownFill = ImageVector.Builder(
            name = "Filled.CrownFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(248f, 80f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = false, -51.12f, 15.77f)
                lineToRelative(-26.79f, 33f)
                lineTo(146f, 73.4f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = false, -36.06f, 0f)
                lineTo(85.91f, 128.74f)
                lineToRelative(-26.79f, -33f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = false, -26.6f, 12f)
                lineTo(47f, 194.63f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 62.78f, 208f)
                horizontalLineTo(193.22f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 209f, 194.63f)
                lineToRelative(14.47f, -86.85f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 248f, 80f)
                close()
                moveTo(128f, 40f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 40f)
                close()
                moveTo(24f, 80f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 36f, 92f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 80f)
                close()
                moveTo(220f, 92f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 220f, 92f)
                close()
            }
        }.build()

        return _CrownFill!!
    }

@Suppress("ObjectPropertyName")
private var _CrownFill: ImageVector? = null
