package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.SkipBackCircleFill: ImageVector
    get() {
        if (_SkipBackCircleFill != null) {
            return _SkipBackCircleFill!!
        }
        _SkipBackCircleFill = ImageVector.Builder(
            name = "Filled.SkipBackCircleFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 24f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 232f, 128f)
                arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                close()
                moveTo(168f, 168f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12.65f, 6.51f)
                lineTo(104f, 137.83f)
                lineTo(104f, 168f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(88f, 88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                verticalLineToRelative(30.17f)
                lineToRelative(51.35f, -36.68f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 88f)
                close()
            }
        }.build()

        return _SkipBackCircleFill!!
    }

@Suppress("ObjectPropertyName")
private var _SkipBackCircleFill: ImageVector? = null
