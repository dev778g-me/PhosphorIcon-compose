package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.CampfireFill: ImageVector
    get() {
        if (_CampfireFill != null) {
            return _CampfireFill!!
        }
        _CampfireFill = ImageVector.Builder(
            name = "Filled.CampfireFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(132.19f, 25.19f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.38f, 0f)
                arcTo(156f, 156f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96.24f, 48f)
                curveTo(77.77f, 67.13f, 68f, 87.9f, 68f, 108f)
                arcToRelative(60f, 60f, 0f, isMoreThanHalf = false, isPositiveArc = false, 120f, 0f)
                curveTo(188f, 60.08f, 134.47f, 26.59f, 132.19f, 25.19f)
                close()
                moveTo(128f, 152f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, -24f)
                curveToRelative(0f, -24f, 24f, -40f, 24f, -40f)
                reflectiveCurveToRelative(24f, 16f, 24f, 40f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 152f)
                close()
                moveTo(223.62f, 226.42f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -10.05f, 5.2f)
                lineTo(128f, 204.39f)
                lineTo(42.43f, 231.62f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4.85f, -15.25f)
                lineToRelative(64f, -20.37f)
                lineToRelative(-64f, -20.38f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4.85f, -15.24f)
                lineTo(128f, 187.6f)
                lineToRelative(85.57f, -27.22f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4.85f, 15.24f)
                lineToRelative(-64f, 20.38f)
                lineToRelative(64f, 20.37f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 223.62f, 226.42f)
                close()
            }
        }.build()

        return _CampfireFill!!
    }

@Suppress("ObjectPropertyName")
private var _CampfireFill: ImageVector? = null
