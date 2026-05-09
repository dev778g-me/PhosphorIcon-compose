package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.CrownCrossFill: ImageVector
    get() {
        if (_CrownCrossFill != null) {
            return _CrownCrossFill!!
        }
        _CrownCrossFill = ImageVector.Builder(
            name = "Filled.CrownCrossFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 83.22f)
                arcToRelative(53.86f, 53.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -10.06f)
                verticalLineTo(40f)
                horizontalLineTo(104f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(16f)
                verticalLineTo(8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                verticalLineTo(24f)
                horizontalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                horizontalLineTo(136f)
                verticalLineTo(73.16f)
                arcTo(53.86f, 53.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 83.22f)
                close()
                moveTo(180f, 56f)
                curveToRelative(-17.74f, 0f, -33.21f, 6.48f, -44f, 17.16f)
                verticalLineTo(176f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                verticalLineTo(73.16f)
                curveTo(109.21f, 62.48f, 93.74f, 56f, 76f, 56f)
                arcToRelative(60.07f, 60.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, -60f, 60f)
                curveToRelative(0f, 29.86f, 14.54f, 48.85f, 26.73f, 59.52f)
                arcTo(90.48f, 90.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 189.34f)
                verticalLineTo(208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineToRelative(96f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                verticalLineTo(189.34f)
                arcToRelative(90.48f, 90.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.27f, -13.82f)
                curveTo(225.46f, 164.85f, 240f, 145.86f, 240f, 116f)
                arcTo(60.07f, 60.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 180f, 56f)
                close()
            }
        }.build()

        return _CrownCrossFill!!
    }

@Suppress("ObjectPropertyName")
private var _CrownCrossFill: ImageVector? = null
