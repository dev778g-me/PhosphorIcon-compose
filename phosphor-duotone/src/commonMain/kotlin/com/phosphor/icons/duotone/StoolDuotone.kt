package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.StoolDuotone: ImageVector
    get() {
        if (_StoolDuotone != null) {
            return _StoolDuotone!!
        }
        _StoolDuotone = ImageVector.Builder(
            name = "Duotone.StoolDuotone",
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
                moveTo(72f, 32f)
                lineTo(184f, 32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 40f)
                lineTo(192f, 64f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 184f, 72f)
                lineTo(72f, 72f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 64f)
                lineTo(64f, 40f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, 32f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(72f, 32f)
                lineTo(184f, 32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 40f)
                lineTo(192f, 64f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 184f, 72f)
                lineTo(72f, 72f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 64f)
                lineTo(64f, 40f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, 32f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(168f, 72f)
                lineTo(192f, 224f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(64f, 224f)
                lineTo(88f, 72f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(72.84f, 168f)
                lineTo(183.16f, 168f)
            }
        }.build()

        return _StoolDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _StoolDuotone: ImageVector? = null
