package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.SyringeFill: ImageVector
    get() {
        if (_SyringeFill != null) {
            return _SyringeFill!!
        }
        _SyringeFill = ImageVector.Builder(
            name = "Filled.SyringeFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(237.66f, 77.6f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 0f)
                lineTo(208f, 59.25f)
                lineTo(179.3f, 88f)
                lineToRelative(34.35f, 34.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 11.32f)
                lineTo(196f, 127.27f)
                lineToRelative(-84f, 84f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 100.65f, 216f)
                horizontalLineTo(51.26f)
                lineTo(29.6f, 237.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.72f, -0.43f)
                arcToRelative(8.21f, 8.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.61f, -11.1f)
                lineToRelative(21.45f, -21.46f)
                verticalLineTo(155.28f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 44.63f, 144f)
                lineToRelative(15.18f, -15.18f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.66f, 0f)
                lineTo(94.3f, 157.63f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 11.32f, -11.32f)
                lineTo(76.78f, 117.47f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -5.66f)
                lineToRelative(11f, -11f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.66f, 0f)
                lineToRelative(28.84f, 28.84f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 11.32f, -11.32f)
                lineTo(104.79f, 89.46f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -5.66f)
                lineToRelative(23.87f, -23.86f)
                lineToRelative(-6.35f, -6.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.18f, -11.49f)
                arcToRelative(8.22f, 8.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.37f, 0.41f)
                lineTo(168f, 76.63f)
                lineToRelative(28.69f, -28.7f)
                lineTo(178.33f, 29.58f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.17f, -11.49f)
                arcToRelative(8.23f, 8.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.38f, 0.41f)
                lineToRelative(47.78f, 47.78f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 237.66f, 77.6f)
                close()
            }
        }.build()

        return _SyringeFill!!
    }

@Suppress("ObjectPropertyName")
private var _SyringeFill: ImageVector? = null
