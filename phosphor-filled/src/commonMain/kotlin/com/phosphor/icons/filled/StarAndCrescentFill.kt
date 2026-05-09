package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.StarAndCrescentFill: ImageVector
    get() {
        if (_StarAndCrescentFill != null) {
            return _StarAndCrescentFill!!
        }
        _StarAndCrescentFill = ImageVector.Builder(
            name = "Filled.StarAndCrescentFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(160f, 206.4f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.36f, 7.13f)
                arcTo(94.93f, 94.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 112f, 224f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -192f)
                arcToRelative(94.93f, 94.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 43.64f, 10.47f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 14.25f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 142.56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 206.4f)
                close()
                moveTo(251.17f, 120.65f)
                lineTo(224.67f, 109.22f)
                lineTo(222.36f, 79.38f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -14.14f, -4.47f)
                lineTo(189.63f, 97.42f)
                lineToRelative(-27.71f, -6.85f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.81f, 11.82f)
                lineTo(168.18f, 128f)
                lineToRelative(-15.07f, 25.61f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.81f, 11.82f)
                lineToRelative(27.71f, -6.85f)
                lineToRelative(18.59f, 22.51f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.14f, -4.47f)
                lineToRelative(2.31f, -29.84f)
                lineToRelative(26.5f, -11.43f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -14.7f)
                close()
            }
        }.build()

        return _StarAndCrescentFill!!
    }

@Suppress("ObjectPropertyName")
private var _StarAndCrescentFill: ImageVector? = null
