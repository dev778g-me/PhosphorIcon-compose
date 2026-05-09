package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.CurrencyBtcDuotone: ImageVector
    get() {
        if (_CurrencyBtcDuotone != null) {
            return _CurrencyBtcDuotone!!
        }
        _CurrencyBtcDuotone = ImageVector.Builder(
            name = "Duotone.CurrencyBtcDuotone",
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
                moveTo(160f, 120f)
                horizontalLineTo(148f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -72f)
                horizontalLineTo(88f)
                verticalLineTo(200f)
                horizontalLineToRelative(72f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -80f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(72f, 48f)
                lineTo(88f, 48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(72f, 200f)
                lineTo(88f, 200f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(112f, 48f)
                lineTo(112f, 24f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(144f, 48f)
                lineTo(144f, 24f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(112f, 224f)
                lineTo(112f, 200f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(144f, 224f)
                lineTo(144f, 200f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88f, 120f)
                horizontalLineToRelative(72f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 80f)
                horizontalLineTo(88f)
                verticalLineTo(48f)
                horizontalLineToRelative(60f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 72f)
            }
        }.build()

        return _CurrencyBtcDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyBtcDuotone: ImageVector? = null
