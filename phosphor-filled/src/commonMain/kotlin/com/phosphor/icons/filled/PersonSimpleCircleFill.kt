package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.PersonSimpleCircleFill: ImageVector
    get() {
        if (_PersonSimpleCircleFill != null) {
            return _PersonSimpleCircleFill!!
        }
        _PersonSimpleCircleFill = ImageVector.Builder(
            name = "Filled.PersonSimpleCircleFill",
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
                moveTo(128f, 64f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, 16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 64f)
                close()
                moveTo(176f, 120f)
                lineTo(136f, 120f)
                verticalLineToRelative(13.58f)
                lineToRelative(30.66f, 46f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -13.32f, 8.88f)
                lineToRelative(-25.34f, -38f)
                lineToRelative(-25.34f, 38f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -13.32f, -8.88f)
                lineToRelative(30.66f, -46f)
                lineTo(120f, 120f)
                lineTo(80f, 120f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
            }
        }.build()

        return _PersonSimpleCircleFill!!
    }

@Suppress("ObjectPropertyName")
private var _PersonSimpleCircleFill: ImageVector? = null
