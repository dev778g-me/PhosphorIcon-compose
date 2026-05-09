package com.phosphor.icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Regular.Axe: ImageVector
    get() {
        if (_Axe != null) {
            return _Axe!!
        }
        _Axe = ImageVector.Builder(
            name = "Regular.Axe",
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
                moveTo(164.47f, 189.65f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -13.6f, -4.68f)
                curveToRelative(-7.09f, -53.14f, -42.41f, -87.8f, -59.45f, -99.76f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 90.33f, 73f)
                lineTo(129f, 34.33f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.2f, 1.09f)
                curveToRelative(12f, 17f, 46.62f, 52.36f, 99.76f, 59.45f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.68f, 13.6f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(151.78f, 48.22f)
                lineTo(171f, 29f)
                arcToRelative(17f, 17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 0f)
                horizontalLineToRelative(0f)
                arcToRelative(17f, 17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 24f)
                lineTo(177.7f, 70.3f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(126.3f, 121.7f)
                lineTo(37f, 211f)
                arcToRelative(17f, 17f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, 0f)
                horizontalLineToRelative(0f)
                arcToRelative(17f, 17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -24f)
                lineToRelative(91.25f, -91.25f)
            }
        }.build()

        return _Axe!!
    }

@Suppress("ObjectPropertyName")
private var _Axe: ImageVector? = null
