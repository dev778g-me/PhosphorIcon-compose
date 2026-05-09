package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.MegaphoneSimpleFill: ImageVector
    get() {
        if (_MegaphoneSimpleFill != null) {
            return _MegaphoneSimpleFill!!
        }
        _MegaphoneSimpleFill = ImageVector.Builder(
            name = "Filled.MegaphoneSimpleFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(228.54f, 86.66f)
                lineToRelative(-176.06f, -54f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 48f)
                lineTo(32f, 192f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.52f, -0.65f)
                lineTo(136f, 181.73f)
                lineTo(136f, 192f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                verticalLineToRelative(-29.9f)
                lineToRelative(28.54f, -8.75f)
                arcTo(16.09f, 16.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 240f, 138f)
                lineTo(240f, 102f)
                arcTo(16.09f, 16.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 228.54f, 86.66f)
                close()
                moveTo(184f, 192f)
                lineTo(152f, 192f)
                lineTo(152f, 176.82f)
                lineTo(184f, 167f)
                close()
                moveTo(224f, 138f)
                lineTo(223.89f, 138f)
                lineTo(152f, 160.08f)
                lineTo(152f, 79.91f)
                lineTo(223.89f, 102f)
                lineToRelative(0.11f, 0f)
                verticalLineToRelative(36f)
                close()
            }
        }.build()

        return _MegaphoneSimpleFill!!
    }

@Suppress("ObjectPropertyName")
private var _MegaphoneSimpleFill: ImageVector? = null
