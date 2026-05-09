package com.phosphor.icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Regular.TwitterLogo: ImageVector
    get() {
        if (_TwitterLogo != null) {
            return _TwitterLogo!!
        }
        _TwitterLogo = ImageVector.Builder(
            name = "Regular.TwitterLogo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88f, 176f)
                reflectiveCurveTo(32.85f, 144f, 40.78f, 56f)
                curveToRelative(0f, 0f, 39.66f, 40f, 87.22f, 48f)
                verticalLineTo(88f)
                curveToRelative(0f, -22f, 18f, -40.27f, 40f, -40f)
                arcToRelative(40.74f, 40.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, 36.67f, 24f)
                horizontalLineTo(240f)
                lineToRelative(-32f, 32f)
                curveToRelative(-4.26f, 66.84f, -60.08f, 120f, -128f, 120f)
                curveToRelative(-32f, 0f, -40f, -12f, -40f, -12f)
                reflectiveCurveTo(72f, 200f, 88f, 176f)
                close()
            }
        }.build()

        return _TwitterLogo!!
    }

@Suppress("ObjectPropertyName")
private var _TwitterLogo: ImageVector? = null
