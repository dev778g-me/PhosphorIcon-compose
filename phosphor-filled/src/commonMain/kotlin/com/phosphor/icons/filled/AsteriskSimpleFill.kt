package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.AsteriskSimpleFill: ImageVector
    get() {
        if (_AsteriskSimpleFill != null) {
            return _AsteriskSimpleFill!!
        }
        _AsteriskSimpleFill = ImageVector.Builder(
            name = "Filled.AsteriskSimpleFill",
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
                moveTo(191.34f, 115.83f)
                lineTo(140.94f, 132.21f)
                lineTo(172.09f, 175.08f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12.94f, 9.4f)
                lineTo(128f, 141.61f)
                lineTo(96.85f, 184.48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12.94f, -9.4f)
                lineToRelative(31.15f, -42.87f)
                lineToRelative(-50.4f, -16.38f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.94f, -15.22f)
                lineTo(120f, 117f)
                lineTo(120f, 64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                verticalLineToRelative(53f)
                lineToRelative(50.4f, -16.38f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.94f, 15.22f)
                close()
            }
        }.build()

        return _AsteriskSimpleFill!!
    }

@Suppress("ObjectPropertyName")
private var _AsteriskSimpleFill: ImageVector? = null
