package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.TranslateDuotone: ImageVector
    get() {
        if (_TranslateDuotone != null) {
            return _TranslateDuotone!!
        }
        _TranslateDuotone = ImageVector.Builder(
            name = "Duotone.TranslateDuotone",
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
                moveTo(144f, 184f)
                lineToRelative(80f, 0f)
                lineToRelative(-40f, -80f)
                lineToRelative(-40f, 80f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(96f, 127.56f)
                arcTo(95.78f, 95.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 56f)
                horizontalLineToRelative(64f)
                arcToRelative(95.78f, 95.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, 71.56f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(239.97f, 216f)
                lineToRelative(-56f, -112f)
                lineToRelative(-56f, 112f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(143.97f, 184f)
                lineTo(223.97f, 184f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(95.97f, 32f)
                lineTo(95.97f, 56f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(31.97f, 56f)
                lineTo(159.97f, 56f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 56f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -96f, 96f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(69.44f, 88f)
                arcTo(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 152f)
            }
        }.build()

        return _TranslateDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _TranslateDuotone: ImageVector? = null
