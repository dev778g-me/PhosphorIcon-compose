package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.SwordFill: ImageVector
    get() {
        if (_SwordFill != null) {
            return _SwordFill!!
        }
        _SwordFill = ImageVector.Builder(
            name = "Filled.SwordFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216f, 32f)
                lineTo(152f, 32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.34f, 3.12f)
                lineToRelative(-64f, 83.21f)
                lineTo(72f, 108.69f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -22.64f, 0f)
                lineToRelative(-8.69f, 8.7f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 22.63f)
                lineToRelative(22f, 22f)
                lineToRelative(-32f, 32f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 22.63f)
                lineToRelative(8.69f, 8.68f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.62f, 0f)
                lineToRelative(32f, -32f)
                lineToRelative(22f, 22f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.64f, 0f)
                lineToRelative(8.69f, -8.7f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -22.63f)
                lineToRelative(-9.64f, -9.64f)
                lineToRelative(83.21f, -64f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 104f)
                lineTo(224f, 40f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 32f)
                close()
                moveTo(208f, 100.06f)
                lineTo(126.26f, 162.94f)
                lineTo(115.32f, 152f)
                lineToRelative(50.34f, -50.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.32f, -11.31f)
                lineTo(104f, 140.68f)
                lineTo(93.07f, 129.74f)
                lineTo(155.94f, 48f)
                lineTo(208f, 48f)
                close()
            }
        }.build()

        return _SwordFill!!
    }

@Suppress("ObjectPropertyName")
private var _SwordFill: ImageVector? = null
