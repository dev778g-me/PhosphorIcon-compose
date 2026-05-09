package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.EnvelopeOpenDuotone: ImageVector
    get() {
        if (_EnvelopeOpenDuotone != null) {
            return _EnvelopeOpenDuotone!!
        }
        _EnvelopeOpenDuotone = ImageVector.Builder(
            name = "Duotone.EnvelopeOpenDuotone",
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
                moveTo(224f, 96f)
                lineToRelative(-78.54f, 56f)
                lineToRelative(-34.91f, 0f)
                lineToRelative(-78.55f, -56f)
                lineToRelative(96f, -64f)
                lineToRelative(96f, 64f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 96f)
                verticalLineTo(200f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                horizontalLineTo(216f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                verticalLineTo(96f)
                lineTo(128f, 32f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(110.55f, 152f)
                lineTo(34.47f, 205.74f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(221.53f, 205.74f)
                lineTo(145.45f, 152f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(224f, 96f)
                lineToRelative(-78.54f, 56f)
                lineToRelative(-34.91f, 0f)
                lineToRelative(-78.55f, -56f)
            }
        }.build()

        return _EnvelopeOpenDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _EnvelopeOpenDuotone: ImageVector? = null
