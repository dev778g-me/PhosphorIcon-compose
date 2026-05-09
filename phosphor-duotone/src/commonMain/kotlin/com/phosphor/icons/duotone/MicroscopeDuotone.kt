package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.MicroscopeDuotone: ImageVector
    get() {
        if (_MicroscopeDuotone != null) {
            return _MicroscopeDuotone!!
        }
        _MicroscopeDuotone = ImageVector.Builder(
            name = "Duotone.MicroscopeDuotone",
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
                moveTo(80f, 24f)
                lineTo(128f, 24f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 136f, 32f)
                lineTo(136f, 136f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 144f)
                lineTo(80f, 144f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, 136f)
                lineTo(72f, 32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 24f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 216f)
                lineTo(224f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(72f, 176f)
                lineTo(136f, 176f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 24f)
                lineTo(128f, 24f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 136f, 32f)
                lineTo(136f, 136f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 144f)
                lineTo(80f, 144f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, 136f)
                lineTo(72f, 32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 24f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(136f, 72f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 144f)
            }
        }.build()

        return _MicroscopeDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _MicroscopeDuotone: ImageVector? = null
