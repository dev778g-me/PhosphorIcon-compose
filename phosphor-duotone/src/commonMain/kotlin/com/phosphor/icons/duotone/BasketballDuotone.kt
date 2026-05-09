package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.BasketballDuotone: ImageVector
    get() {
        if (_BasketballDuotone != null) {
            return _BasketballDuotone!!
        }
        _BasketballDuotone = ImageVector.Builder(
            name = "Duotone.BasketballDuotone",
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
                moveTo(60.06f, 195.91f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.12f, -135.65f)
                horizontalLineToRelative(0f)
                arcToRelative(95.7f, 95.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 28f, 67.76f)
                arcToRelative(95.74f, 95.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, -28f, 67.77f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(196.06f, 195.91f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.12f, -135.65f)
                horizontalLineToRelative(0f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 135.53f)
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
                moveTo(60f, 60.24f)
                arcTo(95.7f, 95.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 128f)
                arcToRelative(95.7f, 95.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, -28f, 67.76f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(196f, 60.24f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 135.52f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 128f)
                lineTo(224f, 128f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 32f)
                lineTo(128f, 224f)
            }
        }.build()

        return _BasketballDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _BasketballDuotone: ImageVector? = null
