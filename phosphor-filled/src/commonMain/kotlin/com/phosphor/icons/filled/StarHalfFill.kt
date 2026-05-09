package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.StarHalfFill: ImageVector
    get() {
        if (_StarHalfFill != null) {
            return _StarHalfFill!!
        }
        _StarHalfFill = ImageVector.Builder(
            name = "Filled.StarHalfFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(239.18f, 97.26f)
                arcTo(16.38f, 16.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224.92f, 86f)
                lineToRelative(-59f, -4.76f)
                lineTo(143.14f, 26.15f)
                arcToRelative(16.36f, 16.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, -30.27f, 0f)
                lineTo(90.11f, 81.23f)
                lineTo(31.08f, 86f)
                arcToRelative(16.46f, 16.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.37f, 28.86f)
                lineToRelative(45f, 38.83f)
                lineTo(53f, 211.75f)
                arcToRelative(16.4f, 16.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24.5f, 17.82f)
                lineTo(128f, 198.49f)
                lineToRelative(50.53f, 31.08f)
                arcTo(16.4f, 16.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 203f, 211.75f)
                lineToRelative(-13.76f, -58.07f)
                lineToRelative(45f, -38.83f)
                arcTo(16.43f, 16.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, 239.18f, 97.26f)
                close()
                moveTo(223.84f, 102.73f)
                lineTo(175.14f, 144.73f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.56f, 7.91f)
                lineToRelative(14.88f, 62.8f)
                arcToRelative(0.37f, 0.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.17f, 0.48f)
                curveToRelative(-0.18f, 0.14f, -0.23f, 0.11f, -0.38f, 0f)
                lineToRelative(-54.72f, -33.65f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 181.1f)
                lineTo(128f, 32f)
                curveToRelative(0.24f, 0f, 0.27f, 0.08f, 0.35f, 0.26f)
                lineTo(153f, 91.86f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.75f, 4.92f)
                lineToRelative(63.91f, 5.16f)
                curveToRelative(0.16f, 0f, 0.25f, 0f, 0.34f, 0.29f)
                reflectiveCurveTo(224f, 102.63f, 223.84f, 102.73f)
                close()
            }
        }.build()

        return _StarHalfFill!!
    }

@Suppress("ObjectPropertyName")
private var _StarHalfFill: ImageVector? = null
