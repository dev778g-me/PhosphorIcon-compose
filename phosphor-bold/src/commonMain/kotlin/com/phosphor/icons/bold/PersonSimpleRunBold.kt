package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.PersonSimpleRunBold: ImageVector
    get() {
        if (_PersonSimpleRunBold != null) {
            return _PersonSimpleRunBold!!
        }
        _PersonSimpleRunBold = ImageVector.Builder(
            name = "Bold.PersonSimpleRunBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(152f, 56f)
                moveToRelative(-24f, 0f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 48f, 0f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -48f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(56f, 109.6f)
                reflectiveCurveToRelative(32f, -25.67f, 80f, 7f)
                curveToRelative(50.47f, 34.3f, 80f, 20.85f, 80f, 20.85f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(110.64f, 161.16f)
                curveTo(128.47f, 165f, 176f, 180f, 176f, 232f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(133.51f, 114.9f)
                curveTo(125.7f, 141.36f, 95.88f, 206.39f, 32f, 200f)
            }
        }.build()

        return _PersonSimpleRunBold!!
    }

@Suppress("ObjectPropertyName")
private var _PersonSimpleRunBold: ImageVector? = null
