package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.FileVueFill: ImageVector
    get() {
        if (_FileVueFill != null) {
            return _FileVueFill!!
        }
        _FileVueFill = ImageVector.Builder(
            name = "Filled.FileVueFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(213.66f, 82.34f)
                lineToRelative(-56f, -56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 152f, 24f)
                horizontalLineToRelative(-96f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 16f)
                verticalLineToRelative(76f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                lineTo(212f, 120f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
                lineTo(216f, 88f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 213.66f, 82.34f)
                close()
                moveTo(152f, 88f)
                lineTo(152f, 44f)
                lineToRelative(44f, 44f)
                close()
                moveTo(87.36f, 155f)
                lineTo(67.47f, 210.69f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -15.08f, 0f)
                lineTo(32.5f, 155f)
                arcTo(8.21f, 8.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 37f, 144.55f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.46f, 4.76f)
                lineToRelative(12.47f, 34.9f)
                lineToRelative(12.47f, -34.9f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.46f, -4.76f)
                arcTo(8.22f, 8.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, 87.36f, 155f)
                close()
                moveTo(184f, 160f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(15.73f)
                arcToRelative(8.19f, 8.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.26f, 7.47f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8.53f)
                lineTo(184f, 188f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(23.73f)
                arcToRelative(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.26f, 7.47f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8.53f)
                lineTo(176f, 216f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                lineTo(168f, 152f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineToRelative(31.74f)
                arcToRelative(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.26f, 7.47f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8.53f)
                close()
                moveTo(152f, 152f)
                verticalLineToRelative(37.45f)
                curveToRelative(0f, 14.14f, -11.07f, 26.12f, -25.22f, 26.54f)
                arcTo(26f, 26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 100f, 190f)
                lineTo(100f, 152.27f)
                arcToRelative(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.47f, -8.25f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.54f, 8f)
                verticalLineToRelative(37.65f)
                arcTo(10.23f, 10.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 125.27f, 200f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 136f, 190f)
                lineTo(136f, 152.27f)
                arcToRelative(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.47f, -8.25f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 152f, 152f)
                close()
            }
        }.build()

        return _FileVueFill!!
    }

@Suppress("ObjectPropertyName")
private var _FileVueFill: ImageVector? = null
