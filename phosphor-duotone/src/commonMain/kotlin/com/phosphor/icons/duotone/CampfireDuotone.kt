package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.CampfireDuotone: ImageVector
    get() {
        if (_CampfireDuotone != null) {
            return _CampfireDuotone!!
        }
        _CampfireDuotone = ImageVector.Builder(
            name = "Duotone.CampfireDuotone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(128f, 32f)
                reflectiveCurveTo(76f, 64f, 76f, 108f)
                arcToRelative(52f, 52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 52f, 52f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, -24f)
                curveToRelative(0f, -24f, 24f, -40f, 24f, -40f)
                reflectiveCurveToRelative(24f, 16f, 24f, 40f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, 24f)
                arcToRelative(52f, 52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 52f, -52f)
                curveTo(180f, 64f, 128f, 32f, 128f, 32f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(180f, 108f)
                arcToRelative(52f, 52f, 0f, isMoreThanHalf = false, isPositiveArc = true, -104f, 0f)
                curveToRelative(0f, -44f, 52f, -76f, 52f, -76f)
                reflectiveCurveTo(180f, 64f, 180f, 108f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 168f)
                lineTo(216f, 224f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(216f, 168f)
                lineTo(40f, 224f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(152f, 136f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -48f, 0f)
                curveToRelative(0f, -24f, 24f, -40f, 24f, -40f)
                reflectiveCurveTo(152f, 112f, 152f, 136f)
                close()
            }
        }.build()

        return _CampfireDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _CampfireDuotone: ImageVector? = null
