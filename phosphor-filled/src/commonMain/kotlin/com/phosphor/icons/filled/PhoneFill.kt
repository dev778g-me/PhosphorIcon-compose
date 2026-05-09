package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.PhoneFill: ImageVector
    get() {
        if (_PhoneFill != null) {
            return _PhoneFill!!
        }
        _PhoneFill = ImageVector.Builder(
            name = "Filled.PhoneFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(231.88f, 175.08f)
                arcTo(56.26f, 56.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 224f)
                curveTo(96.6f, 224f, 32f, 159.4f, 32f, 80f)
                arcTo(56.26f, 56.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80.92f, 24.12f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.62f, 9.52f)
                lineToRelative(21.12f, 47.15f)
                lineToRelative(0f, 0.12f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 117.39f, 96f)
                curveToRelative(-0.18f, 0.27f, -0.37f, 0.52f, -0.57f, 0.77f)
                lineTo(96f, 121.45f)
                curveToRelative(7.49f, 15.22f, 23.41f, 31f, 38.83f, 38.51f)
                lineToRelative(24.34f, -20.71f)
                arcToRelative(8.12f, 8.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.56f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.17f, -1.4f)
                lineToRelative(0.13f, 0.06f)
                lineToRelative(47.11f, 21.11f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 231.88f, 175.08f)
                close()
            }
        }.build()

        return _PhoneFill!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneFill: ImageVector? = null
