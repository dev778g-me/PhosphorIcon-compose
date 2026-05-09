package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.UserPlusBold: ImageVector
    get() {
        if (_UserPlusBold != null) {
            return _UserPlusBold!!
        }
        _UserPlusBold = ImageVector.Builder(
            name = "Bold.UserPlusBold",
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
                moveTo(204f, 136f)
                lineTo(244f, 136f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(224f, 116f)
                lineTo(224f, 156f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(108f, 100f)
                moveToRelative(-60f, 0f)
                arcToRelative(60f, 60f, 0f, isMoreThanHalf = true, isPositiveArc = true, 120f, 0f)
                arcToRelative(60f, 60f, 0f, isMoreThanHalf = true, isPositiveArc = true, -120f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(24f, 200f)
                curveToRelative(20.55f, -24.45f, 49.56f, -40f, 84f, -40f)
                reflectiveCurveToRelative(63.45f, 15.55f, 84f, 40f)
            }
        }.build()

        return _UserPlusBold!!
    }

@Suppress("ObjectPropertyName")
private var _UserPlusBold: ImageVector? = null
