package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.UsersThreeFill: ImageVector
    get() {
        if (_UsersThreeFill != null) {
            return _UsersThreeFill!!
        }
        _UsersThreeFill = ImageVector.Builder(
            name = "Filled.UsersThreeFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(64.12f, 147.8f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 4.2f)
                lineTo(16f, 152f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.8f, -6.17f)
                arcToRelative(8.35f, 8.35f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.62f, -6.93f)
                arcTo(67.79f, 67.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, 37f, 117.51f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 66.46f, -35.8f)
                arcToRelative(3.94f, 3.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.27f, 4.18f)
                arcTo(64.08f, 64.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 144f)
                curveTo(64f, 145.28f, 64f, 146.54f, 64.12f, 147.8f)
                close()
                moveTo(246.12f, 138.89f)
                arcTo(67.76f, 67.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, 219f, 117.51f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = false, -66.46f, -35.8f)
                arcToRelative(3.94f, 3.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.27f, 4.18f)
                arcTo(64.08f, 64.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 144f)
                curveToRelative(0f, 1.28f, 0f, 2.54f, -0.12f, 3.8f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4.2f)
                lineTo(240f, 152f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.8f, -6.17f)
                arcTo(8.33f, 8.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 246.17f, 138.89f)
                close()
                moveTo(157.12f, 182.07f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = false, -58.37f, 0f)
                arcTo(72.13f, 72.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 65.07f, 212f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, 224f)
                lineTo(184f, 224f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.93f, -12f)
                arcTo(72.15f, 72.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 157.19f, 182.07f)
                close()
            }
        }.build()

        return _UsersThreeFill!!
    }

@Suppress("ObjectPropertyName")
private var _UsersThreeFill: ImageVector? = null
