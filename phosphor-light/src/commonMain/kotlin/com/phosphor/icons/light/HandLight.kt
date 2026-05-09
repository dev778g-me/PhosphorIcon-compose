package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.HandLight: ImageVector
    get() {
        if (_HandLight != null) {
            return _HandLight!!
        }
        _HandLight = ImageVector.Builder(
            name = "Light.HandLight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(168f, 76f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 0f)
                verticalLineToRelative(76f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, -80f, 80f)
                curveToRelative(-44.18f, 0f, -60.75f, -21.28f, -93.32f, -90f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 34.64f, -20f)
                lineTo(88f, 152f)
                verticalLineTo(60f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 120f)
                verticalLineTo(44f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 0f)
                verticalLineToRelative(76f)
            }
        }.build()

        return _HandLight!!
    }

@Suppress("ObjectPropertyName")
private var _HandLight: ImageVector? = null
