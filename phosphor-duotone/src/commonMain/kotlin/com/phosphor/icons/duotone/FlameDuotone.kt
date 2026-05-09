package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.FlameDuotone: ImageVector
    get() {
        if (_FlameDuotone != null) {
            return _FlameDuotone!!
        }
        _FlameDuotone = ImageVector.Builder(
            name = "Duotone.FlameDuotone",
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
                moveTo(128f, 24f)
                reflectiveCurveTo(48f, 72f, 48f, 144f)
                arcTo(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 125.94f, 224f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 184f)
                curveToRelative(0f, -40f, 40f, -64f, 40f, -64f)
                reflectiveCurveToRelative(40f, 24f, 40f, 64f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 130.06f, 224f)
                arcTo(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 144f)
                curveTo(208f, 72f, 128f, 24f, 128f, 24f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(208f, 144f)
                curveToRelative(0f, -72f, -80f, -120f, -80f, -120f)
                reflectiveCurveTo(48f, 72f, 48f, 144f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88f, 184f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 0f)
                curveToRelative(0f, -40f, -40f, -64f, -40f, -64f)
                reflectiveCurveTo(88f, 144f, 88f, 184f)
                close()
            }
        }.build()

        return _FlameDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _FlameDuotone: ImageVector? = null
