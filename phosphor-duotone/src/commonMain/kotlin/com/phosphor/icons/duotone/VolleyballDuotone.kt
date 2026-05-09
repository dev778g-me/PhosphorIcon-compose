package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.VolleyballDuotone: ImageVector
    get() {
        if (_VolleyballDuotone != null) {
            return _VolleyballDuotone!!
        }
        _VolleyballDuotone = ImageVector.Builder(
            name = "Duotone.VolleyballDuotone",
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
                moveTo(160f, 184f)
                arcToRelative(95.56f, 95.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, -54.53f, -17f)
                lineTo(128f, 128f)
                horizontalLineToRelative(45.06f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -56.48f, -95.34f)
                horizontalLineToRelative(0f)
                arcTo(95.55f, 95.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 44.86f)
                lineTo(105.47f, 89f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -54.33f, 96.58f)
                horizontalLineToRelative(0f)
                arcTo(95.75f, 95.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 211.14f)
                horizontalLineToRelative(0f)
                arcTo(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216.25f, 165.8f)
                arcTo(95.56f, 95.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 184f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(216.26f, 165.77f)
                verticalLineToRelative(0f)
                lineToRelative(0f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 128f)
                moveToRelative(-96f, 0f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, 192f, 0f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, -192f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 44.86f)
                lineTo(128f, 128f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 211.14f)
                lineTo(128f, 128f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(224f, 128f)
                lineTo(128f, 128f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(116.58f, 32.66f)
                arcTo(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 173.06f, 128f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(51.14f, 185.56f)
                arcTo(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 105.47f, 89f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(216.28f, 165.78f)
                arcTo(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 105.47f, 167f)
            }
        }.build()

        return _VolleyballDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _VolleyballDuotone: ImageVector? = null
