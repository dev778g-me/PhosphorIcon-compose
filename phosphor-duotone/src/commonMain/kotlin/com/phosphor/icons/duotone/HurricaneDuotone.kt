package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.HurricaneDuotone: ImageVector
    get() {
        if (_HurricaneDuotone != null) {
            return _HurricaneDuotone!!
        }
        _HurricaneDuotone = ImageVector.Builder(
            name = "Duotone.HurricaneDuotone",
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
                moveTo(148.62f, 50.68f)
                lineTo(160f, 8f)
                reflectiveCurveTo(48f, 32f, 48f, 128f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 59.38f, 77.32f)
                lineTo(96f, 248f)
                reflectiveCurveToRelative(112f, -24f, 112f, -120f)
                arcTo(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 148.62f, 50.68f)
                close()
                moveTo(128f, 152f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, -24f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 152f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 128f)
                moveToRelative(-24f, 0f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 48f, 0f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -48f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(148.62f, 50.68f)
                arcTo(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 128f)
                curveToRelative(0f, 96f, -112f, 120f, -112f, 120f)
                lineToRelative(11.38f, -42.68f)
                arcTo(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 128f)
                curveTo(48f, 32f, 160f, 8f, 160f, 8f)
                close()
            }
        }.build()

        return _HurricaneDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _HurricaneDuotone: ImageVector? = null
